package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParticipantQueueOfTheTasks implements ParticipantInCourseObservable {
    private List<MentorsObserver> observers;
    private Map<String, InfoOfTheTask> taskInfo;
    private String username;

    public ParticipantQueueOfTheTasks(String username) {
        observers = new ArrayList<>();
        this.username = username;
        taskInfo = new HashMap<>();

        for(ListOfTasks tasks : ListOfTasks.values()) {
            taskInfo.put(tasks.getNameOfTask(), new InfoOfTheTask("", StatusOfTasks.NEW));
        }
    }

    public void sendTask(ListOfTasks tasksName, String url) {
        taskInfo.get(tasksName.getNameOfTask()).setUrl(url);
        taskInfo.get(tasksName.getNameOfTask()).setTaskStatus("", StatusOfTasks.PENDING);
        notifyMentors();
    }

    @Override
    public void registerMentor(MentorsObserver mentorsObserver) {
        observers.add(mentorsObserver);
    }

    @Override
    public void notifyMentors() {
        for(MentorsObserver observer : observers) {
            observer.changeStatusOfTheTasks(this);
        }
    }

    @Override
    public void removeMentor(MentorsObserver mentorsObserver) {
        observers.remove(mentorsObserver);
    }
}
