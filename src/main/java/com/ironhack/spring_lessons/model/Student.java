package com.ironhack.spring_lessons.model;


import jakarta.persistence.*;


@Entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float grade;
    @Embedded
    private StudentInfo studentInfo;

    //el objeto tipo StudentInfo  se crea pero el tipo de informacion studentInfo no existe como tal, ie: no es un Integer, Float, String blah blah
    // Hacer una clase en donde van a estar los datos    ie:    StudentInfo



    // Constructor vacio
    public Student() {
    }


    //Getters & Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }



}
