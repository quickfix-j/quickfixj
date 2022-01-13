<xsl:stylesheet version="2.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:functx="http://www.functx.com"
    xmlns:fixr="http://fixprotocol.io/2020/orchestra/repository"
    xmlns:dc="http://purl.org/dc/elements/1.1/">
    <xsl:output method="xml" />
    <xsl:strip-space elements="*" />
    <xsl:output omit-xml-declaration="no" indent="yes" />

    <xsl:template match="@* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()" />
        </xsl:copy>
    </xsl:template>
    
    <!-- xsl:template match="node()|@*" name="identity">
        <xsl:copy>
            <xsl:apply-templates select="node()|@*" />
        </xsl:copy>
    </xsl:template -->

    <!-- filter out deprecated codes -->
    <!-- this is added to remove duplicates with differing case as these cause a problem with QFJ code generation"
         only remove this specific deprecated case to avoid problems with QuickFIX/J test compilation
         ..fixr:codeSet name="BenchmarkCurveNameCodeSet" id="221" type="String"..    -->
    <xsl:template
        match="fixr:codeSet[@id='221']/fixr:code[@deprecated]"/>
    <!-- remove bug -->
    <xsl:template
        match="fixr:codeSet[@name='NoStreamAssetAttributesCodeSet']"/>
    <!-- This group is not defined so references to it need to be removed to prevent QFJ null ptr exceptions -->
    <!-- fixr:groupRef added="FIX.5.0SP2" addedEP="254" id="2266" -->
    <!--     <fixr:component name="CollateralReinvestmentGrp" id="2266" category="Common" added="FIX.5.0SP2" addedEP="254" abbrName="CollRnvstmnt">     -->
    <xsl:template
        match="fixr:groupRef[@id='2266']"/>     
    <xsl:template
        match="fixr:component[@id='2266']"/>
    <xsl:template
        match="fixr:componentRef[@id='2266']"/>      
    <xsl:template
        match="fixr:componentRef[@id='2266']"/>      
    <!-- The following code has type "char" but is multi-character -->
    <!--    <fixr:code name="ManualOrderIdentifier" id="1081011" value="10" sort="10" added="FIX.5.0SP2" addedEP="253"> -->
    <xsl:template
        match="fixr:codeSet[@id='1081']/fixr:code[@id='1081011']"/> 
    
    <!-- the following are members of fixr:codeSet name="EntitlementAttribDatatypeCodeSet" id="1779" that have names which are Java primitive types  
         and thereby cause compilation failures in the generated code -->
    <xsl:template
        match="fixr:codeSet[@id='1779']/fixr:code[@id='1779022']"/>
    <xsl:template
        match="fixr:codeSet[@id='1779']/fixr:code[@id='1779024']"/> 
    <xsl:template
        match="fixr:codeSet[@id='1779']/fixr:code[@id='1779030']"/> 
         
    
    <!-- replace incorrect type for NoStreamAssetAttributesCodeSet -->
    <xsl:template match="fixr:fields/fixr:field/@type">
        <xsl:attribute name="type">
            <xsl:choose>
                <xsl:when test=". = 'NoStreamAssetAttributesCodeSet'">
                    <xsl:attribute name="type">
                        <xsl:text>NumInGroup</xsl:text>
                    </xsl:attribute>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="." />
                </xsl:otherwise>
            </xsl:choose>
        </xsl:attribute>
    </xsl:template>
	<!-- The following are work arounds for compatibility with static field definitions for QuickFIX -->
	<!-- Update name attribute to match the static field definitions for QuickFIX , work around for the 2 consecutive Caps in AValue-->
    <xsl:template match="fixr:codeSet[@id='373']/fixr:code[@name='TagSpecifiedWithoutAValue']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'TAG_SPECIFIED_WITHOUT_A_VALUE'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>
	<!-- workaround for https://github.com/FIXTradingCommunity/orchestrations/issues/25 -->
	<xsl:template match="fixr:codeSet[@id='373']/fixr:code[@name='Non']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>
	<!--Workarounds for inconsistencies in QFJ names vs Orchestra camelback case conventions-->
	<xsl:template match="fixr:codeSet[@id='373']/fixr:code[@name='InvalidMsgType']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'INVALID_MSGTYPE'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>
	<xsl:template match="fixr:codeSet[@id='373']/fixr:code[@name='IncorrectNumInGroupCountForRepeatingGroup']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>
	<xsl:template match="fixr:codeSet[@id='373']/fixr:code[@name='CompIDProblem']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'COMPID_PROBLEM'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>
	<xsl:template match="fixr:codeSet[@id='373']/fixr:code[@name='SendingTimeAccuracyProblem']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'SENDINGTIME_ACCURACY_PROBLEM'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>

	<!-- Encrypt Method : QFJ thinks this should be NONE_OTHER -->
	<xsl:template match="fixr:codeSet[@id='98']/fixr:code[@name='None']">
		<xsl:copy>
			<xsl:attribute name="name">
                <xsl:value-of select="'NONE_OTHER'" />
            </xsl:attribute>
			<xsl:apply-templates select="@id | @value | @sort | @added" />
			<xsl:apply-templates select="node()" />
		</xsl:copy>
    </xsl:template>
    <!-- MsgType Code Set -->    
    <xsl:template match="fixr:codeSet[@id='35']/fixr:code[@name='IOI']">
        <xsl:copy>
            <xsl:attribute name="name">
                <xsl:value-of select="'INDICATION_OF_INTEREST'" />
            </xsl:attribute>
            <xsl:apply-templates select="@id | @value | @sort | @added" />
            <xsl:apply-templates select="node()" />
        </xsl:copy>
    </xsl:template>

    <!-- xsl:template match="fixr:codeSet[@id='35']/fixr:code[@name='NewOrderSingle']">
        <xsl:copy>
            <xsl:attribute name="name">
                <xsl:value-of select="'NEW_ORDER_SINGLE'" />
            </xsl:attribute>
            <xsl:apply-templates select="@id | @value | @sort | @added" />
            <xsl:apply-templates select="node()" />
        </xsl:copy>
    </xsl:template -->

    <xsl:param name="addCodeSets">
		<!-- fixr:codeSet name="SettlTypeCodeSet" id="63" type="char">
			<fixr:code name="Regular" id="63001" value="0" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Regular
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="Cash" id="63002" value="1" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Cash
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="NextDay" id="63003" value="2" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Next Day (T+1)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="TPlus2" id="63004" value="3" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         T+2
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="TPlus3" id="63005" value="4" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         T+3
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="TPlus4" id="63006" value="5" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         T+4
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="Future" id="63007" value="6" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Future
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="WhenAndIfIssued" id="63008" value="7" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         When And If Issued
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="SellersOption" id="63009" value="8" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Sellers Option
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="TPlus5" id="63010" value="9" added="FIX.3.0">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         T+ 5
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
         Indicates order settlement period. If present, SettlDate (64) overrides this field. If both SettlType (63) and SettDate (64) are omitted, the default for SettlType (63) is 0 (Regular)
         Regular is defined as the default settlement period for the particular security on the exchange of execution.
         In Fixed Income the contents of this field may influence the instrument definition if the SecurityID (48) is ambiguous. In the US an active Treasury offering may be re-opened, and for a time one CUSIP will apply to both the current and "when-issued" securities. Supplying a value of "7" clarifies the instrument description; any other value or the absence of this field should cause the respondent to default to the active issue.
      </fixr:documentation>
			</fixr:annotation>
		</fixr:codeSet>
		<fixr:codeSet name="Rule80ACodeSet" id="47" type="char">
			<fixr:code name="AgencySingleOrder" id="47001" value="A" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Agency single order
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionAType" id="47002" value="B" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Short exempt transaction (refer to A type)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ProprietaryNonAlgo" id="47003" value="C" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, non-index arb, for Member firm/org
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ProgramOrderMember" id="47004" value="D" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, index arb, for Member firm/org
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionForPrincipal" id="47005" value="E" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Registered Equity Market Maker trades
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionWType" id="47006" value="F" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Short exempt transaction (refer to W type)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionIType" id="47007" value="H" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Short exempt transaction (refer to I type)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="IndividualInvestor" id="47008" value="I" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Individual Investor, single order
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ProprietaryAlgo" id="47009" value="J" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, index arb, for individual customer
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="AgencyAlgo" id="47010" value="K" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, non-index arb, for individual customer
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionMemberAffliated" id="47011" value="L" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Short exempt transaction for member competing market-maker affiliated with the firm clearing the trade (refer to P and O types)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ProgramOrderOtherMember" id="47012" value="M" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, index arb, for other member
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="AgentForOtherMember" id="47013" value="N" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, non-index arb, for other member
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ProprietaryTransactionAffiliated" id="47014" value="O" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Competing dealer trades
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="Principal" id="47015" value="P" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Principal
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="TransactionNonMember" id="47016" value="R" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Competing dealer trades
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="SpecialistTrades" id="47017" value="S" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Specialist trades
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="TransactionUnaffiliatedMember" id="47018" value="T" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Competing dealer trades
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="AgencyIndexArb" id="47019" value="U" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, index arb, for other agency
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="AllOtherOrdersAsAgentForOtherMember" id="47020" value="W" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         All other orders as agent for other member
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionMemberNotAffliated" id="47021" value="X" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade (refer to W and T types)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="AgencyNonAlgo" id="47022" value="Y" added="FIX.2.7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Program Order, non-index arb, for other agency
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ShortExemptTransactionNonMember" id="47023" value="Z" added="FIX.4.1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
         Short exempt transaction for non-member competing market-maker (refer to A and R types)
      </fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
         Note that the name of this field is changing to "OrderCapacity" as Rule80A is a very US market-specific term. Other world markets need to convey similar information, however, often a subset of the US values. . See the "Rule80A (aka OrderCapacity) Usage by Market" appendix for market-specific usage of this field.
      </fixr:documentation>
			</fixr:annotation>
		</fixr:codeSet>
		<fixr:codeSet name="QuantityTypeCodeSet" id="465" type="int" added="FIX.4.3">
			<fixr:code name="SHARES" id="465001" value="1">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="BONDS" id="465002" value="2">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="CURRENTFACE" id="465003" value="3">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="ORIGINALFACE" id="465004" value="4">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="CURRENCY" id="465005" value="5">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="CONTRACTS" id="465006" value="6">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="OTHER" id="465007" value="7">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
			<fixr:code name="PAR" id="465008" value="8">
				<fixr:annotation>
					<fixr:documentation purpose="SYNOPSIS">
					</fixr:documentation>
				</fixr:annotation>
			</fixr:code>
		</fixr:codeSet -->
    </xsl:param>

    <xsl:param name="addFields">
	    <!-- Field not present in latest but used in FIX versions and expected by QFJ -->
		<!--fixr:field id="33" name="LinesOfText" type="int" added="FIX.2.7">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
				Identifies number of lines of text body
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!-- fixr:field id="47" name="Rule80A" type="Rule80ACodeSet" added="FIX.2.7">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
         Note that the name of this field is changing to "OrderCapacity" as Rule80A is a very US market-specific term. Other world markets need to convey similar information, however, often a subset of the US values. . See the "Rule80A (aka OrderCapacity) Usage by Market" appendix for market-specific usage of this field.
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!-- fixr:field id="63" name="SettlType" type="SettlTypeCodeSet" added="FIX.2.7" abbrName="SettlTyp">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
         Indicates order settlement period. If present, SettlDate (64) overrides this field. If both SettlType (63) and SettDate (64) are omitted, the default for SettlType (63) is 0 (Regular)
         Regular is defined as the default settlement period for the particular security on the exchange of execution.
         In Fixed Income the contents of this field may influence the instrument definition if the SecurityID (48) is ambiguous. In the US an active Treasury offering may be re-opened, and for a time one CUSIP will apply to both the current and "when-issued" securities. Supplying a value of "7" clarifies the instrument description; any other value or the absence of this field should cause the respondent to default to the active issue.
      </fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!--fixr:field id="64" name="SettlDate" type="LocalMktDate" added="FIX.2.7" abbrName="SettlDt">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
         Specific date of trade settlement (SettlementDate) in YYYYMMDD format.
         If present, this field overrides SettlType (63). This field is required if the value of SettlType (63) is 6 (Future) or 8 (Sellers Option). This field must be omitted if the value of SettlType (63) is 7 (When and If Issued)
         (expressed in local time at place of settlement)
      </fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!--fixr:field id="80" name="AllocShares" type='int' added="FIX.4.0">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
				Number of shares to be allocated to specific sub-account
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!--fixr:field id="193" name="FutSettDate2" type='LocalMktDate' added="FIX.4.1">
			<fixr:annotation>
				<fixr:documentation>
                  FutSettDate of the future part of a F/X swap order.
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field-->		
		<!--fixr:field id="211" name="PegDifference" type="PriceOffset" added="FIX.4.1">
			<fixr:annotation>
				<fixr:documentation>
                  Amount (signed) added to the price of the peg
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
	    <!-- fixr:field added="FIX.4.2" id="370"
	        name="OnBehalfOfSendingTime" type="UTCTimestamp"
	        abbrName="OnBehalfOfSendingTime" presence="optional"
	        supported="supported">
	        <fixr:annotation supported="supported">
	            <fixr:documentation purpose="SYNOPSIS" supported="supported">
	              Used when a message is sent via a "hub" or "service bureau". 
	              If A sends to Q (the hub) who then sends to B via a separate FIX session, then when Q sends to B the value of this field should represent the SendingTime on the message A sent to Q.
	              (always expressed in UTC (Universal Time Coordinated, also known as "GMT")
	            </fixr:documentation>
	        </fixr:annotation>
	    </fixr:field -->
		<!--fixr:field id="389" name="DiscretionOffset" type="PriceOffset" added="FIX.4.2">
			<fixr:annotation>
				<fixr:documentation>
                 Amount (signed) added to the "related to" price specified via DiscretionInst.
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!-- fixr:field id="440" 
			name="ClearingAccount" type="String" added="FIX.4.2">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
                  Supplemental accounting information forwared to clearing house/firm.
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!--fixr:field id="439" name="ClearingFirm" type="String" added="FIX.4.2">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
                  Firm that will clear the trade. Used if different from the executing firm.
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
		<!-- fixr:field id="465" name="QuantityType" type="QuantityTypeCodeSet" added="FIX.4.3">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">
                  Designates the type of quantities (e.g. OrderQty) specified. Used for MBS and TIPS Fixed Income security types.
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field -->
    </xsl:param>
    
    <!-- xsl:template
        match="fixr:fields/fixr:field[position()=last()]">
        <xsl:call-template name="identity" />
        <xsl:copy-of select="$addFields" />
    </xsl:template>

    <xsl:template
        match="fixr:codeSets/fixr:codeSet[position()=last()]">
        <xsl:call-template name="identity" />
        <xsl:copy-of select="$addCodeSets" />
    </xsl:template -->

    <!-- filter out session layer messages 
    <xsl:template
        match="fixr:message[(@msgType='0' or
                             @msgType='1' or
                             @msgType='2' or
                             @msgType='3' or
                             @msgType='4' or
                             @msgType='5' or
                             @msgType='A') ]" />
                             -->

</xsl:stylesheet>
