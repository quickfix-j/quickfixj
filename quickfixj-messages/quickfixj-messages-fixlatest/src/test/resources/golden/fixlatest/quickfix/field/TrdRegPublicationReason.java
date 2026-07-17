/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TrdRegPublicationReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2670;

  public static final int NO_BOOK_ORDER_DUE_TO_AVERAGE_SPREAD_PRICE = 0;

  public static final int NO_BOOK_ORDER_DUE_TO_REF_PRICE = 1;

  public static final int NO_BOOK_ORDER_DUE_TO_OTHER_CONDITIONS = 2;

  public static final int NO_PUBLIC_PRICE_DUE_TO_REF_PRICE = 3;

  public static final int NO_PUBLIC_PRICE_DUE_TO_ILLIQUID = 4;

  public static final int NO_PUBLIC_PRICE_DUE_TO_ORDER_SIZE = 5;

  public static final int DEFERRAL_DUE_TO_LARGE_IN_SCALE = 6;

  public static final int DEFERRAL_DUE_TO_ILLIQUID = 7;

  public static final int DEFERRAL_DUE_TO_SIZE_SPECIFIC = 8;

  public static final int NO_PUBLIC_PRICE_DUE_TO_LARGE_IN_SCALE = 9;

  public static final int NO_PUBLIC_PRICE_SIZE_DUE_TO_ORDER_HIDDEN = 10;

  public static final int EXEMPTED_DUE_TO_SECURITIES_FINANCING_TRANSACTION = 11;

  public static final int EXEMPTED_DUE_TO_ESCBPOLICY_TRANSACTION = 12;

  public static final int EXCEPTION_DUE_TO_REPORT_BY_PAPER = 13;

  public static final int EXCEPTION_DUE_TO_TRADE_EXECUTED_WITH_NON_REPORTING_PARTY = 14;

  public static final int EXCEPTION_DUE_TO_INTRA_FIRM_ORDER = 15;

  public static final int REPORTED_OUTSIDE_REPORTING_HOURS = 16;

  public TrdRegPublicationReason() {
    super(2670);
  }

  public TrdRegPublicationReason(Integer data) {
    super(2670, data);
  }

  public TrdRegPublicationReason(int data) {
    super(2670, data);
  }
}
