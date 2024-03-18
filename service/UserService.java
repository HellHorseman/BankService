package org.em.bankservice.service;

import org.em.bankservice.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

    public User save(User user);

    public User create(User user);

    public User getByUsername(String username);

    public UserDetailsService userDetailsService();

    public User getCurrentUser();
}
