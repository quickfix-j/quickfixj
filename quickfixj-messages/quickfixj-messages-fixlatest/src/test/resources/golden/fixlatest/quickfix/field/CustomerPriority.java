/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CustomerPriority extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2570;

  public static final int NO_PRIORITY = 0;

  public static final int UNCONDITIONAL_PRIORITY = 1;

  public CustomerPriority() {
    super(2570);
  }

  public CustomerPriority(Integer data) {
    super(2570, data);
  }

  public CustomerPriority(int data) {
    super(2570, data);
  }
}
