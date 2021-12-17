package com.workflow.engine.client;

import com.workflow.engine.client.rest.RestTemplateFacade;
import com.workflow.engine.model.ReportDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author davidjmartin
 */
public class ReportServiceRestClient {

    @Autowired
    private RestTemplateFacade restTemplateFacade;

    public void postReport(List<ReportDto> report) {
        restTemplateFacade.postForObject(report);
    }

    public void deleteReport() {
        restTemplateFacade.delete();
    }

}
