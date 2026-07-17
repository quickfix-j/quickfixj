/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ExecAckStatus extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1036;

  public static final char RECEIVED = '0';

  public static final char ACCEPTED = '1';

  public static final char DON = '2';

  public ExecAckStatus() {
    super(1036);
  }

  public ExecAckStatus(Character data) {
    super(1036, data);
  }

  public ExecAckStatus(char data) {
    super(1036, data);
  }
}
