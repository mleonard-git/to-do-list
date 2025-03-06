package com.qa.tdl.java.model;

public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String task;
    private Boolean isTaskCompleted;

}
