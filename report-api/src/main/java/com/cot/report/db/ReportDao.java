package com.cot.report.db;

import com.cot.report.model.ReportDto;

import java.util.List;

/**
 * @author davidjmartin
 */
public interface ReportDao {
    List<ReportDto> findBySymbol(String symbol);
    String saveReports(List<ReportDto> reportDto);
    void deleteAllReports();
}
