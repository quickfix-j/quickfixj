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
    <xsl:template
        match="fixr:fields/fixr:field[not(
									      @id = '6' or
									      @id = '8' or
									      @id = '9' or
									      @id = '10' or
									      @id = '11' or
									      @id = '19' or
									      @id = '21' or
									      @id = '22' or
									      @id = '33' or
									      @id = '34' or
									      @id = '35' or
									      @id = '38' or
									      @id = '40' or
									      @id = '43' or
									      @id = '44' or
									      @id = '48' or
									      @id = '49' or
									      @id = '50' or
									      @id = '52' or
									      @id = '54' or
									      @id = '55' or
									      @id = '56' or
									      @id = '57' or
									      @id = '58' or
									      @id = '59' or
									      @id = '60' or
			                              @id = '89' or
			                              @id = '90' or
			                              @id = '91' or
			                              @id = '93' or
			                              @id = '95' or
			                              @id = '96' or
			                              @id = '97' or
									      @id = '110' or
									      @id = '115' or
									      @id = '116' or
									      @id = '122' or
									      @id = '128' or
									      @id = '129' or
									      @id = '131' or
									      @id = '134' or
									      @id = '135' or
									      @id = '142' or
									      @id = '143' or
									      @id = '144' or
									      @id = '145' or
									      @id = '146' or
									      @id = '149' or
									      @id = '152' or
									      @id = '155' or
									      @id = '167' or
									      @id = '193' or
									      @id = '212' or
									      @id = '213' or
									      @id = '268' or
									      @id = '269' or
										  @id = '270' or
									      @id = '271' or
									      @id = '277' or
									      @id = '278' or
									      @id = '279' or
			                              @id = '320' or
			                              @id = '322' or
			                              @id = '323' or
			                              @id = '336' or
			                              @id = '347' or
			                              @id = '369' or
			                              @id = '393' or
			                              @id = '447' or
			                              @id = '448' or
			                              @id = '452' or
			                              @id = '453' or
			                              @id = '460' or
			                              @id = '548' or
			                              @id = '549' or
			                              @id = '550' or
			                              @id = '552' or
			                              @id = '553' or
			                              @id = '554' or
			                              @id = '555' or
			                              @id = '560' or
			                              @id = '600' or
			                              @id = '627' or
		                                  @id = '628' or
		                                  @id = '629' or
		                                  @id = '630' or
		                                  @id = '918' or
		                                  @id = '923' or
		                                  @id = '924' or
		                                  @id = '925' or
		                                  @id = '1128' or
								          @id = '1129' or
								          @id = '1262' or
								          @id = '1268' or
								          @id = '1269' or
								          @id = '1270' or
								          @id = '1271' or
								          @id = '1272' or
								          @id = '1156' or
		                                  @id = '1400' or
		                                  @id = '1401' or
		                                  @id = '1402' or
		                                  @id = '1403' or
		                                  @id = '1404' or
		                                  @id = '1779' or
		                                  @id = '321007')]"/>

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
                                          @id = '2085')]"/>

    <!-- filter out messages that are not used in QFJ tests -->
    <xsl:template
        match="fixr:messages/fixr:message[not(@id = '8' or
        									  @id = '12' or
        									  @id = '13' or
        									  @id = '14' or
        									  @id = '26' or
        									  @id = '30' or
        									  @id = '31' or
        									  @id = '35' or
        									  @id = '37' or
        									  @id = '52' or
        									  @id = '60' or
        									  @id = '90')]"/>

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
        match="fixr:components/fixr:component[(@id='1003')]/fixr:groupRef" />

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

 	<!-- HopGrp 2085 ______________ -->
 	<!-- include everything -->

 	<!-- ******************************** -->
	<!-- MESSAGES -->
	<!-- ******************************** -->

 	<!-- ******* Advertisement -->
 	<xsl:template
        match="fixr:message[@id='8']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                          @id='1025' or
                                                                          @id='1003')]" />
    <xsl:template
        match="fixr:message[@id='8']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@id='8']/fixr:structure/fixr:fieldRef" />

 	<!-- ******* News -->
 	<xsl:template
        match="fixr:message[@id='12']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='12']/fixr:structure/fixr:groupRef[not(@id='2029')]" />
    <xsl:template
        match="fixr:message[@id='12']/fixr:structure/fixr:fieldRef" />

	<!--  ******* Email -->
 	<xsl:template
        match="fixr:message[@id='13']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='13']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@id='13']/fixr:structure/fixr:fieldRef" />

	<!--  ******* New Single Order : This is very much a hack just  to ensure that HandlInst gets included in the code gen 
	      and overwrites legacy code gen, the orchestra code gen does not write fields that are not included in messages 
	      or their group/components -->
 	<xsl:template
        match="fixr:message[@id='14']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='14']/fixr:structure/fixr:fieldRef[not(@id='21' or
                                                                       @id='40')]" />
    <xsl:template
        match="fixr:message[@id='14']/fixr:structure/fixr:groupRef[not(@id='1012')]" />

    <!-- ******* QuoteRequest -->
 	<xsl:template
        match="fixr:message[@id='26']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='26']/fixr:structure/fixr:groupRef[not(@id='2045')]" />
	<xsl:template
        match="fixr:message[@id='26']/fixr:structure/fixr:fieldRef[not(@id='131')]" />

 	<!-- ******* MarketDataSnapshotFullRefresh -->
 	<xsl:template
        match="fixr:message[@id='30']/fixr:structure/fixr:componentRef[not(@id='1003' or
        																   @id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='30']/fixr:structure/fixr:groupRef[not(@id='2031')]" />
    <xsl:template
        match="fixr:message[@id='30']/fixr:structure/fixr:fieldRef" />

 	<!-- ******* MarketDataIncrementalRefresh -->
 	<xsl:template
        match="fixr:message[@id='31']/fixr:structure/fixr:componentRef[not(@id='1003' or
                                                                           @id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='31']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@id='31']/fixr:structure/fixr:fieldRef" />

 	<!-- ******* MassQuoteAck -->
 	<xsl:template
        match="fixr:message[@id='35']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='35']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@id='35']/fixr:structure/fixr:fieldRef" />

	<!-- ******* SecurityDefinition -->
	<xsl:template
			match="fixr:message[@id='37']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                               @id='1025' or
                                                                               @id='1003')]" />
	<xsl:template
			match="fixr:message[@id='37']/fixr:structure/fixr:groupRef" />
	<xsl:template
			match="fixr:message[@id='37']/fixr:structure/fixr:fieldRef[not(@id='58' or
			                                                               @id='320' or
																		   @id='322' or
																		   @id='323')]" />
	<!-- or
			                                                               @id='336' or
																		   @id='393')]" / -->

 	<!-- ******* Cross Order -->
 	<xsl:template
        match="fixr:message[@id='52']/fixr:structure/fixr:componentRef[not(@id='1003' or
        															       @id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='52']/fixr:structure/fixr:groupRef[not(@id='2059')]" />
    <xsl:template
        match="fixr:message[@id='52']/fixr:structure/fixr:fieldRef[not(@id='548' or 
        															   @id='549' or
        															   @id='550')]" />

	<!-- ******* Derivative Security List -->
 	<xsl:template
        match="fixr:message[@id='60']/fixr:structure/fixr:componentRef[not(@id='1003' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='60']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@id='60']/fixr:structure/fixr:fieldRef[not(@id='560')]" />  

 	<!-- ******* UserRequest -->
 	<xsl:template
        match="fixr:message[@id='90']/fixr:structure/fixr:componentRef[not(@id='1024' or
                                                                           @id='1025')]" />
    <xsl:template
        match="fixr:message[@id='90']/fixr:structure/fixr:groupRef" />
    <xsl:template
        match="fixr:message[@id='90']/fixr:structure/fixr:fieldRef" />
</xsl:stylesheet>
