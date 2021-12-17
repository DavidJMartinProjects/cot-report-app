package com.cot.report.db;

import com.cot.report.model.ReportDto;

import java.util.List;

/**
 * @author davidjmartin
 */
public interface ReportDao {
    public List<ReportDto> findBySymbol(String symbol);
    public List<ReportDto> saveReports(List<ReportDto> reportDto);
}
