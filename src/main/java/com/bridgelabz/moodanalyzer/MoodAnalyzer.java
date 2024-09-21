package com.bridgelabz.moodanalyzer;
import java.util.*;

class MoodAnalyzer {
    private String message;

    // Default constructor
    public MoodAnalyzer() {
        this.message = "";  // Initialize with an empty string
    }

    // Parameterized constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // Method to analyze the mood and handle NULL or empty scenario
    public String analyzeMood() throws MoodAnalysisException {
        if (message == null) {
            throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD.getMessage());
        }
        if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD.getMessage());
        }
        // Check if the message contains the word "Sad"
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            System.out.println(moodAnalyzer.analyzeMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            System.out.println(moodAnalyzer.analyzeMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



