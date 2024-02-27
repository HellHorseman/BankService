package org.em.bankservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankAccountController {

    @PostMapping
    public ResponseEntity<?> createAccount() {
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getAccount() {
        return null;
    }

    @PatchMapping
    public ResponseEntity<?> updateAccount() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAccount() {
        return null;
    }
}
