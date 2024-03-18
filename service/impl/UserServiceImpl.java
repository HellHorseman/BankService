package org.em.bankservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.em.bankservice.exception.IsExistException;
import org.em.bankservice.exception.UserNotFoundException;
import org.em.bankservice.model.User;
import org.em.bankservice.repository.UserRepo;
import org.em.bankservice.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public User create(User user) {
        if (userRepo.existByUsername(user.getUsername())) {
            throw new IsExistException("Username is already exist");
        }

        if (userRepo.existByEmail(user.getEmail())) {
            throw new IsExistException("Email is already exist");
        }

        return save(user);
    }

    @Override
    public User getByUsername(String username) {
        return userRepo.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    @Override
    public UserDetailsService userDetailsService() {
        return this::getByUsername;
    }

    @Override
    public User getCurrentUser() {
        var username = SecurityContextHolder.getContext().getAuthentication().getName();
        return getByUsername(username);
    }
}
