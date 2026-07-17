/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ReturnRateQuoteTimeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42748;

  public static final int OPEN = 0;

  public static final int OFFICIAL_SETTL_PX = 1;

  public static final int XETRA = 2;

  public static final int CLOSE = 3;

  public static final int DERIVATIVES_CLOSE = 4;

  public static final int HIGH = 5;

  public static final int LOW = 6;

  public static final int AS_SPECIFIED_IN_MASTER_CONFIRMATION = 7;

  public ReturnRateQuoteTimeType() {
    super(42748);
  }

  public ReturnRateQuoteTimeType(Integer data) {
    super(42748, data);
  }

  public ReturnRateQuoteTimeType(int data) {
    super(42748, data);
  }
}
