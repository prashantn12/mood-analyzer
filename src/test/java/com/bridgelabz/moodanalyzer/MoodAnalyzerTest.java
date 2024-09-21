package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHAPPY() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        
        String mood = moodAnalyzer.analyzeMood();

        Assert.assertEquals("HAPPY", mood);
    }
}
