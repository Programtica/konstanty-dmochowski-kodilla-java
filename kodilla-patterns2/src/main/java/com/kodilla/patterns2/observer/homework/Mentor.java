package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorsObserver {
    private final String firstname;
    private final String lastname;
    private int mentorTaskNumber = 0;

    public Mentor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getTaskNumber() {
        return mentorTaskNumber;
    }

    @Override
    public void changeStatusOfTheTasks(ParticipantQueueOfTheTasks participantQueueOfTheTasks) {
        mentorTaskNumber++;
        System.out.println(firstname + lastname + ": New tasks for check. Total tasks: " + mentorTaskNumber + ". Send" +
                "email with confirmed tasks.");
    }
}
