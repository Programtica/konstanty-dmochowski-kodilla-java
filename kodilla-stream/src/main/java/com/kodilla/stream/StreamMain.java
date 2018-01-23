package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain
{
    public static void main(String[] args)
    {
        Forum forumDatabase = new Forum();
        Map<Integer, Object> resultOfUsers = forumDatabase.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= 1998)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));


        System.out.println("Flitered users: " + resultOfUsers.size());
        resultOfUsers.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
        .forEach(System.out::println);
    }
}
