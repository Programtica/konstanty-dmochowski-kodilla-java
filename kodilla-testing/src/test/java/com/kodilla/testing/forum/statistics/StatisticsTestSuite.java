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
        int quantityOfPosts = 0;
        int quantityOfComments = 0;

        ArrayList<String> quantityOfUsers = new ArrayList<>();

        //When
        CalculateStatistics nullData = new CalculateStatistics(statisticsInMock);
        nullData.calculateAdvStatistics(statisticsInMock);

        //Then
        Assert.assertEquals(0, nullData.averageQuantityOfPostsByUsers(), 1.0);
        Assert.assertEquals(0, nullData.averageQuantityOfCommentsByPosts(), 1.0);
        Assert.assertEquals(0, nullData.averageQuantityOfCommentsByPosts(), 1.0);
    }

    @Test
    public void testOfStatisticsWhenIsFirstTypeOfInformation()
    {
        //Given
        Statistics statisticsInMock = mock(Statistics.class);

        int quantityOfPosts = 1000;
        int quantityOfComments = 20;

        ArrayList<String> quantityOfUsers = new ArrayList<>();

        for(int i=0; i<1000; i++)
        {
            quantityOfUsers.add("User: " + i);
        }
        when(statisticsInMock.postCount()).thenReturn(quantityOfPosts);
        when(statisticsInMock.commentsCount()).thenReturn(quantityOfComments);
        when(statisticsInMock.userNames()).thenReturn(quantityOfUsers);

        //When
        CalculateStatistics morePostsThanComments = mock(CalculateStatistics.class);
        morePostsThanComments.calculateAdvStatistics(statisticsInMock);

        //Then
        int averageOfPostsWhichMustBeExpected = statisticsInMock.postCount() / statisticsInMock.userNames().size();
        double postsByUser = morePostsThanComments.averageQuantityOfCommentsByPosts();
        Assert.assertEquals(averageOfPostsWhichMustBeExpected, postsByUser, 1);

        int averageOfCommentsWhichMustBeExpected = statisticsInMock.commentsCount() / statisticsInMock.userNames().size();
        double commentsByUser = morePostsThanComments.averageQuantityOfCommentsByUsers();
        Assert.assertEquals(averageOfCommentsWhichMustBeExpected, commentsByUser, 1);

        int averageOfCommentsByPostsWhichMustBeExpected = statisticsInMock.commentsCount() / statisticsInMock.postCount();
        double commentsByPosts = morePostsThanComments.averageQuantityOfPostsByUsers();
        Assert.assertEquals(averageOfCommentsByPostsWhichMustBeExpected, commentsByPosts, 1);
    }

    @Test
    public void testOfStatisticsWhenIsSecondTypeOfInformation()
    {
        //Given
        Statistics statisticsInMock = mock(Statistics.class);

        int quantityOfPosts = 10;
        int quantityOfComments = 1000;

        ArrayList<String> quantityOfUsers = new ArrayList<>();

        for(int i=0; i<100; i++)
        {
            quantityOfUsers.add("User: " + i);
        }

        when(statisticsInMock.postCount()).thenReturn(quantityOfPosts);
        when(statisticsInMock.commentsCount()).thenReturn(quantityOfComments);
        when(statisticsInMock.userNames()).thenReturn(quantityOfUsers);

        //When
        CalculateStatistics moreCommentsThanPosts = mock(CalculateStatistics.class);
        moreCommentsThanPosts.calculateAdvStatistics(statisticsInMock);

        //Then
        int averageOfPostsWhichMustBeExpected = statisticsInMock.postCount() / statisticsInMock.userNames().size();
        double postsByUser = moreCommentsThanPosts.averageQuantityOfPostsByUsers();
        Assert.assertEquals(averageOfPostsWhichMustBeExpected, postsByUser, 1);

        int averageOfCommentsWhichMustBeExpected = statisticsInMock.commentsCount() / statisticsInMock.userNames().size();
        double commentsByUser = moreCommentsThanPosts.averageQuantityOfCommentsByUsers();
        Assert.assertEquals(averageOfCommentsWhichMustBeExpected, commentsByUser, 1);

        int averageOfCommentsByPostsWhichMustBeExpected = statisticsInMock.commentsCount() / statisticsInMock.postCount();
        double commentsPerPosts = moreCommentsThanPosts.averageQuantityOfCommentsByPosts();
        Assert.assertEquals(averageOfCommentsByPostsWhichMustBeExpected, commentsPerPosts, 1);
    }
}