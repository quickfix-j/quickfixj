/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MassCancelRequestType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 530;

  public static final char CANCEL_ORDERS_FOR_ASECURITY = '1';

  public static final char CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = '2';

  public static final char CANCEL_ORDERS_FOR_APRODUCT = '3';

  public static final char CANCEL_ORDERS_FOR_ACFICODE = '4';

  public static final char CANCEL_ORDERS_FOR_ASECURITY_TYPE = '5';

  public static final char CANCEL_ORDERS_FOR_ATRADING_SESSION = '6';

  public static final char CANCEL_ALL_ORDERS = '7';

  public static final char CANCEL_ORDERS_FOR_AMARKET = '8';

  public static final char CANCEL_ORDERS_FOR_AMARKET_SEGMENT = '9';

  public static final char CANCEL_ORDERS_FOR_ASECURITY_GROUP = 'A';

  public static final char CANCEL_ORDERS_FOR_SECURITY_ISSUER = 'B';

  public static final char CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY = 'C';

  public MassCancelRequestType() {
    super(530);
  }

  public MassCancelRequestType(Character data) {
    super(530, data);
  }

  public MassCancelRequestType(char data) {
    super(530, data);
  }
}
