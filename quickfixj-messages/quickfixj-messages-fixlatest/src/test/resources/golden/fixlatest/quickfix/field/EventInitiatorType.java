/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class EventInitiatorType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2830;

  public static final char CUSTOMER_OR_CLIENT = 'C';

  public static final char EXCHANGE_OR_EXECUTION_VENUE = 'E';

  public static final char FIRM_OR_BROKER = 'F';

  public EventInitiatorType() {
    super(2830);
  }

  public EventInitiatorType(Character data) {
    super(2830, data);
  }

  public EventInitiatorType(char data) {
    super(2830, data);
  }
}
