package me.lms.tddstart.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

}
