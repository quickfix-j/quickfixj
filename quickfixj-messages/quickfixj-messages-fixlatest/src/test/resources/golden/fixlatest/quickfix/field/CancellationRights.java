/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class CancellationRights extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 480;

  public static final char YES = 'Y';

  public static final char NO_EXECUTION_ONLY = 'N';

  public static final char NO_WAIVER_AGREEMENT = 'M';

  public static final char NO_INSTITUTIONAL = 'O';

  public CancellationRights() {
    super(480);
  }

  public CancellationRights(Character data) {
    super(480, data);
  }

  public CancellationRights(char data) {
    super(480, data);
  }
}
