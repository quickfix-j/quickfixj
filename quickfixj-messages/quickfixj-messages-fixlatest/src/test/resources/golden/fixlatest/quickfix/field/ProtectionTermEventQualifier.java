/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ProtectionTermEventQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40200;

  public static final char RESTRUCTURING_MULTIPLE_HOLDING_OBLIGATIONS = 'H';

  public static final char RESTRUCTURING_MULTIPLE_CREDIT_EVENT_NOTICES = 'E';

  public static final char FLOATING_RATE_INTEREST_SHORTFALL = 'C';

  public ProtectionTermEventQualifier() {
    super(40200);
  }

  public ProtectionTermEventQualifier(Character data) {
    super(40200, data);
  }

  public ProtectionTermEventQualifier(char data) {
    super(40200, data);
  }
}
