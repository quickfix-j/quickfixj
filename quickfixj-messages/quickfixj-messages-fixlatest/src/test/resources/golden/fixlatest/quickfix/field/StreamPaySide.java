/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamPaySide extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40052;

  public static final int BUY = 1;

  public static final int SELL = 2;

  public StreamPaySide() {
    super(40052);
  }

  public StreamPaySide(Integer data) {
    super(40052, data);
  }

  public StreamPaySide(int data) {
    super(40052, data);
  }
}
