<xsl:stylesheet version="2.0"
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

	<xsl:template match="node()|@*" name="identity">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*" />
		</xsl:copy>
	</xsl:template>


	<!-- remove all the fields that are not required by core -->
	<xsl:template match="fixr:fields/fixr:field[not(
											   @id='1156'
											or @id='1128'
											or @id='7'
											or @id='8'
											or @id='9'
											or @id='380'
											or @id='10'
											or @id='1129'
											or @id='1137'
											or @id='128'
											or @id='145'
											or @id='129'
											or @id='98'
											or @id='16'
											or @id='123'
											or @id='108'
											or @id='369'
											or @id='347'
											or @id='34'
											or @id='35'
											or @id='36'
											or @id='789'
											or @id='627'
											or @id='115'
											or @id='144'
											or @id='370'
											or @id='116'
											or @id='122'
											or @id='43'
											or @id='97'
											or @id='372'
											or @id='45'
											or @id='371'
											or @id='141'
											or @id='90'
											or @id='91'
											or @id='49'
											or @id='142'
											or @id='50'
											or @id='52'
											or @id='373'
											or @id='1409'
											or @id='89'
											or @id='93'
											or @id='56'
											or @id='143'
											or @id='57'
											or @id='112'
											or @id='58'
											or @id='213'
											or @id='212'
											)]">
	</xsl:template>

	<!-- ApplExtID -->
	<!-- ApplVerID -->
	<!-- BeginSeqNo -->
	<!-- BeginString -->
	<!-- BodyLength -->
	<!-- BusinessRejectReason -->
	<!-- CheckSum -->
	<!-- CstmApplVerID -->
	<!-- DefaultApplVerID -->
	<!-- DeliverToCompID -->
	<!-- DeliverToLocationID -->
	<!-- DeliverToSubID -->
	<!-- EncryptMethod -->
	<!-- EndSeqNo -->
	<!-- GapFillFlag -->
	<!-- HeartBtInt -->
	<!-- LastMsgSeqNumProcessed -->
	<!-- MessageEncoding -->
	<!-- MsgSeqNum -->
	<!-- MsgType -->
	<!-- NewSeqNo -->
	<!-- NextExpectedMsgSeqNum -->
	<!-- NoHops -->
	<!-- OnBehalfOfCompID -->
	<!-- OnBehalfOfLocationID -->
	<!-- OnBehalfOfSendingTime -->
	<!-- OnBehalfOfSubID -->
	<!-- OrigSendingTime -->
	<!-- PossDupFlag -->
	<!-- PossResend -->
	<!-- RefMsgType -->
	<!-- RefSeqNum -->
	<!-- RefTagID -->
	<!-- ResetSeqNumFlag -->
	<!-- SecureDataLen -->
	<!-- SenderCompID -->
	<!-- SenderLocationID -->
	<!-- SenderSubID -->
	<!-- SendingTime -->
	<!-- SessionRejectReason -->
	<!-- SessionStatus -->
	<!-- Signature -->
	<!-- SignatureLength -->
	<!-- TargetCompID -->
	<!-- TargetLocationID -->
	<!-- TargetSubID -->
	<!-- TestReqID -->
	<!-- Text -->
	<!-- XmlData -->
	<!-- XmlDataLen -->

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

	<!-- filter out messages -->
	<xsl:template
		match="fixr:messages/fixr:message" />

	<!-- filter out components -->
	<xsl:template
		match="fixr:components/fixr:component" />

	<!-- filter out groups -->
	<xsl:template
		match="fixr:groups/fixr:group" />

<!--
PossResendCodeSet 97
ApplVerIDCodeSet 1128
BusinessRejectReasonCodeSet 380
EncryptMethodCodeSet 98
GapFillFlagCodeSet 123
MsgTypeCodeSet 35
PossDupFlagCodeSet 43
SessionRejectReasonCodeSet 373
SessionStatusCodeSet 1409 -->

	<!-- filter out codesets -->
	<xsl:template
		match="fixr:codeSet[not(@id='35'
								or @id='43'
								or @id='97'
								or @id='98'
								or @id='123'
								or @id='373'
								or @id='380'
								or @id='1128'
								or @id='1409'
		)]"/>

</xsl:stylesheet>
