package ru.kors.springstudents.model;

import jakarta.persistence.*;
        import lombok.*;

        import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    //    Поменять имя в колнки
    @Column(name = "firstName")
    private String firstName;
    private String lastname;
    private LocalDate dataOfBirth;
    // уникальное поле среди полщователей
    @Column(unique = true)
    private String email;
    //    Возраст генерируется на основе даты рождения
    @Transient
    private int age;

    public int getAge(){
        return Period.between(dataOfBirth, LocalDate.now()).getYears();
    }
}
