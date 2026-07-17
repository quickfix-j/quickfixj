/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class ConfirmationAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AU";

  public ConfirmationAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public ConfirmationAck (quickfix.field.ConfirmID confirmID, quickfix.field.TradeDate tradeDate, quickfix.field.TransactTime transactTime, quickfix.field.AffirmStatus affirmStatus) {
    this();
    setField(confirmID);
    setField(tradeDate);
    setField(transactTime);
    setField(affirmStatus);
  }

  public void set(quickfix.field.ConfirmID value) {
    setField(value);
  }

  public quickfix.field.ConfirmID get(quickfix.field.ConfirmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmID getConfirmID() throws FieldNotFound {
    return get(new quickfix.field.ConfirmID());
  }

  public boolean isSet(quickfix.field.ConfirmID field) {
    return isSetField(field);
  }

  public boolean isSetConfirmID() {
    return isSetField(664);
  }

  public void set(quickfix.field.TradeDate value) {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
    return get(new quickfix.field.TradeDate());
  }

  public boolean isSet(quickfix.field.TradeDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeDate() {
    return isSetField(75);
  }

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
  }

  public void set(quickfix.field.AffirmStatus value) {
    setField(value);
  }

  public quickfix.field.AffirmStatus get(quickfix.field.AffirmStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffirmStatus getAffirmStatus() throws FieldNotFound {
    return get(new quickfix.field.AffirmStatus());
  }

  public boolean isSet(quickfix.field.AffirmStatus field) {
    return isSetField(field);
  }

  public boolean isSetAffirmStatus() {
    return isSetField(940);
  }

  public void set(quickfix.field.TradeConfirmationReferenceID value) {
    setField(value);
  }

  public quickfix.field.TradeConfirmationReferenceID get(quickfix.field.TradeConfirmationReferenceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeConfirmationReferenceID getTradeConfirmationReferenceID() throws FieldNotFound {
    return get(new quickfix.field.TradeConfirmationReferenceID());
  }

  public boolean isSet(quickfix.field.TradeConfirmationReferenceID field) {
    return isSetField(field);
  }

  public boolean isSetTradeConfirmationReferenceID() {
    return isSetField(2390);
  }

  public void set(quickfix.field.ConfirmRejReason value) {
    setField(value);
  }

  public quickfix.field.ConfirmRejReason get(quickfix.field.ConfirmRejReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ConfirmRejReason getConfirmRejReason() throws FieldNotFound {
    return get(new quickfix.field.ConfirmRejReason());
  }

  public boolean isSet(quickfix.field.ConfirmRejReason field) {
    return isSetField(field);
  }

  public boolean isSetConfirmRejReason() {
    return isSetField(774);
  }

  public void set(quickfix.field.MatchStatus value) {
    setField(value);
  }

  public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
    return get(new quickfix.field.MatchStatus());
  }

  public boolean isSet(quickfix.field.MatchStatus field) {
    return isSetField(field);
  }

  public boolean isSetMatchStatus() {
    return isSetField(573);
  }

  public void set(quickfix.fixlatest.component.MatchExceptionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchExceptionGrp get(quickfix.fixlatest.component.MatchExceptionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchExceptionGrp getMatchExceptionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchExceptionGrp());
  }

  public void set(quickfix.field.NoMatchExceptions value) {
    setField(value);
  }

  public quickfix.field.NoMatchExceptions get(quickfix.field.NoMatchExceptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchExceptions getNoMatchExceptions() throws FieldNotFound {
    return get(new quickfix.field.NoMatchExceptions());
  }

  public boolean isSet(quickfix.field.NoMatchExceptions field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchExceptions() {
    return isSetField(2772);
  }

public static class NoMatchExceptions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2773, 2774, 2775, 2776, 2777, 2778, 2779, 2780, 2797, 2798, 0};

  public NoMatchExceptions() {
    super(2772, 2773, ORDER);
  }

  public void set(quickfix.field.MatchExceptionType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionType get(quickfix.field.MatchExceptionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionType getMatchExceptionType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionType());
  }

  public boolean isSet(quickfix.field.MatchExceptionType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionType() {
    return isSetField(2773);
  }

  public void set(quickfix.field.MatchExceptionElementType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementType get(quickfix.field.MatchExceptionElementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementType getMatchExceptionElementType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementType());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementType() {
    return isSetField(2774);
  }

  public void set(quickfix.field.MatchExceptionElementName value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementName get(quickfix.field.MatchExceptionElementName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementName getMatchExceptionElementName() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementName());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementName field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementName() {
    return isSetField(2775);
  }

  public void set(quickfix.field.MatchExceptionAllocValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionAllocValue get(quickfix.field.MatchExceptionAllocValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionAllocValue getMatchExceptionAllocValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionAllocValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionAllocValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionAllocValue() {
    return isSetField(2776);
  }

  public void set(quickfix.field.MatchExceptionConfirmValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionConfirmValue get(quickfix.field.MatchExceptionConfirmValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionConfirmValue getMatchExceptionConfirmValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionConfirmValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionConfirmValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionConfirmValue() {
    return isSetField(2777);
  }

  public void set(quickfix.field.MatchExceptionToleranceValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValue get(quickfix.field.MatchExceptionToleranceValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValue getMatchExceptionToleranceValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValue() {
    return isSetField(2778);
  }

  public void set(quickfix.field.MatchExceptionToleranceValueType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValueType get(quickfix.field.MatchExceptionToleranceValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValueType getMatchExceptionToleranceValueType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValueType());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValueType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValueType() {
    return isSetField(2779);
  }

  public void set(quickfix.field.MatchExceptionText value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionText get(quickfix.field.MatchExceptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionText getMatchExceptionText() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionText());
  }

  public boolean isSet(quickfix.field.MatchExceptionText field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionText() {
    return isSetField(2780);
  }

  public void set(quickfix.field.EncodedMatchExceptionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExceptionTextLen get(quickfix.field.EncodedMatchExceptionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExceptionTextLen getEncodedMatchExceptionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExceptionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedMatchExceptionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExceptionTextLen() {
    return isSetField(2797);
  }

  public void set(quickfix.field.EncodedMatchExecptionText value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExecptionText get(quickfix.field.EncodedMatchExecptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExecptionText getEncodedMatchExecptionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExecptionText());
  }

  public boolean isSet(quickfix.field.EncodedMatchExecptionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExecptionText() {
    return isSetField(2798);
  }
}

  public void set(quickfix.fixlatest.component.MatchingDataPointGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchingDataPointGrp get(quickfix.fixlatest.component.MatchingDataPointGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchingDataPointGrp getMatchingDataPointGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchingDataPointGrp());
  }

  public void set(quickfix.field.NoMatchingDataPoints value) {
    setField(value);
  }

  public quickfix.field.NoMatchingDataPoints get(quickfix.field.NoMatchingDataPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchingDataPoints getNoMatchingDataPoints() throws FieldNotFound {
    return get(new quickfix.field.NoMatchingDataPoints());
  }

  public boolean isSet(quickfix.field.NoMatchingDataPoints field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchingDataPoints() {
    return isSetField(2781);
  }

public static class NoMatchingDataPoints extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2782, 2783, 2784, 2785, 0};

  public NoMatchingDataPoints() {
    super(2781, 2782, ORDER);
  }

  public void set(quickfix.field.MatchingDataPointIndicator value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointIndicator get(quickfix.field.MatchingDataPointIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointIndicator getMatchingDataPointIndicator() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointIndicator());
  }

  public boolean isSet(quickfix.field.MatchingDataPointIndicator field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointIndicator() {
    return isSetField(2782);
  }

  public void set(quickfix.field.MatchingDataPointValue value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointValue get(quickfix.field.MatchingDataPointValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointValue getMatchingDataPointValue() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointValue());
  }

  public boolean isSet(quickfix.field.MatchingDataPointValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointValue() {
    return isSetField(2783);
  }

  public void set(quickfix.field.MatchingDataPointType value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointType get(quickfix.field.MatchingDataPointType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointType getMatchingDataPointType() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointType());
  }

  public boolean isSet(quickfix.field.MatchingDataPointType field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointType() {
    return isSetField(2784);
  }

  public void set(quickfix.field.MatchingDataPointName value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointName get(quickfix.field.MatchingDataPointName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointName getMatchingDataPointName() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointName());
  }

  public boolean isSet(quickfix.field.MatchingDataPointName field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointName() {
    return isSetField(2785);
  }
}

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }
}
