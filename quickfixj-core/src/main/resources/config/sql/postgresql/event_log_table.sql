CREATE SEQUENCE event_log_sequence;

CREATE TABLE event_log (
  id INTEGER DEFAULT NEXTVAL('event_log_sequence'),
  time TIMESTAMP NOT NULL,
  beginstring CHAR(8) NOT NULL,
  sendercompid VARCHAR(64) NOT NULL,
  sendersubid VARCHAR(64) NOT NULL,
  senderlocid VARCHAR(64) NOT NULL,
  targetcompid VARCHAR(64) NOT NULL,
  targetsubid VARCHAR(64) NOT NULL,
  targetlocid VARCHAR(64) NOT NULL,
  session_qualifier VARCHAR(64),
  text TEXT NOT NULL,
  PRIMARY KEY (id)
);