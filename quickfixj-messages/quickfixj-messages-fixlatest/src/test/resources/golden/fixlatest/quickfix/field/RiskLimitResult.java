/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1764;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_PARTY = 1;

  public static final int INVALID_RELATED_PARTY = 2;

  public static final int INVALID_RISK_LIMIT_TYPE = 3;

  public static final int INVALID_RISK_LIMIT_ID = 4;

  public static final int INVALID_RISK_LIMIT_AMOUNT = 5;

  public static final int INVALID_RISK_WARNING_LEVEL_ACTION = 6;

  public static final int INVALID_RISK_INSTRUMENT_SCOPE = 7;

  public static final int RISK_LIMIT_ACTIONS_NOT_SUPPORTED = 8;

  public static final int WARNING_LEVELS_NOT_SUPPORTED = 9;

  public static final int WARNING_LEVEL_ACTIONS_NOT_SUPPORTED = 10;

  public static final int RISK_INSTRUMENT_SCOPE_NOT_SUPPORTED = 11;

  public static final int RISK_LIMIT_NOT_APPROVED_FOR_PARTY = 12;

  public static final int RISK_LIMIT_ALREADY_DEFINED_FOR_PARTY = 13;

  public static final int INSTRUMENT_NOT_APPROVED_FOR_PARTY = 14;

  public static final int NOT_AUTHORIZED = 98;

  public static final int OTHER = 99;

  public RiskLimitResult() {
    super(1764);
  }

  public RiskLimitResult(Integer data) {
    super(1764, data);
  }

  public RiskLimitResult(int data) {
    super(1764, data);
  }
}
