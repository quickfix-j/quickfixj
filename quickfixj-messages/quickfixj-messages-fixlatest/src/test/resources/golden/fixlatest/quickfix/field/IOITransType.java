/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class IOITransType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 28;

  public static final char NEW = 'N';

  public static final char CANCEL = 'C';

  public static final char REPLACE = 'R';

  public IOITransType() {
    super(28);
  }

  public IOITransType(Character data) {
    super(28, data);
  }

  public IOITransType(char data) {
    super(28, data);
  }
}
