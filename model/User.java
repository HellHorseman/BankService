package org.em.bankservice.model;

import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.Calendar;


@Data
public class User {


    private long id;

    private String phone;

    @Email
    private String email;

    private String name;

    private String surname;

    private String patronymic;

    private Calendar birthDate;
}
