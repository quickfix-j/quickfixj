/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollAsgnTransType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 903;

  public static final int NEW = 0;

  public static final int REPLACE = 1;

  public static final int CANCEL = 2;

  public static final int RELEASE = 3;

  public static final int REVERSE = 4;

  public CollAsgnTransType() {
    super(903);
  }

  public CollAsgnTransType(Integer data) {
    super(903, data);
  }

  public CollAsgnTransType(int data) {
    super(903, data);
  }
}
