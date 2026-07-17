/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DiscretionScope extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 846;

  public static final int LOCAL = 1;

  public static final int NATIONAL = 2;

  public static final int GLOBAL = 3;

  public static final int NATIONAL_EXCLUDING_LOCAL = 4;

  public DiscretionScope() {
    super(846);
  }

  public DiscretionScope(Integer data) {
    super(846, data);
  }

  public DiscretionScope(int data) {
    super(846, data);
  }
}
