package org.em.bankservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "bank_account")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ba_id")
    private long id;

    @Column(name = "client_id")
    private long clientId;

    @Column(name = "money")
    private float money;

    @Column(name = "open_acc_date")
    private LocalDateTime openAcc;
}
