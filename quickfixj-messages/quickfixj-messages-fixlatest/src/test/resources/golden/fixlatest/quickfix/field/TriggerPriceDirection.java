/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TriggerPriceDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1109;

  public static final char UP = 'U';

  public static final char DOWN = 'D';

  public TriggerPriceDirection() {
    super(1109);
  }

  public TriggerPriceDirection(Character data) {
    super(1109, data);
  }

  public TriggerPriceDirection(char data) {
    super(1109, data);
  }
}
