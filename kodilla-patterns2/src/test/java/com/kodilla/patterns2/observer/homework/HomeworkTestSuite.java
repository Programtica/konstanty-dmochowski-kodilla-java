package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Adam", "Księgowy");
        Mentor mentor2 = new Mentor("Karolina", "Adamczak");
        ParticipantQueueOfTheTasks participant1 = new ParticipantQueueOfTheTasks("Maksymilian Kowalski");
        ParticipantQueueOfTheTasks participant2 = new ParticipantQueueOfTheTasks("Eliza Grześkowiak");
        ParticipantQueueOfTheTasks participant3 = new ParticipantQueueOfTheTasks("Konstanty Dmochowski");
        participant1.registerMentor(mentor1);
        participant2.registerMentor(mentor2);
        participant3.registerMentor(mentor2);
        //When
        participant1.sendTask(ListOfTasks.FIRST, "http://example.com/max/1");
        participant2.sendTask(ListOfTasks.SECOND, "http://example.com/elise/2");
        participant3.sendTask(ListOfTasks.FOURTH, "http://example.com/constantin/4");
        //Then
        assertEquals(1, mentor1.getTaskNumber());
        assertEquals(2, mentor2.getTaskNumber());
    }
}
