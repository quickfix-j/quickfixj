/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocHandlInst extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 209;

  public static final int MATCH = 1;

  public static final int FORWARD = 2;

  public static final int FORWARD_AND_MATCH = 3;

  public static final int AUTO_CLAIM_GIVE_UP = 4;

  public AllocHandlInst() {
    super(209);
  }

  public AllocHandlInst(Integer data) {
    super(209, data);
  }

  public AllocHandlInst(int data) {
    super(209, data);
  }
}
