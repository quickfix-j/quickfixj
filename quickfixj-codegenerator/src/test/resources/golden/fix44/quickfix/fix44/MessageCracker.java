/* Generated Java Source File */
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

package quickfix.fix44;

import quickfix.*;
import quickfix.field.*;
import java.util.HashMap;

public class MessageCracker {

	private final HashMap<String, MessageConsumer> methodRegistry = new HashMap<>();
	private final MessageConsumer defaultFunction = this::onMessage;

	public MessageCracker() {
	
		methodRegistry.put(Heartbeat.MSGTYPE,
			(message, sessionID) -> onMessage((Heartbeat) message, sessionID));
	
		methodRegistry.put(Logon.MSGTYPE,
			(message, sessionID) -> onMessage((Logon) message, sessionID));
	
		methodRegistry.put(TestRequest.MSGTYPE,
			(message, sessionID) -> onMessage((TestRequest) message, sessionID));
	
		methodRegistry.put(ResendRequest.MSGTYPE,
			(message, sessionID) -> onMessage((ResendRequest) message, sessionID));
	
		methodRegistry.put(Reject.MSGTYPE,
			(message, sessionID) -> onMessage((Reject) message, sessionID));
	
		methodRegistry.put(SequenceReset.MSGTYPE,
			(message, sessionID) -> onMessage((SequenceReset) message, sessionID));
	
		methodRegistry.put(Logout.MSGTYPE,
			(message, sessionID) -> onMessage((Logout) message, sessionID));
	
		methodRegistry.put(BusinessMessageReject.MSGTYPE,
			(message, sessionID) -> onMessage((BusinessMessageReject) message, sessionID));
	
		methodRegistry.put(UserRequest.MSGTYPE,
			(message, sessionID) -> onMessage((UserRequest) message, sessionID));
	
		methodRegistry.put(UserResponse.MSGTYPE,
			(message, sessionID) -> onMessage((UserResponse) message, sessionID));
	
		methodRegistry.put(Advertisement.MSGTYPE,
			(message, sessionID) -> onMessage((Advertisement) message, sessionID));
	
		methodRegistry.put(IndicationOfInterest.MSGTYPE,
			(message, sessionID) -> onMessage((IndicationOfInterest) message, sessionID));
	
		methodRegistry.put(News.MSGTYPE,
			(message, sessionID) -> onMessage((News) message, sessionID));
	
		methodRegistry.put(Email.MSGTYPE,
			(message, sessionID) -> onMessage((Email) message, sessionID));
	
		methodRegistry.put(QuoteRequest.MSGTYPE,
			(message, sessionID) -> onMessage((QuoteRequest) message, sessionID));
	
		methodRegistry.put(QuoteResponse.MSGTYPE,
			(message, sessionID) -> onMessage((QuoteResponse) message, sessionID));
	
		methodRegistry.put(QuoteRequestReject.MSGTYPE,
			(message, sessionID) -> onMessage((QuoteRequestReject) message, sessionID));
	
		methodRegistry.put(RFQRequest.MSGTYPE,
			(message, sessionID) -> onMessage((RFQRequest) message, sessionID));
	
		methodRegistry.put(Quote.MSGTYPE,
			(message, sessionID) -> onMessage((Quote) message, sessionID));
	
		methodRegistry.put(QuoteCancel.MSGTYPE,
			(message, sessionID) -> onMessage((QuoteCancel) message, sessionID));
	
		methodRegistry.put(QuoteStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((QuoteStatusRequest) message, sessionID));
	
		methodRegistry.put(QuoteStatusReport.MSGTYPE,
			(message, sessionID) -> onMessage((QuoteStatusReport) message, sessionID));
	
		methodRegistry.put(MassQuote.MSGTYPE,
			(message, sessionID) -> onMessage((MassQuote) message, sessionID));
	
		methodRegistry.put(MassQuoteAcknowledgement.MSGTYPE,
			(message, sessionID) -> onMessage((MassQuoteAcknowledgement) message, sessionID));
	
		methodRegistry.put(MarketDataRequest.MSGTYPE,
			(message, sessionID) -> onMessage((MarketDataRequest) message, sessionID));
	
		methodRegistry.put(MarketDataSnapshotFullRefresh.MSGTYPE,
			(message, sessionID) -> onMessage((MarketDataSnapshotFullRefresh) message, sessionID));
	
		methodRegistry.put(MarketDataIncrementalRefresh.MSGTYPE,
			(message, sessionID) -> onMessage((MarketDataIncrementalRefresh) message, sessionID));
	
		methodRegistry.put(MarketDataRequestReject.MSGTYPE,
			(message, sessionID) -> onMessage((MarketDataRequestReject) message, sessionID));
	
		methodRegistry.put(SecurityDefinitionRequest.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityDefinitionRequest) message, sessionID));
	
		methodRegistry.put(SecurityDefinition.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityDefinition) message, sessionID));
	
		methodRegistry.put(SecurityTypeRequest.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityTypeRequest) message, sessionID));
	
		methodRegistry.put(SecurityTypes.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityTypes) message, sessionID));
	
		methodRegistry.put(SecurityListRequest.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityListRequest) message, sessionID));
	
		methodRegistry.put(SecurityList.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityList) message, sessionID));
	
		methodRegistry.put(DerivativeSecurityListRequest.MSGTYPE,
			(message, sessionID) -> onMessage((DerivativeSecurityListRequest) message, sessionID));
	
		methodRegistry.put(DerivativeSecurityList.MSGTYPE,
			(message, sessionID) -> onMessage((DerivativeSecurityList) message, sessionID));
	
		methodRegistry.put(SecurityStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityStatusRequest) message, sessionID));
	
		methodRegistry.put(SecurityStatus.MSGTYPE,
			(message, sessionID) -> onMessage((SecurityStatus) message, sessionID));
	
		methodRegistry.put(TradingSessionStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((TradingSessionStatusRequest) message, sessionID));
	
		methodRegistry.put(TradingSessionStatus.MSGTYPE,
			(message, sessionID) -> onMessage((TradingSessionStatus) message, sessionID));
	
		methodRegistry.put(NewOrderSingle.MSGTYPE,
			(message, sessionID) -> onMessage((NewOrderSingle) message, sessionID));
	
		methodRegistry.put(ExecutionReport.MSGTYPE,
			(message, sessionID) -> onMessage((ExecutionReport) message, sessionID));
	
		methodRegistry.put(DontKnowTrade.MSGTYPE,
			(message, sessionID) -> onMessage((DontKnowTrade) message, sessionID));
	
		methodRegistry.put(OrderCancelReplaceRequest.MSGTYPE,
			(message, sessionID) -> onMessage((OrderCancelReplaceRequest) message, sessionID));
	
		methodRegistry.put(OrderCancelRequest.MSGTYPE,
			(message, sessionID) -> onMessage((OrderCancelRequest) message, sessionID));
	
		methodRegistry.put(OrderCancelReject.MSGTYPE,
			(message, sessionID) -> onMessage((OrderCancelReject) message, sessionID));
	
		methodRegistry.put(OrderStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((OrderStatusRequest) message, sessionID));
	
		methodRegistry.put(OrderMassCancelRequest.MSGTYPE,
			(message, sessionID) -> onMessage((OrderMassCancelRequest) message, sessionID));
	
		methodRegistry.put(OrderMassCancelReport.MSGTYPE,
			(message, sessionID) -> onMessage((OrderMassCancelReport) message, sessionID));
	
		methodRegistry.put(OrderMassStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((OrderMassStatusRequest) message, sessionID));
	
		methodRegistry.put(NewOrderCross.MSGTYPE,
			(message, sessionID) -> onMessage((NewOrderCross) message, sessionID));
	
		methodRegistry.put(CrossOrderCancelReplaceRequest.MSGTYPE,
			(message, sessionID) -> onMessage((CrossOrderCancelReplaceRequest) message, sessionID));
	
		methodRegistry.put(CrossOrderCancelRequest.MSGTYPE,
			(message, sessionID) -> onMessage((CrossOrderCancelRequest) message, sessionID));
	
		methodRegistry.put(NewOrderMultileg.MSGTYPE,
			(message, sessionID) -> onMessage((NewOrderMultileg) message, sessionID));
	
		methodRegistry.put(MultilegOrderCancelReplaceRequest.MSGTYPE,
			(message, sessionID) -> onMessage((MultilegOrderCancelReplaceRequest) message, sessionID));
	
		methodRegistry.put(BidRequest.MSGTYPE,
			(message, sessionID) -> onMessage((BidRequest) message, sessionID));
	
		methodRegistry.put(BidResponse.MSGTYPE,
			(message, sessionID) -> onMessage((BidResponse) message, sessionID));
	
		methodRegistry.put(NewOrderList.MSGTYPE,
			(message, sessionID) -> onMessage((NewOrderList) message, sessionID));
	
		methodRegistry.put(ListStrikePrice.MSGTYPE,
			(message, sessionID) -> onMessage((ListStrikePrice) message, sessionID));
	
		methodRegistry.put(ListStatus.MSGTYPE,
			(message, sessionID) -> onMessage((ListStatus) message, sessionID));
	
		methodRegistry.put(ListExecute.MSGTYPE,
			(message, sessionID) -> onMessage((ListExecute) message, sessionID));
	
		methodRegistry.put(ListCancelRequest.MSGTYPE,
			(message, sessionID) -> onMessage((ListCancelRequest) message, sessionID));
	
		methodRegistry.put(ListStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((ListStatusRequest) message, sessionID));
	
		methodRegistry.put(AllocationInstruction.MSGTYPE,
			(message, sessionID) -> onMessage((AllocationInstruction) message, sessionID));
	
		methodRegistry.put(AllocationInstructionAck.MSGTYPE,
			(message, sessionID) -> onMessage((AllocationInstructionAck) message, sessionID));
	
		methodRegistry.put(AllocationReport.MSGTYPE,
			(message, sessionID) -> onMessage((AllocationReport) message, sessionID));
	
		methodRegistry.put(AllocationReportAck.MSGTYPE,
			(message, sessionID) -> onMessage((AllocationReportAck) message, sessionID));
	
		methodRegistry.put(Confirmation.MSGTYPE,
			(message, sessionID) -> onMessage((Confirmation) message, sessionID));
	
		methodRegistry.put(ConfirmationAck.MSGTYPE,
			(message, sessionID) -> onMessage((ConfirmationAck) message, sessionID));
	
		methodRegistry.put(ConfirmationRequest.MSGTYPE,
			(message, sessionID) -> onMessage((ConfirmationRequest) message, sessionID));
	
		methodRegistry.put(SettlementInstructions.MSGTYPE,
			(message, sessionID) -> onMessage((SettlementInstructions) message, sessionID));
	
		methodRegistry.put(SettlementInstructionRequest.MSGTYPE,
			(message, sessionID) -> onMessage((SettlementInstructionRequest) message, sessionID));
	
		methodRegistry.put(TradeCaptureReportRequest.MSGTYPE,
			(message, sessionID) -> onMessage((TradeCaptureReportRequest) message, sessionID));
	
		methodRegistry.put(TradeCaptureReportRequestAck.MSGTYPE,
			(message, sessionID) -> onMessage((TradeCaptureReportRequestAck) message, sessionID));
	
		methodRegistry.put(TradeCaptureReport.MSGTYPE,
			(message, sessionID) -> onMessage((TradeCaptureReport) message, sessionID));
	
		methodRegistry.put(TradeCaptureReportAck.MSGTYPE,
			(message, sessionID) -> onMessage((TradeCaptureReportAck) message, sessionID));
	
		methodRegistry.put(RegistrationInstructions.MSGTYPE,
			(message, sessionID) -> onMessage((RegistrationInstructions) message, sessionID));
	
		methodRegistry.put(RegistrationInstructionsResponse.MSGTYPE,
			(message, sessionID) -> onMessage((RegistrationInstructionsResponse) message, sessionID));
	
		methodRegistry.put(PositionMaintenanceRequest.MSGTYPE,
			(message, sessionID) -> onMessage((PositionMaintenanceRequest) message, sessionID));
	
		methodRegistry.put(PositionMaintenanceReport.MSGTYPE,
			(message, sessionID) -> onMessage((PositionMaintenanceReport) message, sessionID));
	
		methodRegistry.put(RequestForPositions.MSGTYPE,
			(message, sessionID) -> onMessage((RequestForPositions) message, sessionID));
	
		methodRegistry.put(RequestForPositionsAck.MSGTYPE,
			(message, sessionID) -> onMessage((RequestForPositionsAck) message, sessionID));
	
		methodRegistry.put(PositionReport.MSGTYPE,
			(message, sessionID) -> onMessage((PositionReport) message, sessionID));
	
		methodRegistry.put(AssignmentReport.MSGTYPE,
			(message, sessionID) -> onMessage((AssignmentReport) message, sessionID));
	
		methodRegistry.put(CollateralRequest.MSGTYPE,
			(message, sessionID) -> onMessage((CollateralRequest) message, sessionID));
	
		methodRegistry.put(CollateralAssignment.MSGTYPE,
			(message, sessionID) -> onMessage((CollateralAssignment) message, sessionID));
	
		methodRegistry.put(CollateralResponse.MSGTYPE,
			(message, sessionID) -> onMessage((CollateralResponse) message, sessionID));
	
		methodRegistry.put(CollateralReport.MSGTYPE,
			(message, sessionID) -> onMessage((CollateralReport) message, sessionID));
	
		methodRegistry.put(CollateralInquiry.MSGTYPE,
			(message, sessionID) -> onMessage((CollateralInquiry) message, sessionID));
	
		methodRegistry.put(NetworkStatusRequest.MSGTYPE,
			(message, sessionID) -> onMessage((NetworkStatusRequest) message, sessionID));
	
		methodRegistry.put(NetworkStatusResponse.MSGTYPE,
			(message, sessionID) -> onMessage((NetworkStatusResponse) message, sessionID));
	
		methodRegistry.put(CollateralInquiryAck.MSGTYPE,
			(message, sessionID) -> onMessage((CollateralInquiryAck) message, sessionID));
	
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

	/**
	 * Callback for FIXHeartbeat message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Heartbeat message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogon message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logon message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXTestRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TestRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXResendRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ResendRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Reject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXSequenceReset message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SequenceReset message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogout message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logout message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXBusinessMessageReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BusinessMessageReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXUserRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(UserRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXUserResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(UserResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAdvertisement message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Advertisement message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXIndicationOfInterest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(IndicationOfInterest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNews message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(News message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXEmail message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Email message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteRequestReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteRequestReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRFQRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RFQRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuote message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Quote message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteCancel message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteCancel message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteStatusReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteStatusReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMassQuote message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MassQuote message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMassQuoteAcknowledgement message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MassQuoteAcknowledgement message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataSnapshotFullRefresh message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataSnapshotFullRefresh message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataIncrementalRefresh message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataIncrementalRefresh message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataRequestReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataRequestReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityDefinitionRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityDefinitionRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityDefinition message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityDefinition message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityTypeRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityTypeRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityTypes message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityTypes message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityListRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityListRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityList message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityList message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXDerivativeSecurityListRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DerivativeSecurityListRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXDerivativeSecurityList message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DerivativeSecurityList message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradingSessionStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradingSessionStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradingSessionStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradingSessionStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderSingle message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderSingle message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXExecutionReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ExecutionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXDontKnowTrade message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DontKnowTrade message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderMassCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderMassCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderMassCancelReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderMassCancelReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderMassStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderMassStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderCross message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderCross message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCrossOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CrossOrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCrossOrderCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CrossOrderCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderMultileg message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderMultileg message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMultilegOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MultilegOrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXBidRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BidRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXBidResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BidResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderList message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderList message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListStrikePrice message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListStrikePrice message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListExecute message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListExecute message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationInstruction message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationInstruction message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationInstructionAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationInstructionAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationReportAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationReportAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXConfirmation message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Confirmation message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXConfirmationAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ConfirmationAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXConfirmationRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ConfirmationRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSettlementInstructions message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SettlementInstructions message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSettlementInstructionRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SettlementInstructionRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReportRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReportRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReportRequestAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReportRequestAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReportAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReportAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRegistrationInstructions message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RegistrationInstructions message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRegistrationInstructionsResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RegistrationInstructionsResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXPositionMaintenanceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionMaintenanceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXPositionMaintenanceReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionMaintenanceReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRequestForPositions message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RequestForPositions message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRequestForPositionsAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RequestForPositionsAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXPositionReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAssignmentReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AssignmentReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralAssignment message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralAssignment message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralInquiry message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralInquiry message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNetworkStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NetworkStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNetworkStatusResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NetworkStatusResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralInquiryAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralInquiryAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	public void crack(quickfix.Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
		crack44((Message) message, sessionID);
	}

	/**
	 * Cracker method for 44 messages.
	 *
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void crack44(Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {

		String type = message.getHeader().getString(MsgType.FIELD);
		methodRegistry.getOrDefault(type, defaultFunction).accept(message, sessionID);
	}

	@FunctionalInterface
	private interface MessageConsumer {
		void accept(Message message, SessionID sessionID)
			throws UnsupportedMessageType, IncorrectTagValue, FieldNotFound;
	}

}
