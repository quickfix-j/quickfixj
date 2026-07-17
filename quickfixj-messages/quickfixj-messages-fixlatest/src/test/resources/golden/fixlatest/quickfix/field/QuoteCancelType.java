/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteCancelType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 298;

  public static final int CANCEL_FOR_ONE_OR_MORE_SECURITIES = 1;

  public static final int CANCEL_FOR_SECURITY_TYPE = 2;

  public static final int CANCEL_FOR_UNDERLYING_SECURITY = 3;

  public static final int CANCEL_ALL_QUOTES = 4;

  public static final int CANCEL_SPECIFIED_SINGLE_QUOTE = 5;

  public static final int CANCEL_BY_TYPE_OF_QUOTE = 6;

  public static final int CANCEL_FOR_SECURITY_ISSUER = 7;

  public static final int CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY = 8;

  public QuoteCancelType() {
    super(298);
  }

  public QuoteCancelType(Integer data) {
    super(298, data);
  }

  public QuoteCancelType(int data) {
    super(298, data);
  }
}
