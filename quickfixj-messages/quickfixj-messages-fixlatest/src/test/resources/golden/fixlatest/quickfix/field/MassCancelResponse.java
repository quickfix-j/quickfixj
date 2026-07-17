/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MassCancelResponse extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 531;

  public static final char CANCEL_REQUEST_REJECTED = '0';

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

  public static final char CANCEL_ORDERS_FOR_ASECURITIES_ISSUER = 'B';

  public static final char CANCEL_ORDERS_FOR_ISSUER_OF_UNDERLYING_SECURITY = 'C';

  public MassCancelResponse() {
    super(531);
  }

  public MassCancelResponse(Character data) {
    super(531, data);
  }

  public MassCancelResponse(char data) {
    super(531, data);
  }
}
