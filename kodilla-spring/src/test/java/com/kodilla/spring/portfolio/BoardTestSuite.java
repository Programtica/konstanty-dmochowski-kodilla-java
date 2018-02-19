package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("toDoList");
        board.inProgressList.tasks.add("inProgressList");
        board.doneList.tasks.add("doneList");
        //Then
        System.out.println(board.toDoList.tasks);
        System.out.println(board.inProgressList.tasks);
        System.out.println(board.doneList.tasks);
    }
}
