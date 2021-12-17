package com.workflow.engine.client.rest;

import com.workflow.engine.model.ReportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author davidjmartin
 */
public class RestTemplateFacade {

    private final static String REPORT_SERVICE_API_URL = "http://localhost:8080/reports";

    @Autowired
    private RestTemplate restTemplate;

    public void postForObject(List<ReportDto> report) {
        restTemplate.postForObject(REPORT_SERVICE_API_URL, report, List.class);
    }

    public void delete() {
        restTemplate.delete(REPORT_SERVICE_API_URL);
    }
    // ToDo: Convert this to an exchange method and handle rest template exceptions
    // ToDo: implement a common module for shared classes
    // ToDo: implement a basic workflow

}
