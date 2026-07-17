/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MarketUpdateAction extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1395;

  public static final char ADD = 'A';

  public static final char DELETE = 'D';

  public static final char MODIFY = 'M';

  public MarketUpdateAction() {
    super(1395);
  }

  public MarketUpdateAction(Character data) {
    super(1395, data);
  }

  public MarketUpdateAction(char data) {
    super(1395, data);
  }
}
