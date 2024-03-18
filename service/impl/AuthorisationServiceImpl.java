package org.em.bankservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.em.bankservice.dto.JwtAuth;
import org.em.bankservice.dto.Login;
import org.em.bankservice.dto.Registr;
import org.em.bankservice.model.User;
import org.em.bankservice.service.AuthorisationService;
import org.em.bankservice.service.JwtService;
import org.em.bankservice.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorisationServiceImpl implements AuthorisationService {

    private final UserService userService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @Override
    public JwtAuth registr(Registr request) {
        var user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        userService.create(user);

        var jwt = jwtService.generateToken(user);
        return new JwtAuth(jwt);
    }

    @Override
    public JwtAuth login(Login request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
        ));

        var user = userService
                .userDetailsService()
                .loadUserByUsername(request.getUsername());

        var jwt = jwtService.generateToken(user);
        return new JwtAuth(jwt);
    }
}
