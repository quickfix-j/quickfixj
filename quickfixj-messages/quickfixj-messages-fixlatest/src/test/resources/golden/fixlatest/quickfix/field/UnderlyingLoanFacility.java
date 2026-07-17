/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingLoanFacility extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1999;

  public static final int BRIDGE_LOAN = 0;

  public static final int LETTER_OF_CREDIT = 1;

  public static final int REVOLVING_LOAN = 2;

  public static final int SWINGLINE_FUNDING = 3;

  public static final int TERM_LOAN = 4;

  public static final int TRADE_CLAIM = 5;

  public UnderlyingLoanFacility() {
    super(1999);
  }

  public UnderlyingLoanFacility(Integer data) {
    super(1999, data);
  }

  public UnderlyingLoanFacility(int data) {
    super(1999, data);
  }
}
