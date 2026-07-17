/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class EntitlementResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1884;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_PARTY = 1;

  public static final int INVALID_RELATED_PARTY = 2;

  public static final int INVALID_ENTITLEMENT_TYPE = 3;

  public static final int INVALID_ENTITLEMENT_ID = 4;

  public static final int INVALID_ENTITLEMENT_ATTRIBUTE = 5;

  public static final int INVALID_INSTRUMENT_SCOPE = 6;

  public static final int INVALID_MARKET_SEGMENT_SCOPE = 7;

  public static final int INVALID_START_DATE = 8;

  public static final int INVALID_END_DATE = 9;

  public static final int INSTRUMENT_SCOPE_NOT_SUPPORTED = 10;

  public static final int MARKET_SEGMENT_SCOPE_NOT_SUPPORTED = 11;

  public static final int ENTITLEMENT_NOT_APPROVED_FOR_PARTY = 12;

  public static final int ENTITLEMENT_ALREADY_DEFINED_FOR_PARTY = 13;

  public static final int INSTRUMENT_NOT_APPROVED_FOR_PARTY = 14;

  public static final int NOT_AUTHORIZED = 98;

  public static final int OTHER = 99;

  public EntitlementResult() {
    super(1884);
  }

  public EntitlementResult(Integer data) {
    super(1884, data);
  }

  public EntitlementResult(int data) {
    super(1884, data);
  }
}
