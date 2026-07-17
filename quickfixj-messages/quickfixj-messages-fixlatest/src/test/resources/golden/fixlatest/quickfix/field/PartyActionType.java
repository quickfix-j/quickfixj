/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyActionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2329;

  public static final int SUSPEND = 0;

  public static final int HALT_TRADING = 1;

  public static final int REINSTATE = 2;

  public PartyActionType() {
    super(2329);
  }

  public PartyActionType(Integer data) {
    super(2329, data);
  }

  public PartyActionType(int data) {
    super(2329, data);
  }
}
