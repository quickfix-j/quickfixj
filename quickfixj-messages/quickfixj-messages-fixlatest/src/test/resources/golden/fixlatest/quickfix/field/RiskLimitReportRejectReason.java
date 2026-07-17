/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitReportRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2317;

  public static final int UNK_RISK_LMT_RPRT_ID = 0;

  public static final int UNK_PTY = 1;

  public static final int OTHER = 99;

  public RiskLimitReportRejectReason() {
    super(2317);
  }

  public RiskLimitReportRejectReason(Integer data) {
    super(2317, data);
  }

  public RiskLimitReportRejectReason(int data) {
    super(2317, data);
  }
}
