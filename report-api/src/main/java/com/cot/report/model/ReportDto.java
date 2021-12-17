package com.cot.report.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author davidjmartin
 */
@Data
@Builder
public class ReportDto {

    private long id;

    private String instrument;
    private String  reportDate;

    private double longPositions;
    private double shortPositions;
    private String changeLong;
    private String changeShort;

    private String percentageLong;
    private String percentageShort;
    private String percentageLongChange;
    private String percentageShortChange;

    private double netPositions;
    private double netPositionsChange;

}
