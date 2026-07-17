/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TriggerAction extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1101;

  public static final char ACTIVATE = '1';

  public static final char MODIFY = '2';

  public static final char CANCEL = '3';

  public TriggerAction() {
    super(1101);
  }

  public TriggerAction(Character data) {
    super(1101, data);
  }

  public TriggerAction(char data) {
    super(1101, data);
  }
}
