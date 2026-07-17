/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class RegistTransType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 514;

  public static final char NEW = '0';

  public static final char CANCEL = '2';

  public static final char REPLACE = '1';

  public RegistTransType() {
    super(514);
  }

  public RegistTransType(Character data) {
    super(514, data);
  }

  public RegistTransType(char data) {
    super(514, data);
  }
}
