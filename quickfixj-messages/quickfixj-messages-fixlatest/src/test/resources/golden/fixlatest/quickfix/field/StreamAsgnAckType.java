/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamAsgnAckType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1503;

  public static final int ASSIGNMENT_ACCEPTED = 0;

  public static final int ASSIGNMENT_REJECTED = 1;

  public StreamAsgnAckType() {
    super(1503);
  }

  public StreamAsgnAckType(Integer data) {
    super(1503, data);
  }

  public StreamAsgnAckType(int data) {
    super(1503, data);
  }
}
