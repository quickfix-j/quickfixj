/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TriggerOrderType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1111;

  public static final char MARKET = '1';

  public static final char LIMIT = '2';

  public TriggerOrderType() {
    super(1111);
  }

  public TriggerOrderType(Character data) {
    super(1111, data);
  }

  public TriggerOrderType(char data) {
    super(1111, data);
  }
}
