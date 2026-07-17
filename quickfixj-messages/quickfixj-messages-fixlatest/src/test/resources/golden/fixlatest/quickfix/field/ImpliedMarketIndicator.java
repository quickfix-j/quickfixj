/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ImpliedMarketIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1144;

  public static final int NOT_IMPLIED = 0;

  public static final int IMPLIED_IN = 1;

  public static final int IMPLIED_OUT = 2;

  public static final int BOTH_IMPLIED_IN_AND_IMPLIED_OUT = 3;

  public ImpliedMarketIndicator() {
    super(1144);
  }

  public ImpliedMarketIndicator(Integer data) {
    super(1144, data);
  }

  public ImpliedMarketIndicator(int data) {
    super(1144, data);
  }
}
