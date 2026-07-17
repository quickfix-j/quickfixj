/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class HaltReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 327;

  public static final int NEWS_DISSEMINATION = 0;

  public static final int ORDER_INFLUX = 1;

  public static final int ORDER_IMBALANCE = 2;

  public static final int ADDITIONAL_INFORMATION = 3;

  public static final int NEWS_PENDING = 4;

  public static final int EQUIPMENT_CHANGEOVER = 5;

  public HaltReason() {
    super(327);
  }

  public HaltReason(Integer data) {
    super(327, data);
  }

  public HaltReason(int data) {
    super(327, data);
  }
}
