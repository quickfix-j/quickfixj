/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class CxlRejResponseTo extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 434;

  public static final char ORDER_CANCEL_REQUEST = '1';

  public static final char ORDER_CANCEL_REPLACE_REQUEST = '2';

  public CxlRejResponseTo() {
    super(434);
  }

  public CxlRejResponseTo(Character data) {
    super(434, data);
  }

  public CxlRejResponseTo(char data) {
    super(434, data);
  }
}
