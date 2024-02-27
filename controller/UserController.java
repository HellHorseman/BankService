package org.em.bankservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    @PostMapping
    public ResponseEntity<?> createUser() {
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getUser() {
        return null;
    }

    @PatchMapping
    public ResponseEntity<?> updateUser() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
