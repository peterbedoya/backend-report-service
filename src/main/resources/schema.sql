DROP TABLE IF EXISTS service_report;

CREATE TABLE service_report
(
  service_report_id bigint AUTO_INCREMENT PRIMARY KEY,
  technical_id VARCHAR,
  service_id VARCHAR,
  started_date Date,
  end_date Date
);


DROP TABLE IF EXISTS parameter;

CREATE TABLE parameter
(
  parameter_id bigint AUTO_INCREMENT PRIMARY KEY,
  type_parameter VARCHAR,
  start_time VARCHAR,
  end_time Date
);
