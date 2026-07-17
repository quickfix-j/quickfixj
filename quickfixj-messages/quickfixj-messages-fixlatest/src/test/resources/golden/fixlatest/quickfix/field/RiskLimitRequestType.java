/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1760;

  public static final int DEFINITIONS = 1;

  public static final int UTILIZATION = 2;

  public static final int DEFINITIONS_AND_UTILIZATIONS = 3;

  public RiskLimitRequestType() {
    super(1760);
  }

  public RiskLimitRequestType(Integer data) {
    super(1760, data);
  }

  public RiskLimitRequestType(int data) {
    super(1760, data);
  }
}
