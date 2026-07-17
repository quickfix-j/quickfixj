/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitCheckModelType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2339;

  public static final int NONE = 0;

  public static final int PLUS_ONE_MODEL = 1;

  public static final int PING_MODEL = 2;

  public static final int PUSH_MODEL = 3;

  public RiskLimitCheckModelType() {
    super(2339);
  }

  public RiskLimitCheckModelType(Integer data) {
    super(2339, data);
  }

  public RiskLimitCheckModelType(int data) {
    super(2339, data);
  }
}
