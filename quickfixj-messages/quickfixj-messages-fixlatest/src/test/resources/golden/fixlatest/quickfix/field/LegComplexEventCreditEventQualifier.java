/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegComplexEventCreditEventQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41375;

  public static final char RESTRUCTURING_MULTIPLE_HOLDING_OBLIGATIONS = 'H';

  public static final char RESTRUCTURING_MULTIPLE_CREDIT_EVENT_NOTICES = 'E';

  public static final char FLOATING_RATE_INTEREST_SHORTFALL = 'C';

  public LegComplexEventCreditEventQualifier() {
    super(41375);
  }

  public LegComplexEventCreditEventQualifier(Character data) {
    super(41375, data);
  }

  public LegComplexEventCreditEventQualifier(char data) {
    super(41375, data);
  }
}
