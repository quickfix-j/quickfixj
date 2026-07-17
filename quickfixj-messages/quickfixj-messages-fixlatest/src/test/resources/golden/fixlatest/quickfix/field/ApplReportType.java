/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ApplReportType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1426;

  public static final int APPL_SEQ_NUM_RESET = 0;

  public static final int LAST_MESSAGE_SENT = 1;

  public static final int APPLICATION_ALIVE = 2;

  public static final int RESEND_COMPLETE = 3;

  public ApplReportType() {
    super(1426);
  }

  public ApplReportType(Integer data) {
    super(1426, data);
  }

  public ApplReportType(int data) {
    super(1426, data);
  }
}
