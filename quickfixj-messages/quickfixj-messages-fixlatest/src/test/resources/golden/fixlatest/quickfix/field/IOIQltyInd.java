/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class IOIQltyInd extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 25;

  public static final char HIGH = 'H';

  public static final char LOW = 'L';

  public static final char MEDIUM = 'M';

  public IOIQltyInd() {
    super(25);
  }

  public IOIQltyInd(Character data) {
    super(25, data);
  }

  public IOIQltyInd(char data) {
    super(25, data);
  }
}
