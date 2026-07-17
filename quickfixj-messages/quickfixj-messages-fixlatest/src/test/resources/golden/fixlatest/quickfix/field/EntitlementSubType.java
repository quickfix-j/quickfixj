/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class EntitlementSubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2402;

  public static final int ORDER_ENTRY = 1;

  public static final int HIT_LIFT = 2;

  public static final int VIEW_INDICATIVE_PX = 3;

  public static final int VIEW_EXECUTABLE_PX = 4;

  public static final int SINGLE_QUOTE = 5;

  public static final int STREAMING_QUOTES = 6;

  public static final int SINGLE_BROKER = 7;

  public static final int MULTI_BROKERS = 8;

  public EntitlementSubType() {
    super(2402);
  }

  public EntitlementSubType(Integer data) {
    super(2402, data);
  }

  public EntitlementSubType(int data) {
    super(2402, data);
  }
}
