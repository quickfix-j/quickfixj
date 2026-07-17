/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class EmailType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 94;

  public static final char NEW = '0';

  public static final char REPLY = '1';

  public static final char ADMIN_REPLY = '2';

  public EmailType() {
    super(94);
  }

  public EmailType(Character data) {
    super(94, data);
  }

  public EmailType(char data) {
    super(94, data);
  }
}
