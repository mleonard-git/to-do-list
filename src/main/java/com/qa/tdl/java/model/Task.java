package com.qa.tdl.java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    //defines entity attributes which will make up the task
    // the data type variable names will remain the same in the database

    //@column annotation - look up?

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String task;
    private Boolean isTaskCompleted;

}
