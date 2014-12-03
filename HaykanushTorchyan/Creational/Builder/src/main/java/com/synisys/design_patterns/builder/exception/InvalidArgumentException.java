package com.synisys.design_patterns.builder.exception;

/**
 * Created by haykanush.torchyan on 11/3/2014.
 */
public class InvalidArgumentException extends RuntimeException {

    public InvalidArgumentException() {
        super();
    }

    /**
     * Constructs a new <code>InvalidArgumentException</code> exception
     * with the specified detail message.
     *
     * @param message the detail message.
     */
    public InvalidArgumentException(String message) {
        super(message);
    }

    /**
     * Constructs a new <code>InvalidArgumentException</code> exception
     * with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause   the cause.
     */
    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new <code>InvalidArgumentException</code> exception
     * with the specified cause.
     *
     * @param cause the cause.
     */
    public InvalidArgumentException(Throwable cause) {
        super(cause);
    }
}
