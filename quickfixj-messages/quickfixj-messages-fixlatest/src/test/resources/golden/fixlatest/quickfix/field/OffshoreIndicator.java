/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OffshoreIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2795;

  public static final int REGULAR = 0;

  public static final int OFFSHORE = 1;

  public static final int ONSHORE = 2;

  public OffshoreIndicator() {
    super(2795);
  }

  public OffshoreIndicator(Integer data) {
    super(2795, data);
  }

  public OffshoreIndicator(int data) {
    super(2795, data);
  }
}
