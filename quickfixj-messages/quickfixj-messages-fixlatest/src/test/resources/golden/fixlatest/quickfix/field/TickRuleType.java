/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TickRuleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1209;

  public static final int REGULAR_TRADING = 0;

  public static final int VARIABLE_CABINET = 1;

  public static final int FIXED_CABINET = 2;

  public static final int TRADED_AS_ASPREAD_LEG = 3;

  public static final int SETTLED_AS_ASPREAD_LEG = 4;

  public static final int TRADED_AS_SPREAD = 5;

  public TickRuleType() {
    super(1209);
  }

  public TickRuleType(Integer data) {
    super(1209, data);
  }

  public TickRuleType(int data) {
    super(1209, data);
  }
}
