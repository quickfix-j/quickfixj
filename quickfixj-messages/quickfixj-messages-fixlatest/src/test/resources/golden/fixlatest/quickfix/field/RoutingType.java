/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RoutingType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 216;

  public static final int TARGET_FIRM = 1;

  public static final int TARGET_LIST = 2;

  public static final int BLOCK_FIRM = 3;

  public static final int BLOCK_LIST = 4;

  public static final int TARGET_PERSON = 5;

  public static final int BLOCK_PERSON = 6;

  public RoutingType() {
    super(216);
  }

  public RoutingType(Integer data) {
    super(216, data);
  }

  public RoutingType(int data) {
    super(216, data);
  }
}
