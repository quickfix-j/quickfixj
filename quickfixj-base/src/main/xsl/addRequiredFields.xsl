<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:functx="http://www.functx.com"
	xmlns:fixr="http://fixprotocol.io/2020/orchestra/repository"
	xmlns:dc="http://purl.org/dc/elements/1.1/">
	<xsl:output method="xml" />
	<xsl:strip-space elements="*" />
	<xsl:output omit-xml-declaration="no" indent="yes" />
	
	<xsl:param name="addFields">
	    <!-- Field not present in latest but used in FIX versions and expected by QFJ -->
		<!-- OnBehalfOfSendingTime used only in FIX4.2 and 4.3 -->
		<fixr:field id="370" name="OnBehalfOfSendingTime" type="UTCTimestamp" added="FIX.4.2">
			<fixr:annotation>
				<fixr:documentation purpose="SYNOPSIS">Used when a message is sent via a "hub" or "service bureau". If A sends to Q (the hub) who then sends to B via a separate FIX session, then when Q sends to B the value of this field should represent the SendingTime on the message A sent to Q. (always expressed in UTC (Universal Time Coordinated, also known as "GMT")
				</fixr:documentation>
			</fixr:annotation>
		</fixr:field>
	</xsl:param>
	
	<!-- add fields -->
	<xsl:template
		match="fixr:fields/fixr:field[position()=last()]">
		<xsl:call-template name="identity" />
		<xsl:copy-of select="$addFields" />
	</xsl:template>
	
	<xsl:template match="node()|@*" name="identity">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*" />
		</xsl:copy>
	</xsl:template>


</xsl:stylesheet>
