package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {


    @Test
    public void givenNullMood_ShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
