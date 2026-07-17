/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosMaintAction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 712;

  public static final int NEW = 1;

  public static final int REPLACE = 2;

  public static final int CANCEL = 3;

  public static final int REVERSE = 4;

  public PosMaintAction() {
    super(712);
  }

  public PosMaintAction(Integer data) {
    super(712, data);
  }

  public PosMaintAction(int data) {
    super(712, data);
  }
}
