package com.workflow.engine.exception;

import lombok.Builder;
import lombok.Data;

/**
 * @author davidjmartin
 */
@Data
@Builder
public class ErrorData {
    private String url;
    private String errorCode;
    private String message;
    private String timestamp;
}