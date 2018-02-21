package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        String textOfLog = "Last log - is not empty";
        //When
        Logger.getInstance().log(textOfLog);
        //Then
        Assert.assertFalse(Logger.getInstance().getLastLog().isEmpty());
    }

}
