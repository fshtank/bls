package com.fshtank.bls.exceptions;

/**
 * Generic Exception
 */
public class BlsException extends Exception {
    /**
     * @param string
     * @param cause
     */
    public BlsException(String string, Throwable cause) {
        super(string, cause);
    }

    public BlsException(String string) {
        super(string);
    }
}
