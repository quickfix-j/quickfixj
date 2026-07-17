/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class RegistStatus extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 506;

  public static final char ACCEPTED = 'A';

  public static final char REJECTED = 'R';

  public static final char HELD = 'H';

  public static final char REMINDER = 'N';

  public RegistStatus() {
    super(506);
  }

  public RegistStatus(Character data) {
    super(506, data);
  }

  public RegistStatus(char data) {
    super(506, data);
  }
}
