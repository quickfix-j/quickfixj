CREATE TABLE messages (
  beginstring VARCHAR2(8) NOT NULL,
  sendercompid VARCHAR2(64) NOT NULL,
  targetcompid VARCHAR2(64) NOT NULL,
  session_qualifier VARCHAR2(64) NOT NULL,
  msgseqnum INTEGER NOT NULL, 
  message VARCHAR2(4000) NOT NULL,
  PRIMARY KEY (beginstring, sendercompid, targetcompid, session_qualifier, msgseqnum)
);