/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarginReqmtInqResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1641;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_OR_UNKNOWN_INSTRUMENT = 1;

  public static final int INVALID_OR_UNKNOWN_MARGIN_CLASS = 2;

  public static final int INVALID_PARTIES = 3;

  public static final int INVALID_TRANSPORT_TYPE_REQ = 4;

  public static final int INVALID_DESTINATION_REQ = 5;

  public static final int NO_MARGIN_REQ_FOUND = 6;

  public static final int MARGIN_REQ_INQUIRY_QUALIFIER_NOT_SUPPORTED = 7;

  public static final int UNAUTHORIZED_FOR_MARGIN_REQ_INQUIRY = 8;

  public static final int OTHER = 99;

  public MarginReqmtInqResult() {
    super(1641);
  }

  public MarginReqmtInqResult(Integer data) {
    super(1641, data);
  }

  public MarginReqmtInqResult(int data) {
    super(1641, data);
  }
}
