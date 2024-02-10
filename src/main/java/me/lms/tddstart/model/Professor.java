package me.lms.tddstart.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "`professor`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Professor {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int professorCode;

    private String professorName;
    private int departmentCode;


    public Professor(int professorCode, String professorName, int departmentCode) {
        this.professorCode = professorCode;
        this.professorName = professorName;
        this.departmentCode = departmentCode;
    }


}
