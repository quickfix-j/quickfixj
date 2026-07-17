/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ResponseTransportType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 725;

  public static final int INBAND = 0;

  public static final int OUT_OF_BAND = 1;

  public ResponseTransportType() {
    super(725);
  }

  public ResponseTransportType(Integer data) {
    super(725, data);
  }

  public ResponseTransportType(int data) {
    super(725, data);
  }
}
