/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ReferenceDataDateType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2748;

  public static final int ADMIT_TO_TRADE_REQUEST_DATE = 0;

  public static final int ADMIT_TO_TRADE_APPROVAL_DATE = 1;

  public static final int ADMIT_TO_TRADE_OR_FIRST_TRADE_DATE = 2;

  public static final int TERMINATION_DATE = 3;

  public ReferenceDataDateType() {
    super(2748);
  }

  public ReferenceDataDateType(Integer data) {
    super(2748, data);
  }

  public ReferenceDataDateType(int data) {
    super(2748, data);
  }
}
