package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser
{
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPosts;

    public ForumUser(final int userId, final String username, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPublishedPosts)
    {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUserId()
    {
        return userId;
    }

    public String getUsername()
    {
        return username;
    }

    public char getSex()
    {
        return sex;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts()
    {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString()
    {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
