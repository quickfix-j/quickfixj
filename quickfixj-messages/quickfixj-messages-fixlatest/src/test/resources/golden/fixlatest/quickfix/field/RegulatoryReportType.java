/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RegulatoryReportType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1934;

  public static final int RT = 0;

  public static final int PET = 1;

  public static final int SNAPSHOT = 2;

  public static final int CONFIRMATION = 3;

  public static final int RTPET = 4;

  public static final int PETCONFIRMATION = 5;

  public static final int RTPETCONFIRMATION = 6;

  public static final int POST_TRADE = 7;

  public static final int VERIFICATION = 8;

  public static final int PST_TRD_EVNT = 9;

  public static final int PST_TRD_EVNT_RTREPORTABLE = 10;

  public static final int LMTF = 11;

  public static final int DATF = 12;

  public static final int VOLO = 13;

  public static final int FWAF = 14;

  public static final int IDAF = 15;

  public static final int VOLW = 16;

  public static final int FULF = 17;

  public static final int FULA = 18;

  public static final int FULV = 19;

  public static final int FULJ = 20;

  public static final int COAF = 21;

  public static final int ORDER = 22;

  public static final int CHILD_ORDER = 23;

  public static final int ORDER_ROUTE = 24;

  public static final int TRADE = 25;

  public static final int QUOTE = 26;

  public static final int SUPPLEMENT = 27;

  public static final int NEW_TRANSACTION = 28;

  public static final int TRANSACTION_CORRECTION = 29;

  public static final int TRANSACTION_MODIFICATION = 30;

  public static final int COLLATERAL_UPDATE = 31;

  public static final int MARGIN_UPDATE = 32;

  public static final int TRANSACTION_REPORTED_IN_ERROR = 33;

  public static final int TERMINATION_EARLY_TERMINATION = 34;

  public RegulatoryReportType() {
    super(1934);
  }

  public RegulatoryReportType(Integer data) {
    super(1934, data);
  }

  public RegulatoryReportType(int data) {
    super(1934, data);
  }
}
