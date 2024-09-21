package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {


    @Test(expected = MoodAnalysisException.class)
    public void givenNullMood_shouldThrowMoodAnalysisException() throws MoodAnalysisException {
        // Arrange
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);

        // Act
        moodAnalyzer.analyzeMood();  

        // Assert is handled by the expected parameter of the @Test annotation
    }
}

