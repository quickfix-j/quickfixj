/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocSettlInstType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 780;

  public static final int USE_DEFAULT_INSTRUCTIONS = 0;

  public static final int DERIVE_FROM_PARAMETERS_PROVIDED = 1;

  public static final int FULL_DETAILS_PROVIDED = 2;

  public static final int SSIDBIDS_PROVIDED = 3;

  public static final int PHONE_FOR_INSTRUCTIONS = 4;

  public AllocSettlInstType() {
    super(780);
  }

  public AllocSettlInstType(Integer data) {
    super(780, data);
  }

  public AllocSettlInstType(int data) {
    super(780, data);
  }
}
