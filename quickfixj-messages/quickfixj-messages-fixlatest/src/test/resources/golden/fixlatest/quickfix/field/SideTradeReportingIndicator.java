/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideTradeReportingIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2671;

  public static final int NOT_REPORTED = 0;

  public static final int ON_BOOK = 1;

  public static final int SISELLER = 2;

  public static final int SIBUYER = 3;

  public static final int NON_SISELLER = 4;

  public static final int SUB_DELEGATION_BY_FIRM = 5;

  public static final int REPORTABLE = 6;

  public static final int NON_SIBUYER = 7;

  public static final int OFF_BOOK = 8;

  public static final int NOT_REPORTABLE = 9;

  public SideTradeReportingIndicator() {
    super(2671);
  }

  public SideTradeReportingIndicator(Integer data) {
    super(2671, data);
  }

  public SideTradeReportingIndicator(int data) {
    super(2671, data);
  }
}
