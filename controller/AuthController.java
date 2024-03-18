package org.em.bankservice.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.em.bankservice.dto.JwtAuth;
import org.em.bankservice.dto.Login;
import org.em.bankservice.dto.Registr;
import org.em.bankservice.service.AuthorisationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthorisationService authenticationService;

    @PostMapping("/registr")
    public JwtAuth registr(@RequestBody @Valid Registr request) {
        return authenticationService.registr(request);
    }

    @PostMapping("/login")
    public JwtAuth login(@RequestBody @Valid Login request) {
        return authenticationService.login(request);
    }
}
