/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamRateIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40332;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public LegPaymentStreamRateIndexSource() {
    super(40332);
  }

  public LegPaymentStreamRateIndexSource(Integer data) {
    super(40332, data);
  }

  public LegPaymentStreamRateIndexSource(int data) {
    super(40332, data);
  }
}
