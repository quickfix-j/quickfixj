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

package quickfix.fix42;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix42.Heartbeat.MSGTYPE:
				return new quickfix.fix42.Heartbeat();
	
			case quickfix.fix42.Logon.MSGTYPE:
				return new quickfix.fix42.Logon();
	
			case quickfix.fix42.TestRequest.MSGTYPE:
				return new quickfix.fix42.TestRequest();
	
			case quickfix.fix42.ResendRequest.MSGTYPE:
				return new quickfix.fix42.ResendRequest();
	
			case quickfix.fix42.Reject.MSGTYPE:
				return new quickfix.fix42.Reject();
	
			case quickfix.fix42.SequenceReset.MSGTYPE:
				return new quickfix.fix42.SequenceReset();
	
			case quickfix.fix42.Logout.MSGTYPE:
				return new quickfix.fix42.Logout();
	
			case quickfix.fix42.Advertisement.MSGTYPE:
				return new quickfix.fix42.Advertisement();
	
			case quickfix.fix42.IndicationofInterest.MSGTYPE:
				return new quickfix.fix42.IndicationofInterest();
	
			case quickfix.fix42.News.MSGTYPE:
				return new quickfix.fix42.News();
	
			case quickfix.fix42.Email.MSGTYPE:
				return new quickfix.fix42.Email();
	
			case quickfix.fix42.QuoteRequest.MSGTYPE:
				return new quickfix.fix42.QuoteRequest();
	
			case quickfix.fix42.Quote.MSGTYPE:
				return new quickfix.fix42.Quote();
	
			case quickfix.fix42.MassQuote.MSGTYPE:
				return new quickfix.fix42.MassQuote();
	
			case quickfix.fix42.QuoteCancel.MSGTYPE:
				return new quickfix.fix42.QuoteCancel();
	
			case quickfix.fix42.QuoteStatusRequest.MSGTYPE:
				return new quickfix.fix42.QuoteStatusRequest();
	
			case quickfix.fix42.QuoteAcknowledgement.MSGTYPE:
				return new quickfix.fix42.QuoteAcknowledgement();
	
			case quickfix.fix42.MarketDataRequest.MSGTYPE:
				return new quickfix.fix42.MarketDataRequest();
	
			case quickfix.fix42.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.fix42.MarketDataSnapshotFullRefresh();
	
			case quickfix.fix42.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.fix42.MarketDataIncrementalRefresh();
	
			case quickfix.fix42.MarketDataRequestReject.MSGTYPE:
				return new quickfix.fix42.MarketDataRequestReject();
	
			case quickfix.fix42.SecurityDefinitionRequest.MSGTYPE:
				return new quickfix.fix42.SecurityDefinitionRequest();
	
			case quickfix.fix42.SecurityDefinition.MSGTYPE:
				return new quickfix.fix42.SecurityDefinition();
	
			case quickfix.fix42.SecurityStatusRequest.MSGTYPE:
				return new quickfix.fix42.SecurityStatusRequest();
	
			case quickfix.fix42.SecurityStatus.MSGTYPE:
				return new quickfix.fix42.SecurityStatus();
	
			case quickfix.fix42.TradingSessionStatusRequest.MSGTYPE:
				return new quickfix.fix42.TradingSessionStatusRequest();
	
			case quickfix.fix42.TradingSessionStatus.MSGTYPE:
				return new quickfix.fix42.TradingSessionStatus();
	
			case quickfix.fix42.NewOrderSingle.MSGTYPE:
				return new quickfix.fix42.NewOrderSingle();
	
			case quickfix.fix42.ExecutionReport.MSGTYPE:
				return new quickfix.fix42.ExecutionReport();
	
			case quickfix.fix42.DontKnowTrade.MSGTYPE:
				return new quickfix.fix42.DontKnowTrade();
	
			case quickfix.fix42.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix42.OrderCancelReplaceRequest();
	
			case quickfix.fix42.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix42.OrderCancelRequest();
	
			case quickfix.fix42.OrderCancelReject.MSGTYPE:
				return new quickfix.fix42.OrderCancelReject();
	
			case quickfix.fix42.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix42.OrderStatusRequest();
	
			case quickfix.fix42.Allocation.MSGTYPE:
				return new quickfix.fix42.Allocation();
	
			case quickfix.fix42.AllocationACK.MSGTYPE:
				return new quickfix.fix42.AllocationACK();
	
			case quickfix.fix42.SettlementInstructions.MSGTYPE:
				return new quickfix.fix42.SettlementInstructions();
	
			case quickfix.fix42.BidRequest.MSGTYPE:
				return new quickfix.fix42.BidRequest();
	
			case quickfix.fix42.BidResponse.MSGTYPE:
				return new quickfix.fix42.BidResponse();
	
			case quickfix.fix42.NewOrderList.MSGTYPE:
				return new quickfix.fix42.NewOrderList();
	
			case quickfix.fix42.ListStrikePrice.MSGTYPE:
				return new quickfix.fix42.ListStrikePrice();
	
			case quickfix.fix42.ListStatus.MSGTYPE:
				return new quickfix.fix42.ListStatus();
	
			case quickfix.fix42.ListExecute.MSGTYPE:
				return new quickfix.fix42.ListExecute();
	
			case quickfix.fix42.ListCancelRequest.MSGTYPE:
				return new quickfix.fix42.ListCancelRequest();
	
			case quickfix.fix42.ListStatusRequest.MSGTYPE:
				return new quickfix.fix42.ListStatusRequest();
	
			case quickfix.fix42.BusinessMessageReject.MSGTYPE:
				return new quickfix.fix42.BusinessMessageReject();
	
		}

		return new quickfix.fix42.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix42.Logon.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMsgTypes.FIELD:
					return new quickfix.fix42.Logon.NoMsgTypes();
	
				}
				break;
	
			case quickfix.fix42.IndicationofInterest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix42.IndicationofInterest.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix42.IndicationofInterest.NoRoutingIDs();
	
				}
				break;
	
			case quickfix.fix42.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix42.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix42.News.NoRelatedSym();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix42.News.LinesOfText();
	
				}
				break;
	
			case quickfix.fix42.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix42.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix42.Email.NoRelatedSym();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix42.Email.LinesOfText();
	
				}
				break;
	
			case quickfix.fix42.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix42.QuoteRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix42.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix42.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix42.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				}
				break;
	
			case quickfix.fix42.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix42.QuoteCancel.NoQuoteEntries();
	
				}
				break;
	
			case quickfix.fix42.QuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix42.QuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix42.QuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				}
				break;
	
			case quickfix.fix42.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix42.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix42.MarketDataRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix42.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix42.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				}
				break;
	
			case quickfix.fix42.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix42.MarketDataIncrementalRefresh.NoMDEntries();
	
				}
				break;
	
			case quickfix.fix42.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix42.SecurityDefinitionRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix42.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix42.SecurityDefinition.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix42.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix42.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix42.NewOrderSingle.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix42.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix42.ExecutionReport.NoContraBrokers();
	
				}
				break;
	
			case quickfix.fix42.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix42.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix42.OrderCancelReplaceRequest.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix42.Allocation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix42.Allocation.NoOrders();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix42.Allocation.NoExecs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix42.Allocation.NoAllocs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix42.Allocation.NoAllocs.NoMiscFees();
	
				}
				break;
	
			case quickfix.fix42.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix42.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix42.BidRequest.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix42.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix42.BidResponse.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix42.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix42.NewOrderList.NoOrders();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix42.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix42.NewOrderList.NoOrders.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix42.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix42.ListStrikePrice.NoStrikes();
	
				}
				break;
	
			case quickfix.fix42.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix42.ListStatus.NoOrders();
	
				}
				break;
	
		}

		return null;
	}
}
