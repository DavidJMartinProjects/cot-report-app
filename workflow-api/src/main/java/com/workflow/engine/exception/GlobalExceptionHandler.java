package com.workflow.engine.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

import static org.springframework.web.client.HttpServerErrorException.*;

/**
 * @author davidjmartin
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(WorkflowApiException.class)
    @ResponseStatus(code = HttpStatus.CONFLICT)
    @ResponseBody
    public ErrorData handleEntityNotFound(HttpServletRequest request, WorkflowApiException ex) {
        log.info("handling EntityNotFoundException: {}.", ex.getMessage());
        return buildErrorData("resource not found.", ex.getMessage(), request);
    }

    @ExceptionHandler(DataAccessException.class)
    @ResponseStatus(code = HttpStatus.CONFLICT)
    @ResponseBody
    public ErrorData handleDataAccessException(HttpServletRequest request, DataAccessException ex) {
        log.info("handling DataAccessException: {}.", ex.getMessage());
        return buildErrorData("encountered exception.", ex.getMessage(), request);
    }

    @ExceptionHandler(InternalServerError.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorData handleInternalServerError(HttpServletRequest request, InternalServerError ex) {
        log.info("handling InternalServerError: {}.", ex.getMessage());
        return buildErrorData("encountered exception.", ex.getMessage(), request);
    }

    private ErrorData buildErrorData(String errorCode, String message, HttpServletRequest request) {
        return ErrorData.builder()
                .errorCode(errorCode)
                .message(message)
                .url(request.getMethod() + " request to : " + request.getRequestURI())
                .timestamp(LocalDateTime.now().toString())
                .build();
    }

}