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

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
 <xsl:output  method="text" encoding="UTF-8"/>

 <xsl:template match="text()"/>

 <xsl:template match="fix/header">
 </xsl:template>

 <xsl:template match="fix/trailer">
 </xsl:template>

 <xsl:template match="fix"><xsl:copy-of select="document('COPYRIGHT.xml')"/>
	<xsl:apply-templates/>
 </xsl:template>

 <xsl:param name="messageName">PLACEHOLDER</xsl:param>
 
 <xsl:template match="fix/messages/message">
 <xsl:if test="@name=$messageName">
package quickfix.fix<xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/>;
import quickfix.FieldNotFound;
import quickfix.Group;
import quickfix.field.*;

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
  <xsl:apply-templates/>
}
  </xsl:if>
  </xsl:template>

  <xsl:template match="message/group">
    <xsl:call-template name="field-methods"/>
  public static class <xsl:value-of select="@name"/> extends Group {
    public <xsl:value-of select="@name"/>() {<xsl:apply-templates select="field|component" mode="class-constructor"/>
    <xsl:apply-templates/>
  }
  </xsl:template>
  
  <xsl:template match="field" mode="class-constructor">
    <xsl:if test="position()=1">
      <xsl:variable name="groupName" select="parent::group/@name"/>
      <xsl:variable name="groupField" select="/fix/fields/field[@name=$groupName]"/>
      <xsl:variable name="delimeterName" select="@name"/>
      <xsl:variable name="delimeterField" select="/fix/fields/field[@name=$delimeterName]"/>
    super(<xsl:value-of select="$groupField/@number"/>,<xsl:value-of select="$delimeterField/@number"/>,
        new int[] {<xsl:for-each select="parent::group/field"><xsl:variable name="n" select="@name"/>
        <xsl:value-of select="/fix/fields/field[@name=$n]/@number"/>,</xsl:for-each> 0 } );
    }
    </xsl:if>
  </xsl:template>
  
  <xsl:template match="component" mode="class-constructor">
    <xsl:if test="position()=1">
      <xsl:variable name="groupName" select="parent::group/@name"/>
      <xsl:variable name="groupField" select="/fix/fields/field[@name=$groupName]"/>
      <xsl:variable name="componentName" select="@name"/>
      <xsl:variable name="delimeterName" select="/fix/components/component[@name=$componentName]/field[1]/@name"/>
      <xsl:variable name="delimeterField" select="/fix/fields/field[@name=$delimeterName]"/>
    super(<xsl:value-of select="$groupField/@number"/>,<xsl:value-of select="$delimeterField/@number"/>,
        new int[] {<xsl:for-each select="parent::group/field"><xsl:variable name="n" select="@name"/>
        <xsl:value-of select="/fix/fields/field[@name=$n]/@number"/>,</xsl:for-each> 0 } );
    }
    </xsl:if>
  </xsl:template>
  
  <xsl:template match="message/field|message/group/field">
    <xsl:call-template name="field-methods"/>
  </xsl:template>
  
   <xsl:template match="message/component|message/group/component">
     <xsl:variable name="name" select="@name"/>
   	 <xsl:for-each select="/fix/components/component[@name=$name]/field">
    	<xsl:call-template name="field-methods"/>
   	 </xsl:for-each>
  </xsl:template>
  
  <xsl:template name="field-methods">
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

</xsl:stylesheet>
