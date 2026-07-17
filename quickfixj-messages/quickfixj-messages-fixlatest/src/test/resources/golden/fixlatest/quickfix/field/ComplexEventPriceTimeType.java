/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventPriceTimeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1489;

  public static final int EXPIRATION = 1;

  public static final int IMMEDIATE = 2;

  public static final int SPECIFIED_DATE = 3;

  public static final int CLOSE = 4;

  public static final int OPEN = 5;

  public static final int OFFICIAL_SETTL_PRICE = 6;

  public static final int DERIVATIVES_CLOSE = 7;

  public static final int AS_SPECIFIED_MASTER_CONFIRMATION = 8;

  public ComplexEventPriceTimeType() {
    super(1489);
  }

  public ComplexEventPriceTimeType(Integer data) {
    super(1489, data);
  }

  public ComplexEventPriceTimeType(int data) {
    super(1489, data);
  }
}
