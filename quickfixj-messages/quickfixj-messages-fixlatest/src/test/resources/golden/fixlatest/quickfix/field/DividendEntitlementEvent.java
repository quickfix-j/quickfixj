/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DividendEntitlementEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42246;

  public static final int EX_DATE = 0;

  public static final int RECORD_DATE = 1;

  public DividendEntitlementEvent() {
    super(42246);
  }

  public DividendEntitlementEvent(Integer data) {
    super(42246, data);
  }

  public DividendEntitlementEvent(int data) {
    super(42246, data);
  }
}
