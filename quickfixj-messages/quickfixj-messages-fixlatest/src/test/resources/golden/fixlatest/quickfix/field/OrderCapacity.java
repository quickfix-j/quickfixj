/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class OrderCapacity extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 528;

  public static final char AGENCY = 'A';

  public static final char PROPRIETARY = 'G';

  public static final char INDIVIDUAL = 'I';

  public static final char PRINCIPAL = 'P';

  public static final char RISKLESS_PRINCIPAL = 'R';

  public static final char AGENT_FOR_OTHER_MEMBER = 'W';

  public static final char MIXED_CAPACITY = 'M';

  public OrderCapacity() {
    super(528);
  }

  public OrderCapacity(Character data) {
    super(528, data);
  }

  public OrderCapacity(char data) {
    super(528, data);
  }
}
