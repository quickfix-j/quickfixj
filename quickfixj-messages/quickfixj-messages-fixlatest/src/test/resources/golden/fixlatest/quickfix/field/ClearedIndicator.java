/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ClearedIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1832;

  public static final int NOT_CLEARED = 0;

  public static final int CLEARED = 1;

  public static final int SUBMITTED = 2;

  public static final int REJECTED = 3;

  public ClearedIndicator() {
    super(1832);
  }

  public ClearedIndicator(Integer data) {
    super(1832, data);
  }

  public ClearedIndicator(int data) {
    super(1832, data);
  }
}
