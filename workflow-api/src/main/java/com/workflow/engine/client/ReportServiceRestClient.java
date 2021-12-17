package com.workflow.engine.client;

import com.workflow.engine.client.rest.RestTemplateFacade;
import com.workflow.engine.exception.WorkflowApiException;
import com.workflow.engine.model.ReportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;

import java.util.List;

/**
 * @author davidjmartin
 */
public class ReportServiceRestClient {

    private final static String REPORT_SERVICE_API_URL = "http://localhost:8080/reports";

    @Autowired
    private RestTemplateFacade restTemplateFacade;

    public void postReport(List<ReportDto> report) {
        try {
            restTemplateFacade.exchange(REPORT_SERVICE_API_URL, HttpMethod.POST, new HttpEntity<>(report), List.class);
        } catch (WorkflowApiException exception) {
            throw new WorkflowApiException("Encountered Error during POST request to report-api service.");
        }
    }

    public void deleteReport() {
        try {
            restTemplateFacade.exchange(REPORT_SERVICE_API_URL, HttpMethod.DELETE, null, null);
        } catch (WorkflowApiException exception) {
            throw new WorkflowApiException("Encountered Error during DELETE request to report-api service.");
        }
    }

}
