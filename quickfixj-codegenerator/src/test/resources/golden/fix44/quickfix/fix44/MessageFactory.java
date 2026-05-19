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

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix44.Heartbeat.MSGTYPE:
				return new quickfix.fix44.Heartbeat();
	
			case quickfix.fix44.Logon.MSGTYPE:
				return new quickfix.fix44.Logon();
	
			case quickfix.fix44.TestRequest.MSGTYPE:
				return new quickfix.fix44.TestRequest();
	
			case quickfix.fix44.ResendRequest.MSGTYPE:
				return new quickfix.fix44.ResendRequest();
	
			case quickfix.fix44.Reject.MSGTYPE:
				return new quickfix.fix44.Reject();
	
			case quickfix.fix44.SequenceReset.MSGTYPE:
				return new quickfix.fix44.SequenceReset();
	
			case quickfix.fix44.Logout.MSGTYPE:
				return new quickfix.fix44.Logout();
	
			case quickfix.fix44.BusinessMessageReject.MSGTYPE:
				return new quickfix.fix44.BusinessMessageReject();
	
			case quickfix.fix44.UserRequest.MSGTYPE:
				return new quickfix.fix44.UserRequest();
	
			case quickfix.fix44.UserResponse.MSGTYPE:
				return new quickfix.fix44.UserResponse();
	
			case quickfix.fix44.Advertisement.MSGTYPE:
				return new quickfix.fix44.Advertisement();
	
			case quickfix.fix44.IndicationOfInterest.MSGTYPE:
				return new quickfix.fix44.IndicationOfInterest();
	
			case quickfix.fix44.News.MSGTYPE:
				return new quickfix.fix44.News();
	
			case quickfix.fix44.Email.MSGTYPE:
				return new quickfix.fix44.Email();
	
			case quickfix.fix44.QuoteRequest.MSGTYPE:
				return new quickfix.fix44.QuoteRequest();
	
			case quickfix.fix44.QuoteResponse.MSGTYPE:
				return new quickfix.fix44.QuoteResponse();
	
			case quickfix.fix44.QuoteRequestReject.MSGTYPE:
				return new quickfix.fix44.QuoteRequestReject();
	
			case quickfix.fix44.RFQRequest.MSGTYPE:
				return new quickfix.fix44.RFQRequest();
	
			case quickfix.fix44.Quote.MSGTYPE:
				return new quickfix.fix44.Quote();
	
			case quickfix.fix44.QuoteCancel.MSGTYPE:
				return new quickfix.fix44.QuoteCancel();
	
			case quickfix.fix44.QuoteStatusRequest.MSGTYPE:
				return new quickfix.fix44.QuoteStatusRequest();
	
			case quickfix.fix44.QuoteStatusReport.MSGTYPE:
				return new quickfix.fix44.QuoteStatusReport();
	
			case quickfix.fix44.MassQuote.MSGTYPE:
				return new quickfix.fix44.MassQuote();
	
			case quickfix.fix44.MassQuoteAcknowledgement.MSGTYPE:
				return new quickfix.fix44.MassQuoteAcknowledgement();
	
			case quickfix.fix44.MarketDataRequest.MSGTYPE:
				return new quickfix.fix44.MarketDataRequest();
	
			case quickfix.fix44.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.fix44.MarketDataSnapshotFullRefresh();
	
			case quickfix.fix44.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.fix44.MarketDataIncrementalRefresh();
	
			case quickfix.fix44.MarketDataRequestReject.MSGTYPE:
				return new quickfix.fix44.MarketDataRequestReject();
	
			case quickfix.fix44.SecurityDefinitionRequest.MSGTYPE:
				return new quickfix.fix44.SecurityDefinitionRequest();
	
			case quickfix.fix44.SecurityDefinition.MSGTYPE:
				return new quickfix.fix44.SecurityDefinition();
	
			case quickfix.fix44.SecurityTypeRequest.MSGTYPE:
				return new quickfix.fix44.SecurityTypeRequest();
	
			case quickfix.fix44.SecurityTypes.MSGTYPE:
				return new quickfix.fix44.SecurityTypes();
	
			case quickfix.fix44.SecurityListRequest.MSGTYPE:
				return new quickfix.fix44.SecurityListRequest();
	
			case quickfix.fix44.SecurityList.MSGTYPE:
				return new quickfix.fix44.SecurityList();
	
			case quickfix.fix44.DerivativeSecurityListRequest.MSGTYPE:
				return new quickfix.fix44.DerivativeSecurityListRequest();
	
			case quickfix.fix44.DerivativeSecurityList.MSGTYPE:
				return new quickfix.fix44.DerivativeSecurityList();
	
			case quickfix.fix44.SecurityStatusRequest.MSGTYPE:
				return new quickfix.fix44.SecurityStatusRequest();
	
			case quickfix.fix44.SecurityStatus.MSGTYPE:
				return new quickfix.fix44.SecurityStatus();
	
			case quickfix.fix44.TradingSessionStatusRequest.MSGTYPE:
				return new quickfix.fix44.TradingSessionStatusRequest();
	
			case quickfix.fix44.TradingSessionStatus.MSGTYPE:
				return new quickfix.fix44.TradingSessionStatus();
	
			case quickfix.fix44.NewOrderSingle.MSGTYPE:
				return new quickfix.fix44.NewOrderSingle();
	
			case quickfix.fix44.ExecutionReport.MSGTYPE:
				return new quickfix.fix44.ExecutionReport();
	
			case quickfix.fix44.DontKnowTrade.MSGTYPE:
				return new quickfix.fix44.DontKnowTrade();
	
			case quickfix.fix44.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix44.OrderCancelReplaceRequest();
	
			case quickfix.fix44.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix44.OrderCancelRequest();
	
			case quickfix.fix44.OrderCancelReject.MSGTYPE:
				return new quickfix.fix44.OrderCancelReject();
	
			case quickfix.fix44.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix44.OrderStatusRequest();
	
			case quickfix.fix44.OrderMassCancelRequest.MSGTYPE:
				return new quickfix.fix44.OrderMassCancelRequest();
	
			case quickfix.fix44.OrderMassCancelReport.MSGTYPE:
				return new quickfix.fix44.OrderMassCancelReport();
	
			case quickfix.fix44.OrderMassStatusRequest.MSGTYPE:
				return new quickfix.fix44.OrderMassStatusRequest();
	
			case quickfix.fix44.NewOrderCross.MSGTYPE:
				return new quickfix.fix44.NewOrderCross();
	
			case quickfix.fix44.CrossOrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix44.CrossOrderCancelReplaceRequest();
	
			case quickfix.fix44.CrossOrderCancelRequest.MSGTYPE:
				return new quickfix.fix44.CrossOrderCancelRequest();
	
			case quickfix.fix44.NewOrderMultileg.MSGTYPE:
				return new quickfix.fix44.NewOrderMultileg();
	
			case quickfix.fix44.MultilegOrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix44.MultilegOrderCancelReplaceRequest();
	
			case quickfix.fix44.BidRequest.MSGTYPE:
				return new quickfix.fix44.BidRequest();
	
			case quickfix.fix44.BidResponse.MSGTYPE:
				return new quickfix.fix44.BidResponse();
	
			case quickfix.fix44.NewOrderList.MSGTYPE:
				return new quickfix.fix44.NewOrderList();
	
			case quickfix.fix44.ListStrikePrice.MSGTYPE:
				return new quickfix.fix44.ListStrikePrice();
	
			case quickfix.fix44.ListStatus.MSGTYPE:
				return new quickfix.fix44.ListStatus();
	
			case quickfix.fix44.ListExecute.MSGTYPE:
				return new quickfix.fix44.ListExecute();
	
			case quickfix.fix44.ListCancelRequest.MSGTYPE:
				return new quickfix.fix44.ListCancelRequest();
	
			case quickfix.fix44.ListStatusRequest.MSGTYPE:
				return new quickfix.fix44.ListStatusRequest();
	
			case quickfix.fix44.AllocationInstruction.MSGTYPE:
				return new quickfix.fix44.AllocationInstruction();
	
			case quickfix.fix44.AllocationInstructionAck.MSGTYPE:
				return new quickfix.fix44.AllocationInstructionAck();
	
			case quickfix.fix44.AllocationReport.MSGTYPE:
				return new quickfix.fix44.AllocationReport();
	
			case quickfix.fix44.AllocationReportAck.MSGTYPE:
				return new quickfix.fix44.AllocationReportAck();
	
			case quickfix.fix44.Confirmation.MSGTYPE:
				return new quickfix.fix44.Confirmation();
	
			case quickfix.fix44.ConfirmationAck.MSGTYPE:
				return new quickfix.fix44.ConfirmationAck();
	
			case quickfix.fix44.ConfirmationRequest.MSGTYPE:
				return new quickfix.fix44.ConfirmationRequest();
	
			case quickfix.fix44.SettlementInstructions.MSGTYPE:
				return new quickfix.fix44.SettlementInstructions();
	
			case quickfix.fix44.SettlementInstructionRequest.MSGTYPE:
				return new quickfix.fix44.SettlementInstructionRequest();
	
			case quickfix.fix44.TradeCaptureReportRequest.MSGTYPE:
				return new quickfix.fix44.TradeCaptureReportRequest();
	
			case quickfix.fix44.TradeCaptureReportRequestAck.MSGTYPE:
				return new quickfix.fix44.TradeCaptureReportRequestAck();
	
			case quickfix.fix44.TradeCaptureReport.MSGTYPE:
				return new quickfix.fix44.TradeCaptureReport();
	
			case quickfix.fix44.TradeCaptureReportAck.MSGTYPE:
				return new quickfix.fix44.TradeCaptureReportAck();
	
			case quickfix.fix44.RegistrationInstructions.MSGTYPE:
				return new quickfix.fix44.RegistrationInstructions();
	
			case quickfix.fix44.RegistrationInstructionsResponse.MSGTYPE:
				return new quickfix.fix44.RegistrationInstructionsResponse();
	
			case quickfix.fix44.PositionMaintenanceRequest.MSGTYPE:
				return new quickfix.fix44.PositionMaintenanceRequest();
	
			case quickfix.fix44.PositionMaintenanceReport.MSGTYPE:
				return new quickfix.fix44.PositionMaintenanceReport();
	
			case quickfix.fix44.RequestForPositions.MSGTYPE:
				return new quickfix.fix44.RequestForPositions();
	
			case quickfix.fix44.RequestForPositionsAck.MSGTYPE:
				return new quickfix.fix44.RequestForPositionsAck();
	
			case quickfix.fix44.PositionReport.MSGTYPE:
				return new quickfix.fix44.PositionReport();
	
			case quickfix.fix44.AssignmentReport.MSGTYPE:
				return new quickfix.fix44.AssignmentReport();
	
			case quickfix.fix44.CollateralRequest.MSGTYPE:
				return new quickfix.fix44.CollateralRequest();
	
			case quickfix.fix44.CollateralAssignment.MSGTYPE:
				return new quickfix.fix44.CollateralAssignment();
	
			case quickfix.fix44.CollateralResponse.MSGTYPE:
				return new quickfix.fix44.CollateralResponse();
	
			case quickfix.fix44.CollateralReport.MSGTYPE:
				return new quickfix.fix44.CollateralReport();
	
			case quickfix.fix44.CollateralInquiry.MSGTYPE:
				return new quickfix.fix44.CollateralInquiry();
	
			case quickfix.fix44.NetworkStatusRequest.MSGTYPE:
				return new quickfix.fix44.NetworkStatusRequest();
	
			case quickfix.fix44.NetworkStatusResponse.MSGTYPE:
				return new quickfix.fix44.NetworkStatusResponse();
	
			case quickfix.fix44.CollateralInquiryAck.MSGTYPE:
				return new quickfix.fix44.CollateralInquiryAck();
	
		}

		return new quickfix.fix44.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix44.Logon.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMsgTypes.FIELD:
					return new quickfix.fix44.Logon.NoMsgTypes();
	
				}
				break;
	
			case quickfix.fix44.Advertisement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.Advertisement.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.Advertisement.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.Advertisement.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.Advertisement.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.Advertisement.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.Advertisement.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.IndicationOfInterest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoRoutingIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.IndicationOfInterest.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix44.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.News.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.News.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.News.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.News.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.News.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.News.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.News.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix44.News.LinesOfText();
	
				}
				break;
	
			case quickfix.fix44.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix44.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.Email.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.Email.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.Email.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.Email.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.Email.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.Email.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.Email.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix44.Email.LinesOfText();
	
				}
				break;
	
			case quickfix.fix44.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.QuoteResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix44.QuoteResponse.NoQuoteQualifiers();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.QuoteResponse.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteResponse.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.QuoteResponse.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteResponse.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.QuoteResponse.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.QuoteResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteResponse.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.QuoteResponse.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.QuoteResponse.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.QuoteRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteRequestReject.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.RFQRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.RFQRequest.NoRelatedSym.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.Quote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix44.Quote.NoQuoteQualifiers();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.Quote.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.Quote.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.Quote.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.Quote.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.Quote.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.Quote.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.Quote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.Quote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.Quote.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.Quote.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.Quote.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.QuoteCancel.NoQuoteEntries.NoEvents();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.QuoteCancel.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.QuoteStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoEvents();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.QuoteStatusReport.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets.NoQuoteEntries.NoEvents();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.MassQuote.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.MassQuote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.MassQuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoEvents();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.MarketDataRequest.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix44.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.MarketDataSnapshotFullRefresh.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.MarketDataIncrementalRefresh.NoMDEntries.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.MarketDataRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAltMDSource.FIELD:
					return new quickfix.fix44.MarketDataRequestReject.NoAltMDSource();
	
				}
				break;
	
			case quickfix.fix44.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.SecurityDefinitionRequest.NoInstrAttrib();
	
				}
				break;
	
			case quickfix.fix44.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.SecurityDefinition.NoInstrAttrib();
	
				}
				break;
	
			case quickfix.fix44.SecurityTypes.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityTypes.FIELD:
					return new quickfix.fix44.SecurityTypes.NoSecurityTypes();
	
				}
				break;
	
			case quickfix.fix44.SecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.SecurityListRequest.NoInstrAttrib();
	
				}
				break;
	
			case quickfix.fix44.SecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoInstrAttrib();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.SecurityList.NoRelatedSym.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.DerivativeSecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.DerivativeSecurityListRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix44.DerivativeSecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoRelatedSym.NoInstrAttrib();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.DerivativeSecurityList.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix44.SecurityStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.SecurityStatusRequest.NoInstrAttrib();
	
				}
				break;
	
			case quickfix.fix44.SecurityStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.SecurityStatus.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityStatus.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.SecurityStatus.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityStatus.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.SecurityStatus.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.SecurityStatus.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.SecurityStatus.NoInstrAttrib();
	
				}
				break;
	
			case quickfix.fix44.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.NewOrderSingle.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix44.ExecutionReport.NoContraBrokers();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.ExecutionReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.ExecutionReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix44.ExecutionReport.NoContAmts();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.ExecutionReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.ExecutionReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.ExecutionReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.ExecutionReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.ExecutionReport.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.ExecutionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.ExecutionReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.ExecutionReport.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.ExecutionReport.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.DontKnowTrade.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.DontKnowTrade.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.DontKnowTrade.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.DontKnowTrade.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.DontKnowTrade.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.DontKnowTrade.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.DontKnowTrade.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.OrderCancelReplaceRequest.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.OrderCancelRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.OrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.OrderCancelRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.OrderCancelRequest.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.OrderStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.OrderStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.OrderStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.OrderStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.OrderStatusRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.OrderStatusRequest.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.OrderMassCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.OrderMassCancelRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.OrderMassCancelRequest.NoEvents();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.OrderMassCancelRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix44.OrderMassCancelReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix44.OrderMassCancelReport.NoAffectedOrders();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.OrderMassCancelReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.OrderMassCancelReport.NoEvents();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.OrderMassCancelReport.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix44.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.OrderMassStatusRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.OrderMassStatusRequest.NoEvents();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix44.NewOrderCross.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSides();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.NewOrderCross.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderCross.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.NewOrderCross.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderCross.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.NewOrderCross.NoTradingSessions();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderCross.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.NewOrderCross.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.NewOrderCross.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.CrossOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.CrossOrderCancelReplaceRequest.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.CrossOrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CrossOrderCancelRequest.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.NewOrderMultileg.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.NewOrderMultileg.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.MultilegOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.MultilegOrderCancelReplaceRequest.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix44.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix44.BidRequest.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix44.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix44.BidResponse.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix44.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoEvents();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.NewOrderList.NoOrders.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix44.ListStrikePrice.NoStrikes();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.ListStrikePrice.NoStrikes.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.ListStrikePrice.NoStrikes.NoEvents();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.ListStrikePrice.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.ListStrikePrice.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix44.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix44.ListStatus.NoOrders();
	
				}
				break;
	
			case quickfix.fix44.AllocationInstruction.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoInstrAttrib();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.AllocationInstruction.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.AllocationInstructionAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.AllocationInstructionAck.NoAllocs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.AllocationInstructionAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.AllocationReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix44.AllocationReport.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.AllocationReport.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.AllocationReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.AllocationReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.AllocationReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.AllocationReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.AllocationReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.AllocationReport.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.AllocationReport.NoInstrAttrib();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.AllocationReport.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.AllocationReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.AllocationReportAck.NoAllocs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.AllocationReportAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.Confirmation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix44.Confirmation.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.Confirmation.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.Confirmation.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.Confirmation.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.Confirmation.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoCapacities.FIELD:
					return new quickfix.fix44.Confirmation.NoCapacities();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.Confirmation.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.Confirmation.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.Confirmation.NoTrdRegTimestamps();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.Confirmation.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.Confirmation.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.Confirmation.NoInstrAttrib();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.Confirmation.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.Confirmation.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.Confirmation.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.Confirmation.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.ConfirmationRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix44.ConfirmationRequest.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.SettlementInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlInst.FIELD:
					return new quickfix.fix44.SettlementInstructions.NoSettlInst();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.SettlementInstructionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.SettlementInstructionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.TradeCaptureReportRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoDates.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoDates();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoEvents();
	
				case quickfix.field.NoInstrAttrib.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequest.NoInstrAttrib();
	
				}
				break;
	
			case quickfix.fix44.TradeCaptureReportRequestAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequestAck.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequestAck.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequestAck.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.TradeCaptureReportRequestAck.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.TradeCaptureReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoContAmts();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSides.NoStipulations();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoEvents();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoPosAmt();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.TradeCaptureReport.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix44.TradeCaptureReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoEvents();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix44.RegistrationInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRegistDtls.FIELD:
					return new quickfix.fix44.RegistrationInstructions.NoRegistDtls();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDistribInsts.FIELD:
					return new quickfix.fix44.RegistrationInstructions.NoDistribInsts();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.RegistrationInstructions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.RegistrationInstructionsResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.RegistrationInstructionsResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.PositionMaintenanceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoTradingSessions();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoEvents();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.PositionMaintenanceReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoTradingSessions();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoEvents();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix44.PositionMaintenanceReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix44.RequestForPositions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.RequestForPositions.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.RequestForPositions.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.RequestForPositions.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.RequestForPositions.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix44.RequestForPositions.NoTradingSessions();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.RequestForPositions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.RequestForPositions.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.RequestForPositions.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.RequestForPositionsAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.RequestForPositionsAck.NoEvents();
	
				}
				break;
	
			case quickfix.fix44.PositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.PositionReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.PositionReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.PositionReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.PositionReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.PositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.PositionReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.PositionReport.NoEvents();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix44.PositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix44.PositionReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix44.AssignmentReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.AssignmentReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.AssignmentReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.AssignmentReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.AssignmentReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.AssignmentReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.AssignmentReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.AssignmentReport.NoEvents();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix44.AssignmentReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix44.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix44.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix44.AssignmentReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix44.CollateralRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.CollateralRequest.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix44.CollateralRequest.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CollateralRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CollateralRequest.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.CollateralRequest.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CollateralRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralRequest.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CollateralRequest.NoEvents();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.CollateralRequest.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.CollateralRequest.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.CollateralAssignment.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoEvents();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoStipulations();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.CollateralResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.CollateralResponse.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix44.CollateralResponse.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CollateralResponse.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralResponse.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CollateralResponse.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralResponse.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.CollateralResponse.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CollateralResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralResponse.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CollateralResponse.NoEvents();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.CollateralResponse.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.CollateralResponse.NoStipulations();
	
				}
				break;
	
			case quickfix.fix44.CollateralReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.CollateralReport.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix44.CollateralReport.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CollateralReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CollateralReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix44.CollateralReport.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CollateralReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralReport.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CollateralReport.NoEvents();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.CollateralReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.CollateralReport.NoStipulations();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.CollateralReport.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.CollateralReport.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralReport.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.CollateralInquiry.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoCollInquiryQualifier();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoEvents();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoStipulations();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoDlvyInst();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case quickfix.fix44.NetworkStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix44.NetworkStatusRequest.NoCompIDs();
	
				}
				break;
	
			case quickfix.fix44.NetworkStatusResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix44.NetworkStatusResponse.NoCompIDs();
	
				}
				break;
	
			case quickfix.fix44.CollateralInquiryAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoSecurityAltID();
	
				case quickfix.field.NoEvents.FIELD:
					return new quickfix.fix44.CollateralInquiryAck.NoEvents();
	
				}
				break;
	
		}

		return null;
	}
}
