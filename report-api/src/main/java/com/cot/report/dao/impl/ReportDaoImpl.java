package com.cot.report.dao.impl;

import com.cot.report.dao.ReportDao;
import com.cot.report.dao.db.ReportRepository;
import com.cot.report.model.ReportDto;
import com.cot.report.model.ReportEntity;
import com.cot.report.model.mapper.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author davidjmartin
 */
@Service
public class ReportDaoImpl implements ReportDao {

    @Autowired
    private ReportMapper mapper;

    @Autowired
    private ReportRepository repository;

    @Override
    public List<ReportDto> findBySymbol(String symbol) {
        return repository.findByInstrument(symbol)
            .stream()
            .map(entity -> mapper.toDto(entity, ReportDto.class))
            .collect(Collectors.toList());
    }

    @Override
    public List<ReportDto> saveReports(List<ReportDto> reportDto) {
        List<ReportEntity> reportEntities = mapper.toList(reportDto, ReportEntity.class);
        return mapper.toList(repository.saveAll(reportEntities), ReportDto.class);
    }

}
