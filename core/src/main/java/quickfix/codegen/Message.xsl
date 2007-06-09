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
 <xsl:param name="serialVersionUID"/>
 <xsl:param name="messagePackage"/>
 <xsl:param name="fieldPackage"/>
 
 <xsl:template match="text()"/>


 <xsl:template match="/">/* -*- C++ -*- */
 <xsl:copy-of select="document('COPYRIGHT.xml')"/>
  
package <xsl:value-of select="$messagePackage"/>;

import quickfix.FieldNotFound;
import quickfix.field.*;
	 
public class Message extends quickfix.Message
{
  static final long serialVersionUID = <xsl:value-of select="$serialVersionUID"/>;

  public Message() {
  	this(null);
  }
  
  protected Message(int[] fieldOrder) {
    super(fieldOrder);
    header = new Header(this);
    trailer = new Trailer();
    getHeader().setField(new BeginString("FIX.<xsl:value-of select="//fix/@major"/>.<xsl:value-of select="//fix/@minor"/>"));
  }
  
  public class Header extends quickfix.Message.Header {
	 public Header(Message msg) {
		 // JNI compatibility
	 }
    <xsl:apply-templates select="//fix/header/field" mode="field-accessors"/>
    <xsl:apply-templates select="//fix/header/group" mode="field-accessors"/>
    <xsl:apply-templates select="//fix/header/component" mode="field-accessors"/>
  }
	
  <!-- TODO Must talk to Oren about why these are defined at the message level -->
    <xsl:apply-templates select="//fix/trailer/field" mode="field-accessors"/>
    <xsl:apply-templates select="//fix/trailer/group" mode="field-accessors"/>
    <xsl:apply-templates select="//fix/trailer/component" mode="field-accessors"/>
}

</xsl:template>

<!--
	The following templates are almost duplicated from Message.xsl. However,
	there are a few slight differences with how header groups are handled.
-->
	
   <!-- *********************************************************************
 	FIX repeating group generation template.
 		- Find first field (for constructor)
 		- Find all fields and their order (for constructor)
 		- Generate field accessor methods
  *********************************************************************** -->

  <xsl:template mode="field-accessors" match="group">
    <xsl:call-template name="field-accessor-template"/>
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
  
	  <!--  Find the component numbers and order -->
  
  <xsl:template mode="component-field-numbers" match="field">
    <xsl:variable name="name" select="@name"/>
  	<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>, </xsl:template>

  <xsl:template mode="component-field-numbers" match="group">
    <xsl:variable name="name" select="@name"/>
  	<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>, </xsl:template>
 
  <xsl:template mode="component-field-numbers" match="component">
    <xsl:variable name="name" select="@name"/>  
  	<xsl:apply-templates select="/fix/components/component[@name=$name]/*" 
  		mode="component-field-numbers"/>
  </xsl:template>

	<!-- ================================================================= -->
	
  <!--  Find the field numbers and order -->
  
  <xsl:template mode="group-field-numbers" match="field|group">
    <xsl:variable name="name" select="@name"/>
  	<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>, </xsl:template>

  <xsl:template mode="group-field-numbers" match="component">
    <xsl:variable name="name" select="@name"/>  
  	<xsl:apply-templates select="/fix/components/component[@name=$name]/*" 
  		mode="group-field-numbers"/>
  </xsl:template>
 
  <!-- *********************************************************************
 	Field accessor method generation.
  *********************************************************************** -->
  
  <xsl:template mode="field-accessors" match="field">
  	<xsl:call-template name="field-accessor-template"/>
  </xsl:template>
  
  <xsl:template name="field-accessor-template">
  public void set(<xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> value)
  { 
    setField(value); 
  }
  
  public <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> get(<xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/>  value) throws FieldNotFound
  { 
    getField(value); 
    return value; 
  }
  
  public <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> get<xsl:value-of select="@name"/>() throws FieldNotFound
  { 
    <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> value = new <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/>();
    getField(value); 
    return value; 
  }
  
  public boolean isSet(<xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> field)
  { 
    return isSetField(field); 
  }
  
  public boolean isSet<xsl:value-of select="@name"/>()
  {<xsl:variable name="name" select="@name"/>
    return isSetField(<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>); 
  }
  </xsl:template>

  <xsl:template name="component-accessor-template">
  <xsl:variable name="type" select="concat($messagePackage,'.component.',@name)"/>
  public void set(<xsl:value-of select="$type"/> component) 
  { 
    setComponent(component); 
  }
  
  public <xsl:value-of select="$type"/> get(<xsl:value-of select="$type"/>  component) throws FieldNotFound
  { 
    getComponent(component);
    return component; 
  }
  
  public <xsl:value-of select="$type"/> get<xsl:value-of select="@name"/>() throws FieldNotFound
  { 
    <xsl:value-of select="$type"/> component = new <xsl:value-of select="$type"/>();
    getComponent(component); 
    return component; 
  }
  
  </xsl:template>

  <xsl:template mode="field-accessors" match="message//component">
  	<xsl:call-template name="component-accessor-template"/>
    <xsl:variable name="name" select="@name"/>  
  	<xsl:apply-templates select="/fix/components/component[@name=$name]/*[name(.)='field' or name(.)='group' or name(.)='component']"
  		mode="field-accessors"/>
  </xsl:template>
	
</xsl:stylesheet>

