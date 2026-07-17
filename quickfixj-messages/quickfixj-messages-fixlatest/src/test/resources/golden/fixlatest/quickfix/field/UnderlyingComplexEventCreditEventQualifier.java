/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class UnderlyingComplexEventCreditEventQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41725;

  public static final char RESTRUCTURING_MULTIPLE_HOLDING_OBLIGATIONS = 'H';

  public static final char RESTRUCTURING_MULTIPLE_CREDIT_EVENT_NOTICES = 'E';

  public static final char FLOATING_RATE_INTEREST_SHORTFALL = 'C';

  public UnderlyingComplexEventCreditEventQualifier() {
    super(41725);
  }

  public UnderlyingComplexEventCreditEventQualifier(Character data) {
    super(41725, data);
  }

  public UnderlyingComplexEventCreditEventQualifier(char data) {
    super(41725, data);
  }
}
