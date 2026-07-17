/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingSecurityStatus extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2011;

  public static final String ACTIVE = "1";

  public static final String INACTIVE = "2";

  public static final String ACTIVE_CLOSING_ORDERS_ONLY = "3";

  public static final String EXPIRED = "4";

  public static final String DELISTED = "5";

  public static final String KNOCKED_OUT = "6";

  public static final String KNOCK_OUT_REVOKED = "7";

  public static final String PENDING_EXPIRY = "8";

  public static final String SUSPENDED = "9";

  public static final String PUBLISHED = "10";

  public static final String PENDING_DELETION = "11";

  public UnderlyingSecurityStatus() {
    super(2011);
  }

  public UnderlyingSecurityStatus(String data) {
    super(2011, data);
  }
}
