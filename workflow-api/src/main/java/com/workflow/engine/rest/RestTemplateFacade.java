package com.workflow.engine.rest;

import com.workflow.engine.model.ReportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author davidjmartin
 */
public class RestTemplateFacade {

    @Autowired
    private RestTemplate restTemplate;

    public void postReport(List<ReportDto> report) {
    }

    public void deleteReport() {

    }

}