package org.em.bankservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {

    private long id;

    private long senderId;

    private long receiverId;

    private float transactionSum;

    private Date transactionDate;
}
