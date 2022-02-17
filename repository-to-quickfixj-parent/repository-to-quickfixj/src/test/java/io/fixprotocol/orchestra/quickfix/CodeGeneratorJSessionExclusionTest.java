package io.fixprotocol.orchestra.quickfix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.commons.io.FileUtils;

class CodeGeneratorJSessionExclusionTest {

	private CodeGeneratorJ generator;
	private Set<String> sessionMessageClasses = new HashSet<String>(Arrays.asList(
		  "Logon.java" 
		 ,"Logout.java" 
		 ,"Heartbeat.java"
		 ,"TestRequest.java"
		 ,"ResendRequest.java"
		 ,"Reject.java"
		 ,"SequenceReset.java"
		 ,"XMLnonFIX.java"));
	
	private Set<String> sessionFieldClasses = new HashSet<String>(Arrays.asList(
			 "ApplExtID.java"
			,"ApplVerID.java"
			,"BeginSeqNo.java"
			,"BeginString.java"
			,"BodyLength.java"
			,"CheckSum.java"
			,"CstmApplVerID.java"
			,"DefaultApplExtID.java"
			,"DefaultApplVerID.java"
			,"DefaultCstmApplVerID.java"
			,"DefaultVerIndicator.java"
			,"DeliverToCompID.java"
			,"DeliverToLocationID.java"
			,"DeliverToSubID.java"
			,"EncryptMethod.java"
			,"EndSeqNo.java"
			,"GapFillFlag.java"
			,"HeartBtInt.java"
			,"HopCompID.java"
			,"HopRefID.java"
			,"HopSendingTime.java"
			,"LastMsgSeqNumProcessed.java"
			,"MaxMessageSize.java"
			,"MessageEncoding.java"
			,"MsgDirection.java"
			,"MsgSeqNum.java"
			,"MsgType.java"
			,"NewSeqNo.java"
			,"NextExpectedMsgSeqNum.java"
			,"NoHops.java"
			,"NoMsgTypes.java"
			,"OnBehalfOfCompID.java"
			,"OnBehalfOfLocationID.java"
			,"OnBehalfOfSubID.java"
			,"OrigSendingTime.java"
			,"PossDupFlag.java"
			,"PossResend.java"
			,"RefTagID.java"
			,"ResetSeqNumFlag.java"
			,"SecureData.java"
			,"SecureDataLen.java"
			,"SenderCompID.java"
			,"SenderLocationID.java"
			,"SenderSubID.java"
			,"SendingTime.java"
			,"SessionRejectReason.java"
			,"SessionStatus.java"
			,"Signature.java"
			,"SignatureLength.java"
			,"TargetCompID.java"
			,"TargetLocationID.java"
			,"TargetSubID.java"
			,"TestMessageIndicator.java"
			,"TestReqID.java"
			,"XmlData.java"
			,"XmlDataLen.java"));
	
	File withSessionInclusionLatest =    new File("target/spec/generated-sources/withSessionInclusion/latest/");
	File withSessionExclusionLatest =    new File("target/spec/generated-sources/withSessionExclusion/latest/");
	File withSessionInclusionFixLatest = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/fixlatest");
	File withSessionInclusionField     = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/field");
	File withSessionExclusionFixLatest = new File("target/spec/generated-sources/withSessionExclusion/latest/quickfix/fixlatest");
	File withSessionExclusionField     = new File("target/spec/generated-sources/withSessionExclusion/latest/quickfix/field");;
	
	@BeforeEach
	public void setUp() throws Exception {
		generator = new CodeGeneratorJ();
	}

	@AfterEach
	public void clearDown() throws Exception {
		FileUtils.cleanDirectory(withSessionInclusionLatest);
		FileUtils.cleanDirectory(withSessionExclusionLatest);
	}
	
	@Test
	void testDefault() throws IOException {
	    generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionInclusionLatest);
	    // default should not exclude session files
	    assertSessionFilesGenerated();
	}
	
	@Test
	void testMutuallyExclusiveOptions() throws IOException {
		assertThrows(IllegalArgumentException.class, () -> {
			generator.setExcludeSession(true);
	    });
	}
	
	@Test
	void testMutuallyCompatibleOptions() throws IOException {
		generator.setGenerateFixt11Package(false);
		generator.setExcludeSession(true);
	}
	
	@Test
	void testDefaultOverriden() throws IOException {
		generator.setGenerateFixt11Package(false);
		generator.setExcludeSession(true);
		generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionExclusionLatest);
		assertNoSessionOnlyFilesGenerated();
	}

	
	@Test
	void testBaseClassGeneration() throws IOException {
		//TODO
	}
	
	private void assertSessionFilesGenerated() {
	    File[] matchingFiles = withSessionInclusionFixLatest.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionMessageClasses.contains(name);
	        }
	    });
	    assertEquals(sessionMessageClasses.size(), matchingFiles.length);
		//Fields
	    matchingFiles = withSessionInclusionField.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionFieldClasses.contains(name);
	        }
	    });
	    assertEquals(sessionFieldClasses.size(), matchingFiles.length);
	    assertSessionGroupCreated();
	}

	private void assertSessionGroupCreated() {
		//TODO
	}
	
	/**
	 * Asserts that no files that are only used in the session layer are generated
	 */
	private void assertNoSessionOnlyFilesGenerated() {
	    File[] matchingFiles = withSessionExclusionFixLatest.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionMessageClasses.contains(name);
	        }
	    });
	    assertEquals(0,matchingFiles.length);

	    matchingFiles = withSessionExclusionField.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionFieldClasses.contains(name);
	        }
	    });
	    for (int i =0; i< matchingFiles.length; i++) {
	    	System.err.printf("Found File %s%n", matchingFiles[i]);
	    }
	    assertEquals(0, matchingFiles.length);
	    assertSessionGroupNotCreated();
	}

	private void assertSessionGroupNotCreated() {
		//TODO
	}

}
