/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingReturnRateQuoteTimeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43047;

  public static final int OPEN = 0;

  public static final int OFFICIAL_SETTL_PX = 1;

  public static final int XETRA = 2;

  public static final int CLOSE = 3;

  public static final int DERIVATIVES_CLOSE = 4;

  public static final int HIGH = 5;

  public static final int LOW = 6;

  public static final int AS_SPECIFIED_IN_MASTER_CONFIRMATION = 7;

  public UnderlyingReturnRateQuoteTimeType() {
    super(43047);
  }

  public UnderlyingReturnRateQuoteTimeType(Integer data) {
    super(43047, data);
  }

  public UnderlyingReturnRateQuoteTimeType(int data) {
    super(43047, data);
  }
}
