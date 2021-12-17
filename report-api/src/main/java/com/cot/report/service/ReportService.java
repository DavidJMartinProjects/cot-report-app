package com.cot.report.service;

import com.cot.report.model.ReportDto;

import java.util.List;

/**
 * @author davidjmartin
 */
public interface ReportService {
    List<ReportDto> getReportBySymbol(String symbol);
}

