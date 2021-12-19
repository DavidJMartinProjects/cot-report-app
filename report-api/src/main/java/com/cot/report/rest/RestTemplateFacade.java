package com.cot.report.rest;

import com.cot.report.exception.WorkflowApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author davidjmartin
 */
public class RestTemplateFacade {

    @Autowired
    private RestTemplate restTemplate;

    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, @Nullable HttpEntity<?> requestEntity, Class<T> responseType) {
        try {
            return restTemplate.exchange(url, HttpMethod.POST, requestEntity, responseType);
        } catch (RestClientException exception) {
            throw new WorkflowApiException(exception.getMessage());
        }
    }

}

// ToDo: Convert this to an exchange method and handle rest template exceptions
// ToDo: implement a common module for shared classes
// ToDo: implement a basic workflow
