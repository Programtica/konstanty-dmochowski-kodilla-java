package com.kodilla.patterns2.observer.homework;

public interface ParticipantInCourseObservable {
    void registerMentor(MentorsObserver mentorsObserver);
    void notifyMentors();
    void removeMentor(MentorsObserver mentorsObserver);
}
