package org.em.bankservice.dto;

import lombok.Data;

import java.util.Calendar;

@Data
public class UserDTO {

    private long id;
    private String phone;
    private String email;
    private String name;
    private String surname;
    private String patronymic;
    private Calendar birthDate;
}
