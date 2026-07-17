/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OptPayoutType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1482;

  public static final int VANILLA = 1;

  public static final int CAPPED = 2;

  public static final int BINARY = 3;

  public static final int ASIAN = 4;

  public static final int BARRIER = 5;

  public static final int DIGITAL_BARRIER = 6;

  public static final int LOOKBACK = 7;

  public static final int OTHER_PATH_DEPENDENT = 8;

  public static final int OTHER = 99;

  public OptPayoutType() {
    super(1482);
  }

  public OptPayoutType(Integer data) {
    super(1482, data);
  }

  public OptPayoutType(int data) {
    super(1482, data);
  }
}
