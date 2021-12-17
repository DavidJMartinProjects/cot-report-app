package com.cot.report.db;

import com.cot.report.model.ReportDto;
import com.cot.report.model.ReportEntity;
import com.cot.report.model.mapper.ReportMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author davidjmartin
 */
@Service
@Slf4j
public class ReportDao {

    @Autowired
    private ReportMapper mapper;

    @Autowired
    private ReportRepository repository;

    public List<ReportDto> findBySymbol(String symbol) {
        return repository.findByInstrument(symbol)
            .stream()
            .map(entity -> mapper.toDto(entity, ReportDto.class))
            .collect(Collectors.toList());
    }

    public List<ReportDto> saveReports(List<ReportDto> reportDto) {
        List<ReportEntity> reportEntities = mapper.toList(reportDto, ReportEntity.class);
        return mapper.toList(repository.saveAll(reportEntities), ReportDto.class);
    }

}
