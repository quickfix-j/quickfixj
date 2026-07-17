/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegOptPayoutType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2193;

  public static final int VANILLA = 1;

  public static final int CAPPED = 2;

  public static final int BINARY = 3;

  public static final int ASIAN = 4;

  public static final int BARRIER = 5;

  public static final int DIGITAL_BARRIER = 6;

  public static final int LOOKBACK = 7;

  public static final int OTHER_PATH_DEPENDENT = 8;

  public static final int OTHER = 99;

  public LegOptPayoutType() {
    super(2193);
  }

  public LegOptPayoutType(Integer data) {
    super(2193, data);
  }

  public LegOptPayoutType(int data) {
    super(2193, data);
  }
}
