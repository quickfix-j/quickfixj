/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ListUpdateAction extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1324;

  public static final char ADD = 'A';

  public static final char DELETE = 'D';

  public static final char MODIFY = 'M';

  public static final char SNAPSHOT = 'S';

  public ListUpdateAction() {
    super(1324);
  }

  public ListUpdateAction(Character data) {
    super(1324, data);
  }

  public ListUpdateAction(char data) {
    super(1324, data);
  }
}
