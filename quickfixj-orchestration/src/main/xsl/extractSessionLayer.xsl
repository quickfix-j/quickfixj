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

    <!-- filter out FIX Session Layer messages -->
    <xsl:template
        match="fixr:message[(@category='Session') ]" />

    <!-- filter out FIX Session Layer fields -->
    <xsl:template match="fixr:fields/fixr:field[(   @id='7'
                                                    or @id='8'
                                                    or @id='9'
                                                    or @id='10'
                                                    or @id='16'
                                                    or @id='34'
                                                    or @id='35'
                                                    or @id='36'
                                                    or @id='43'
                                                    or @id='49'
                                                    or @id='50'
                                                    or @id='52'
                                                    or @id='56'
                                                    or @id='57'
                                                    or @id='89'
                                                    or @id='90'
                                                    or @id='91'
                                                    or @id='93'
                                                    or @id='95'
                                                    or @id='96'
                                                    or @id='97'
                                                    or @id='98'
                                                    or @id='108'
                                                    or @id='112'
                                                    or @id='115'
                                                    or @id='116'
                                                    or @id='122'
                                                    or @id='123'
                                                    or @id='128'
                                                    or @id='129'
                                                    or @id='141'
                                                    or @id='142'
                                                    or @id='143'
                                                    or @id='144'
                                                    or @id='145'
                                                    or @id='212'
                                                    or @id='213'
                                                    or @id='347'
                                                    or @id='369'
                                                    or @id='371'
                                                    or @id='373'
                                                    or @id='383'
                                                    or @id='385'
                                                    or @id='464'
                                                    or @id='553'
                                                    or @id='554'
                                                    or @id='627'
                                                    or @id='628'
                                                    or @id='629'
                                                    or @id='630'
                                                    or @id='789'
                                                    or @id='925'
                                                    or @id='1128'
                                                    or @id='1129'
                                                    or @id='1137'
                                                    or @id='1156'
                                                    or @id='1400'
                                                    or @id='1401'
                                                    or @id='1402'
                                                    or @id='1403'
                                                    or @id='1404'
                                                    or @id='1407'
                                                    or @id='1408'
                                                    or @id='1409'
                                                    or @id='1410'
                                                    or @id='2085') ]" />

    <!-- Remove Session category -->
    <xsl:template match="fixr:categories/fixr:category[(@name='Session') ]" />

    <!-- Extract standard trailer component -->
    <!--  xsl:template match="fixr:message/fixr:structure/fixr:componentRef[@id='1025']" / -->
    <xsl:template match="fixr:components/fixr:group[@id='2085'
                                                    @id='2098']" />
    <xsl:template match="fixr:components/fixr:component[@id='1024']" />
    <xsl:template match="fixr:components/fixr:component[@id='1025']" />

</xsl:stylesheet>
