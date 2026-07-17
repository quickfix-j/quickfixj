/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitCheckRequestResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2326;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_PARTY = 1;

  public static final int REQ_EXCEEDS_CREDIT_LIMIT = 2;

  public static final int REQ_EXCEEDS_CLIP_SIZE_LIMIT = 3;

  public static final int REQ_EXCEEDS_MAX_NOTIONAL = 4;

  public static final int OTHER = 99;

  public RiskLimitCheckRequestResult() {
    super(2326);
  }

  public RiskLimitCheckRequestResult(Integer data) {
    super(2326, data);
  }

  public RiskLimitCheckRequestResult(int data) {
    super(2326, data);
  }
}
