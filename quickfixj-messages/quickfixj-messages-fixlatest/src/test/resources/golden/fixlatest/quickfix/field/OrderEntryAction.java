/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class OrderEntryAction extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2429;

  public static final char ADD = '1';

  public static final char MODIFY = '2';

  public static final char DELETE = '3';

  public static final char SUSPEND = '4';

  public static final char RELEASE = '5';

  public OrderEntryAction() {
    super(2429);
  }

  public OrderEntryAction(Character data) {
    super(2429, data);
  }

  public OrderEntryAction(char data) {
    super(2429, data);
  }
}
