/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SecurityUpdateAction extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 980;

  public static final char ADD = 'A';

  public static final char DELETE = 'D';

  public static final char MODIFY = 'M';

  public SecurityUpdateAction() {
    super(980);
  }

  public SecurityUpdateAction(Character data) {
    super(980, data);
  }

  public SecurityUpdateAction(char data) {
    super(980, data);
  }
}
