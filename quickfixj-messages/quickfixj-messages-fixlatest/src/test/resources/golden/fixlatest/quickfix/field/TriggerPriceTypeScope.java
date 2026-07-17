/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TriggerPriceTypeScope extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1108;

  public static final char NONE = '0';

  public static final char LOCAL = '1';

  public static final char NATIONAL = '2';

  public static final char GLOBAL = '3';

  public TriggerPriceTypeScope() {
    super(1108);
  }

  public TriggerPriceTypeScope(Character data) {
    super(1108, data);
  }

  public TriggerPriceTypeScope(char data) {
    super(1108, data);
  }
}
