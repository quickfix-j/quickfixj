/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingLienSeniority extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1998;

  public static final int UNKNOWN = 0;

  public static final int FIRST_LIEN = 1;

  public static final int SECOND_LIEN = 2;

  public static final int THIRD_LIEN = 3;

  public UnderlyingLienSeniority() {
    super(1998);
  }

  public UnderlyingLienSeniority(Integer data) {
    super(1998, data);
  }

  public UnderlyingLienSeniority(int data) {
    super(1998, data);
  }
}
