/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class AsOfIndicator extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1015;

  public static final char FALSE = '0';

  public static final char TRUE = '1';

  public AsOfIndicator() {
    super(1015);
  }

  public AsOfIndicator(Character data) {
    super(1015, data);
  }

  public AsOfIndicator(char data) {
    super(1015, data);
  }
}
