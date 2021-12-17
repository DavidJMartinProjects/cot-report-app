package com.workflow.engine.exception;

/**
 * @author davidjmartin
 */
public class WorkflowApiException extends RuntimeException {
    public WorkflowApiException(String message) {
        super(message);
    }
}