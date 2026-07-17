/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarginDirection extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2851;

  public static final int POSTED = 0;

  public static final int RECEIVED = 1;

  public MarginDirection() {
    super(2851);
  }

  public MarginDirection(Integer data) {
    super(2851, data);
  }

  public MarginDirection(int data) {
    super(2851, data);
  }
}
