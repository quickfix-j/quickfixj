/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamAsgnReqType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1498;

  public static final int STREAM_ASSIGNMENT_FOR_NEW_CUSTOMER = 1;

  public static final int STREAM_ASSIGNMENT_FOR_EXISTING_CUSTOMER = 2;

  public StreamAsgnReqType() {
    super(1498);
  }

  public StreamAsgnReqType(Integer data) {
    super(1498, data);
  }

  public StreamAsgnReqType(int data) {
    super(1498, data);
  }
}
