package com.kodilla.patterns2.observer.homework;

public enum ListOfTasks {
    FIRST("1. Data types"),
    SECOND("2. Variables"),
    THIRD("3. If statement"),
    FOURTH("4. Loops");

    private String nameOfTask;

    ListOfTasks(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }
}
