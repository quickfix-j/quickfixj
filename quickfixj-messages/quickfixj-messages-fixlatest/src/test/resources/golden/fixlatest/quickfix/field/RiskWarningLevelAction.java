/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskWarningLevelAction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1769;

  public static final int QUEUE_INBOUND = 0;

  public static final int QUEUE_OUTBOUND = 1;

  public static final int REJECT = 2;

  public static final int DISCONNECT = 3;

  public static final int WARNING = 4;

  public static final int PING_CREDIT_CHECK_WITH_REVALIDATION = 5;

  public static final int PING_CREDIT_CHECK_NO_REVALIDATION = 6;

  public static final int PUSH_CREDIT_CHECK_WITH_REVALIDATION = 7;

  public static final int PUSH_CREDIT_CHECK_NO_REVALIDATION = 8;

  public static final int SUSPEND = 9;

  public static final int HALT_TRADING = 10;

  public RiskWarningLevelAction() {
    super(1769);
  }

  public RiskWarningLevelAction(Integer data) {
    super(1769, data);
  }

  public RiskWarningLevelAction(int data) {
    super(1769, data);
  }
}
