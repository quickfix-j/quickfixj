/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LimitAmtType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1631;

  public static final int CREDIT_LIMIT = 0;

  public static final int GROSS_POSITION_LIMIT = 1;

  public static final int NET_POSITION_LIMIT = 2;

  public static final int RISK_EXPOSURE_LIMIT = 3;

  public static final int LONG_POSITION_LIMIT = 4;

  public static final int SHORT_POSITION_LIMIT = 5;

  public LimitAmtType() {
    super(1631);
  }

  public LimitAmtType(Integer data) {
    super(1631, data);
  }

  public LimitAmtType(int data) {
    super(1631, data);
  }
}
