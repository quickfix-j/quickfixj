/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class ReportToExch extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 113;

  public static final boolean SENDER_REPORTS = false;

  public static final boolean RECEIVER_REPORTS = true;

  public ReportToExch() {
    super(113);
  }

  public ReportToExch(Boolean data) {
    super(113, data);
  }

  public ReportToExch(boolean data) {
    super(113, data);
  }
}
