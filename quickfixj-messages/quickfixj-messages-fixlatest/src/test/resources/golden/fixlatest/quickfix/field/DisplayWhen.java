/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class DisplayWhen extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1083;

  public static final char IMMEDIATE = '1';

  public static final char EXHAUST = '2';

  public DisplayWhen() {
    super(1083);
  }

  public DisplayWhen(Character data) {
    super(1083, data);
  }

  public DisplayWhen(char data) {
    super(1083, data);
  }
}
