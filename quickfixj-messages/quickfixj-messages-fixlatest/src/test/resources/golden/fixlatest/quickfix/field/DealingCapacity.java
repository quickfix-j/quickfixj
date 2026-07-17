/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class DealingCapacity extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1048;

  public static final char AGENT = 'A';

  public static final char PRINCIPAL = 'P';

  public static final char RISKLESS_PRINCIPAL = 'R';

  public DealingCapacity() {
    super(1048);
  }

  public DealingCapacity(Character data) {
    super(1048, data);
  }

  public DealingCapacity(char data) {
    super(1048, data);
  }
}
