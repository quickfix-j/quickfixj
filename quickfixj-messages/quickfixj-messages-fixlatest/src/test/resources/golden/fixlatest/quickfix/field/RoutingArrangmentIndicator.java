/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RoutingArrangmentIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2883;

  public static final int NO_ROUTING_ARRANGMENT_IN_PLACE = 0;

  public static final int ROUTING_ARRANGEMENT_IN_PLACE = 1;

  public RoutingArrangmentIndicator() {
    super(2883);
  }

  public RoutingArrangmentIndicator(Integer data) {
    super(2883, data);
  }

  public RoutingArrangmentIndicator(int data) {
    super(2883, data);
  }
}
