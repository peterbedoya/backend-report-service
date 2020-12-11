DROP TABLE IF EXISTS service_report;

CREATE TABLE service_report
(
  service_report_id INT NOT NULL
  AUTO_INCREMENT PRIMARY KEY,
  technical_id VARCHAR (250) NOT NULL,
  service_id VARCHAR (250) NOT NULL,
  started_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP NOT NULL
);


DROP TABLE IF EXISTS parameter;

CREATE TABLE parameter
(
  parameter_id INT AUTO_INCREMENT PRIMARY KEY,
  type_parameter VARCHAR,
  start_time Date,
  end_time Date
);
