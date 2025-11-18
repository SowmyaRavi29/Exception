package moodAnalyzer;

public class MoodAnalysisException extends Exception {
    enum ExceptionType { NULL, EMPTY }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}