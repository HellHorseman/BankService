package org.em.bankservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trans_id")
    private long id;

    @Column(name = "seder_id")
    private long senderId;

    @Column(name = "receiver_id")
    private long receiverId;

    @Column(name = "transaction_sum")
    private float transactionSum;

    @Column(name = "transaction_date")
    private Date transactionDate;
}
