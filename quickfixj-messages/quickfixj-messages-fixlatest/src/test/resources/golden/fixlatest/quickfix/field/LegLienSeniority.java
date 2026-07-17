/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegLienSeniority extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2169;

  public static final int UNKNOWN = 0;

  public static final int FIRST_LIEN = 1;

  public static final int SECOND_LIEN = 2;

  public static final int THIRD_LIEN = 3;

  public LegLienSeniority() {
    super(2169);
  }

  public LegLienSeniority(Integer data) {
    super(2169, data);
  }

  public LegLienSeniority(int data) {
    super(2169, data);
  }
}
