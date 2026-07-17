/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LoanFacility extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1955;

  public static final int BRIDGE_LOAN = 0;

  public static final int LETTER_OF_CREDIT = 1;

  public static final int REVOLVING_LOAN = 2;

  public static final int SWINGLINE_FUNDING = 3;

  public static final int TERM_LOAN = 4;

  public static final int TRADE_CLAIM = 5;

  public LoanFacility() {
    super(1955);
  }

  public LoanFacility(Integer data) {
    super(1955, data);
  }

  public LoanFacility(int data) {
    super(1955, data);
  }
}
