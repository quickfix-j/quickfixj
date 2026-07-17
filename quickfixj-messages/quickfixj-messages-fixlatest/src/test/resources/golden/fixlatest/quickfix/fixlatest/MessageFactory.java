/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

  public Message create(String beginString, String msgType) {
    switch (msgType) {
    case quickfix.fixlatest.IOI.MSGTYPE:
      return new quickfix.fixlatest.IOI();
    case quickfix.fixlatest.Advertisement.MSGTYPE:
      return new quickfix.fixlatest.Advertisement();
    case quickfix.fixlatest.ExecutionReport.MSGTYPE:
      return new quickfix.fixlatest.ExecutionReport();
    case quickfix.fixlatest.OrderCancelReject.MSGTYPE:
      return new quickfix.fixlatest.OrderCancelReject();
    case quickfix.fixlatest.News.MSGTYPE:
      return new quickfix.fixlatest.News();
    case quickfix.fixlatest.Email.MSGTYPE:
      return new quickfix.fixlatest.Email();
    case quickfix.fixlatest.NewOrderSingle.MSGTYPE:
      return new quickfix.fixlatest.NewOrderSingle();
    case quickfix.fixlatest.NewOrderList.MSGTYPE:
      return new quickfix.fixlatest.NewOrderList();
    case quickfix.fixlatest.OrderCancelRequest.MSGTYPE:
      return new quickfix.fixlatest.OrderCancelRequest();
    case quickfix.fixlatest.OrderCancelReplaceRequest.MSGTYPE:
      return new quickfix.fixlatest.OrderCancelReplaceRequest();
    case quickfix.fixlatest.OrderStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.OrderStatusRequest();
    case quickfix.fixlatest.AllocationInstruction.MSGTYPE:
      return new quickfix.fixlatest.AllocationInstruction();
    case quickfix.fixlatest.ListCancelRequest.MSGTYPE:
      return new quickfix.fixlatest.ListCancelRequest();
    case quickfix.fixlatest.ListExecute.MSGTYPE:
      return new quickfix.fixlatest.ListExecute();
    case quickfix.fixlatest.ListStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.ListStatusRequest();
    case quickfix.fixlatest.ListStatus.MSGTYPE:
      return new quickfix.fixlatest.ListStatus();
    case quickfix.fixlatest.AllocationInstructionAck.MSGTYPE:
      return new quickfix.fixlatest.AllocationInstructionAck();
    case quickfix.fixlatest.DontKnowTrade.MSGTYPE:
      return new quickfix.fixlatest.DontKnowTrade();
    case quickfix.fixlatest.QuoteRequest.MSGTYPE:
      return new quickfix.fixlatest.QuoteRequest();
    case quickfix.fixlatest.Quote.MSGTYPE:
      return new quickfix.fixlatest.Quote();
    case quickfix.fixlatest.SettlementInstructions.MSGTYPE:
      return new quickfix.fixlatest.SettlementInstructions();
    case quickfix.fixlatest.MarketDataRequest.MSGTYPE:
      return new quickfix.fixlatest.MarketDataRequest();
    case quickfix.fixlatest.MarketDataSnapshotFullRefresh.MSGTYPE:
      return new quickfix.fixlatest.MarketDataSnapshotFullRefresh();
    case quickfix.fixlatest.MarketDataIncrementalRefresh.MSGTYPE:
      return new quickfix.fixlatest.MarketDataIncrementalRefresh();
    case quickfix.fixlatest.MarketDataRequestReject.MSGTYPE:
      return new quickfix.fixlatest.MarketDataRequestReject();
    case quickfix.fixlatest.QuoteCancel.MSGTYPE:
      return new quickfix.fixlatest.QuoteCancel();
    case quickfix.fixlatest.QuoteStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.QuoteStatusRequest();
    case quickfix.fixlatest.MassQuoteAck.MSGTYPE:
      return new quickfix.fixlatest.MassQuoteAck();
    case quickfix.fixlatest.SecurityDefinitionRequest.MSGTYPE:
      return new quickfix.fixlatest.SecurityDefinitionRequest();
    case quickfix.fixlatest.SecurityDefinition.MSGTYPE:
      return new quickfix.fixlatest.SecurityDefinition();
    case quickfix.fixlatest.SecurityStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.SecurityStatusRequest();
    case quickfix.fixlatest.SecurityStatus.MSGTYPE:
      return new quickfix.fixlatest.SecurityStatus();
    case quickfix.fixlatest.TradingSessionStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.TradingSessionStatusRequest();
    case quickfix.fixlatest.TradingSessionStatus.MSGTYPE:
      return new quickfix.fixlatest.TradingSessionStatus();
    case quickfix.fixlatest.MassQuote.MSGTYPE:
      return new quickfix.fixlatest.MassQuote();
    case quickfix.fixlatest.BusinessMessageReject.MSGTYPE:
      return new quickfix.fixlatest.BusinessMessageReject();
    case quickfix.fixlatest.BidRequest.MSGTYPE:
      return new quickfix.fixlatest.BidRequest();
    case quickfix.fixlatest.BidResponse.MSGTYPE:
      return new quickfix.fixlatest.BidResponse();
    case quickfix.fixlatest.ListStrikePrice.MSGTYPE:
      return new quickfix.fixlatest.ListStrikePrice();
    case quickfix.fixlatest.RegistrationInstructions.MSGTYPE:
      return new quickfix.fixlatest.RegistrationInstructions();
    case quickfix.fixlatest.RegistrationInstructionsResponse.MSGTYPE:
      return new quickfix.fixlatest.RegistrationInstructionsResponse();
    case quickfix.fixlatest.OrderMassCancelRequest.MSGTYPE:
      return new quickfix.fixlatest.OrderMassCancelRequest();
    case quickfix.fixlatest.OrderMassCancelReport.MSGTYPE:
      return new quickfix.fixlatest.OrderMassCancelReport();
    case quickfix.fixlatest.NewOrderCross.MSGTYPE:
      return new quickfix.fixlatest.NewOrderCross();
    case quickfix.fixlatest.CrossOrderCancelReplaceRequest.MSGTYPE:
      return new quickfix.fixlatest.CrossOrderCancelReplaceRequest();
    case quickfix.fixlatest.CrossOrderCancelRequest.MSGTYPE:
      return new quickfix.fixlatest.CrossOrderCancelRequest();
    case quickfix.fixlatest.SecurityTypeRequest.MSGTYPE:
      return new quickfix.fixlatest.SecurityTypeRequest();
    case quickfix.fixlatest.SecurityTypes.MSGTYPE:
      return new quickfix.fixlatest.SecurityTypes();
    case quickfix.fixlatest.SecurityListRequest.MSGTYPE:
      return new quickfix.fixlatest.SecurityListRequest();
    case quickfix.fixlatest.SecurityList.MSGTYPE:
      return new quickfix.fixlatest.SecurityList();
    case quickfix.fixlatest.DerivativeSecurityListRequest.MSGTYPE:
      return new quickfix.fixlatest.DerivativeSecurityListRequest();
    case quickfix.fixlatest.DerivativeSecurityList.MSGTYPE:
      return new quickfix.fixlatest.DerivativeSecurityList();
    case quickfix.fixlatest.NewOrderMultileg.MSGTYPE:
      return new quickfix.fixlatest.NewOrderMultileg();
    case quickfix.fixlatest.MultilegOrderCancelReplace.MSGTYPE:
      return new quickfix.fixlatest.MultilegOrderCancelReplace();
    case quickfix.fixlatest.TradeCaptureReportRequest.MSGTYPE:
      return new quickfix.fixlatest.TradeCaptureReportRequest();
    case quickfix.fixlatest.TradeCaptureReport.MSGTYPE:
      return new quickfix.fixlatest.TradeCaptureReport();
    case quickfix.fixlatest.OrderMassStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.OrderMassStatusRequest();
    case quickfix.fixlatest.QuoteRequestReject.MSGTYPE:
      return new quickfix.fixlatest.QuoteRequestReject();
    case quickfix.fixlatest.RFQRequest.MSGTYPE:
      return new quickfix.fixlatest.RFQRequest();
    case quickfix.fixlatest.QuoteStatusReport.MSGTYPE:
      return new quickfix.fixlatest.QuoteStatusReport();
    case quickfix.fixlatest.QuoteResponse.MSGTYPE:
      return new quickfix.fixlatest.QuoteResponse();
    case quickfix.fixlatest.Confirmation.MSGTYPE:
      return new quickfix.fixlatest.Confirmation();
    case quickfix.fixlatest.PositionMaintenanceRequest.MSGTYPE:
      return new quickfix.fixlatest.PositionMaintenanceRequest();
    case quickfix.fixlatest.PositionMaintenanceReport.MSGTYPE:
      return new quickfix.fixlatest.PositionMaintenanceReport();
    case quickfix.fixlatest.RequestForPositions.MSGTYPE:
      return new quickfix.fixlatest.RequestForPositions();
    case quickfix.fixlatest.RequestForPositionsAck.MSGTYPE:
      return new quickfix.fixlatest.RequestForPositionsAck();
    case quickfix.fixlatest.PositionReport.MSGTYPE:
      return new quickfix.fixlatest.PositionReport();
    case quickfix.fixlatest.TradeCaptureReportRequestAck.MSGTYPE:
      return new quickfix.fixlatest.TradeCaptureReportRequestAck();
    case quickfix.fixlatest.TradeCaptureReportAck.MSGTYPE:
      return new quickfix.fixlatest.TradeCaptureReportAck();
    case quickfix.fixlatest.AllocationReport.MSGTYPE:
      return new quickfix.fixlatest.AllocationReport();
    case quickfix.fixlatest.AllocationReportAck.MSGTYPE:
      return new quickfix.fixlatest.AllocationReportAck();
    case quickfix.fixlatest.ConfirmationAck.MSGTYPE:
      return new quickfix.fixlatest.ConfirmationAck();
    case quickfix.fixlatest.SettlementInstructionRequest.MSGTYPE:
      return new quickfix.fixlatest.SettlementInstructionRequest();
    case quickfix.fixlatest.AssignmentReport.MSGTYPE:
      return new quickfix.fixlatest.AssignmentReport();
    case quickfix.fixlatest.CollateralRequest.MSGTYPE:
      return new quickfix.fixlatest.CollateralRequest();
    case quickfix.fixlatest.CollateralAssignment.MSGTYPE:
      return new quickfix.fixlatest.CollateralAssignment();
    case quickfix.fixlatest.CollateralResponse.MSGTYPE:
      return new quickfix.fixlatest.CollateralResponse();
    case quickfix.fixlatest.CollateralReport.MSGTYPE:
      return new quickfix.fixlatest.CollateralReport();
    case quickfix.fixlatest.CollateralInquiry.MSGTYPE:
      return new quickfix.fixlatest.CollateralInquiry();
    case quickfix.fixlatest.NetworkCounterpartySystemStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.NetworkCounterpartySystemStatusRequest();
    case quickfix.fixlatest.NetworkCounterpartySystemStatusResponse.MSGTYPE:
      return new quickfix.fixlatest.NetworkCounterpartySystemStatusResponse();
    case quickfix.fixlatest.UserRequest.MSGTYPE:
      return new quickfix.fixlatest.UserRequest();
    case quickfix.fixlatest.UserResponse.MSGTYPE:
      return new quickfix.fixlatest.UserResponse();
    case quickfix.fixlatest.CollateralInquiryAck.MSGTYPE:
      return new quickfix.fixlatest.CollateralInquiryAck();
    case quickfix.fixlatest.ConfirmationRequest.MSGTYPE:
      return new quickfix.fixlatest.ConfirmationRequest();
    case quickfix.fixlatest.ContraryIntentionReport.MSGTYPE:
      return new quickfix.fixlatest.ContraryIntentionReport();
    case quickfix.fixlatest.SecurityDefinitionUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.SecurityDefinitionUpdateReport();
    case quickfix.fixlatest.SecurityListUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.SecurityListUpdateReport();
    case quickfix.fixlatest.AdjustedPositionReport.MSGTYPE:
      return new quickfix.fixlatest.AdjustedPositionReport();
    case quickfix.fixlatest.AllocationInstructionAlert.MSGTYPE:
      return new quickfix.fixlatest.AllocationInstructionAlert();
    case quickfix.fixlatest.ExecutionAck.MSGTYPE:
      return new quickfix.fixlatest.ExecutionAck();
    case quickfix.fixlatest.TradingSessionList.MSGTYPE:
      return new quickfix.fixlatest.TradingSessionList();
    case quickfix.fixlatest.TradingSessionListRequest.MSGTYPE:
      return new quickfix.fixlatest.TradingSessionListRequest();
    case quickfix.fixlatest.SettlementObligationReport.MSGTYPE:
      return new quickfix.fixlatest.SettlementObligationReport();
    case quickfix.fixlatest.DerivativeSecurityListUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.DerivativeSecurityListUpdateReport();
    case quickfix.fixlatest.TradingSessionListUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.TradingSessionListUpdateReport();
    case quickfix.fixlatest.MarketDefinitionRequest.MSGTYPE:
      return new quickfix.fixlatest.MarketDefinitionRequest();
    case quickfix.fixlatest.MarketDefinition.MSGTYPE:
      return new quickfix.fixlatest.MarketDefinition();
    case quickfix.fixlatest.MarketDefinitionUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.MarketDefinitionUpdateReport();
    case quickfix.fixlatest.UserNotification.MSGTYPE:
      return new quickfix.fixlatest.UserNotification();
    case quickfix.fixlatest.OrderMassActionReport.MSGTYPE:
      return new quickfix.fixlatest.OrderMassActionReport();
    case quickfix.fixlatest.OrderMassActionRequest.MSGTYPE:
      return new quickfix.fixlatest.OrderMassActionRequest();
    case quickfix.fixlatest.ApplicationMessageRequest.MSGTYPE:
      return new quickfix.fixlatest.ApplicationMessageRequest();
    case quickfix.fixlatest.ApplicationMessageRequestAck.MSGTYPE:
      return new quickfix.fixlatest.ApplicationMessageRequestAck();
    case quickfix.fixlatest.ApplicationMessageReport.MSGTYPE:
      return new quickfix.fixlatest.ApplicationMessageReport();
    case quickfix.fixlatest.StreamAssignmentRequest.MSGTYPE:
      return new quickfix.fixlatest.StreamAssignmentRequest();
    case quickfix.fixlatest.StreamAssignmentReport.MSGTYPE:
      return new quickfix.fixlatest.StreamAssignmentReport();
    case quickfix.fixlatest.StreamAssignmentReportACK.MSGTYPE:
      return new quickfix.fixlatest.StreamAssignmentReportACK();
    case quickfix.fixlatest.MarginRequirementInquiry.MSGTYPE:
      return new quickfix.fixlatest.MarginRequirementInquiry();
    case quickfix.fixlatest.MarginRequirementInquiryAck.MSGTYPE:
      return new quickfix.fixlatest.MarginRequirementInquiryAck();
    case quickfix.fixlatest.MarginRequirementReport.MSGTYPE:
      return new quickfix.fixlatest.MarginRequirementReport();
    case quickfix.fixlatest.PartyDetailsListRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyDetailsListRequest();
    case quickfix.fixlatest.PartyDetailsListReport.MSGTYPE:
      return new quickfix.fixlatest.PartyDetailsListReport();
    case quickfix.fixlatest.PartyDetailsListUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.PartyDetailsListUpdateReport();
    case quickfix.fixlatest.PartyRiskLimitsRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitsRequest();
    case quickfix.fixlatest.PartyRiskLimitsReport.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitsReport();
    case quickfix.fixlatest.SecurityMassStatusRequest.MSGTYPE:
      return new quickfix.fixlatest.SecurityMassStatusRequest();
    case quickfix.fixlatest.SecurityMassStatus.MSGTYPE:
      return new quickfix.fixlatest.SecurityMassStatus();
    case quickfix.fixlatest.AccountSummaryReport.MSGTYPE:
      return new quickfix.fixlatest.AccountSummaryReport();
    case quickfix.fixlatest.PartyRiskLimitsUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitsUpdateReport();
    case quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest();
    case quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck();
    case quickfix.fixlatest.PartyEntitlementsRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyEntitlementsRequest();
    case quickfix.fixlatest.PartyEntitlementsReport.MSGTYPE:
      return new quickfix.fixlatest.PartyEntitlementsReport();
    case quickfix.fixlatest.QuoteAck.MSGTYPE:
      return new quickfix.fixlatest.QuoteAck();
    case quickfix.fixlatest.PartyDetailsDefinitionRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyDetailsDefinitionRequest();
    case quickfix.fixlatest.PartyDetailsDefinitionRequestAck.MSGTYPE:
      return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck();
    case quickfix.fixlatest.PartyEntitlementsUpdateReport.MSGTYPE:
      return new quickfix.fixlatest.PartyEntitlementsUpdateReport();
    case quickfix.fixlatest.PartyEntitlementsDefinitionRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest();
    case quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.MSGTYPE:
      return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck();
    case quickfix.fixlatest.TradeMatchReport.MSGTYPE:
      return new quickfix.fixlatest.TradeMatchReport();
    case quickfix.fixlatest.TradeMatchReportAck.MSGTYPE:
      return new quickfix.fixlatest.TradeMatchReportAck();
    case quickfix.fixlatest.PartyRiskLimitsReportAck.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitsReportAck();
    case quickfix.fixlatest.PartyRiskLimitCheckRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitCheckRequest();
    case quickfix.fixlatest.PartyRiskLimitCheckRequestAck.MSGTYPE:
      return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck();
    case quickfix.fixlatest.PartyActionRequest.MSGTYPE:
      return new quickfix.fixlatest.PartyActionRequest();
    case quickfix.fixlatest.PartyActionReport.MSGTYPE:
      return new quickfix.fixlatest.PartyActionReport();
    case quickfix.fixlatest.MassOrder.MSGTYPE:
      return new quickfix.fixlatest.MassOrder();
    case quickfix.fixlatest.MassOrderAck.MSGTYPE:
      return new quickfix.fixlatest.MassOrderAck();
    case quickfix.fixlatest.PositionTransferInstruction.MSGTYPE:
      return new quickfix.fixlatest.PositionTransferInstruction();
    case quickfix.fixlatest.PositionTransferInstructionAck.MSGTYPE:
      return new quickfix.fixlatest.PositionTransferInstructionAck();
    case quickfix.fixlatest.PositionTransferReport.MSGTYPE:
      return new quickfix.fixlatest.PositionTransferReport();
    case quickfix.fixlatest.MarketDataStatisticsRequest.MSGTYPE:
      return new quickfix.fixlatest.MarketDataStatisticsRequest();
    case quickfix.fixlatest.MarketDataStatisticsReport.MSGTYPE:
      return new quickfix.fixlatest.MarketDataStatisticsReport();
    case quickfix.fixlatest.CollateralReportAck.MSGTYPE:
      return new quickfix.fixlatest.CollateralReportAck();
    case quickfix.fixlatest.MarketDataReport.MSGTYPE:
      return new quickfix.fixlatest.MarketDataReport();
    case quickfix.fixlatest.CrossRequest.MSGTYPE:
      return new quickfix.fixlatest.CrossRequest();
    case quickfix.fixlatest.CrossRequestAck.MSGTYPE:
      return new quickfix.fixlatest.CrossRequestAck();
    case quickfix.fixlatest.AllocationInstructionAlertRequest.MSGTYPE:
      return new quickfix.fixlatest.AllocationInstructionAlertRequest();
    case quickfix.fixlatest.AllocationInstructionAlertRequestAck.MSGTYPE:
      return new quickfix.fixlatest.AllocationInstructionAlertRequestAck();
    case quickfix.fixlatest.TradeAggregationRequest.MSGTYPE:
      return new quickfix.fixlatest.TradeAggregationRequest();
    case quickfix.fixlatest.TradeAggregationReport.MSGTYPE:
      return new quickfix.fixlatest.TradeAggregationReport();
    case quickfix.fixlatest.PayManagementReport.MSGTYPE:
      return new quickfix.fixlatest.PayManagementReport();
    case quickfix.fixlatest.PayManagementReportAck.MSGTYPE:
      return new quickfix.fixlatest.PayManagementReportAck();
    case quickfix.fixlatest.PayManagementRequest.MSGTYPE:
      return new quickfix.fixlatest.PayManagementRequest();
    case quickfix.fixlatest.PayManagementRequestAck.MSGTYPE:
      return new quickfix.fixlatest.PayManagementRequestAck();
    }
    return new quickfix.fixlatest.Message();
  }

  public Group create(String beginString, String msgType, int correspondingFieldID) {
    switch (msgType) {
  case quickfix.fixlatest.IOI.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.IOI.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.IOI.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.IOI.NoUnderlyings();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.IOI.NoRelatedInstruments();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.IOI.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.IOI.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.IOI.NoLegs.NoLegStipulations();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.IOI.NoPriceQualifiers();
      case quickfix.field.NoIOIQualifiers.FIELD:
        return new quickfix.fixlatest.IOI.NoIOIQualifiers();
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.IOI.NoRoutingIDs();
      case quickfix.field.NoRelativeValues.FIELD:
        return new quickfix.fixlatest.IOI.NoRelativeValues();
    }
    break;
  case quickfix.fixlatest.Advertisement.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.Advertisement.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.Advertisement.NoUnderlyings();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.Advertisement.NoRelatedInstruments();
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.Advertisement.NoRoutingIDs();
    }
    break;
  case quickfix.fixlatest.ExecutionReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoContraBrokers.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoContraBrokers();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoRegulatoryTradeIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoAllocs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoUnderlyings();
      case quickfix.field.NoPayments.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPayments();
      case quickfix.field.NoPaymentBusinessCenters.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPayments.NoPaymentBusinessCenters();
      case quickfix.field.NoPaymentSettls.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPayments.NoPaymentSettls();
      case quickfix.field.NoPaymentSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs();
      case quickfix.field.NoPaymentSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs.NoPaymentSettlPartySubIDs();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoStipulations();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoPriceQualifiers();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoStrategyParameters();
      case quickfix.field.NoOrderAttributes.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoOrderAttributes();
      case quickfix.field.NoLimitAmts.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLimitAmts();
      case quickfix.field.NoFills.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoFills();
      case quickfix.field.NoNested4PartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoFills.NoNested4PartyIDs();
      case quickfix.field.NoNested4PartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoFills.NoNested4PartyIDs.NoNested4PartySubIDs();
      case quickfix.field.NoOrderEvents.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoOrderEvents();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoCommissions();
      case quickfix.field.NoRelativeValues.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoRelativeValues();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoRateSources();
      case quickfix.field.NoValueChecks.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoValueChecks();
      case quickfix.field.NoMatchInst.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoMatchInst();
      case quickfix.field.NoDisclosureInstructions.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoDisclosureInstructions();
      case quickfix.field.NoContAmts.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoContAmts();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNested3PartyIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs.NoNested3PartyIDs();
      case quickfix.field.NoNested3PartySubIDs.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoLegs.NoNested3PartyIDs.NoNested3PartySubIDs();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoTrdRegTimestamps();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoTrdRegPublications();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoTradePriceConditions();
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.ExecutionReport.NoOrders();
    }
    break;
  case quickfix.fixlatest.OrderCancelReject.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReject.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReject.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.News.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoNewsRefIDs.FIELD:
        return new quickfix.fixlatest.News.NoNewsRefIDs();
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.News.NoRoutingIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.News.NoRelatedSym();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.News.NoRelatedSym.NoRelatedInstruments();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.News.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.News.NoUnderlyings();
      case quickfix.field.NoLinesOfText.FIELD:
        return new quickfix.fixlatest.News.NoLinesOfText();
    }
    break;
  case quickfix.fixlatest.Email.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.Email.NoRoutingIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.Email.NoRelatedSym();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.Email.NoRelatedSym.NoRelatedInstruments();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.Email.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.Email.NoLegs();
      case quickfix.field.NoLinesOfText.FIELD:
        return new quickfix.fixlatest.Email.NoLinesOfText();
      case quickfix.field.NoAttachments.FIELD:
        return new quickfix.fixlatest.Email.NoAttachments();
      case quickfix.field.NoAttachmentKeywords.FIELD:
        return new quickfix.fixlatest.Email.NoAttachments.NoAttachmentKeywords();
    }
    break;
  case quickfix.fixlatest.NewOrderSingle.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoAllocs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoValueChecks.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoValueChecks();
      case quickfix.field.NoMatchInst.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoMatchInst();
      case quickfix.field.NoDisclosureInstructions.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoDisclosureInstructions();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoTradingSessions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoStipulations();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoCommissions();
      case quickfix.field.NoOrderAttributes.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoOrderAttributes();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoRateSources();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoStrategyParameters();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoTrdRegTimestamps();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoTrdRegPublications();
    }
    break;
  case quickfix.fixlatest.NewOrderList.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoAllocs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoTradingSessions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoStipulations();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoCommissions();
      case quickfix.field.NoOrderAttributes.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoOrderAttributes();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.NewOrderList.NoOrders.NoStrategyParameters();
    }
    break;
  case quickfix.fixlatest.OrderCancelRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.OrderCancelRequest.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.OrderCancelReplaceRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoAllocs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoValueChecks.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoValueChecks();
      case quickfix.field.NoMatchInst.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoMatchInst();
      case quickfix.field.NoDisclosureInstructions.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoDisclosureInstructions();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoTradingSessions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoUnderlyings();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoStrategyParameters();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoCommissions();
      case quickfix.field.NoOrderAttributes.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoOrderAttributes();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoRateSources();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.OrderCancelReplaceRequest.NoTrdRegTimestamps();
    }
    break;
  case quickfix.fixlatest.OrderStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderStatusRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.OrderStatusRequest.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.AllocationInstruction.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoOrders();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoOrders.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoExecs();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoExecs.NoTrdRegPublications();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoExecs.NoTradePriceConditions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoLegs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoPriceQualifiers();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoStipulations();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoRegulatoryTradeIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoPosAmt();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoAllocCommissions.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoAllocCommissions();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoClearingInstructions.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoClearingInstructions();
      case quickfix.field.NoTradeAllocAmts.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoAllocs.NoTradeAllocAmts();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.AllocationInstruction.NoRateSources();
    }
    break;
  case quickfix.fixlatest.ListCancelRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.ListCancelRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.ListExecute.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.ListStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.ListStatus.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.ListStatus.NoOrders();
    }
    break;
  case quickfix.fixlatest.AllocationInstructionAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoRegulatoryTradeIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
    }
    break;
  case quickfix.fixlatest.DontKnowTrade.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.DontKnowTrade.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.DontKnowTrade.NoLegs();
    }
    break;
  case quickfix.fixlatest.QuoteRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoRateSources();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoQuoteQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoRegulatoryTradeIDs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoPriceQualifiers();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.Quote.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoQuoteQualifiers.FIELD:
        return new quickfix.fixlatest.Quote.NoQuoteQualifiers();
      case quickfix.field.NoQuoteAttributes.FIELD:
        return new quickfix.fixlatest.Quote.NoQuoteAttributes();
      case quickfix.field.NoValueChecks.FIELD:
        return new quickfix.fixlatest.Quote.NoValueChecks();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.Quote.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.Quote.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.Quote.NoUnderlyings();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.Quote.NoRateSources();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.Quote.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.Quote.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.Quote.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.Quote.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.Quote.NoTrdRegTimestamps();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.Quote.NoPriceQualifiers();
      case quickfix.field.NoRelativeValues.FIELD:
        return new quickfix.fixlatest.Quote.NoRelativeValues();
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.Quote.NoRoutingIDs();
    }
    break;
  case quickfix.fixlatest.SettlementInstructions.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoSettlInst.FIELD:
        return new quickfix.fixlatest.SettlementInstructions.NoSettlInst();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.SettlementInstructions.NoSettlInst.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.MarketDataRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoMDEntryTypes.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoMDEntryTypes();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoMarketSegments();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoRelatedSym();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoRelatedSym.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoRelatedSym.NoRelatedInstruments();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.MarketDataRequest.NoTradingSessions();
    }
    break;
  case quickfix.fixlatest.MarketDataSnapshotFullRefresh.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoRelatedInstruments();
      case quickfix.field.NoMDEntries.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoPriceQualifiers();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoRateSources();
      case quickfix.field.NoOfSecSizes.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoOfSecSizes();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoTradePriceConditions();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoTrdRegPublications();
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoRelatedTrades();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoRoutingIDs();
    }
    break;
  case quickfix.fixlatest.MarketDataIncrementalRefresh.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoMDEntries.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoRelatedInstruments();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoPriceQualifiers();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoRateSources();
      case quickfix.field.NoOfSecSizes.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoOfSecSizes();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoTradePriceConditions();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoTrdRegPublications();
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoRelatedTrades();
      case quickfix.field.NoStatsIndicators.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoStatsIndicators();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRoutingIDs.FIELD:
        return new quickfix.fixlatest.MarketDataIncrementalRefresh.NoRoutingIDs();
    }
    break;
  case quickfix.fixlatest.MarketDataRequestReject.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDataRequestReject.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDataRequestReject.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoAltMDSource.FIELD:
        return new quickfix.fixlatest.MarketDataRequestReject.NoAltMDSource();
    }
    break;
  case quickfix.fixlatest.QuoteCancel.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoQuoteEntries.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoQuoteEntries();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoQuoteEntries.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteCancel.NoQuoteEntries.NoLegs();
    }
    break;
  case quickfix.fixlatest.QuoteStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.QuoteStatusRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteStatusRequest.NoLegs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusRequest.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusRequest.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.MassQuoteAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoQuoteSets.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoQuoteSets();
      case quickfix.field.NoQuoteEntries.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoQuoteSets.NoQuoteEntries();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MassQuoteAck.NoQuoteSets.NoQuoteEntries.NoLegs();
    }
    break;
  case quickfix.fixlatest.SecurityDefinitionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionRequest.NoUnderlyings();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionRequest.NoRelatedInstruments();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionRequest.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionRequest.NoLegs();
    }
    break;
  case quickfix.fixlatest.SecurityDefinition.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoUnderlyings();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoRelatedInstruments();
      case quickfix.field.NoSecurityClassifications.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoSecurityClassifications();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoLegs();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoMarketSegments();
      case quickfix.field.NoStrikeRules.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoMarketSegments.NoStrikeRules();
      case quickfix.field.NoMaturityRules.FIELD:
        return new quickfix.fixlatest.SecurityDefinition.NoMarketSegments.NoStrikeRules.NoMaturityRules();
    }
    break;
  case quickfix.fixlatest.SecurityStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityStatusRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityStatusRequest.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityStatusRequest.NoRelatedInstruments();
    }
    break;
  case quickfix.fixlatest.SecurityStatus.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityStatus.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityStatus.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityStatus.NoRelatedInstruments();
      case quickfix.field.NoClearingPriceParameters.FIELD:
        return new quickfix.fixlatest.SecurityStatus.NoClearingPriceParameters();
    }
    break;
  case quickfix.fixlatest.TradingSessionStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.TradingSessionStatus.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.MassQuote.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MassQuote.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MassQuote.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoQuoteSets.FIELD:
        return new quickfix.fixlatest.MassQuote.NoQuoteSets();
      case quickfix.field.NoQuoteEntries.FIELD:
        return new quickfix.fixlatest.MassQuote.NoQuoteSets.NoQuoteEntries();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
    }
    break;
  case quickfix.fixlatest.BusinessMessageReject.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.BidRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoBidDescriptors.FIELD:
        return new quickfix.fixlatest.BidRequest.NoBidDescriptors();
      case quickfix.field.NoBidComponents.FIELD:
        return new quickfix.fixlatest.BidRequest.NoBidComponents();
    }
    break;
  case quickfix.fixlatest.BidResponse.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoBidComponents.FIELD:
        return new quickfix.fixlatest.BidResponse.NoBidComponents();
    }
    break;
  case quickfix.fixlatest.ListStrikePrice.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoStrikes.FIELD:
        return new quickfix.fixlatest.ListStrikePrice.NoStrikes();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.ListStrikePrice.NoStrikes.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.RegistrationInstructions.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.RegistrationInstructions.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRegistDtls.FIELD:
        return new quickfix.fixlatest.RegistrationInstructions.NoRegistDtls();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoDistribInsts.FIELD:
        return new quickfix.fixlatest.RegistrationInstructions.NoDistribInsts();
    }
    break;
  case quickfix.fixlatest.RegistrationInstructionsResponse.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.RegistrationInstructionsResponse.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.OrderMassCancelRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelRequest.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelRequest.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.OrderMassCancelReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoAffectedOrders.FIELD:
        return new quickfix.fixlatest.OrderMassCancelReport.NoAffectedOrders();
      case quickfix.field.NoNotAffectedOrders.FIELD:
        return new quickfix.fixlatest.OrderMassCancelReport.NoNotAffectedOrders();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelReport.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassCancelReport.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.NewOrderCross.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoSides.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoCrossLegs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNested3PartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs.NoNested3PartyIDs();
      case quickfix.field.NoNested3PartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCrossLegs.NoNested3PartyIDs.NoNested3PartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoAllocs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoCommissions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoLegs();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoTradingSessions();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoStipulations();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoStrategyParameters();
    }
    break;
  case quickfix.fixlatest.CrossOrderCancelReplaceRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoSides.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoCrossLegs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNested3PartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs.NoNested3PartyIDs();
      case quickfix.field.NoNested3PartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCrossLegs.NoNested3PartyIDs.NoNested3PartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoSides.NoCommissions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoLegs();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoTradingSessions();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoStipulations();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelReplaceRequest.NoStrategyParameters();
    }
    break;
  case quickfix.fixlatest.CrossOrderCancelRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoSides.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoSides.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CrossOrderCancelRequest.NoLegs();
    }
    break;
  case quickfix.fixlatest.SecurityTypeRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.SecurityTypes.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoSecurityTypes.FIELD:
        return new quickfix.fixlatest.SecurityTypes.NoSecurityTypes();
    }
    break;
  case quickfix.fixlatest.SecurityListRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityListRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityListRequest.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityListRequest.NoRelatedInstruments();
    }
    break;
  case quickfix.fixlatest.SecurityList.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym();
      case quickfix.field.NoSecurityClassifications.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoSecurityClassifications();
      case quickfix.field.NoStrikeRules.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoStrikeRules();
      case quickfix.field.NoMaturityRules.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoStrikeRules.NoMaturityRules();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoRelatedInstruments();
      case quickfix.field.NoPriceMovements.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoPriceMovements();
      case quickfix.field.NoPriceMovementValues.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoPriceMovements.NoPriceMovementValues();
      case quickfix.field.NoClearingAccountTypes.FIELD:
        return new quickfix.fixlatest.SecurityList.NoRelatedSym.NoPriceMovements.NoClearingAccountTypes();
    }
    break;
  case quickfix.fixlatest.DerivativeSecurityListRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.DerivativeSecurityList.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.DerivativeSecurityList.NoRelatedSym();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.DerivativeSecurityList.NoRelatedSym.NoLegs();
    }
    break;
  case quickfix.fixlatest.NewOrderMultileg.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoAllocs();
      case quickfix.field.NoNested3PartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
      case quickfix.field.NoNested3PartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
      case quickfix.field.NoValueChecks.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoValueChecks();
      case quickfix.field.NoMatchInst.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoMatchInst();
      case quickfix.field.NoDisclosureInstructions.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoDisclosureInstructions();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoTradingSessions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoCommissions();
      case quickfix.field.NoOrderAttributes.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoOrderAttributes();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.NewOrderMultileg.NoStrategyParameters();
    }
    break;
  case quickfix.fixlatest.MultilegOrderCancelReplace.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoAllocs();
      case quickfix.field.NoNested3PartyIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs();
      case quickfix.field.NoNested3PartySubIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
      case quickfix.field.NoValueChecks.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoValueChecks();
      case quickfix.field.NoMatchInst.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoMatchInst();
      case quickfix.field.NoDisclosureInstructions.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoDisclosureInstructions();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoTradingSessions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoCommissions();
      case quickfix.field.NoOrderAttributes.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoOrderAttributes();
      case quickfix.field.NoStrategyParameters.FIELD:
        return new quickfix.fixlatest.MultilegOrderCancelReplace.NoStrategyParameters();
    }
    break;
  case quickfix.fixlatest.TradeCaptureReportRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequest.NoLegs();
      case quickfix.field.NoDates.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequest.NoDates();
    }
    break;
  case quickfix.fixlatest.TradeCaptureReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoTradePriceConditions();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoRegulatoryTradeIDs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPriceQualifiers();
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoPayments.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPayments();
      case quickfix.field.NoPaymentBusinessCenters.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPayments.NoPaymentBusinessCenters();
      case quickfix.field.NoPaymentSettls.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPayments.NoPaymentSettls();
      case quickfix.field.NoPaymentSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs();
      case quickfix.field.NoPaymentSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs.NoPaymentSettlPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoUnderlyings();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoRelatedInstruments();
      case quickfix.field.NoCollateralAmounts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoCollateralAmounts();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoRateSources();
      case quickfix.field.NoTransactionAttributes.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoTransactionAttributes();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoPosAmt();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoLegs();
      case quickfix.field.NoLegPosAmt.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoLegs.NoLegPosAmt();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoOfLegUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoLegs.NoOfLegUnderlyings();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoTrdRegTimestamps();
      case quickfix.field.NoTradeQtys.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoTradeQtys();
      case quickfix.field.NoSides.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoLimitAmts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoLimitAmts();
      case quickfix.field.NoClearingInstructions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoClearingInstructions();
      case quickfix.field.NoSideRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSideRegulatoryTradeIDs();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoCommissions();
      case quickfix.field.NoContAmts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoContAmts();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoStipulations();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoTradeAllocAmts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoAllocs.NoTradeAllocAmts();
      case quickfix.field.NoAllocCommissions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoAllocs.NoAllocCommissions();
      case quickfix.field.NoSideTrdRegTS.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSideTrdRegTS();
      case quickfix.field.NoSettlDetails.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSettlDetails();
      case quickfix.field.NoSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs();
      case quickfix.field.NoSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoPositions();
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoRelatedTrades();
      case quickfix.field.NoRelatedPositions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoRelatedPositions();
      case quickfix.field.NoSideCollateralAmounts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSideCollateralAmounts();
      case quickfix.field.NoSideCollateralReinvestments.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoSides.NoSideCollateralAmounts.NoSideCollateralReinvestments();
      case quickfix.field.NoTrdRepIndicators.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoTrdRepIndicators();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoTrdRegPublications();
      case quickfix.field.NoMandatoryClearingJurisdictions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoMandatoryClearingJurisdictions();
      case quickfix.field.NoAttachments.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoAttachments();
      case quickfix.field.NoAttachmentKeywords.FIELD:
        return new quickfix.fixlatest.TradeCaptureReport.NoAttachments.NoAttachmentKeywords();
    }
    break;
  case quickfix.fixlatest.OrderMassStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassStatusRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassStatusRequest.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassStatusRequest.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.QuoteRequestReject.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoQuoteQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoQuoteQualifiers();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoPriceQualifiers();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteRequestReject.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.RFQRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.RFQRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.RFQRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.RFQRequest.NoRelatedSym();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.RFQRequest.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.RFQRequest.NoRelatedSym.NoLegs();
    }
    break;
  case quickfix.fixlatest.QuoteStatusReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoQuoteQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoQuoteQualifiers();
      case quickfix.field.NoQuoteAttributes.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoQuoteAttributes();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoPriceQualifiers();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.QuoteStatusReport.NoTrdRegTimestamps();
    }
    break;
  case quickfix.fixlatest.QuoteResponse.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoQuoteQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoQuoteQualifiers();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.QuoteResponse.NoPriceQualifiers();
    }
    break;
  case quickfix.fixlatest.Confirmation.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.Confirmation.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.Confirmation.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.Confirmation.NoOrders();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.Confirmation.NoOrders.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.Confirmation.NoExecs();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.Confirmation.NoExecs.NoTrdRegPublications();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.Confirmation.NoExecs.NoTradePriceConditions();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.Confirmation.NoTrdRegTimestamps();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.Confirmation.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.Confirmation.NoLegs();
      case quickfix.field.NoCapacities.FIELD:
        return new quickfix.fixlatest.Confirmation.NoCapacities();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.Confirmation.NoPriceQualifiers();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.Confirmation.NoCommissions();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.Confirmation.NoStipulations();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.Confirmation.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.Confirmation.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoMatchExceptions.FIELD:
        return new quickfix.fixlatest.Confirmation.NoMatchExceptions();
      case quickfix.field.NoMatchingDataPoints.FIELD:
        return new quickfix.fixlatest.Confirmation.NoMatchingDataPoints();
    }
    break;
  case quickfix.fixlatest.PositionMaintenanceRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoRelatedInstruments();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoUnderlyings();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoTradingSessions();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceRequest.NoPosAmt();
    }
    break;
  case quickfix.fixlatest.PositionMaintenanceReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoRelatedInstruments();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoUnderlyings();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoTradingSessions();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPosAmt();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoRegulatoryTradeIDs();
      case quickfix.field.NoPayments.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPayments();
      case quickfix.field.NoPaymentBusinessCenters.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPayments.NoPaymentBusinessCenters();
      case quickfix.field.NoPaymentSettls.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPayments.NoPaymentSettls();
      case quickfix.field.NoPaymentSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs();
      case quickfix.field.NoPaymentSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs.NoPaymentSettlPartySubIDs();
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.PositionMaintenanceReport.NoRelatedTrades();
    }
    break;
  case quickfix.fixlatest.RequestForPositions.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.RequestForPositions.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.RequestForPositions.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.RequestForPositions.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.RequestForPositions.NoUnderlyings();
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.RequestForPositions.NoTradingSessions();
    }
    break;
  case quickfix.fixlatest.RequestForPositionsAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.RequestForPositionsAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.RequestForPositionsAck.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.RequestForPositionsAck.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.PositionReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoTransactionAttributes.FIELD:
        return new quickfix.fixlatest.PositionReport.NoTransactionAttributes();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.PositionReport.NoTrdRegTimestamps();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.PositionReport.NoRelatedInstruments();
      case quickfix.field.NoCollateralAmounts.FIELD:
        return new quickfix.fixlatest.PositionReport.NoCollateralAmounts();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PositionReport.NoUnderlyings();
      case quickfix.field.NoUnderlyingAmounts.FIELD:
        return new quickfix.fixlatest.PositionReport.NoUnderlyings.NoUnderlyingAmounts();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPosAmt();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoRegulatoryTradeIDs();
      case quickfix.field.NoPayments.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPayments();
      case quickfix.field.NoPaymentBusinessCenters.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPayments.NoPaymentBusinessCenters();
      case quickfix.field.NoPaymentSettls.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPayments.NoPaymentSettls();
      case quickfix.field.NoPaymentSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs();
      case quickfix.field.NoPaymentSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionReport.NoPayments.NoPaymentSettls.NoPaymentSettlPartyIDs.NoPaymentSettlPartySubIDs();
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.PositionReport.NoRelatedTrades();
    }
    break;
  case quickfix.fixlatest.TradeCaptureReportRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequestAck.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportRequestAck.NoLegs();
    }
    break;
  case quickfix.fixlatest.TradeCaptureReportAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRootPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoRootPartyIDs();
      case quickfix.field.NoRootPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoRootPartyIDs.NoRootPartySubIDs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoPriceQualifiers();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoUnderlyings();
      case quickfix.field.NoTrdRepIndicators.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoTrdRepIndicators();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoLegs();
      case quickfix.field.NoLegPosAmt.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoLegs.NoLegPosAmt();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoLegs.NoLegStipulations();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoOfLegUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoLegs.NoOfLegUnderlyings();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoTrdRegTimestamps();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoPosAmt();
      case quickfix.field.NoTradeQtys.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoTradeQtys();
      case quickfix.field.NoSides.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLimitAmts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoLimitAmts();
      case quickfix.field.NoClearingInstructions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoClearingInstructions();
      case quickfix.field.NoCommissions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoCommissions();
      case quickfix.field.NoContAmts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoContAmts();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoStipulations();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoSettlDetails.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoSettlDetails();
      case quickfix.field.NoSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs();
      case quickfix.field.NoSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoTradeAllocAmts.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoAllocs.NoTradeAllocAmts();
      case quickfix.field.NoAllocCommissions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoAllocs.NoAllocCommissions();
      case quickfix.field.NoSideTrdRegTS.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoSideTrdRegTS();
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoRelatedTrades();
      case quickfix.field.NoRelatedPositions.FIELD:
        return new quickfix.fixlatest.TradeCaptureReportAck.NoSides.NoRelatedPositions();
    }
    break;
  case quickfix.fixlatest.AllocationReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoOrders();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoOrders.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoExecs();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoExecs.NoTrdRegPublications();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoExecs.NoTradePriceConditions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoLegs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoPriceQualifiers();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoStipulations();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoRegulatoryTradeIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoPosAmt();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoAllocCommissions.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoAllocCommissions();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoClearingInstructions.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoClearingInstructions();
      case quickfix.field.NoTradeAllocAmts.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoAllocs.NoTradeAllocAmts();
      case quickfix.field.NoRateSources.FIELD:
        return new quickfix.fixlatest.AllocationReport.NoRateSources();
    }
    break;
  case quickfix.fixlatest.AllocationReportAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoRegulatoryTradeIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationReportAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
    }
    break;
  case quickfix.fixlatest.ConfirmationAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoMatchExceptions.FIELD:
        return new quickfix.fixlatest.ConfirmationAck.NoMatchExceptions();
      case quickfix.field.NoMatchingDataPoints.FIELD:
        return new quickfix.fixlatest.ConfirmationAck.NoMatchingDataPoints();
    }
    break;
  case quickfix.fixlatest.SettlementInstructionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.SettlementInstructionRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.AssignmentReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoUnderlyings();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.AssignmentReport.NoPosAmt();
    }
    break;
  case quickfix.fixlatest.CollateralRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoExecs();
      case quickfix.field.NoTrades.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoTrades();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoUnderlyings();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoTrdRegTimestamps();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.CollateralRequest.NoStipulations();
    }
    break;
  case quickfix.fixlatest.CollateralAssignment.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoExecs();
      case quickfix.field.NoTrades.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoTrades();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoUnderlyings();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoTrdRegTimestamps();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.CollateralAssignment.NoStipulations();
    }
    break;
  case quickfix.fixlatest.CollateralResponse.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoExecs();
      case quickfix.field.NoTrades.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoTrades();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoUnderlyings();
      case quickfix.field.NoCollateralAmounts.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoCollateralAmounts();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoTrdRegTimestamps();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.CollateralResponse.NoStipulations();
    }
    break;
  case quickfix.fixlatest.CollateralReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoExecs();
      case quickfix.field.NoTrades.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoTrades();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoUnderlyings();
      case quickfix.field.NoCollateralAmounts.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoCollateralAmounts();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoRegulatoryTradeIDs();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoTrdRegTimestamps();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoStipulations();
      case quickfix.field.NoFundingSources.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoFundingSources();
      case quickfix.field.NoTransactionAttributes.FIELD:
        return new quickfix.fixlatest.CollateralReport.NoTransactionAttributes();
    }
    break;
  case quickfix.fixlatest.CollateralInquiry.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoCollInquiryQualifier.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoCollInquiryQualifier();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoExecs();
      case quickfix.field.NoTrades.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoTrades();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoUnderlyings();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoTrdRegTimestamps();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.CollateralInquiry.NoStipulations();
    }
    break;
  case quickfix.fixlatest.NetworkCounterpartySystemStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoCompIDs.FIELD:
        return new quickfix.fixlatest.NetworkCounterpartySystemStatusRequest.NoCompIDs();
    }
    break;
  case quickfix.fixlatest.NetworkCounterpartySystemStatusResponse.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoCompIDs.FIELD:
        return new quickfix.fixlatest.NetworkCounterpartySystemStatusResponse.NoCompIDs();
    }
    break;
  case quickfix.fixlatest.UserRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.UserResponse.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoThrottles.FIELD:
        return new quickfix.fixlatest.UserResponse.NoThrottles();
      case quickfix.field.NoThrottleMsgType.FIELD:
        return new quickfix.fixlatest.UserResponse.NoThrottles.NoThrottleMsgType();
    }
    break;
  case quickfix.fixlatest.CollateralInquiryAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoCollInquiryQualifier.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoCollInquiryQualifier();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoExecs();
      case quickfix.field.NoTrades.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoTrades();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.CollateralInquiryAck.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.ConfirmationRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.ConfirmationRequest.NoOrders();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
    }
    break;
  case quickfix.fixlatest.ContraryIntentionReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.ContraryIntentionReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.ContraryIntentionReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoExpiration.FIELD:
        return new quickfix.fixlatest.ContraryIntentionReport.NoExpiration();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.ContraryIntentionReport.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.SecurityDefinitionUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoUnderlyings();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoRelatedInstruments();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoLegs();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoMarketSegments();
      case quickfix.field.NoStrikeRules.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules();
      case quickfix.field.NoMaturityRules.FIELD:
        return new quickfix.fixlatest.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules.NoMaturityRules();
    }
    break;
  case quickfix.fixlatest.SecurityListUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym();
      case quickfix.field.NoStrikeRules.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules();
      case quickfix.field.NoMaturityRules.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules.NoMaturityRules();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoStipulations();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoLegs.NoLegStipulations();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityListUpdateReport.NoRelatedSym.NoRelatedInstruments();
    }
    break;
  case quickfix.fixlatest.AdjustedPositionReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoRelatedSym();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.AdjustedPositionReport.NoRelatedSym.NoRelatedInstruments();
    }
    break;
  case quickfix.fixlatest.AllocationInstructionAlert.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoOrders();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoExecs();
      case quickfix.field.NoTrdRegPublications.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoExecs.NoTrdRegPublications();
      case quickfix.field.NoTradePriceConditions.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoExecs.NoTradePriceConditions();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoLegs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoPriceQualifiers();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoStipulations.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoStipulations();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoPosAmt();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoAllocCommissions.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoAllocCommissions();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoMiscFees.NoMiscFeeSubTypes();
      case quickfix.field.NoClearingInstructions.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoClearingInstructions();
      case quickfix.field.NoTradeAllocAmts.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlert.NoAllocs.NoTradeAllocAmts();
    }
    break;
  case quickfix.fixlatest.ExecutionAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.ExecutionAck.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.ExecutionAck.NoLegs();
      case quickfix.field.NoPriceQualifiers.FIELD:
        return new quickfix.fixlatest.ExecutionAck.NoPriceQualifiers();
      case quickfix.field.NoRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.ExecutionAck.NoRegulatoryTradeIDs();
    }
    break;
  case quickfix.fixlatest.TradingSessionList.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.TradingSessionList.NoTradingSessions();
    }
    break;
  case quickfix.fixlatest.TradingSessionListRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.SettlementObligationReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoSettlOblig.FIELD:
        return new quickfix.fixlatest.SettlementObligationReport.NoSettlOblig();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.SettlementObligationReport.NoSettlOblig.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.SettlementObligationReport.NoSettlOblig.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoSettlDetails.FIELD:
        return new quickfix.fixlatest.SettlementObligationReport.NoSettlOblig.NoSettlDetails();
      case quickfix.field.NoSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs();
      case quickfix.field.NoSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
    }
    break;
  case quickfix.fixlatest.DerivativeSecurityListUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.DerivativeSecurityListUpdateReport.NoRelatedSym();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.DerivativeSecurityListUpdateReport.NoRelatedSym.NoLegs();
    }
    break;
  case quickfix.fixlatest.TradingSessionListUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoTradingSessions.FIELD:
        return new quickfix.fixlatest.TradingSessionListUpdateReport.NoTradingSessions();
    }
    break;
  case quickfix.fixlatest.MarketDefinitionRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.MarketDefinition.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoInstrumentScopes();
      case quickfix.field.NoRelatedMarketSegments.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoRelatedMarketSegments();
      case quickfix.field.NoOrdTypeRules.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoOrdTypeRules();
      case quickfix.field.NoTimeInForceRules.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoTimeInForceRules();
      case quickfix.field.NoExecInstRules.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoExecInstRules();
      case quickfix.field.NoAuctionTypeRules.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoAuctionTypeRules();
      case quickfix.field.NoMDFeedTypes.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoMDFeedTypes();
      case quickfix.field.NoMatchRules.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoMatchRules();
      case quickfix.field.NoFlexProductEligibilities.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoFlexProductEligibilities();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoMiscFees.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoMiscFees();
      case quickfix.field.NoMiscFeeSubTypes.FIELD:
        return new quickfix.fixlatest.MarketDefinition.NoMiscFees.NoMiscFeeSubTypes();
    }
    break;
  case quickfix.fixlatest.MarketDefinitionUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoInstrumentScopes();
      case quickfix.field.NoRelatedMarketSegments.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoRelatedMarketSegments();
      case quickfix.field.NoOrdTypeRules.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoOrdTypeRules();
      case quickfix.field.NoTimeInForceRules.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoTimeInForceRules();
      case quickfix.field.NoExecInstRules.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoExecInstRules();
      case quickfix.field.NoAuctionTypeRules.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoAuctionTypeRules();
      case quickfix.field.NoMDFeedTypes.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoMDFeedTypes();
      case quickfix.field.NoMatchRules.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoMatchRules();
      case quickfix.field.NoFlexProductEligibilities.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoFlexProductEligibilities();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDefinitionUpdateReport.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.UserNotification.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoUsernames.FIELD:
        return new quickfix.fixlatest.UserNotification.NoUsernames();
      case quickfix.field.NoThrottles.FIELD:
        return new quickfix.fixlatest.UserNotification.NoThrottles();
      case quickfix.field.NoThrottleMsgType.FIELD:
        return new quickfix.fixlatest.UserNotification.NoThrottles.NoThrottleMsgType();
    }
    break;
  case quickfix.fixlatest.OrderMassActionReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoAffectedOrders.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoAffectedOrders();
      case quickfix.field.NoNotAffectedOrders.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoNotAffectedOrders();
      case quickfix.field.NoAffectedMarketSegments.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoAffectedMarketSegments();
      case quickfix.field.NoNotAffectedMarketSegments.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoNotAffectedMarketSegments();
      case quickfix.field.NoTargetMarketSegments.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoTargetMarketSegments();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionReport.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.OrderMassActionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoTargetMarketSegments.FIELD:
        return new quickfix.fixlatest.OrderMassActionRequest.NoTargetMarketSegments();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionRequest.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.OrderMassActionRequest.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.ApplicationMessageRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoApplIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequest.NoApplIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequest.NoApplIDs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequest.NoApplIDs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequest.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.ApplicationMessageRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoApplIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequestAck.NoApplIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequestAck.NoApplIDs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequestAck.NoApplIDs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequestAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageRequestAck.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.ApplicationMessageReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoApplIDs.FIELD:
        return new quickfix.fixlatest.ApplicationMessageReport.NoApplIDs();
    }
    break;
  case quickfix.fixlatest.StreamAssignmentRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoAsgnReqs.FIELD:
        return new quickfix.fixlatest.StreamAssignmentRequest.NoAsgnReqs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.StreamAssignmentRequest.NoAsgnReqs.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.StreamAssignmentRequest.NoAsgnReqs.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.StreamAssignmentRequest.NoAsgnReqs.NoRelatedSym();
    }
    break;
  case quickfix.fixlatest.StreamAssignmentReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoAsgnReqs.FIELD:
        return new quickfix.fixlatest.StreamAssignmentReport.NoAsgnReqs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.StreamAssignmentReport.NoAsgnReqs.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.StreamAssignmentReport.NoAsgnReqs.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.StreamAssignmentReport.NoAsgnReqs.NoRelatedSym();
    }
    break;
  case quickfix.fixlatest.StreamAssignmentReportACK.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.MarginRequirementInquiry.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoMarginReqmtInqQualifier.FIELD:
        return new quickfix.fixlatest.MarginRequirementInquiry.NoMarginReqmtInqQualifier();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarginRequirementInquiry.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarginRequirementInquiry.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.MarginRequirementInquiryAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoMarginReqmtInqQualifier.FIELD:
        return new quickfix.fixlatest.MarginRequirementInquiryAck.NoMarginReqmtInqQualifier();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarginRequirementInquiryAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarginRequirementInquiryAck.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.MarginRequirementReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarginRequirementReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarginRequirementReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTrdRegTimestamps.FIELD:
        return new quickfix.fixlatest.MarginRequirementReport.NoTrdRegTimestamps();
      case quickfix.field.NoMarginAmt.FIELD:
        return new quickfix.fixlatest.MarginRequirementReport.NoMarginAmt();
    }
    break;
  case quickfix.fixlatest.PartyDetailsListRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRequestedPartyRoles.FIELD:
        return new quickfix.fixlatest.PartyDetailsListRequest.NoRequestedPartyRoles();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyDetailsListRequest.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.PartyDetailsListReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyDetailsListReport.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.PartyDetailsListUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyUpdates.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyDetailsListUpdateReport.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitsRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRequestedPartyRoles.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoRequestedPartyRoles();
      case quickfix.field.NoRequestedRiskLimitType.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoRequestedRiskLimitType();
      case quickfix.field.NoRiskInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsRequest.NoRiskInstrumentScopes();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitsReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoRiskLimits();
      case quickfix.field.NoRiskLimitTypes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes();
      case quickfix.field.NoRiskWarningLevels.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes.NoRiskWarningLevels();
      case quickfix.field.NoRiskInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReport.NoPartyRiskLimits.NoRiskLimits.NoRiskInstrumentScopes();
    }
    break;
  case quickfix.fixlatest.SecurityMassStatusRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.SecurityMassStatus.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.SecurityMassStatus.NoRelatedSym();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.SecurityMassStatus.NoRelatedSym.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.SecurityMassStatus.NoRelatedSym.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.SecurityMassStatus.NoRelatedSym.NoRelatedInstruments();
    }
    break;
  case quickfix.fixlatest.AccountSummaryReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoSettlementAmounts.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoSettlementAmounts();
      case quickfix.field.NoMarginAmt.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoMarginAmt();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoCollateralAmounts.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoCollateralAmounts();
      case quickfix.field.NoPayCollects.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoPayCollects();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.AccountSummaryReport.NoPosAmt();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitsUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoRiskLimits();
      case quickfix.field.NoRiskLimitTypes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes();
      case quickfix.field.NoRiskWarningLevels.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes.NoRiskWarningLevels();
      case quickfix.field.NoRiskInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsUpdateReport.NoPartyRiskLimits.NoRiskLimits.NoRiskInstrumentScopes();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoRiskLimits();
      case quickfix.field.NoRiskLimitTypes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes();
      case quickfix.field.NoRiskWarningLevels.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes.NoRiskWarningLevels();
      case quickfix.field.NoRiskInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequest.NoPartyRiskLimits.NoRiskLimits.NoRiskInstrumentScopes();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoRiskLimits();
      case quickfix.field.NoRiskLimitTypes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes();
      case quickfix.field.NoRiskWarningLevels.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes.NoRiskWarningLevels();
      case quickfix.field.NoRiskInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsDefinitionRequestAck.NoPartyRiskLimits.NoRiskLimits.NoRiskInstrumentScopes();
    }
    break;
  case quickfix.fixlatest.PartyEntitlementsRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRequestedPartyRoles.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoRequestedPartyRoles();
      case quickfix.field.NoEntitlementTypes.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoEntitlementTypes();
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoInstrumentScopes();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsRequest.NoMarketSegments();
    }
    break;
  case quickfix.fixlatest.PartyEntitlementsReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoEntitlements();
      case quickfix.field.NoEntitlementAttrib.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoEntitlements.NoEntitlementAttrib();
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoEntitlements.NoInstrumentScopes();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsReport.NoPartyEntitlements.NoEntitlements.NoMarketSegments();
    }
    break;
  case quickfix.fixlatest.QuoteAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.QuoteAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.QuoteAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoQuoteAttributes.FIELD:
        return new quickfix.fixlatest.QuoteAck.NoQuoteAttributes();
    }
    break;
  case quickfix.fixlatest.PartyDetailsDefinitionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyUpdates.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequest.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.PartyDetailsDefinitionRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyUpdates.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyDetailsDefinitionRequestAck.NoPartyUpdates.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.PartyEntitlementsUpdateReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoEntitlements();
      case quickfix.field.NoEntitlementAttrib.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoEntitlements.NoEntitlementAttrib();
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoEntitlements.NoInstrumentScopes();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsUpdateReport.NoPartyEntitlements.NoEntitlements.NoMarketSegments();
    }
    break;
  case quickfix.fixlatest.PartyEntitlementsDefinitionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoEntitlements();
      case quickfix.field.NoEntitlementAttrib.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoEntitlements.NoEntitlementAttrib();
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoEntitlements.NoInstrumentScopes();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequest.NoPartyEntitlements.NoEntitlements.NoMarketSegments();
    }
    break;
  case quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoEntitlements.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoEntitlements();
      case quickfix.field.NoEntitlementAttrib.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoEntitlements.NoEntitlementAttrib();
      case quickfix.field.NoInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoEntitlements.NoInstrumentScopes();
      case quickfix.field.NoMarketSegments.FIELD:
        return new quickfix.fixlatest.PartyEntitlementsDefinitionRequestAck.NoPartyEntitlements.NoEntitlements.NoMarketSegments();
    }
    break;
  case quickfix.fixlatest.TradeMatchReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoInstrmtMatchSides.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoLegs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoUnderlyings();
      case quickfix.field.NoTrdMatchSides.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoAllocs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoAllocs();
      case quickfix.field.NoAllocRegulatoryTradeIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoAllocs.NoAllocRegulatoryTradeIDs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoTradeAllocAmts.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoAllocs.NoTradeAllocAmts();
      case quickfix.field.NoAllocCommissions.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoAllocs.NoAllocCommissions();
      case quickfix.field.NoLegExecs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoLegExecs();
      case quickfix.field.NoNested3PartyIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoLegExecs.NoNested3PartyIDs();
      case quickfix.field.NoNested3PartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeMatchReport.NoInstrmtMatchSides.NoTrdMatchSides.NoLegExecs.NoNested3PartyIDs.NoNested3PartySubIDs();
    }
    break;
  case quickfix.fixlatest.TradeMatchReportAck.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitsReportAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits();
      case quickfix.field.NoPartyDetails.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails();
      case quickfix.field.NoPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailSubIDs();
      case quickfix.field.NoPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID();
      case quickfix.field.NoPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoPartyDetailAltID.NoPartyDetailAltSubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoPartyDetails.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoRiskLimits.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoRiskLimits();
      case quickfix.field.NoRiskLimitTypes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes();
      case quickfix.field.NoRiskWarningLevels.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoRiskLimits.NoRiskLimitTypes.NoRiskWarningLevels();
      case quickfix.field.NoRiskInstrumentScopes.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitsReportAck.NoPartyRiskLimits.NoRiskLimits.NoRiskInstrumentScopes();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitCheckRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequest.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.PartyRiskLimitCheckRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoRelatedPartyDetailID.NoPartyRelationships();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs();
      case quickfix.field.NoLegStipulations.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs.NoLegStipulations();
      case quickfix.field.NoLegAllocs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs.NoLegAllocs();
      case quickfix.field.NoNested2PartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs.NoLegAllocs.NoNested2PartyIDs();
      case quickfix.field.NoNested2PartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PartyRiskLimitCheckRequestAck.NoUnderlyings();
    }
    break;
  case quickfix.fixlatest.PartyActionRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyActionRequest.NoRelatedPartyDetailID.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.PartyActionReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRequestingPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRequestingPartyIDs();
      case quickfix.field.NoRequestingPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRequestingPartyIDs.NoRequestingPartySubIDs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoRelatedPartyDetailID.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRelatedPartyDetailID();
      case quickfix.field.NoRelatedPartyDetailSubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRelatedPartyDetailID.NoRelatedPartyDetailSubIDs();
      case quickfix.field.NoRelatedPartyDetailAltID.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID();
      case quickfix.field.NoRelatedPartyDetailAltSubIDs.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRelatedPartyDetailID.NoRelatedPartyDetailAltID.NoRelatedPartyDetailAltSubIDs();
      case quickfix.field.NoPartyRelationships.FIELD:
        return new quickfix.fixlatest.PartyActionReport.NoRelatedPartyDetailID.NoPartyRelationships();
    }
    break;
  case quickfix.fixlatest.MassOrder.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MassOrder.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MassOrder.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoOrderEntries.FIELD:
        return new quickfix.fixlatest.MassOrder.NoOrderEntries();
    }
    break;
  case quickfix.fixlatest.MassOrderAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MassOrderAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MassOrderAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoOrderEntries.FIELD:
        return new quickfix.fixlatest.MassOrderAck.NoOrderEntries();
    }
    break;
  case quickfix.fixlatest.PositionTransferInstruction.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoUnderlyings();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.PositionTransferInstruction.NoPosAmt();
    }
    break;
  case quickfix.fixlatest.PositionTransferInstructionAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstructionAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstructionAck.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstructionAck.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferInstructionAck.NoTargetPartyIDs.NoTargetPartySubIDs();
    }
    break;
  case quickfix.fixlatest.PositionTransferReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoTargetPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoTargetPartyIDs();
      case quickfix.field.NoTargetPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoTargetPartyIDs.NoTargetPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoUnderlyings();
      case quickfix.field.NoPositions.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoPositions();
      case quickfix.field.NoNestedPartyIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoPositions.NoNestedPartyIDs();
      case quickfix.field.NoNestedPartySubIDs.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
      case quickfix.field.NoPosAmt.FIELD:
        return new quickfix.fixlatest.PositionTransferReport.NoPosAmt();
    }
    break;
  case quickfix.fixlatest.MarketDataStatisticsRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsRequest.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsRequest.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsRequest.NoRelatedInstruments();
      case quickfix.field.NoMDStatistics.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsRequest.NoMDStatistics();
    }
    break;
  case quickfix.fixlatest.MarketDataStatisticsReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoUnderlyings.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsReport.NoUnderlyings();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsReport.NoLegs();
      case quickfix.field.NoRelatedInstruments.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsReport.NoRelatedInstruments();
      case quickfix.field.NoMDStatistics.FIELD:
        return new quickfix.fixlatest.MarketDataStatisticsReport.NoMDStatistics();
    }
    break;
  case quickfix.fixlatest.CollateralReportAck.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.CollateralReportAck.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.CollateralReportAck.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.MarketDataReport.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.CrossRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.CrossRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.AllocationInstructionAlertRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlertRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.AllocationInstructionAlertRequest.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.AllocationInstructionAlertRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.TradeAggregationRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoOrders.FIELD:
        return new quickfix.fixlatest.TradeAggregationRequest.NoOrders();
      case quickfix.field.NoExecs.FIELD:
        return new quickfix.fixlatest.TradeAggregationRequest.NoExecs();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.TradeAggregationRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.TradeAggregationRequest.NoPartyIDs.NoPartySubIDs();
    }
    break;
  case quickfix.fixlatest.TradeAggregationReport.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.PayManagementReport.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.PayManagementReport.NoRelatedTrades();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PayManagementReport.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PayManagementReport.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoSettlDetails.FIELD:
        return new quickfix.fixlatest.PayManagementReport.NoSettlDetails();
      case quickfix.field.NoSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.PayManagementReport.NoSettlDetails.NoSettlPartyIDs();
      case quickfix.field.NoSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.PayManagementReport.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
    }
    break;
  case quickfix.fixlatest.PayManagementReportAck.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.PayManagementRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedTrades.FIELD:
        return new quickfix.fixlatest.PayManagementRequest.NoRelatedTrades();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.PayManagementRequest.NoPartyIDs();
      case quickfix.field.NoPartySubIDs.FIELD:
        return new quickfix.fixlatest.PayManagementRequest.NoPartyIDs.NoPartySubIDs();
      case quickfix.field.NoSettlDetails.FIELD:
        return new quickfix.fixlatest.PayManagementRequest.NoSettlDetails();
      case quickfix.field.NoSettlPartyIDs.FIELD:
        return new quickfix.fixlatest.PayManagementRequest.NoSettlDetails.NoSettlPartyIDs();
      case quickfix.field.NoSettlPartySubIDs.FIELD:
        return new quickfix.fixlatest.PayManagementRequest.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
    }
    break;
  case quickfix.fixlatest.PayManagementRequestAck.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
    }
    return null;
  }
}
