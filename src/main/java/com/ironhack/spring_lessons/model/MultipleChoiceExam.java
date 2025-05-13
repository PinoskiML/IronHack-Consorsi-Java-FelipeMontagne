package com.ironhack.spring_lessons.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class MultipleChoiceExam extends  Exam{
    private Integer numberOfChoices;


    //constructor vacio


    public MultipleChoiceExam() {
    }


    //Getter & Setters


    public Integer getNumberOfChoices() {
        return numberOfChoices;
    }

    public void setNumberOfChoices(Integer numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }
}
