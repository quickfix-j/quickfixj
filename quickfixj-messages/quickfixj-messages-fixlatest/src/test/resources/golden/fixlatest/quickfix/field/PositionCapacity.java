/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PositionCapacity extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1834;

  public static final int PRINCIPAL = 0;

  public static final int AGENT = 1;

  public static final int CUSTOMER = 2;

  public static final int COUNTERPARTY = 3;

  public PositionCapacity() {
    super(1834);
  }

  public PositionCapacity(Integer data) {
    super(1834, data);
  }

  public PositionCapacity(int data) {
    super(1834, data);
  }
}
