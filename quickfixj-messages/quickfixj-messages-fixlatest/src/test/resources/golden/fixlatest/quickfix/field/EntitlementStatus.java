/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class EntitlementStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1883;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_CHANGES = 1;

  public static final int REJECTED = 2;

  public static final int PENDING = 3;

  public static final int REQUESTED = 4;

  public static final int DEFERRED = 5;

  public EntitlementStatus() {
    super(1883);
  }

  public EntitlementStatus(Integer data) {
    super(1883, data);
  }

  public EntitlementStatus(int data) {
    super(1883, data);
  }
}
