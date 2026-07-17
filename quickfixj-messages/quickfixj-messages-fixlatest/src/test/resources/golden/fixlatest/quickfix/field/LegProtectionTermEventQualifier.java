/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegProtectionTermEventQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41634;

  public static final char RESTRUCTURING_MULTIPLE_HOLDING_OBLIGATIONS = 'H';

  public static final char RESTRUCTURING_MULTIPLE_CREDIT_EVENT_NOTICES = 'E';

  public static final char FLOATING_RATE_INTEREST_SHORTFALL = 'C';

  public LegProtectionTermEventQualifier() {
    super(41634);
  }

  public LegProtectionTermEventQualifier(Character data) {
    super(41634, data);
  }

  public LegProtectionTermEventQualifier(char data) {
    super(41634, data);
  }
}
