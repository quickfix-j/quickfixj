/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassActionScope extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1374;

  public static final int ALL_ORDERS_FOR_ASECURITY = 1;

  public static final int ALL_ORDERS_FOR_AN_UNDERLYING_SECURITY = 2;

  public static final int ALL_ORDERS_FOR_APRODUCT = 3;

  public static final int ALL_ORDERS_FOR_ACFICODE = 4;

  public static final int ALL_ORDERS_FOR_ASECURITY_TYPE = 5;

  public static final int ALL_ORDERS_FOR_ATRADING_SESSION = 6;

  public static final int ALL_ORDERS = 7;

  public static final int ALL_ORDERS_FOR_AMARKET = 8;

  public static final int ALL_ORDERS_FOR_AMARKET_SEGMENT = 9;

  public static final int ALL_ORDERS_FOR_ASECURITY_GROUP = 10;

  public static final int CANCEL_FOR_SECURITY_ISSUER = 11;

  public static final int CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY = 12;

  public MassActionScope() {
    super(1374);
  }

  public MassActionScope(Integer data) {
    super(1374, data);
  }

  public MassActionScope(int data) {
    super(1374, data);
  }
}
