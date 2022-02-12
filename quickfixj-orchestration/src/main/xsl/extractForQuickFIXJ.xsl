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
    <!-- MassStatusReqTypeCodeSet -->
    <xsl:template match="fixr:codeSet[@id='585']/fixr:code[@name='StatusForOrdersForAPartyID']">
        <xsl:copy>
            <xsl:attribute name="name">
                <xsl:value-of select="'STATUS_FOR_ORDERS_FOR_A_PARTY_ID'" />
            </xsl:attribute>
            <xsl:apply-templates select="@id | @value | @sort | @added" />
            <xsl:apply-templates select="node()" />
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>
