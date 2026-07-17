/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MoneyLaunderingStatus extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 481;

  public static final char PASSED = 'Y';

  public static final char NOT_CHECKED = 'N';

  public static final char EXEMPT_BELOW_LIMIT = '1';

  public static final char EXEMPT_MONEY_TYPE = '2';

  public static final char EXEMPT_AUTHORISED = '3';

  public MoneyLaunderingStatus() {
    super(481);
  }

  public MoneyLaunderingStatus(Character data) {
    super(481, data);
  }

  public MoneyLaunderingStatus(char data) {
    super(481, data);
  }
}
