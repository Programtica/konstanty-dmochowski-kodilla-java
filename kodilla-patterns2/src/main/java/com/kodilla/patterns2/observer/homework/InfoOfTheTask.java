package com.kodilla.patterns2.observer.homework;

public class InfoOfTheTask {
    private String url;
    private StatusOfTasks taskStatus;

    public InfoOfTheTask(String url, StatusOfTasks taskStatus) {
        this.url = url;
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "InfoOfTheTask{" +
                "url='" + url + '\'' +
                ", taskStatus=" + taskStatus +
                '}';
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTaskStatus(String s, StatusOfTasks taskStatus) {
        this.taskStatus = taskStatus;
    }
}
