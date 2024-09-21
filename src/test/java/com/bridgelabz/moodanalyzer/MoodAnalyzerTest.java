package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class MoodAnalyzerTest {

        @Test
        public void givenEmptyMood_shouldInformUserOfEmptyMood() {
            try {
                // Arrange
                MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");

                // Act
                moodAnalyzer.analyzeMood();
            } catch (MoodAnalysisException e) {
                // Assert
                assertEquals(MoodAnalysisError.EMPTY_MOOD.getMessage(), e.getMessage());
            }
        }


    }

