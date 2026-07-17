/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MDUpdateAction extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 279;

  public static final char NEW = '0';

  public static final char CHANGE = '1';

  public static final char DELETE = '2';

  public static final char DELETE_THRU = '3';

  public static final char DELETE_FROM = '4';

  public static final char OVERLAY = '5';

  public MDUpdateAction() {
    super(279);
  }

  public MDUpdateAction(Character data) {
    super(279, data);
  }

  public MDUpdateAction(char data) {
    super(279, data);
  }
}
