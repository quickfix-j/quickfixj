/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderOwnershipIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2679;

  public static final int NO_CHANGE = 0;

  public static final int EXECUTING_PARTY_CHANGE = 1;

  public static final int ENTERING_PARTY_CHANGE = 2;

  public static final int SPECIFIED_PARTY_CHANGE = 3;

  public OrderOwnershipIndicator() {
    super(2679);
  }

  public OrderOwnershipIndicator(Integer data) {
    super(2679, data);
  }

  public OrderOwnershipIndicator(int data) {
    super(2679, data);
  }
}
