DROP TABLE IF EXISTS reports;

CREATE TABLE reports (
    id BIGINT GENERATED ALWAYS AS IDENTITY,

    report_date VARCHAR(250) NOT NULL,
    instrument VARCHAR(250) NOT NULL,

    long_positions VARCHAR(250) DEFAULT NULL,
    short_positions VARCHAR(250) DEFAULT NULL,
    change_long VARCHAR(250) DEFAULT NULL,
    change_short VARCHAR(250) DEFAULT NULL,

    percentage_long VARCHAR(250) DEFAULT NULL,
    percentage_short VARCHAR(250) DEFAULT NULL,
    percentage_long_change VARCHAR(250) DEFAULT NULL,
    percentage_short_change VARCHAR(250) DEFAULT NULL,

    net_positions VARCHAR(250) DEFAULT NULL,
    net_positions_change VARCHAR(250) DEFAULT NULL,
);
