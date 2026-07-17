/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AdjustmentType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 718;

  public static final int PROCESS_REQUEST_AS_MARGIN_DISPOSITION = 0;

  public static final int DELTA_PLUS = 1;

  public static final int DELTA_MINUS = 2;

  public static final int FINAL = 3;

  public static final int CUSTOMER_SPECIFIC_POSITION = 4;

  public AdjustmentType() {
    super(718);
  }

  public AdjustmentType(Integer data) {
    super(718, data);
  }

  public AdjustmentType(int data) {
    super(718, data);
  }
}
