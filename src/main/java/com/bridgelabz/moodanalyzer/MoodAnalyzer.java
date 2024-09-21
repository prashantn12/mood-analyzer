package com.bridgelabz.moodanalyzer;
import java.util.*;

class MoodAnalyzer {


    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        // Check if the message contains the word "Sad"
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        System.out.println(moodAnalyzer.analyzeMood());  // Output: SAD
    }
}

