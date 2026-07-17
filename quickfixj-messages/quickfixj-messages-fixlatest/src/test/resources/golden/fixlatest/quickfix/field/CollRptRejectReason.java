/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollRptRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2487;

  public static final int UNKNOWN_TRADE = 0;

  public static final int UNKNOWN_INSTRUMENT = 1;

  public static final int UNKNOWN_COUNTERPARTY = 2;

  public static final int UNKNOWN_POSITION = 3;

  public static final int UNACCEPTABLE_COLLATERAL = 4;

  public static final int OTHER = 99;

  public CollRptRejectReason() {
    super(2487);
  }

  public CollRptRejectReason(Integer data) {
    super(2487, data);
  }

  public CollRptRejectReason(int data) {
    super(2487, data);
  }
}
