package org.quickfixj;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.shared.model.fileset.FileSet;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.io.Files;

public class ClassPrunerMojoTest
{
	private List<String> classesList = new ArrayList<String>(Arrays.asList(
			 "Account"
			,"AccruedInterestAmt"
			,"AccruedInterestRate"
			,"AdvId"
			,"AdvRefID"
			,"AdvSide"
			,"AdvTransType"
			,"AllocAccount"
			,"AllocAvgPx"
			,"AllocHandlInst"
			,"AllocID"
			,"AllocLinkID"
			,"AllocLinkType"
			,"AllocNetMoney"
			,"AllocRejCode"
			,"AllocShares"
			,"AllocStatus"
			,"AllocText"
			,"AllocTransType"
			,"AvgPrxPrecision"
			,"AvgPx"
			,"BeginSeqNo"
			,"BeginString"
			,"BidForwardPoints"
			,"BidPx"
			,"BidSize"
			,"BidSpotRate"
			,"BodyLength"
			,"BrokerOfCredit"
			,"CashOrderQty"
			,"CashSettlAgentAcctName"
			,"CashSettlAgentAcctNum"
			,"CashSettlAgentCode"
			,"CashSettlAgentContactName"
			,"CashSettlAgentContactPhone"
			,"CashSettlAgentName"
			,"CheckSum"
			,"ClientID"
			,"ClOrdID"
			,"Commission"
			,"CommType"
			,"CoveredOrUncovered"
			,"CumQty"
			,"Currency"
			,"CustomerOrFirm"
			,"CxlQty"
			,"CxlRejReason"
			,"CxlType"
			,"DeliverToCompID"
			,"DeliverToLocationID"
			,"DeliverToSubID"
			,"DKReason"
			,"DlvyInst"
			,"EffectiveTime"
			,"EmailThreadID"
			,"EmailType"
			,"EncryptMethod"
			,"EndSeqNo"
			,"ExDestination"
			,"ExecBroker"
			,"ExecID"
			,"ExecInst"
			,"ExecRefID"
			,"ExecTransType"
			,"ExecType"
			,"ExpireTime"
			,"ForexReq"
			,"FutSettDate"
			,"FutSettDate2"
			,"GapFillFlag"
			,"HandlInst"
			,"Headline"
			,"HeartBtInt"
			,"IDSource"
			,"IOIID"
			,"IOINaturalFlag"
			,"IOIOthSvc"
			,"IOIQltyInd"
			,"IOIQualifier"
			,"IOIRefID"
			,"IOIShares"
			,"IOITransType"
			,"Issuer"
			,"LastCapacity"
			,"LastForwardPoints"
			,"LastMkt"
			,"LastPx"
			,"LastShares"
			,"LastSpotRate"
			,"LeavesQty"
			,"LinesOfText"
			,"ListExecInst"
			,"ListID"
			,"ListNoOrds"
			,"ListSeqNo"
			,"LocateReqd"
			,"MaturityDay"
			,"MaturityMonthYear"
			,"MaxFloor"
			,"MaxShow"
			,"MinQty"
			,"MiscFeeAmt"
			,"MiscFeeCurr"
			,"MiscFeeType"
			,"MsgSeqNum"
			,"MsgType"
			,"NetMoney"
			,"NewSeqNo"
			,"NoAllocs"
			,"NoDlvyInst"
			,"NoExecs"
			,"NoIOIQualifiers"
			,"NoMiscFees"
			,"NoOrders"
			,"NoRelatedSym"
			,"NoRpts"
			,"NotifyBrokerOfCredit"
			,"NumDaysInterest"
			,"OfferForwardPoints"
			,"OfferPx"
			,"OfferSize"
			,"OfferSpotRate"
			,"OnBehalfOfCompID"
			,"OnBehalfOfLocationID"
			,"OnBehalfOfSubID"
			,"OpenClose"
			,"OptAttribute"
			,"OrderID"
			,"OrderQty"
			,"OrderQty2"
			,"OrdRejReason"
			,"OrdStatus"
			,"OrdType"
			,"OrigClOrdID"
			,"OrigSendingTime"
			,"OrigTime"
			,"PegDifference"
			,"PossDupFlag"
			,"PossResend"
			,"PrevClosePx"
			,"Price"
			,"ProcessCode"
			,"PutOrCall"
			,"QuoteID"
			,"QuoteReqID"
			,"RawData"
			,"RawDataLength"
			,"RefAllocID"
			,"RefSeqNum"
			,"RelatdSym"
			,"ReportToExch"
			,"ResetSeqNumFlag"
			,"RptSeq"
			,"Rule80A"
			,"SecondaryOrderID"
			,"SecureData"
			,"SecureDataLen"
			,"SecurityDesc"
			,"SecurityExchange"
			,"SecurityID"
			,"SecuritySettlAgentAcctName"
			,"SecuritySettlAgentAcctNum"
			,"SecuritySettlAgentCode"
			,"SecuritySettlAgentContactName"
			,"SecuritySettlAgentContactPhone"
			,"SecuritySettlAgentName"
			,"SecurityType"
			,"SenderCompID"
			,"SenderLocationID"
			,"SenderSubID"
			,"SendingTime"
			,"SettlBrkrCode"
			,"SettlCurrAmt"
			,"SettlCurrency"
			,"SettlCurrFxRate"
			,"SettlCurrFxRateCalc"
			,"SettlDeliveryType"
			,"SettlDepositoryCode"
			,"SettlInstCode"
			,"SettlInstID"
			,"SettlInstMode"
			,"SettlInstSource"
			,"SettlInstTransType"
			,"SettlLocation"
			,"SettlmntTyp"
			,"Shares"
			,"Side"
			,"Signature"
			,"SignatureLength"
			,"StandInstDbID"
			,"StandInstDbName"
			,"StandInstDbType"
			,"StopPx"
			,"StrikePrice"
			,"Subject"
			,"Symbol"
			,"SymbolSfx"
			,"TargetCompID"
			,"TargetLocationID"
			,"TargetSubID"
			,"TestReqID"
			,"Text"
			,"TimeInForce"
			,"TradeDate"
			,"TransactTime"
			,"Urgency"
			,"URLLink"
			,"ValidUntilTime"
			,"ValuationBusinessCenter"
			,"ValuationDate"
			,"ValuationMethod"
			,"ValuationReferenceModel"
			,"ValuationSource"
			,"ValuationTime"
			,"ValueCheckAction"
			,"ValueCheckType"
			,"ValueOfFutures"
			,"VegaMultiplier"
			,"VenueType"
			,"VerificationMethod"
			,"VersusPurchaseDate"
			,"VersusPurchasePrice"
			,"Volatility"
			,"VoluntaryRegulatoryReport"
			,"WarningText"
			,"WaveNo"
			,"WireReference"
			,"WorkingIndicator"
			,"WtAverageLiquidity"
			,"Yield"
			,"YieldCalcDate"
			,"YieldRedemptionDate"
			,"YieldRedemptionPrice"
			,"YieldRedemptionPriceType"
			,"YieldType"));
	
    List<String> someFieldNamesThatShouldBePruned = 
            new ArrayList<>(Arrays.asList("ValuationBusinessCenter",
                                          "ValuationDate",
                                          "ValuationMethod",
                                          "ValuationReferenceModel",
                                          "ValuationSource",
                                          "ValuationTime",
                                          "ValueCheckAction",
                                          "ValueCheckType",
                                          "ValueOfFutures",
                                          "VegaMultiplier",
                                          "VenueType",
                                          "VerificationMethod",
                                          "VersusPurchaseDate",
                                          "VersusPurchasePrice",
                                          "Volatility",
                                          "VoluntaryRegulatoryReport",
                                          "WarningText",
                                          "WireReference",
                                          "WorkingIndicator",
                                          "WtAverageLiquidity",
                                          "Yield",
                                          "YieldCalcDate",
                                          "YieldRedemptionDate",
                                          "YieldRedemptionPrice",
                                          "YieldRedemptionPriceType",
                                          "YieldType"));
    
    @Rule
    public MojoRule rule = new MojoRule()
    {
        @Override
        protected void before() throws Throwable 
        {
        }

        @Override
        protected void after()
        {
        }
    };
    
	@After
	public void clearDown() throws Exception {

	}
	

    /**
     * @throws Exception if any
     */
    @Test
    public void testPrune()
            throws Exception
    {
        File pom = new File("target/test-classes/project-to-test/");
        assertNotNull( pom );
        assertTrue( pom.exists() );

        ClassPrunerMojo myMojo = ( ClassPrunerMojo ) rule.lookupConfiguredMojo( pom, "prune" );
        assertNotNull( myMojo );

        File classesDirectory = ( File ) rule.getVariableValueFromObject( myMojo, "classesDirectory" );
        assertNotNull( classesDirectory );
        if (!classesDirectory.exists()) {
        	classesDirectory.mkdirs();
        }
        //TODO create directory, populate with test files
        myMojo.getLog().info("classesDirectory : " + classesDirectory.getAbsolutePath() );
        createFilesForTest(classesList, classesDirectory, ".class");
        createFilesForTest(someFieldNamesThatShouldBePruned, classesDirectory, ".class");

        File generatedSourcesDirectory = ( File ) rule.getVariableValueFromObject( myMojo, "generatedSourcesDirectory" );
        assertNotNull( generatedSourcesDirectory );
        if (!generatedSourcesDirectory.exists()) {
        	generatedSourcesDirectory.mkdirs();
        }
        myMojo.getLog().info("generatedSourcesDirectory : " + generatedSourcesDirectory.getAbsolutePath() );
        createFilesForTest(classesList, generatedSourcesDirectory, ".java");
        createFilesForTest(someFieldNamesThatShouldBePruned, generatedSourcesDirectory,  ".java");
        
        myMojo.execute();        
        
        Object variableValueFromObject = rule.getVariableValueFromObject( myMojo, "fileset" );
        FileSet dictionaryFileSet = ( FileSet ) variableValueFromObject;
        assertNotNull( dictionaryFileSet );

        // The following are based on files created above
        List<String> someFieldNamesThatShouldStillExist = new ArrayList<>(Arrays.asList("WaveNo", "ValidUntilTime", "Account"));
        
        for (String fieldName : someFieldNamesThatShouldStillExist) {
            File source = new File( generatedSourcesDirectory, fieldName.concat(".java") );
            assertTrue( source.exists() );
            File clazz = new File( classesDirectory, fieldName.concat(".class") );
            assertTrue( clazz.exists() );
        }
        
        for (String fieldName : someFieldNamesThatShouldBePruned) {
            File source = new File( generatedSourcesDirectory, fieldName.concat(".java") );
            assertFalse( source.exists() );
            File clazz = new File( classesDirectory, fieldName.concat(".class") );
            assertFalse( clazz.exists() );
        }
        
        int numberOfFieldsFromTheCombinedDictionaries = 209;
        assertEquals(classesDirectory.list().length, numberOfFieldsFromTheCombinedDictionaries);
        assertEquals(generatedSourcesDirectory.list().length, numberOfFieldsFromTheCombinedDictionaries);
        
		FileUtils.cleanDirectory(generatedSourcesDirectory);
		FileUtils.cleanDirectory(classesDirectory);
    }

	private static void createFilesForTest(List<String> classesList, File classesDirectory, String extension) throws IOException {
		classesList.stream().forEach(throwingConsumerWrapper(f -> {File file = new File(classesDirectory, f.concat(extension)); Files.touch(file);}));
	}

	@FunctionalInterface
	public interface ThrowingConsumer<T, E extends Exception> {
	    void accept(T t) throws E;
	}
	
	//https://www.baeldung.com/java-lambda-exceptions
	static <T> Consumer<T> throwingConsumerWrapper(
	  ThrowingConsumer<T, Exception> throwingConsumer) {
	    return i -> {
	        try {
	            throwingConsumer.accept(i);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    };
	}

}

