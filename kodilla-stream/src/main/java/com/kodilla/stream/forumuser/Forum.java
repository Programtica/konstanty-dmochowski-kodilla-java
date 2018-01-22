package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum
{
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum()
    {
        theForumList.add(new ForumUser(102, "kot", 'M', 1980, 8, 14, 8));
        theForumList.add(new ForumUser(410, "martynka", 'F', 1997, 11, 11, 0));
        theForumList.add(new ForumUser(305, "adam666", 'M', 1956, 6, 28, 2));
        theForumList.add(new ForumUser(309, "wiki", 'F', 1999, 12, 31, 1));
        theForumList.add(new ForumUser(207, "micha", 'F', 2002, 5, 1, 3));
        theForumList.add(new ForumUser(525, "paulus", 'M', 1996, 2, 4, 0));
    }


    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(theForumList);
    }
}
