package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    
    @Test
    public void givenMessage_WhenSad_ShouldReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");

        String mood = moodAnalyzer.analyzeMood();

        Assert.assertEquals("SAD", mood);
    }
}
