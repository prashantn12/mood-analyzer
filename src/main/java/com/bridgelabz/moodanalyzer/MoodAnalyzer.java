package com.bridgelabz.moodanalyzer;
import java.util.*;

class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
        this.message = "";  // Initialize with an empty string
    }


    public MoodAnalyzer(String message) {
        this.message = message;
    }


    public String analyzeMood() {
        try {
            if (message == null) {
                throw new NullPointerException("Mood message cannot be null");
            }

            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        System.out.println(moodAnalyzer.analyzeMood());  // Output: HAPPY (since null is handled)
    }
}



