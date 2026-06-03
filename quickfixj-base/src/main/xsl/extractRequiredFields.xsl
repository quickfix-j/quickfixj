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

	<!-- remove all the fields that are not required by core -->
	<xsl:template match="fixr:fields/fixr:field[not(@id = (
							'1156', '1128', '7', '8', '9', '380', '10', '1129', '1137',
							'128', '145', '129', '98', '16', '123', '108', '369', '347',
							'34', '35', '36', '789', '627', '115', '144', '370', '116',
							'122', '43', '97', '372', '45', '371', '141', '90', '91',
							'49', '142', '50', '52', '373', '1409', '89', '93', '56',
							'143', '57', '112', '58', '213', '212'
							))]">
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

</xsl:stylesheet>
