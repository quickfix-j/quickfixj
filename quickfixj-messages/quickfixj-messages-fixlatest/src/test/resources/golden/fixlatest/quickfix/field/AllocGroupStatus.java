/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocGroupStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2767;

  public static final int ADDED = 0;

  public static final int CANCELED = 1;

  public static final int REPLACED = 2;

  public static final int CHANGED = 3;

  public static final int PENDING = 4;

  public AllocGroupStatus() {
    super(2767);
  }

  public AllocGroupStatus(Integer data) {
    super(2767, data);
  }

  public AllocGroupStatus(int data) {
    super(2767, data);
  }
}
