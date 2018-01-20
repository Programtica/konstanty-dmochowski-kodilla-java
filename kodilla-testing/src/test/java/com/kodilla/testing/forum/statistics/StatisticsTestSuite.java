package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite
{
    private static int counterOfTests = 0;

    @Before
    public void startATest()
    {
        counterOfTests++;
        System.out.println("Start a test #" + counterOfTests);
    }

    @BeforeClass
    public static void startOfTests()
    {
        System.out.println("Starting a tests!");
    }

    @AfterClass
    public static void endOfTests()
    {
        System.out.println("We finished all tests!");
    }

    @Test
    public void testPfStatisticsWhenNullData()
    {
        //Given
        Statistics statisticsInMock = mock(Statistics.class);
        when(statisticsInMock.postCount()).thenReturn(0);
        when(statisticsInMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsInMock);
        //When
        int posts = statisticsInMock.postCount();
        int comments = statisticsInMock.commentsCount();
        //Then
        Assert.assertEquals(0, posts);
        Assert.assertEquals(0, comments);
    }

    @Test
    public void testOfStatisticsWhenIsFirstTypeOfInformation()
    {
        //Given
        Statistics statisticsInMock = mock(Statistics.class);
        when(statisticsInMock.postCount()).thenReturn(10);
        when(statisticsInMock.commentsCount()).thenReturn(1000);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsInMock);
        //When
        int posts = statisticsInMock.postCount();
        int comments = statisticsInMock.commentsCount();
        //Then
        Assert.assertEquals(10, posts);
        Assert.assertEquals(1000, comments);
    }

    @Test
    public void testOfStatisticsWhenIsSecondTypeOfInformation()
    {
        //Given
        Statistics statisticsInMock = mock(Statistics.class);
        when(statisticsInMock.postCount()).thenReturn(1000);
        when(statisticsInMock.commentsCount()).thenReturn(100);
        int posts = statisticsInMock.postCount();
        int comments = statisticsInMock.commentsCount();
        //Then
        Assert.assertEquals(1000, posts);
        Assert.assertEquals(100, comments);
    }
}