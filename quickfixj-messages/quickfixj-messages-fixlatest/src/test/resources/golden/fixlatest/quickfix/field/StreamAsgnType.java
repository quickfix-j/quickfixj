/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamAsgnType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1617;

  public static final int ASSIGNMENT = 1;

  public static final int REJECTED = 2;

  public static final int TERMINATE = 3;

  public StreamAsgnType() {
    super(1617);
  }

  public StreamAsgnType(Integer data) {
    super(1617, data);
  }

  public StreamAsgnType(int data) {
    super(1617, data);
  }
}
