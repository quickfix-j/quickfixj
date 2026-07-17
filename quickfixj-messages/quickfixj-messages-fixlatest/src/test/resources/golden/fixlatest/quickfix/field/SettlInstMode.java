/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SettlInstMode extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 160;

  public static final char DEFAULT = '0';

  public static final char STANDING_INSTRUCTIONS_PROVIDED = '1';

  public static final char SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING = '2';

  public static final char SPECIFIC_ALLOCATION_ACCOUNT_STANDING = '3';

  public static final char SPECIFIC_ORDER_FOR_ASINGLE_ACCOUNT = '4';

  public static final char REQUEST_REJECT = '5';

  public SettlInstMode() {
    super(160);
  }

  public SettlInstMode(Character data) {
    super(160, data);
  }

  public SettlInstMode(char data) {
    super(160, data);
  }
}
