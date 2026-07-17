/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteRespType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 694;

  public static final int HIT = 1;

  public static final int COUNTER = 2;

  public static final int EXPIRED = 3;

  public static final int COVER = 4;

  public static final int DONE_AWAY = 5;

  public static final int PASS = 6;

  public static final int END_TRADE = 7;

  public static final int TIMED_OUT = 8;

  public static final int TIED = 9;

  public static final int TIED_COVER = 10;

  public static final int ACCEPT = 11;

  public static final int TERMINATE_CONTRACT = 12;

  public QuoteRespType() {
    super(694);
  }

  public QuoteRespType(Integer data) {
    super(694, data);
  }

  public QuoteRespType(int data) {
    super(694, data);
  }
}
