/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NonDeliverableFixingDateType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40827;

  public static final int UNADJUSTED = 0;

  public static final int ADJUSTED = 1;

  public NonDeliverableFixingDateType() {
    super(40827);
  }

  public NonDeliverableFixingDateType(Integer data) {
    super(40827, data);
  }

  public NonDeliverableFixingDateType(int data) {
    super(40827, data);
  }
}
