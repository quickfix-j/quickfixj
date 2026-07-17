/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class Urgency extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 61;

  public static final char NORMAL = '0';

  public static final char FLASH = '1';

  public static final char BACKGROUND = '2';

  public Urgency() {
    super(61);
  }

  public Urgency(Character data) {
    super(61, data);
  }

  public Urgency(char data) {
    super(61, data);
  }
}
