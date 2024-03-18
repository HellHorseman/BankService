package org.em.bankservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @PostMapping
    ResponseEntity<?> createTransaction() {
        return null;
    }

    @GetMapping
    ResponseEntity<?> getTransaction() {
        return null;
    }

    @PatchMapping
    ResponseEntity<?> updateTransaction() {
        return null;
    }

    @DeleteMapping
    ResponseEntity<?> deleteTransaction() {
        return null;
    }
}
