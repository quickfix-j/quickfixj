<!--
	*****************************************************************************
	Copyright (c) 2001-2004 quickfixengine.org  All rights reserved.
	
	This file is part of the QuickFIX FIX Engine
	
	This file may be distributed under the terms of the quickfixengine.org
	license as defined by quickfixengine.org and appearing in the file
	LICENSE included in the packaging of this file.
	
	This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
	WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
	
	See http://www.quickfixengine.org/LICENSE for licensing information.
	
	Contact ask@quickfixengine.org if any conditions of this licensing are
	not clear to you.
	*****************************************************************************
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0">
	<xsl:output method="text" encoding="UTF-8" />

	<xsl:template match="text()"/>

  <xsl:template match="fix/header">
  </xsl:template>

  <xsl:template match="fix/trailer">
  </xsl:template>

  <xsl:template match="fix"><xsl:copy-of select="document('COPYRIGHT.xml')"/>
	<xsl:apply-templates/>
  </xsl:template>

  <xsl:param name="messageName">PLACEHOLDER</xsl:param>
 
  <!-- *********************************************************************
 	Main message generation template. This template generates a default
 	constructor and, if any fields are required, generates a constructor
 	taking those fields as arguments.
  *********************************************************************** -->
 
  <xsl:template match="fix/messages/message">
  <xsl:if test="@name=$messageName">
package quickfix.fix<xsl:value-of select="/fix/@major"/><xsl:value-of select="/fix/@minor"/>;
import quickfix.FieldNotFound;
import quickfix.field.*;<xsl:call-template name="extra-imports"/>

public class <xsl:value-of select="@name"/> extends Message
{
  public <xsl:value-of select="@name"/>()
  {
    super();
    getHeader().setField(new MsgType("<xsl:value-of select="@msgtype"/>"));
  }
  <xsl:if test="count(field[@required='Y']) > 0">
  public <xsl:value-of select="@name"/>(<xsl:for-each select="field[@required='Y']">
    <xsl:variable name="varname" select="concat(translate(substring(@name, 1, 1),
  	  'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
	  'abcdefghijklmnopqrstuvwxyz'), 
	  substring(@name, 2, string-length(@name)-1))"/>
    <xsl:if test="position() > 1">, </xsl:if><xsl:value-of select="concat(@name, ' ', $varname)"/></xsl:for-each>) {
    this();<xsl:for-each select="field[@required='Y']">
      <xsl:variable name="varname" select="concat(translate(substring(@name, 1, 1),
  		'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
		'abcdefghijklmnopqrstuvwxyz'), 
		substring(@name, 2, string-length(@name)-1))"/>
    setField(<xsl:value-of select="$varname"/>);</xsl:for-each>
  }
    </xsl:if>
    <xsl:apply-templates select="field|component|group" mode="field-accessors"/>
}
  </xsl:if>
  </xsl:template>

  <!-- *********************************************************************
 	Determine extra imports
 	  - Group-related import
  *********************************************************************** -->

  <xsl:template name="extra-imports">
    <xsl:variable name="groups" select="group"/>
    <xsl:choose>
      <xsl:when test="count($groups) > 0">
import quickfix.Group;</xsl:when>
      <xsl:otherwise>
        <xsl:call-template name="extra-imports-component">
          <xsl:with-param name="components" select="component"/>
  	      <xsl:with-param name="position" select="1"/>
        </xsl:call-template>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
    
  <xsl:template name="extra-imports-component">
    <xsl:param name="components"/>
    <xsl:param name="position"/>
    <xsl:if test="$position &lt;= count($components)">
      <xsl:variable name="name" select="$components[$position]/@name"/>
   	  <xsl:variable name="group" select="/fix/components/component[@name=$name]/group[1]"/>
      <xsl:choose>
        <xsl:when test="$group">
import quickfix.Group;</xsl:when>
        <xsl:otherwise>
          <xsl:call-template name="extra-imports-component">
            <xsl:with-param name="components" select="$components"/>
            <xsl:with-param name="position" select="$position + 1"/>
          </xsl:call-template>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:if>
  </xsl:template>
  
  <!-- *********************************************************************
 	FIX repeating group generation template.
 		- Find first field (for constructor)
 		- Find all fields and their order (for constructor)
 		- Generate field accessor methods
  *********************************************************************** -->

  <xsl:template mode="field-accessors" match="group">
    <xsl:call-template name="field-accessor-template"/>
    <xsl:variable name="groupFieldName" select="@name"/>
  public static class <xsl:value-of select="@name"/> extends Group {
    public <xsl:value-of select="@name"/>() {
        super(<xsl:value-of select="/fix/fields/field[@name=$groupFieldName]/@number"/>, <xsl:apply-templates select="field|component|group" mode="group-delimeter"/>,
            new int[] {<xsl:apply-templates select="field|component|group" mode="group-field-numbers"/> 0 } );
    }
    <xsl:apply-templates select="field|component|group" mode="field-accessors"/>
  }
  </xsl:template>

  <!--  Find the group delimeter (first field) -->
  
  <xsl:template mode="group-delimeter" match="field">
    <xsl:if test="position() = 1">
      <xsl:variable name="name" select="@name"/>
  	  <xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>
  	</xsl:if>
  </xsl:template>
  
  <xsl:template mode="group-delimeter" match="group">
  	<xsl:value-of select="@number"/>
  </xsl:template>
  
  <xsl:template mode="group-delimeter" match="group//component">
  	<xsl:if test="position() = 1">
      <xsl:variable name="name" select="@name"/>
  	  <xsl:apply-templates select="/fix/components/component[@name=$name]/*[name(.)='field' or name(.)='group' or name(.)='component']" 
  		  mode="group-delimeter"/>
  	</xsl:if>
  </xsl:template>
  
  <!--  Find the field numbers and order -->
  
  <xsl:template mode="group-field-numbers" match="field">
    <xsl:variable name="name" select="@name"/>
  	<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>, </xsl:template>

<!-- 
  <xsl:template mode="group-field-numbers" match="group">
  	<xsl:value-of select="@number"/>, </xsl:template>
  	-->
  	
   <xsl:template mode="group-field-numbers" match="group"/>
 
  <xsl:template mode="group-field-numbers" match="message//component">
    <xsl:variable name="name" select="@name"/>  
  	<xsl:apply-templates select="/fix/components/component[@name=$name]/field|group|component" 
  		mode="group-field-numbers"/>
  </xsl:template>
 
  <!-- *********************************************************************
 	Field accessor method generation.
  *********************************************************************** -->
  
  <xsl:template mode="field-accessors" match="field">
  	<xsl:call-template name="field-accessor-template"/>
  </xsl:template>
  
  <xsl:template name="field-accessor-template">
  public void set(quickfix.field.<xsl:value-of select="@name"/> value)
  { 
    setField(value); 
  }
  
  public quickfix.field.<xsl:value-of select="@name"/> get(quickfix.field.<xsl:value-of select="@name"/>  value) throws FieldNotFound
  { 
    getField(value); 
    return value; 
  }
  
  public quickfix.field.<xsl:value-of select="@name"/> get<xsl:value-of select="@name"/>() throws FieldNotFound
  { 
    quickfix.field.<xsl:value-of select="@name"/> value = new quickfix.field.<xsl:value-of select="@name"/>();
    getField(value); 
    return value; 
  }
  
  public boolean isSet(quickfix.field.<xsl:value-of select="@name"/> field)
  { 
    return isSetField(field); 
  }
  
  public boolean isSet<xsl:value-of select="@name"/>()
  {<xsl:variable name="name" select="@name"/>
    return isSetField(<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>); 
  }
  </xsl:template>

  <xsl:template mode="field-accessors" match="message//component">
    <xsl:variable name="name" select="@name"/>  
  	<xsl:apply-templates select="/fix/components/component[@name=$name]/*[name(.)='field' or name(.)='group' or name(.)='component']"
  		mode="field-accessors"/>
  </xsl:template>

</xsl:stylesheet>
