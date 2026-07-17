/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ValueCheckAction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1870;

  public static final int DO_NOT_CHECK = 0;

  public static final int CHECK = 1;

  public static final int BEST_EFFORT = 2;

  public ValueCheckAction() {
    super(1870);
  }

  public ValueCheckAction(Integer data) {
    super(1870, data);
  }

  public ValueCheckAction(int data) {
    super(1870, data);
  }
}
