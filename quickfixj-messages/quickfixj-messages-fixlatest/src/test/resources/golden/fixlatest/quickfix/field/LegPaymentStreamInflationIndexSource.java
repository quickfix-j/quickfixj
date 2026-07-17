/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamInflationIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40354;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public LegPaymentStreamInflationIndexSource() {
    super(40354);
  }

  public LegPaymentStreamInflationIndexSource(Integer data) {
    super(40354, data);
  }

  public LegPaymentStreamInflationIndexSource(int data) {
    super(40354, data);
  }
}
