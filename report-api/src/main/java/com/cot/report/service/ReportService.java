package com.cot.report.service;

import com.cot.report.db.impl.ReportDaoImpl;
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
    private ReportDaoImpl reportDao;

    public List<ReportDto> getReportBySymbol(String symbol) {
        return reportDao.findBySymbol(symbol);
    }

}
