package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kostek = new ZGeneration("programtica");
        User eliza = new YGeneration("elartist");
        User krzysiek = new Millenials("kys");

        //When
        String kostekSharingSystem = kostek.sharePost();
        System.out.println("Kostek should " + kostekSharingSystem);
        String elizaSharingSystem = eliza.sharePost();
        System.out.println("Eliza should " + elizaSharingSystem);
        String krzysiekSharingSystem = krzysiek.sharePost();
        System.out.println("Krzysiek should " + krzysiekSharingSystem);

        //Then
        Assert.assertEquals("share a post to a Twitter", kostekSharingSystem);
        Assert.assertEquals("share a post to a Facebook", elizaSharingSystem);
        Assert.assertEquals("share a post to a Snapchat", krzysiekSharingSystem);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User kostek = new ZGeneration("programtica");
        //When
        String kostekSharingSystem = kostek.sharePost();
        System.out.println("Kostek should " + kostekSharingSystem);
        kostek.setSocialPublisher(new FacebookPublisher());
        kostekSharingSystem = kostek.sharePost();
        System.out.println("Kostek now should " + kostekSharingSystem);

        //Then
        Assert.assertEquals("share a post to a Facebook", kostekSharingSystem);
    }
}

