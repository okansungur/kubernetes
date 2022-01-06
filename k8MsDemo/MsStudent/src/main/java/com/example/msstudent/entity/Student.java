package com.example.msstudent.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "students")
@Entity
@Data
public class Student {
    @Id
    private long studentId;
    private String name;

}
