/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fshtank.bls.controllers;

import com.gm.gsmc.shoppingtools.ofertas.exceptions.OfertasException;
import com.gm.gsmc.shoppingtools.ofertas.exceptions.ServiceNotAvailableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

;

/**
 * @author Rick Fisher (ess-zee-en-elef-zero) - Exception Man
 */
@ControllerAdvice
public class DefaultExceptionHandlerAdvice {


    /**
     * Exception handler for otherwise unclassified illegal argument exception;
     *
     * @param e
     * @return
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException e) {
        OfertasException oe = new OfertasException("Http method " + e.getMethod() + " Not Suppported by this resource");
        return ResponseEntity.badRequest().body(new ErrorResponse(oe, false,
                "Http method \"" + e.getMethod() + "\" Not Suppported by this resource"));
    }

    /**
     * Exception handler for otherwise unclassified illegal argument exception;
     *
     * @param e
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleIllegalArgumentException(IllegalArgumentException e) {
        OfertasException oe = new OfertasException("Invalid Parameters, something else if we had something else to say..");
        return ResponseEntity.badRequest()
                .body(new ErrorResponse(
                        oe,
                        "Invalid Parameters",
                        "something else if we had something else to say.."
                ));
    }

    /**
     * Exception handler for commonly used shared exception class;
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ServiceNotAvailableException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleServiceNotAvailable(ServiceNotAvailableException e) {
        OfertasException oe = new OfertasException("A required datasource was not available. Attempting at a later time may succeed");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(new ErrorResponse(
                        oe,
                        true,
                        "A required datasource was not available",
                        "Attempting at a later time may succeed"
                ));
    }

    /**
     * Default catch-all exception handler. Best we can give is BAD_REQUEST
     *
     * @param e exception caught
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        OfertasException oe = new OfertasException("An unexpected error occurred");
        return ResponseEntity.badRequest().body(new ErrorResponse(oe, "  An unexpected error occurred"));
    }
}
