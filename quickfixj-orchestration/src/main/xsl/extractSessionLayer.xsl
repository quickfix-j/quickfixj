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
    <xsl:template match="fixr:fields/fixr:field[@id = (
                                                    '7', '8', '9', '10', '16', '34', '35', '36',
                                                    '43', '49', '50', '52', '56', '57', '89', '90',
                                                    '91', '93', '95', '96', '97', '98', '108', '112',
                                                    '115', '116', '122', '123', '128', '129', '141',
                                                    '142', '143', '144', '145', '212', '213', '347',
                                                    '369', '371', '373', '383', '385', '464', '553',
                                                    '554', '627', '628', '629', '630', '789', '925',
                                                    '1128', '1129', '1137', '1156', '1400', '1401',
                                                    '1402', '1403', '1404', '1407', '1408', '1409',
                                                    '1410', '2085')] />

    <!-- Remove Session category -->
    <xsl:template match="fixr:categories/fixr:category[(@name='Session') ]" />

    <!-- Extract standard trailer component -->
    <!--  xsl:template match="fixr:message/fixr:structure/fixr:componentRef[@id='1025']" / -->
    <xsl:template match="fixr:components/fixr:group[@id='2085'
                                                    @id='2098']" />
    <xsl:template match="fixr:components/fixr:component[@id='1024']" />
    <xsl:template match="fixr:components/fixr:component[@id='1025']" />

</xsl:stylesheet>
