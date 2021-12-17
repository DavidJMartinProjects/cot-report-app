package com.cot.report.service;

import com.cot.report.db.ReportDao;
import com.cot.report.db.ReportRepository;
import com.cot.report.model.ReportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author davidjmartin
 */
@Service
public class ReportService {

    @Autowired
    private ReportDao reportDao;

    public List<ReportDto> getReportBySymbol(String symbol) {
        return reportDao.findBySymbol(symbol);
    }

}
