/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosMaintResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 723;

  public static final int SUCCESSFUL_COMPLETION = 0;

  public static final int REJECTED = 1;

  public static final int OTHER = 99;

  public PosMaintResult() {
    super(723);
  }

  public PosMaintResult(Integer data) {
    super(723, data);
  }

  public PosMaintResult(int data) {
    super(723, data);
  }
}
