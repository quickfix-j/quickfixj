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
 <xsl:param name="fieldPackage"/>
 <xsl:param name="messagePackage"/>

 <xsl:template match="text()"/>

 <xsl:template match="/">/* -*- Generated Java -*- */
 <xsl:copy-of select="document('COPYRIGHT.xml')"/>
package <xsl:value-of select="$messagePackage"/>;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory
{
  public Message create( String beginString, String msgType ) {
  <xsl:call-template name="if-statement"/>
  return new <xsl:value-of select="$messagePackage"/>.Message();
  }

     public Group create(String beginString, String msgType, int correspondingFieldID) {
         <xsl:call-template name="group-if-statement"/>
        return null;
     }
}

  </xsl:template>
    <xsl:template name="if-statement">
     <xsl:for-each select="//fix/messages/message">
       if(<xsl:value-of select="$messagePackage"/>.<xsl:value-of select="@name"/>.MSGTYPE.equals(msgType)) {
         return new <xsl:value-of select="$messagePackage"/>.<xsl:value-of select="@name"/>();
       }
     </xsl:for-each>
    </xsl:template>

    <xsl:template name="group-if-statement">
     <xsl:for-each select="//fix/messages/message[group or component]">
       if(<xsl:value-of select="$messagePackage"/>.<xsl:value-of select="@name"/>.MSGTYPE.equals(msgType)) {
         switch(correspondingFieldID) {
         <xsl:apply-templates mode="group-factories" select="group">
            <xsl:with-param name="fullPath" select="@name"/>
         </xsl:apply-templates>
         <xsl:apply-templates mode="group-factories" select="component">
            <xsl:with-param name="fullPath" select="@name"/>
         </xsl:apply-templates>
         }
       }
     </xsl:for-each>
    </xsl:template>

    <xsl:template mode="group-factories" match="group">
    	<xsl:param name="fullPath"/>
           case <xsl:value-of select="$fieldPackage"/>.<xsl:value-of select="@name"/>.FIELD:
                return new <xsl:value-of select="concat($messagePackage, '.', $fullPath, '.', @name)"/>();
		 <xsl:variable name="groupPath" select="concat($fullPath, '.', @name)"/>
         <xsl:apply-templates mode="group-factories" select="group">
           <xsl:with-param name="fullPath" select='$groupPath'/>
         </xsl:apply-templates>
         <xsl:apply-templates mode="group-factories" select="component">
         	<xsl:with-param name="fullPath" select="$groupPath"/>
         </xsl:apply-templates>
    </xsl:template>

    <xsl:template mode="group-factories" match="component">
    	<xsl:param name="fullPath"/>
  	    <xsl:variable name="name" select="@name"/>
  		<xsl:apply-templates mode="group-factories" select="/fix/components/component[@name=$name]/group">
  			<xsl:with-param name="fullPath" select='$fullPath'/>
  		</xsl:apply-templates>
    </xsl:template>

</xsl:stylesheet>
