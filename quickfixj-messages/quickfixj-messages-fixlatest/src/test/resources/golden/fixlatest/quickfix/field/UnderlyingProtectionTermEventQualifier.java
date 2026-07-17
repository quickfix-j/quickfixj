/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class UnderlyingProtectionTermEventQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42086;

  public static final char RESTRUCTURING_MULTIPLE_HOLDING_OBLIGATIONS = 'H';

  public static final char RESTRUCTURING_MULTIPLE_CREDIT_EVENT_NOTICES = 'E';

  public static final char FLOATING_RATE_INTEREST_SHORTFALL = 'C';

  public UnderlyingProtectionTermEventQualifier() {
    super(42086);
  }

  public UnderlyingProtectionTermEventQualifier(Character data) {
    super(42086, data);
  }

  public UnderlyingProtectionTermEventQualifier(char data) {
    super(42086, data);
  }
}
