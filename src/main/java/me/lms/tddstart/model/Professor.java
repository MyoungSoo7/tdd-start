package me.lms.tddstart.model;

import jakarta.persistence.*;


@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int professorCode;

    private String professorName;
    private int departmentCode;

}
