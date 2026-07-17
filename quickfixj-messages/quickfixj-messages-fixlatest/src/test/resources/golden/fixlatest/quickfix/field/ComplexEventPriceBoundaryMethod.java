/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventPriceBoundaryMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1487;

  public static final int LESS_THAN_COMPLEX_EVENT_PRICE = 1;

  public static final int LESS_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE = 2;

  public static final int EQUAL_TO_COMPLEX_EVENT_PRICE = 3;

  public static final int GREATER_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE = 4;

  public static final int GREATER_THAN_COMPLEX_EVENT_PRICE = 5;

  public ComplexEventPriceBoundaryMethod() {
    super(1487);
  }

  public ComplexEventPriceBoundaryMethod(Integer data) {
    super(1487, data);
  }

  public ComplexEventPriceBoundaryMethod(int data) {
    super(1487, data);
  }
}
