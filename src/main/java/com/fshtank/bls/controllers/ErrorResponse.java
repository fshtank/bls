/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fshtank.bls.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.fshtank.bls.exceptions.BlsException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rick Fisher (ess-zee-en-elef-zero) - Exception Man
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JacksonXmlRootElement(localName = "Error")
public class ErrorResponse {

    private static final Logger LOGGER = LogManager.getLogger(ErrorResponse.class);

    Exception exception;
    List<String> additionalText;
    List<String> stackTrace;

    String errMsg = "An error occurred processing your offers request";

    public ErrorResponse(String... text) {
        this(null, false, text);
        LOGGER.error("An error occurred in Ofertas: " + text);
    }

    public ErrorResponse(Exception exception, String... additionalText) {
        this(exception, false, additionalText);
        LOGGER.error("An error occurred in Ofertas: " + additionalText, exception);
    }

    public ErrorResponse(Exception exception, boolean includeStackTrace, String... additionalText) {
        this.exception = exception;
        if (null != exception && includeStackTrace) {
            populateStackTrace(exception);
        }
        this.additionalText = Arrays.asList(additionalText);
        LOGGER.error("An error occurred in Ofertas: " + additionalText, exception);
    }

    private void populateStackTrace(Exception exception1) {


        this.stackTrace = new ArrayList<>();
        for (StackTraceElement ste : exception1.getStackTrace()) {
            StringBuilder sb = new StringBuilder();

            sb//.append("at ")
                    .append(ste.getClassName())
                    .append(".").append(ste.getMethodName())
                    .append("(").append(ste.getFileName()).append(":").append(ste.getLineNumber())
                    .append(")");
            this.stackTrace.add(sb.toString());
        }
    }

    public String getMessage() {
        return exception.getMessage();
    }

    public String getCause() {
        return exception.toString();
    }

//    @JacksonXmlElementWrapper(localName = "AdditionalInfo", useWrapping = false)
    //@JacksonXmlProperty(localName = "Text")
    public List<String> getAdditionalInfo() {
        return additionalText;
    }

//    @JacksonXmlElementWrapper(localName = "StackTrace")
//    @JacksonXmlProperty(localName = "StackFrame")
    public List<String> getStackTrace() {
        return stackTrace;
    }
}
