/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeReportTransType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 487;

  public static final int NEW = 0;

  public static final int CANCEL = 1;

  public static final int REPLACE = 2;

  public static final int RELEASE = 3;

  public static final int REVERSE = 4;

  public static final int CANCEL_DUE_TO_BACK_OUT_OF_TRADE = 5;

  public TradeReportTransType() {
    super(487);
  }

  public TradeReportTransType(Integer data) {
    super(487, data);
  }

  public TradeReportTransType(int data) {
    super(487, data);
  }
}
