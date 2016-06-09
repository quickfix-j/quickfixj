CREATE TABLE messages (
  beginstring VARCHAR2(8) NOT NULL,
  sendercompid VARCHAR2(64) NOT NULL,
  sendersubid VARCHAR2(64) NOT NULL,
  senderlocid VARCHAR2(64) NOT NULL,
  targetcompid VARCHAR2(64) NOT NULL,
  targetsubid VARCHAR2(64) NOT NULL,
  targetlocid VARCHAR2(64) NOT NULL,
  session_qualifier VARCHAR2(64) NOT NULL,
  msgseqnum INTEGER NOT NULL,
  message VARCHAR2(4000) NOT NULL,
  PRIMARY KEY (beginstring, sendercompid, sendersubid, senderlocid,
               targetcompid, targetsubid, targetlocid, session_qualifier, msgseqnum)
);
