/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PegScope extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 840;

  public static final int LOCAL = 1;

  public static final int NATIONAL = 2;

  public static final int GLOBAL = 3;

  public static final int NATIONAL_EXCLUDING_LOCAL = 4;

  public PegScope() {
    super(840);
  }

  public PegScope(Integer data) {
    super(840, data);
  }

  public PegScope(int data) {
    super(840, data);
  }
}
