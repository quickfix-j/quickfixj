/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeReportType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 856;

  public static final int SUBMIT = 0;

  public static final int ALLEGED = 1;

  public static final int ACCEPT = 2;

  public static final int DECLINE = 3;

  public static final int ADDENDUM = 4;

  public static final int NO = 5;

  public static final int TRADE_REPORT_CANCEL = 6;

  public static final int LOCKED_IN = 7;

  public static final int DEFAULTED = 8;

  public static final int INVALID_CMTA = 9;

  public static final int PENDED = 10;

  public static final int ALLEGED_NEW = 11;

  public static final int ALLEGED_ADDENDUM = 12;

  public static final int ALLEGED_NO = 13;

  public static final int ALLEGED_TRADE_REPORT_CANCEL = 14;

  public static final int ALLEGED_TRADE_BREAK = 15;

  public static final int VERIFY = 16;

  public static final int DISPUTE = 17;

  public static final int NON_MATERIAL_UPDATE = 18;

  public TradeReportType() {
    super(856);
  }

  public TradeReportType(Integer data) {
    super(856, data);
  }

  public TradeReportType(int data) {
    super(856, data);
  }
}
