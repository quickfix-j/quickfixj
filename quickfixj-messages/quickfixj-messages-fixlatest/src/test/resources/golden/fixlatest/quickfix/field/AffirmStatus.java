/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AffirmStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 940;

  public static final int RECEIVED = 1;

  public static final int CONFIRM_REJECTED = 2;

  public static final int AFFIRMED = 3;

  public AffirmStatus() {
    super(940);
  }

  public AffirmStatus(Integer data) {
    super(940, data);
  }

  public AffirmStatus(int data) {
    super(940, data);
  }
}
