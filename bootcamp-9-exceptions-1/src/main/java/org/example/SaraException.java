package org.example;

public class SaraException extends Exception{
    public SaraException() {
    }

    public SaraException(String message) {
        super(message);
    }

    public SaraException(String message, Throwable cause) {
        super(message, cause);
    }

    public SaraException(Throwable cause) {
        super(cause);
    }

    public SaraException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
