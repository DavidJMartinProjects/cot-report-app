package com.cot.report.controller;

import com.cot.report.model.ReportDto;
import com.cot.report.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author davidjmartin
 */
@RestController
@RequestMapping(ReportController.REPORT_BASE_PATH)
@Slf4j
public class ReportController {

    public static final String REPORT_BASE_PATH = "/report";

    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity<List<ReportDto>> getReportBySymbol(@RequestParam final String symbol) {
        log.info("GET: " + REPORT_BASE_PATH + "?symbol={}", symbol);
        return ResponseEntity.ok(reportService.getReportBySymbol(symbol));
    }

    @PostMapping
    public ResponseEntity<String> saveReports(@RequestBody List<ReportDto> reports) {
        log.info("POST: " + REPORT_BASE_PATH );
        return ResponseEntity.ok(reportService.saveReports(reports));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllReports() {
        log.info("DELETE: " + REPORT_BASE_PATH );
        reportService.deleteAllReports();
        return ResponseEntity.noContent().build();
    }

}
