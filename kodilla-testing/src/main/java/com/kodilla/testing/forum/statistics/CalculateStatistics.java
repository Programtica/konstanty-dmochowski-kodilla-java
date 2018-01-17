package com.kodilla.testing.forum.statistics;

import java.util.List;

class CalculateStatistics implements Statistics
{
    private Statistics statistics;

    public CalculateStatistics(Statistics statistics)
    {
        this.statistics = statistics;
    }

    private List<String> userList;

    private int counterOfPosts;
    private int counterOfComments;

    private double averageQuantityOfPosts;
    private double averageQuantityOfComments;
    private double averageQuantityOfCommentsFromPosts;

    public double averageQuantityOfPostsByUsers()
    {
        return averageQuantityOfPosts;
    }

    public double averageQuantityOfCommentsByUsers()
    {
        return averageQuantityOfComments;
    }

    public double averageQuantityOfCommentsByPosts()
    {
        return averageQuantityOfCommentsFromPosts;
    }

    @Override
    public List<String> userNames()
    {
        userList = statistics.userNames();
        return userList;
    }

    @Override
    public int postCount()
    {
        counterOfPosts = statistics.postCount();
        return counterOfPosts;
    }

    @Override
    public int commentsCount()
    {
        counterOfComments = statistics.commentsCount();
        return counterOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics)
    {
        if(statistics.userNames().size() !=0 && statistics.postCount() != 0)
        {
            averageQuantityOfPosts = statistics.postCount()/(statistics.userNames().size());

        }

        else
        {
            averageQuantityOfPosts = 0;

        }

        if(statistics.userNames().size() !=0 && statistics.commentsCount() != 0)
        {
            averageQuantityOfComments = statistics.commentsCount()/(statistics.userNames().size());
        }

        else
        {
            averageQuantityOfComments = 0;
        }

        if(statistics.postCount() != 0 && statistics.commentsCount() !=0)
        {
            averageQuantityOfCommentsFromPosts = statistics.postCount()/(statistics.commentsCount());
        }

        else
        {
            averageQuantityOfCommentsFromPosts = 0;
        }
    }

    public void showStatistics()
    {
        calculateAdvStatistics(statistics);
        System.out.println("We are presenting a results!");
        System.out.println(averageQuantityOfPostsByUsers());
        System.out.println(averageQuantityOfCommentsByUsers());
        System.out.println(averageQuantityOfCommentsByPosts());
    }
}
