/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegLoanFacility extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2170;

  public static final int BRIDGE_LOAN = 0;

  public static final int LETTER_OF_CREDIT = 1;

  public static final int REVOLVING_LOAN = 2;

  public static final int SWINGLINE_FUNDING = 3;

  public static final int TERM_LOAN = 4;

  public static final int TRADE_CLAIM = 5;

  public LegLoanFacility() {
    super(2170);
  }

  public LegLoanFacility(Integer data) {
    super(2170, data);
  }

  public LegLoanFacility(int data) {
    super(2170, data);
  }
}
