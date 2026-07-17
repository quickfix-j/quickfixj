/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RefOrdIDReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1431;

  public static final int GTCFROM_PREVIOUS_DAY = 0;

  public static final int PARTIAL_FILL_REMAINING = 1;

  public static final int ORDER_CHANGED = 2;

  public RefOrdIDReason() {
    super(1431);
  }

  public RefOrdIDReason(Integer data) {
    super(1431, data);
  }

  public RefOrdIDReason(int data) {
    super(1431, data);
  }
}
