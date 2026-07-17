/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RelatedOrderIDSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2888;

  public static final int NON_FIXSOURCE = 0;

  public static final int SYSTEM_ORDER_IDENTIFIER = 1;

  public static final int CLIENT_ORDER_IDENTIFIER = 2;

  public static final int SECONDARY_ORDER_IDENTIFIER = 3;

  public static final int SECONDARY_CLIENT_ORDER_IDENTIFIER = 4;

  public RelatedOrderIDSource() {
    super(2888);
  }

  public RelatedOrderIDSource(Integer data) {
    super(2888, data);
  }

  public RelatedOrderIDSource(int data) {
    super(2888, data);
  }
}
