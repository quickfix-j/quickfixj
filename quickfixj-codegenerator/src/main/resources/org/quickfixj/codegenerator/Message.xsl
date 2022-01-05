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

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
 <xsl:output method="text" encoding="UTF-8"/>
 <xsl:param name="serialVersionUID"/>
 <xsl:param name="messagePackage"/>
 <xsl:param name="fieldPackage"/>

<xsl:template match="text()"/>


<xsl:template match="/">/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/
package <xsl:value-of select="$messagePackage"/>;
<xsl:choose>
  <xsl:when test="//fix/@major='4' or //fix/@type='FIXT'">
import quickfix.FieldNotFound;
  </xsl:when>
</xsl:choose>
import quickfix.field.*;
<xsl:call-template name="extra-imports"/>

public class Message extends quickfix.Message {

	static final long serialVersionUID = <xsl:value-of select="$serialVersionUID"/>;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		<xsl:choose>
			<xsl:when test="//fix/@major='4'">
		getHeader().setField(new BeginString("FIX.<xsl:value-of select="//fix/@major"/>.<xsl:value-of select="//fix/@minor"/>"));
			</xsl:when>
			<xsl:when test="//fix/@major='5' or //fix/@type='FIXT'">
		getHeader().setField(new BeginString("FIXT.1.1"));
			</xsl:when>
		</xsl:choose>
	}

    @Override
    protected Header newHeader() {
        return new Header(this);
    }

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = <xsl:value-of select="$serialVersionUID"/>;

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

  <!--
    *********************************************************************
    FIX repeating group generation template.
      - Find first field (for constructor)
      - Find all fields and their order (for constructor)
      - Generate field accessor methods
    *********************************************************************
  -->

<xsl:template mode="field-accessors" match="group">
    <xsl:call-template name="field-accessor-template"/>
    <xsl:variable name="groupFieldName" select="@name"/>
	public static class <xsl:value-of select="@name"/> extends Group {

		static final long serialVersionUID = <xsl:value-of select="$serialVersionUID"/>;
		private static final int[] ORDER = {<xsl:apply-templates select="field|component|group" mode="group-field-numbers"/>0};

		public <xsl:value-of select="@name"/>() {
			super(<xsl:value-of select="/fix/fields/field[@name=$groupFieldName]/@number"/>, <xsl:apply-templates select="field|component|group" mode="group-delimeter"/>, ORDER);
		}
		<xsl:apply-templates select="field|component|group" mode="field-accessors"/>
	}
</xsl:template>

  <!-- Find the group delimeter (first field) -->

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

  <!-- Find the component numbers and order -->

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

  <!-- Find the field numbers and order -->

<xsl:template mode="group-field-numbers" match="field|group">
    <xsl:variable name="name" select="@name"/>
    <xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>, </xsl:template>

<xsl:template mode="group-field-numbers" match="component">
    <xsl:variable name="name" select="@name"/>
    <xsl:apply-templates select="/fix/components/component[@name=$name]/*"
        mode="group-field-numbers"/>
</xsl:template>

  <!--
    *********************************************************************
    Field accessor method generation.
    *********************************************************************
  -->
<xsl:template mode="field-accessors" match="field">
    <xsl:call-template name="field-accessor-template"/>
</xsl:template>

<xsl:template name="field-accessor-template">
	<xsl:variable name="name" select="@name"/>
	public void set(<xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> value) {
		setField(value);
	}

	public <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> get(<xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> get<xsl:value-of select="@name"/>() throws FieldNotFound {
		return get(new <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/>());
	}

	public boolean isSet(<xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/> field) {
		return isSetField(field);
	}

	public boolean isSet<xsl:value-of select="@name"/>() {
		return isSetField(<xsl:value-of select="/fix/fields/field[@name=$name]/@number"/>);
	}
</xsl:template>

<xsl:template name="component-accessor-template">
	<xsl:variable name="type" select="concat($messagePackage,'.component.',@name)"/>
	public void set(<xsl:value-of select="$type"/> component) {
		setComponent(component);
	}

	public <xsl:value-of select="$type"/> get(<xsl:value-of select="$type"/> component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public <xsl:value-of select="$type"/> get<xsl:value-of select="@name"/>() throws FieldNotFound {
		return get(new <xsl:value-of select="$type"/>());
	}
</xsl:template>

<xsl:template mode="field-accessors" match="message//component">
    <xsl:call-template name="component-accessor-template"/>
    <xsl:variable name="name" select="@name"/>
    <xsl:apply-templates select="/fix/components/component[@name=$name]/*[name(.)='field' or name(.)='group' or name(.)='component']"
        mode="field-accessors"/>
</xsl:template>

<xsl:template name="extra-imports">
    <xsl:variable name="groups" select="/fix/header/group"/>
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

    <!-- TODO Remove this duplication from MessageSubclass.xsl -->
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

</xsl:stylesheet>
