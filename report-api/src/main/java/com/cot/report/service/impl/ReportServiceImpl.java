package com.cot.report.service.impl;

import com.cot.report.dao.ReportDao;
import com.cot.report.model.ReportDto;
import com.cot.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author davidjmartin
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDao reportDao;

    @Override
    public List<ReportDto> getReportBySymbol(String symbol) {
        return reportDao.findBySymbol(symbol);
    }

    @Override
    public String saveReports(List<ReportDto> reports) {
        return reportDao.saveReports(reports);
    }

    @Override
    public void deleteAllReports() {
        reportDao.deleteAllReports();
    }

}
