<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="FIX.5.0SP2"
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

 <xsl:template match="fix">

	<xsl:copy>
      <xsl:attribute name="fixLatest">true</xsl:attribute>
      <xsl:apply-templates select="node()|@*"/>
   </xsl:copy>

    </xsl:template>
</xsl:stylesheet>
