/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LienSeniority extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1954;

  public static final int UNKNOWN = 0;

  public static final int FIRST_LIEN = 1;

  public static final int SECOND_LIEN = 2;

  public static final int THIRD_LIEN = 3;

  public LienSeniority() {
    super(1954);
  }

  public LienSeniority(Integer data) {
    super(1954, data);
  }

  public LienSeniority(int data) {
    super(1954, data);
  }
}
