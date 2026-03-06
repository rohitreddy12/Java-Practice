package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    int StudentId;
    String StudentName;
    String StudentDpt;
    String StudentMarks;
}
