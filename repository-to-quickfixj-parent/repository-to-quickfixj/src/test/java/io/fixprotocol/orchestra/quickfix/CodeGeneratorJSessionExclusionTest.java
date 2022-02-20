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
			,"EncodedText.java"
			,"EncodedTextLen.java"
			,"EncryptedNewPassword.java"
			,"EncryptedNewPasswordLen.java"
			,"EncryptedPassword.java"
			,"EncryptedPasswordLen.java"
			,"EncryptedPasswordMethod.java"
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
			,"NewPassword.java"
			,"NewSeqNo.java"
			,"NextExpectedMsgSeqNum.java"
			,"NoHops.java"
			,"NoMsgTypes.java"
			,"OnBehalfOfCompID.java"
			,"OnBehalfOfLocationID.java"
			,"OnBehalfOfSubID.java"
			,"OrigSendingTime.java"
			,"Password.java"
			,"PossDupFlag.java"
			,"PossResend.java"
			,"RawData.java"
			,"RawDataLength.java"
			,"RefApplExtID.java"
			,"RefApplVerID.java"
			,"RefCstmApplVerID.java"
			,"RefMsgType.java"
			,"RefSeqNum.java"
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
			,"Text.java"
			,"Username.java"
			,"XmlData.java"
			,"XmlDataLen.java"));
	
	private Set<String> sessionGroups = new HashSet<String>(Arrays.asList(	
			"HopGrp.java",
			"MsgTypeGrp.java",
			"AttachmentGrp.java",
			"AttachmentKeywordGrp.java"));
	
	File withSessionInclusionLatest =    new File("target/spec/generated-sources/withSessionInclusion/latest/");
	File withSessionInclusionFixLatest = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/fixlatest");
	File withSessionInclusionFixLatestComponent = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/fixlatest/component");
	File withSessionInclusionFixt11 = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/fixt11");
	File withSessionInclusionFixt11Component = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/fixt11/component");
	File withSessionInclusionField     = new File("target/spec/generated-sources/withSessionInclusion/latest/quickfix/field");

	File withSessionExclusionLatest =    new File("target/spec/generated-sources/withSessionExclusion/latest/");
	File withSessionExclusionFixLatest = new File("target/spec/generated-sources/withSessionExclusion/latest/quickfix/fixlatest");
	File withSessionExclusionFixLatestComponent = new File("target/spec/generated-sources/withSessionExclusion/latest/quickfix/fixlatest/component");
	File withSessionExclusionField     = new File("target/spec/generated-sources/withSessionExclusion/latest/quickfix/field");;
	
	@BeforeEach
	public void setUp() throws Exception {
		generator = new CodeGeneratorJ();
	}

	@AfterEach
	public void clearDown() throws Exception {
		File workingDir = new File("target/spec/generated-sources/withSessionInclusion");
		if (workingDir.exists()) {
			FileUtils.cleanDirectory(workingDir);
		}
		workingDir = new File("target/spec/generated-sources/withSessionExclusion");
		if (workingDir.exists()) {
			FileUtils.cleanDirectory(workingDir);
		}
	}
	
	@Test
	void testDefault() throws IOException {
	    generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionInclusionLatest);
	    // default should not exclude session files
	    assertFixT11PackageGenerated(withSessionInclusionFixLatest, withSessionInclusionFixt11, withSessionInclusionFixt11Component, withSessionInclusionField);
	    assertMessageBaseClassGenerated();
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
	void testDefaultOverridenForSessionExclusion() throws IOException {
		generator.setGenerateFixt11Package(false);
		generator.setExcludeSession(true);
		generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionExclusionLatest);
		assertNoSessionOnlyFilesGenerated();
	}


	@Test
	void testBaseClassGenerationFalse() throws IOException {
		generator.setGenerateMessageBaseClass(false);
		generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionInclusionLatest);
		assertMessageBaseClassNotGenerated();
	}
	
	@Test
	void testFixT11Generation() throws IOException {
		generator.setGenerateFixt11Package(true);
		generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionInclusionLatest);
		assertFixT11PackageGenerated(withSessionInclusionFixLatest, withSessionInclusionFixt11, withSessionInclusionFixt11Component, withSessionInclusionField);
	}
	
	@Test
	void testFixT11PackageNotGenerated() throws IOException {
		generator.setGenerateFixt11Package(false);
		generator.generate(
	            Thread.currentThread().getContextClassLoader().getResource("OrchestraFIXLatest.xml").openStream(),
	            withSessionInclusionLatest);
		assertMessageBaseClassGenerated();
		assertFixT11PackageNotGenerated(withSessionInclusionFixLatest, withSessionInclusionFixLatestComponent, withSessionInclusionField);
	}
	
	private void assertFixT11PackageGenerated(File messagesDirectory, File fixt11MessagesDirectory, File componentsDirectory, File fieldsDirectory) {
		// Session file should be in fixt11 package 
		File[] matchingFiles = fixt11MessagesDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionMessageClasses.contains(name);
	        }
	    });
	    assertEquals(sessionMessageClasses.size(), matchingFiles.length);
	    // not in fixlatest package
	    matchingFiles = messagesDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionMessageClasses.contains(name);
	        }
	    });
	    assertEquals(0, matchingFiles.length);
	    // following components should be under fixt11
	    matchingFiles = componentsDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return name.equals("HopGrp.java") || name.equals("MsgTypeGrp.java");
	        }
	    });
	    assertEquals(2,matchingFiles.length);
	    //Fields
	    matchingFiles = fieldsDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionFieldClasses.contains(name);
	        }
	    });
	    assertEquals(sessionFieldClasses.size(), matchingFiles.length);
	    assertSessionGroupCreated(componentsDirectory);
	}

	private void assertMessageBaseClassGenerated() {
	    File[] matchingFiles = withSessionInclusionFixLatest.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return name.equals("Message.java");
	        }
	    });
	    assertEquals(1,matchingFiles.length);
	    matchingFiles = withSessionInclusionFixLatestComponent.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return name.equals("StandardHeader.java") || name.equals("StandardTrailer.java");
	        }
	    });
	    assertEquals(0,matchingFiles.length);
	}
	
	private void assertMessageBaseClassNotGenerated() {
	    File[] matchingFiles = withSessionInclusionFixLatestComponent.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return name.equals("Message.java");
	        }
	    });
	    assertEquals(0,matchingFiles.length);
	    matchingFiles = withSessionInclusionFixLatestComponent.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return name.equals("StandardHeader.java") || name.equals("StandardTrailer.java");
	        }
	    });
	    assertEquals(0,matchingFiles.length);
	}
	
	private void assertFixT11PackageNotGenerated(File messagesDirectory, File componentDirectory, File fieldDirectory) {
	    File[] matchingFiles = messagesDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionMessageClasses.contains(name);
	        }
	    });
	    assertEquals(sessionMessageClasses.size(), matchingFiles.length);
		//Fields
	    matchingFiles = fieldDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionFieldClasses.contains(name);
	        }
	    });
	    assertEquals(sessionFieldClasses.size(), matchingFiles.length);
	    assertSessionGroupCreated(componentDirectory);
	}

	private void assertSessionGroupCreated(File componentDirectory) {
	    File[] matchingFiles = componentDirectory.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionGroups.contains(name);
	        }
	    });
	    assertEquals(4,matchingFiles.length);
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
	    assertSessionOnlyGroupsNotCreated();
	}

	private void assertSessionOnlyGroupsNotCreated() {
	    File[] matchingFiles = withSessionExclusionFixLatestComponent.listFiles(new FilenameFilter() {
	        public boolean accept(File dir, String name) {
	            return sessionGroups.contains(name);
	        }
	    });
	    // "AttachmentGrp.java" and "AttachmentKeywordGrp.java" are not only used in session msgs
	    assertEquals(2,matchingFiles.length);
	}

}
