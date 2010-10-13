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
 <xsl:output  method="text" encoding="UTF-8"/>
 <xsl:param name="fieldPackage"/>
 <xsl:param name="messagePackage"/>

 <xsl:template match="text()"/>

 <xsl:template match="/">
 <xsl:copy-of select="document('COPYRIGHT.xml')"/>
package <xsl:value-of select="$messagePackage"/>;

import quickfix.*;
import <xsl:value-of select="$fieldPackage"/>.*;

public class MessageCracker 
{

/**
 * Callback for quickfix.Message message
 *
 * @param message
 * @param sessionID
 *
 * @throws FieldNotFound
 * @throws UnsupportedMessageType
 * @throws IncorrectTagValue
 */
public void onMessage( quickfix.Message message, SessionID sessionID ) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue
  { throw new UnsupportedMessageType(); }
<xsl:call-template name="virtual-functions"/>
<xsl:call-template name="switch-statement"/>
  }


</xsl:template>

<xsl:template name="virtual-functions">
 <xsl:for-each select="//fix/messages/message">
 /**
 * Callback for FIX<xsl:value-of select="@name"/> message
 *
 * @param message
 * @param sessionID
 *
 * @throws FieldNotFound
 * @throws UnsupportedMessageType
 * @throws IncorrectTagValue
 */
 public void onMessage( <xsl:value-of select="@name"/> message, SessionID sessionID ) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue
 <xsl:choose>
 <xsl:when test="(@msgcat='app' or @msgcat='Common') and @name='BusinessMessageReject'">
 {
    //
 }
 </xsl:when>
 <xsl:when test="@msgcat='admin'">
 {
    //
 }
  </xsl:when>
 <xsl:when test="@msgcat='Session'">
 {
    //
 }
 </xsl:when>
 <xsl:otherwise>   { throw new UnsupportedMessageType(); }
 </xsl:otherwise>
 </xsl:choose>
</xsl:for-each>
</xsl:template>

<xsl:template name="switch-statement">
  public void crack( quickfix.Message message, SessionID sessionID )
    throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue
  { crack<xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/>((Message)message, sessionID); }

 /**
  * Cracker method for <xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/> messages
  *
  * @throws FieldNotFound
  * @throws UnsupportedMessageType
  * @throws IncorrectTagValue
  */
  public void crack<xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/>( Message message, SessionID sessionID )
    throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue
  {
    MsgType msgType = new MsgType();
    message.getHeader().getField(msgType);
    String msgTypeValue = msgType.getValue();

    <xsl:for-each select="//fix/messages/message">
    <xsl:if test="position()!=1">
    else
    </xsl:if>if( msgTypeValue.equals(<xsl:value-of select="@name"/>.MSGTYPE) )
      onMessage( (<xsl:value-of select="@name"/>)message, sessionID );</xsl:for-each>
    else onMessage( message, sessionID );
  }
</xsl:template>

<xsl:template name="base-class">
 <xsl:if test="//fix/@major='4'">
   <xsl:if test="//fix/@minor='1'">extends quickfix.fix40.MessageCracker</xsl:if>
   <xsl:if test="//fix/@minor='2'">extends quickfix.fix41.MessageCracker</xsl:if>
   <xsl:if test="//fix/@minor='3'">extends quickfix.fix42.MessageCracker</xsl:if>
   <xsl:if test="//fix/@minor='4'">extends quickfix.fix43.MessageCracker</xsl:if>
 </xsl:if>
 <xsl:if test="//fix/@major='5'">
   <xsl:if test="//fix/@minor='0'">extends quickfix.fix44.MessageCracker</xsl:if>
 </xsl:if>
 <xsl:if test="//fix/@type='FIXT'">extends quickfix.fix50.MessageCracker</xsl:if>
</xsl:template>

</xsl:stylesheet>

