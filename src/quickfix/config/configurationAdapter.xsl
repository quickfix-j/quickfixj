<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	version="1.0">
	
	<xsl:template match="session[@name='default']">
		<xsl:call-template name="copy"/>
	</xsl:template>

	<xsl:template match="session">
		<session><xsl:value-of select="@name"/></session>
		<xsl:call-template name="copy"/>
	</xsl:template>

	<xsl:template name="copy">
		<xsl:element name="{@name}">
			<xsl:copy-of select="./*"/>
		</xsl:element>		
	</xsl:template>
	
	<xsl:template match="/">
		<configuration>
			<xsl:apply-templates/>
		</configuration>
	</xsl:template>
	
</xsl:stylesheet>