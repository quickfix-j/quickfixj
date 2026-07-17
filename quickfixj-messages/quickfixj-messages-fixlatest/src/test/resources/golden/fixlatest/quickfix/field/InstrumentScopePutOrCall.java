/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class InstrumentScopePutOrCall extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1553;

  public static final int PUT = 0;

  public static final int CALL = 1;

  public static final int OTHER = 2;

  public static final int CHOOSER = 3;

  public InstrumentScopePutOrCall() {
    super(1553);
  }

  public InstrumentScopePutOrCall(Integer data) {
    super(1553, data);
  }

  public InstrumentScopePutOrCall(int data) {
    super(1553, data);
  }
}
