package ru.kors.springstudents.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastname;
    private LocalDate dataOfBirth;
    private String email;
    private int age;
}
