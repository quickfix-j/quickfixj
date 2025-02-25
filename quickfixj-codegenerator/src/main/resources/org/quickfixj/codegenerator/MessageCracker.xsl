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
 <xsl:param name="fieldPackage"/>
 <xsl:param name="messagePackage"/>

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

import quickfix.*;
import <xsl:value-of select="$fieldPackage"/>.*;
import java.util.HashMap;

public class MessageCracker {

	private final HashMap&lt;String, MessageConsumer&gt; methodRegistry = new HashMap&lt;&gt;();
	private final MessageConsumer defaultFunction = this::onMessage;

	public MessageCracker() {
	<xsl:for-each select="//fix/messages/message">
		methodRegistry.put(<xsl:value-of select="@name"/>.MSGTYPE,
			(message, sessionID) -> onMessage((<xsl:value-of select="@name"/>) message, sessionID));
	</xsl:for-each>
	}

	/**
	 * Callback for quickfix.Message message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(quickfix.Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
<xsl:call-template name="virtual-functions"/>
<xsl:call-template name="switch-statement"/>
}
</xsl:template>

<xsl:template name="virtual-functions">
 <xsl:for-each select="//fix/messages/message">
	/**
	 * Callback for FIX<xsl:value-of select="@name"/> message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(<xsl:value-of select="@name"/> message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {<xsl:text/>
	<xsl:choose>
	<xsl:when test="(@msgcat='app' or @msgcat='Common') and @name='BusinessMessageReject'">
	}
	</xsl:when>
	<xsl:when test="@msgcat='admin'">
	}
	</xsl:when>
	<xsl:when test="@msgcat='Session'">
	}
	</xsl:when>
	<xsl:otherwise>
		throw new UnsupportedMessageType();
	}
	</xsl:otherwise>
	</xsl:choose>
</xsl:for-each>
</xsl:template>

<xsl:template name="switch-statement">
	public void crack(quickfix.Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
		crack<xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/>((Message) message, sessionID);
	}

	/**
	 * Cracker method for <xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/> messages.
	 *
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void crack<xsl:value-of select="//fix/@major"/><xsl:value-of select="//fix/@minor"/>(Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {

		String type = message.getHeader().getString(MsgType.FIELD);
		methodRegistry.getOrDefault(type, defaultFunction).accept(message, sessionID);
	}

	@FunctionalInterface
	private interface MessageConsumer {
		void accept(Message message, SessionID sessionID)
			throws UnsupportedMessageType, IncorrectTagValue, FieldNotFound;
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
