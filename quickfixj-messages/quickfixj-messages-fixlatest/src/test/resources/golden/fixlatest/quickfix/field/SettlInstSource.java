/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SettlInstSource extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 165;

  public static final char BROKER_CREDIT = '1';

  public static final char INSTITUTION = '2';

  public static final char INVESTOR = '3';

  public SettlInstSource() {
    super(165);
  }

  public SettlInstSource(Character data) {
    super(165, data);
  }

  public SettlInstSource(char data) {
    super(165, data);
  }
}
