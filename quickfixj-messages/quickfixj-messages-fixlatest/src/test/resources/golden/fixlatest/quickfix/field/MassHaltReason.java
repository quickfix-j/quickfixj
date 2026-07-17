/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassHaltReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1681;

  public static final int NEWS_DISSEMINATION = 0;

  public static final int ORDER_INFLUX = 1;

  public static final int ORDER_IMBALANCE = 2;

  public static final int ADDITIONAL_INFORMATION = 3;

  public static final int NEWS_PENDING = 4;

  public static final int EQUIPMENT_CHANGEOVER = 5;

  public MassHaltReason() {
    super(1681);
  }

  public MassHaltReason(Integer data) {
    super(1681, data);
  }

  public MassHaltReason(int data) {
    super(1681, data);
  }
}
