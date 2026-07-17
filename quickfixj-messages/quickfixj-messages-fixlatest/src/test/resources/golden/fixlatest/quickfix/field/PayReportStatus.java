/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PayReportStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2806;

  public static final int RECEIVED = 0;

  public static final int ACCEPTED = 1;

  public static final int REJECTED = 2;

  public static final int DISPUTED = 3;

  public PayReportStatus() {
    super(2806);
  }

  public PayReportStatus(Integer data) {
    super(2806, data);
  }

  public PayReportStatus(int data) {
    super(2806, data);
  }
}
