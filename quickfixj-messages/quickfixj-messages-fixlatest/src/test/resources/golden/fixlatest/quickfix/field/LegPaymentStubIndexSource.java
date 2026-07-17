/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStubIndexSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40425;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public LegPaymentStubIndexSource() {
    super(40425);
  }

  public LegPaymentStubIndexSource(Integer data) {
    super(40425, data);
  }

  public LegPaymentStubIndexSource(int data) {
    super(40425, data);
  }
}
