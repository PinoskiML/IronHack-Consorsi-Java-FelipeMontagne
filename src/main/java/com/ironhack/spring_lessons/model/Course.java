package com.ironhack.spring_lessons.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Course {
    @Id
    private String course;
    private Integer hours;
    private String classroom;
    private String vacations;
    private Integer teacherID;


    public Course(String course) {
        this.course = course;
    }

    public Course() {
    }
// para Spring SIEMPRE hay que hacer un constructor vacio
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getVacations() {
        return vacations;
    }

    public void setVacations(String vacations) {
        this.vacations = vacations;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }



    //generar constructor para introducir a mano

    public Course(String course, Integer hours, String classroom, String vacations, Integer teacherID) {
        this.course = course;
        this.hours = hours;
        this.classroom = classroom;
        this.vacations = vacations;
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", hours=" + hours +
                ", classroom='" + classroom + '\'' +
                ", vacations='" + vacations + '\'' +
                ", teacherID=" + teacherID +
                '}';
    }
}
