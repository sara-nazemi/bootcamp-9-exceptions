package org.example;

public class GradeOutOfRangeException extends Exception{
    public GradeOutOfRangeException() {
    }

    public GradeOutOfRangeException(String message) {
        super(message);
    }

    public GradeOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeOutOfRangeException(Throwable cause) {
        super(cause);
    }

    public GradeOutOfRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
