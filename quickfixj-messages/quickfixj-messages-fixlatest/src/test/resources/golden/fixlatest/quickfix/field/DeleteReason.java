/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class DeleteReason extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 285;

  public static final char CANCELLATION = '0';

  public static final char ERROR = '1';

  public DeleteReason() {
    super(285);
  }

  public DeleteReason(Character data) {
    super(285, data);
  }

  public DeleteReason(char data) {
    super(285, data);
  }
}
