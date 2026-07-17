/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class CorporateAction extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 292;

  public static final String EX_DIVIDEND = "A";

  public static final String EX_DISTRIBUTION = "B";

  public static final String EX_RIGHTS = "C";

  public static final String NEW = "D";

  public static final String EX_INTEREST = "E";

  public static final String CASH_DIVIDEND = "F";

  public static final String STOCK_DIVIDEND = "G";

  public static final String NON_INTEGER_STOCK_SPLIT = "H";

  public static final String REVERSE_STOCK_SPLIT = "I";

  public static final String STANDARD_INTEGER_STOCK_SPLIT = "J";

  public static final String POSITION_CONSOLIDATION = "K";

  public static final String LIQUIDATION_REORGANIZATION = "L";

  public static final String MERGER_REORGANIZATION = "M";

  public static final String RIGHTS_OFFERING = "N";

  public static final String SHAREHOLDER_MEETING = "O";

  public static final String SPINOFF = "P";

  public static final String TENDER_OFFER = "Q";

  public static final String WARRANT = "R";

  public static final String SPECIAL_ACTION = "S";

  public static final String SYMBOL_CONVERSION = "T";

  public static final String CUSIP = "U";

  public static final String LEAP_ROLLOVER = "V";

  public static final String SUCCESSION_EVENT = "W";

  public CorporateAction() {
    super(292);
  }

  public CorporateAction(String data) {
    super(292, data);
  }
}
