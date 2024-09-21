package com.bridgelabz.moodanalyzer;

public enum MoodAnalysisError {
    NULL_MOOD("Mood message cannot be null"),
    EMPTY_MOOD("Mood message cannot be empty");

    private final String message;

    MoodAnalysisError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
