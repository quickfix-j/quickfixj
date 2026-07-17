/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingOptPayoutType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2028;

  public static final int VANILLA = 1;

  public static final int CAPPED = 2;

  public static final int BINARY = 3;

  public static final int ASIAN = 4;

  public static final int BARRIER = 5;

  public static final int DIGITAL_BARRIER = 6;

  public static final int LOOKBACK = 7;

  public static final int OTHER_PATH_DEPENDENT = 8;

  public static final int OTHER = 99;

  public UnderlyingOptPayoutType() {
    super(2028);
  }

  public UnderlyingOptPayoutType(Integer data) {
    super(2028, data);
  }

  public UnderlyingOptPayoutType(int data) {
    super(2028, data);
  }
}
