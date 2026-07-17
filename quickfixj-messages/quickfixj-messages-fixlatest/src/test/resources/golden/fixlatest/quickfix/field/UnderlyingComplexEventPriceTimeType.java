/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingComplexEventPriceTimeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2051;

  public static final int EXPIRATION = 1;

  public static final int IMMEDIATE = 2;

  public static final int SPECIFIED_DATE = 3;

  public static final int CLOSE = 4;

  public static final int OPEN = 5;

  public static final int OFFICIAL_SETTL_PRICE = 6;

  public static final int DERIVATIVES_CLOSE = 7;

  public static final int AS_SPECIFIED_MASTER_CONFIRMATION = 8;

  public UnderlyingComplexEventPriceTimeType() {
    super(2051);
  }

  public UnderlyingComplexEventPriceTimeType(Integer data) {
    super(2051, data);
  }

  public UnderlyingComplexEventPriceTimeType(int data) {
    super(2051, data);
  }
}
