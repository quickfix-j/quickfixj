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

    <!-- filter out fields that are not used in QFJ tests -->
    <!-- Field 1492 ComplexEventStartDate is included to prove successful compilation of a field extending UTCDateOnly -->
    <xsl:template
        match="fixr:fields/fixr:field[not(@id = (
                                          '6', '8', '9', '10', '11', '19', '21', '22', '33',
                                          '34', '35', '38', '40', '43', '44', '45', '48', '49',
                                          '50', '52', '54', '55', '56', '57', '58', '59', '60',
                                          '89', '90', '91', '93', '95', '96', '97', '110', '115',
                                          '116', '122', '128', '129', '131', '134', '135', '142',
                                          '143', '144', '145', '146', '149', '152', '155', '167',
                                          '193', '212', '213', '268', '269', '270', '271', '277',
                                          '278', '279', '320', '322', '323', '336', '347', '369',
                                          '372', '380', '393', '447', '448', '452', '453', '460',
                                          '548', '549', '550', '552', '553', '554', '555', '560',
                                          '600', '627', '628', '629', '630', '918', '923', '924',
                                          '925', '1128', '1129', '1262', '1268', '1269', '1270',
                                          '1271', '1272', '1156', '1400', '1401', '1402', '1403',
                                          '1404', '1483', '1484', '1491', '1492', '1779', '321007'))]"/>

    <!-- filter out components that are not used in QFJ tests -->
    <xsl:template
        match="fixr:components/fixr:component[not(@id = '1002' or
                                        		  @id = '1003' or
                                        		  @id = '1005' or
                                        		  @id = '1024' or
                                        		  @id = '1025')]"/>

    <!-- filter out group that are not used in QFJ tests -->
    <xsl:template
        match="fixr:groups/fixr:group[not(@id = '1012' or
        								  @id = '2029' or
        								  @id = '2031' or
        								  @id = '2045' or
        								  @id = '2046' or
        								  @id = '2059' or
                                          @id = '2085' or
                                          @id = '2145' or
                                          @id = '2146' )]"/>

    <!-- filter out messages that are not used in QFJ tests -->
    <xsl:template
        match="fixr:messages/fixr:message[not(@msgType = '7' or
        									  @msgType = 'B' or
        									  @msgType = 'C' or
        									  @msgType = 'D' or
        									  @msgType = 'R' or
        									  @msgType = 'W' or
        									  @msgType = 'X' or
        									  @msgType = 'b' or
        									  @msgType = 'd' or
        									  @msgType = 's' or
        									  @msgType = 'AA' or
        									  @msgType = 'BE' or
        									  @msgType = 'j')]"/>

 	<!-- ******************************** -->
 	<!-- COMPONENTS -->
 	<!-- ******************************** -->

 	<!-- FinancingDetails -->
 	<xsl:template
        match="fixr:components/fixr:component[(@id='1002')]/fixr:fieldRef[not(@id='918')]" />
   	<xsl:template
        match="fixr:components/fixr:component[(@id='1002')]/fixr:groupRef" />
   	<xsl:template
        match="fixr:components/fixr:component[(@id='1002')]/fixr:componentRef" />        

 	<!-- Instrument -->
 	<xsl:template
        match="fixr:components/fixr:component[(@id='1003')]/fixr:fieldRef[not(@id='22' or
                                                                              @id='55' or
                                                                              @id='167' or
                                                                              @id='460')]" />
<!--   	<xsl:template -->
<!--         match="fixr:components/fixr:component[(@id='1003')]/fixr:fieldRef[not(@id='55')]" /> -->
   	<xsl:template
        match="fixr:components/fixr:component[(@id='1003')]/fixr:componentRef" />
   	<xsl:template
        match="fixr:components/fixr:component[(@id='1003')]/fixr:groupRef[not(@id='2145')]" />

 	<!-- InstrumentLeg -->
 	<xsl:template
        match="fixr:components/fixr:component[(@id='1005')]/fixr:fieldRef[not(@id='600')]" />
   	<xsl:template
        match="fixr:components/fixr:component[(@id='1005')]/fixr:componentRef" />
   	<xsl:template
        match="fixr:components/fixr:component[(@id='1005')]/fixr:groupRef" />

 	<!-- StandardHeader (@id='1024') -->
    <!-- include everything -->

 	<!-- StandardTrailer (@id='1025') -->
 	<!-- include everything -->

 	<!-- ******************************** -->
 	<!-- GROUPS -->
 	<!-- ******************************** -->

 	<!-- Parties ______________ -->
    <xsl:template
       	match="fixr:groups/fixr:group[(@id='1012')]/fixr:groupRef" />
	<xsl:template
        match="fixr:groups/fixr:group[(@id='1012')]/fixr:componentRef" />
    <xsl:template
       	match="fixr:groups/fixr:group[(@id='1012')]/fixr:fieldRef[not(@id='447' or
       																  @id='448' or
                                                                      @id='452')]" />

 	<!-- LinesOfTextGrp ______________ -->
 	<xsl:template
        match="fixr:groups/fixr:group[(@id='2029')]/fixr:fieldRef[not(@id='58')]" />
    <xsl:template
       	match="fixr:groups/fixr:group[(@id='2029')]/fixr:groupRef" />
	<xsl:template
        match="fixr:groups/fixr:group[(@id='2029')]/fixr:componentRef" />

    <!-- There are no nested groups or components -->

 	<!-- MDFullGrp ______________ -->
   	<xsl:template
        match="fixr:groups/fixr:group[(@id='2031')]/fixr:groupRef" />
	<xsl:template
        match="fixr:groups/fixr:group[(@id='2031')]/fixr:componentRef" />
  	<xsl:template
        match="fixr:groups/fixr:group[(@id='2031')]/fixr:fieldRef[not(@id='269' or
         															  @id='270' or
         															  @id='278')]" />


 	<!-- QuotReqGrp ______________ -->
	<xsl:template
        match="fixr:groups/fixr:group[(@id='2045')]/fixr:fieldRef[not(@id='193')]" />
   	<xsl:template
        match="fixr:groups/fixr:group[(@id='2045')]/fixr:groupRef[not(@id='2046')]" />
 	<xsl:template
        match="fixr:groups/fixr:group[(@id='2045')]/fixr:componentRef[not(@id='1003' or
         																  @id='1002')]" />

 	<!-- QuotReqLegsGrp ______________ -->
 	<xsl:template
        match="fixr:groups/fixr:group[(@id='2046')]/fixr:componentRef[not(@id='1005')]" />
   	<xsl:template
        match="fixr:groups/fixr:group[(@id='2046')]/fixr:groupRef" />
	<xsl:template
        match="fixr:groups/fixr:group[(@id='2046')]/fixr:fieldRef" />

 	<!-- SideCrossOrdModGrp ______________ -->
 	<xsl:template
        match="fixr:groups/fixr:group[(@id='2059')]/fixr:componentRef" />
   	<xsl:template
        match="fixr:groups/fixr:group[(@id='2059')]/fixr:groupRef[not(@id='1012')]" />
	<xsl:template
	    match="fixr:groups/fixr:group[(@id='2059')]/fixr:fieldRef[not(@id='54' or
                                                                      @id='11')]" />

	<!-- Complex Events -->
	<xsl:template
			match="fixr:groups/fixr:group[(@id='2145')]/fixr:componentRef" />
	<xsl:template
			match="fixr:groups/fixr:group[(@id='2145')]/fixr:fieldRef[not(@id='1484')]" />
	<xsl:template
			match="fixr:groups/fixr:group[(@id='2145')]/fixr:groupRef[not(@id='2146')]" />

	<!-- Complex Event Dates -->
	<xsl:template
			match="fixr:groups/fixr:group[(@id='2146')]/fixr:componentRef" />
	<xsl:template
			match="fixr:groups/fixr:group[(@id='2146')]/fixr:groupRef" />
	<xsl:template
			match="fixr:groups/fixr:group[(@id='2146')]/fixr:fieldRef[not(@id='1492')]" />

	<!-- HopGrp 2085 ______________ -->
 	<!-- include everything -->

 	<!-- ******************************** -->
	<!-- MESSAGES -->
	<!-- ******************************** -->

 	<!-- ******* Advertisement -->
 	<xsl:template
        match="fixr:message[@msgType='7']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                          @id='1025' or
                                                                          @id='1003')]" />
    <xsl:template
        match="fixr:message[@msgType='7']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@msgType='7']/fixr:structure/fixr:fieldRef" />

 	<!-- ******* News -->
 	<xsl:template
        match="fixr:message[@msgType='B']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='B']/fixr:structure/fixr:groupRef[not(@id='2029')]" />
    <xsl:template
        match="fixr:message[@msgType='B']/fixr:structure/fixr:fieldRef" />

	<!--  ******* Email -->
 	<xsl:template
        match="fixr:message[@msgType='C']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='C']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@msgType='C']/fixr:structure/fixr:fieldRef" />

	<!--  ******* New Single Order : This is very much a hack just  to ensure that HandlInst gets included in the code gen 
	      and overwrites legacy code gen, the orchestra code gen does not write fields that are not included in messages 
	      or their group/components -->
 	<xsl:template
        match="fixr:message[@msgType='D']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='D']/fixr:structure/fixr:fieldRef[not(@id='21' or
                                                                       @id='40')]" />
    <xsl:template
        match="fixr:message[@msgType='D']/fixr:structure/fixr:groupRef[not(@id='1012')]" />

    <!-- ******* QuoteRequest -->
 	<xsl:template
        match="fixr:message[@msgType='R']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='R']/fixr:structure/fixr:groupRef[not(@id='2045')]" />
	<xsl:template
        match="fixr:message[@msgType='R']/fixr:structure/fixr:fieldRef[not(@id='131')]" />

 	<!-- ******* MarketDataSnapshotFullRefresh -->
 	<xsl:template
        match="fixr:message[@msgType='W']/fixr:structure/fixr:componentRef[not(@id='1003' or
        																   @id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='W']/fixr:structure/fixr:groupRef[not(@id='2031')]" />
    <xsl:template
        match="fixr:message[@msgType='W']/fixr:structure/fixr:fieldRef" />

 	<!-- ******* MarketDataIncrementalRefresh -->
 	<xsl:template
        match="fixr:message[@msgType='X']/fixr:structure/fixr:componentRef[not(@id='1003' or
                                                                           @id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='X']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@msgType='X']/fixr:structure/fixr:fieldRef" />

 	<!-- ******* MassQuoteAck -->
 	<xsl:template
        match="fixr:message[@msgType='b']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='b']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@msgType='b']/fixr:structure/fixr:fieldRef" />

	<!-- ******* SecurityDefinition -->
	<xsl:template
			match="fixr:message[@msgType='d']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                               @id='1025' or
                                                                               @id='1003')]" />
	<xsl:template
			match="fixr:message[@msgType='d']/fixr:structure/fixr:groupRef" />
	<xsl:template
			match="fixr:message[@msgType='d']/fixr:structure/fixr:fieldRef[not(@id='58' or
			                                                               @id='320' or
																		   @id='322' or
																		   @id='323')]" />
	<!-- or
			                                                               @id='336' or
																		   @id='393')]" / -->

 	<!-- ******* Cross Order -->
 	<xsl:template
        match="fixr:message[@msgType='s']/fixr:structure/fixr:componentRef[not(@id='1003' or
        															       @id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='s']/fixr:structure/fixr:groupRef[not(@id='2059')]" />
    <xsl:template
        match="fixr:message[@msgType='s']/fixr:structure/fixr:fieldRef[not(@id='548' or
        															   @id='549' or
        															   @id='550')]" />

	<!-- ******* Derivative Security List -->
 	<xsl:template
        match="fixr:message[@msgType='AA']/fixr:structure/fixr:componentRef[not(@id='1003' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='AA']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@msgType='AA']/fixr:structure/fixr:fieldRef[not(@id='560')]" />

 	<!-- ******* UserRequest -->
 	<xsl:template
        match="fixr:message[@msgType='BE']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@msgType='BE']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@msgType='BE']/fixr:structure/fixr:fieldRef" />

	<!-- ******* Business Message Reject -->
	<xsl:template
			match="fixr:message[@msgType='j']/fixr:structure/fixr:componentRef[not(@id='1003' or
                                                                               @id='1025')]" />
	<xsl:template
			match="fixr:message[@msgType='j']/fixr:structure/fixr:groupRef" />
	<xsl:template
			match="fixr:message[@msgType='j']/fixr:structure/fixr:fieldRef[not(@id='45' or
																		   @id='58' or
																		   @id='372' or
                                                                           @id='380')]" />
</xsl:stylesheet>
