package org.em.bankservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class BankAccount {

    private long id;

    private long clientId;

    private float money;

    private Date openAcc;
}
