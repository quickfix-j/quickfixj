/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderRelationship extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2890;

  public static final int NOT_SPECIFIED = 0;

  public static final int ORDER_AGGREGATION = 1;

  public static final int ORDER_SPLIT = 2;

  public OrderRelationship() {
    super(2890);
  }

  public OrderRelationship(Integer data) {
    super(2890, data);
  }

  public OrderRelationship(int data) {
    super(2890, data);
  }
}
