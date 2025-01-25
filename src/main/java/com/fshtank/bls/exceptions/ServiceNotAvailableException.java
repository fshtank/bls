package com.fshtank.bls.exceptions;

/**
 * This exception type is thrown when current offers can't produce current offers for whatever the reason.
 * <p>
 * Created by Exception Man
 */
public class ServiceNotAvailableException extends Exception {

    public ServiceNotAvailableException(String string, Throwable cause) {
        super(string, cause);
    }

    public ServiceNotAvailableException(String string) {
        super(string);
    }
}
