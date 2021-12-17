package com.cot.report.db;

import com.cot.report.model.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author davidjmartin
 */
@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long> {

    Collection<ReportEntity> findByInstrument(String instrument);

}

