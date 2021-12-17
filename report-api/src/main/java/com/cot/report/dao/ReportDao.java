package com.cot.report.dao;

import com.cot.report.model.ReportDto;

import java.util.List;

/**
 * @author davidjmartin
 */
public interface ReportDao {
    List<ReportDto> findBySymbol(String symbol);
    List<ReportDto> saveReports(List<ReportDto> reportDto);
}