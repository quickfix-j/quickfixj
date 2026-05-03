/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.*;
import quickfix.field.*;

public class MessageCracker {

  public void onMessage(quickfix.Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
    throw new UnsupportedMessageType();
  }
  /**
   * Callback for Advertisement message.
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
   * Callback for News message.
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
   * Callback for Email message.
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
   * Callback for NewOrderSingle message.
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
   * Callback for QuoteRequest message.
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
   * Callback for MarketDataSnapshotFullRefresh message.
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
   * Callback for MarketDataIncrementalRefresh message.
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
   * Callback for MassQuoteAck message.
   * @param message
   * @param sessionID
   * @throws FieldNotFound
   * @throws UnsupportedMessageType
   * @throws IncorrectTagValue
   */

  public void onMessage(MassQuoteAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
    throw new UnsupportedMessageType();
  }
  /**
   * Callback for SecurityDefinition message.
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
   * Callback for BusinessMessageReject message.
   * @param message
   * @param sessionID
   * @throws FieldNotFound
   * @throws UnsupportedMessageType
   * @throws IncorrectTagValue
   */

  public void onMessage(BusinessMessageReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
    throw new UnsupportedMessageType();
  }
  /**
   * Callback for NewOrderCross message.
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
   * Callback for DerivativeSecurityList message.
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
   * Callback for UserRequest message.
   * @param message
   * @param sessionID
   * @throws FieldNotFound
   * @throws UnsupportedMessageType
   * @throws IncorrectTagValue
   */

  public void onMessage(UserRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
    throw new UnsupportedMessageType();
  }

  public void crack(quickfix.Message message, SessionID sessionID)
    throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
    crackfixlatest((Message) message, sessionID);
  }

  public void crackfixlatest(Message message, SessionID sessionID)
    throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
    String type = message.getHeader().getString(MsgType.FIELD);
    switch (type) {
    case Advertisement.MSGTYPE:
      onMessage((Advertisement)message, sessionID);
      break;
    case News.MSGTYPE:
      onMessage((News)message, sessionID);
      break;
    case Email.MSGTYPE:
      onMessage((Email)message, sessionID);
      break;
    case NewOrderSingle.MSGTYPE:
      onMessage((NewOrderSingle)message, sessionID);
      break;
    case QuoteRequest.MSGTYPE:
      onMessage((QuoteRequest)message, sessionID);
      break;
    case MarketDataSnapshotFullRefresh.MSGTYPE:
      onMessage((MarketDataSnapshotFullRefresh)message, sessionID);
      break;
    case MarketDataIncrementalRefresh.MSGTYPE:
      onMessage((MarketDataIncrementalRefresh)message, sessionID);
      break;
    case MassQuoteAck.MSGTYPE:
      onMessage((MassQuoteAck)message, sessionID);
      break;
    case SecurityDefinition.MSGTYPE:
      onMessage((SecurityDefinition)message, sessionID);
      break;
    case BusinessMessageReject.MSGTYPE:
      onMessage((BusinessMessageReject)message, sessionID);
      break;
    case NewOrderCross.MSGTYPE:
      onMessage((NewOrderCross)message, sessionID);
      break;
    case DerivativeSecurityList.MSGTYPE:
      onMessage((DerivativeSecurityList)message, sessionID);
      break;
    case UserRequest.MSGTYPE:
      onMessage((UserRequest)message, sessionID);
      break;
    default:
      onMessage(message, sessionID);
    }
  }
}
