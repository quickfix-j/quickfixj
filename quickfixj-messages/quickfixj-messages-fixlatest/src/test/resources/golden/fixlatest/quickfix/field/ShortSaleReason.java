/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ShortSaleReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 853;

  public static final int DEALER_SOLD_SHORT = 0;

  public static final int DEALER_SOLD_SHORT_EXEMPT = 1;

  public static final int SELLING_CUSTOMER_SOLD_SHORT = 2;

  public static final int SELLING_CUSTOMER_SOLD_SHORT_EXEMPT = 3;

  public static final int QUALIFIED_SERVICE_REPRESENTATIVE = 4;

  public static final int QSROR_AGUCONTRA_SIDE_SOLD_SHORT_EXEMPT = 5;

  public ShortSaleReason() {
    super(853);
  }

  public ShortSaleReason(Integer data) {
    super(853, data);
  }

  public ShortSaleReason(int data) {
    super(853, data);
  }
}
