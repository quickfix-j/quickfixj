/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassStatusReqType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 585;

  public static final int STATUS_FOR_ORDERS_FOR_ASECURITY = 1;

  public static final int STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY = 2;

  public static final int STATUS_FOR_ORDERS_FOR_APRODUCT = 3;

  public static final int STATUS_FOR_ORDERS_FOR_ACFICODE = 4;

  public static final int STATUS_FOR_ORDERS_FOR_ASECURITY_TYPE = 5;

  public static final int STATUS_FOR_ORDERS_FOR_ATRADING_SESSION = 6;

  public static final int STATUS_FOR_ALL_ORDERS = 7;

  public static final int STATUS_FOR_ORDERS_FOR_A_PARTY_ID = 8;

  public static final int STATUS_FOR_SECURITY_ISSUER = 9;

  public static final int STATUS_FOR_ISSUER_OF_UNDERLYING_SECURITY = 10;

  public MassStatusReqType() {
    super(585);
  }

  public MassStatusReqType(Integer data) {
    super(585, data);
  }

  public MassStatusReqType(int data) {
    super(585, data);
  }
}
