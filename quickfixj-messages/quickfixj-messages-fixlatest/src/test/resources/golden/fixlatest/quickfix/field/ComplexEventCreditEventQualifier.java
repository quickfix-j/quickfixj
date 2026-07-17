/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ComplexEventCreditEventQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41006;

  public static final char RESTRUCTURING_MULTIPLE_HOLDING_OBLIGATIONS = 'H';

  public static final char RESTRUCTURING_MULTIPLE_CREDIT_EVENT_NOTICES = 'E';

  public static final char FLOATING_RATE_INTEREST_SHORTFALL = 'C';

  public ComplexEventCreditEventQualifier() {
    super(41006);
  }

  public ComplexEventCreditEventQualifier(Character data) {
    super(41006, data);
  }

  public ComplexEventCreditEventQualifier(char data) {
    super(41006, data);
  }
}
