/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProgRptReqs extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 414;

  public static final int BUY_SIDE_REQUESTS = 1;

  public static final int SELL_SIDE_SENDS = 2;

  public static final int REAL_TIME_EXECUTION_REPORTS = 3;

  public ProgRptReqs() {
    super(414);
  }

  public ProgRptReqs(Integer data) {
    super(414, data);
  }

  public ProgRptReqs(int data) {
    super(414, data);
  }
}
