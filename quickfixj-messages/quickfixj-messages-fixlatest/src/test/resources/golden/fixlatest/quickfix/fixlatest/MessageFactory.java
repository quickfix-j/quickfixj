/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

  public Message create(String beginString, String msgType) {
    switch (msgType) {
    case quickfix.fixlatest.Advertisement.MSGTYPE:
      return new quickfix.fixlatest.Advertisement();
    case quickfix.fixlatest.News.MSGTYPE:
      return new quickfix.fixlatest.News();
    case quickfix.fixlatest.Email.MSGTYPE:
      return new quickfix.fixlatest.Email();
    case quickfix.fixlatest.NewOrderSingle.MSGTYPE:
      return new quickfix.fixlatest.NewOrderSingle();
    case quickfix.fixlatest.QuoteRequest.MSGTYPE:
      return new quickfix.fixlatest.QuoteRequest();
    case quickfix.fixlatest.MarketDataSnapshotFullRefresh.MSGTYPE:
      return new quickfix.fixlatest.MarketDataSnapshotFullRefresh();
    case quickfix.fixlatest.MarketDataIncrementalRefresh.MSGTYPE:
      return new quickfix.fixlatest.MarketDataIncrementalRefresh();
    case quickfix.fixlatest.MassQuoteAck.MSGTYPE:
      return new quickfix.fixlatest.MassQuoteAck();
    case quickfix.fixlatest.SecurityDefinition.MSGTYPE:
      return new quickfix.fixlatest.SecurityDefinition();
    case quickfix.fixlatest.BusinessMessageReject.MSGTYPE:
      return new quickfix.fixlatest.BusinessMessageReject();
    case quickfix.fixlatest.NewOrderCross.MSGTYPE:
      return new quickfix.fixlatest.NewOrderCross();
    case quickfix.fixlatest.DerivativeSecurityList.MSGTYPE:
      return new quickfix.fixlatest.DerivativeSecurityList();
    case quickfix.fixlatest.UserRequest.MSGTYPE:
      return new quickfix.fixlatest.UserRequest();
    }
    return new quickfix.fixlatest.Message();
  }

  public Group create(String beginString, String msgType, int correspondingFieldID) {
    switch (msgType) {
  case quickfix.fixlatest.Advertisement.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.News.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoLinesOfText.FIELD:
        return new quickfix.fixlatest.News.NoLinesOfText();
    }
    break;
  case quickfix.fixlatest.Email.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.NewOrderSingle.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderSingle.NoPartyIDs();
    }
    break;
  case quickfix.fixlatest.QuoteRequest.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoRelatedSym.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym();
      case quickfix.field.NoLegs.FIELD:
        return new quickfix.fixlatest.QuoteRequest.NoRelatedSym.NoLegs();
    }
    break;
  case quickfix.fixlatest.MarketDataSnapshotFullRefresh.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoMDEntries.FIELD:
        return new quickfix.fixlatest.MarketDataSnapshotFullRefresh.NoMDEntries();
    }
    break;
  case quickfix.fixlatest.MarketDataIncrementalRefresh.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.MassQuoteAck.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.SecurityDefinition.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.BusinessMessageReject.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.NewOrderCross.MSGTYPE:
    switch (correspondingFieldID) {
      case quickfix.field.NoSides.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides();
      case quickfix.field.NoPartyIDs.FIELD:
        return new quickfix.fixlatest.NewOrderCross.NoSides.NoPartyIDs();
    }
    break;
  case quickfix.fixlatest.DerivativeSecurityList.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
  case quickfix.fixlatest.UserRequest.MSGTYPE:
    switch (correspondingFieldID) {
    }
    break;
    }
    return null;
  }
}
