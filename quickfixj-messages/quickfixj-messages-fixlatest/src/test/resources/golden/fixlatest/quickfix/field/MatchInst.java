/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MatchInst extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1625;

  public static final int MATCH = 1;

  public static final int DO_NOT_MATCH = 2;

  public MatchInst() {
    super(1625);
  }

  public MatchInst(Integer data) {
    super(1625, data);
  }

  public MatchInst(int data) {
    super(1625, data);
  }
}
