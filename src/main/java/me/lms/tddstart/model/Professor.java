package me.lms.tddstart.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long professorId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

}
