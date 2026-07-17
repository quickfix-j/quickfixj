/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LastCapacity extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 29;

  public static final char AGENT = '1';

  public static final char CROSS_AS_AGENT = '2';

  public static final char CROSS_AS_PRINCIPAL = '3';

  public static final char PRINCIPAL = '4';

  public static final char RISKLESS_PRINCIPAL = '5';

  public LastCapacity() {
    super(29);
  }

  public LastCapacity(Character data) {
    super(29, data);
  }

  public LastCapacity(char data) {
    super(29, data);
  }
}
