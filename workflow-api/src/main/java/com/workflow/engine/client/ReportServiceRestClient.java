package com.workflow.engine.client;

import com.workflow.engine.client.rest.RestTemplateFacade;
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
        restTemplateFacade.exchange(REPORT_SERVICE_API_URL, HttpMethod.POST, new HttpEntity<>(report), List.class);
    }

    public void deleteReport() {
//        restTemplateFacade.delete();
    }

}
