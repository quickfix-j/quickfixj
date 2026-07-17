/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexOptPayoutTime extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2121;

  public static final int CLOSE = 0;

  public static final int OPEN = 1;

  public static final int OFFICIAL_SETTL = 2;

  public static final int VALUATION_TIME = 3;

  public static final int EXCAHGNE_SETTL_TIME = 4;

  public static final int DERIVATIVES_CLOSE = 5;

  public static final int AS_SPECIFIED = 6;

  public ComplexOptPayoutTime() {
    super(2121);
  }

  public ComplexOptPayoutTime(Integer data) {
    super(2121, data);
  }

  public ComplexOptPayoutTime(int data) {
    super(2121, data);
  }
}
