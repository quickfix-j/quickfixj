/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RegistRejReasonCode extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 507;

  public static final int INVALID_ACCOUNT_TYPE = 1;

  public static final int INVALID_TAX_EXEMPT_TYPE = 2;

  public static final int INVALID_OWNERSHIP_TYPE = 3;

  public static final int NO_REG_DETAILS = 4;

  public static final int INVALID_REG_SEQ_NO = 5;

  public static final int INVALID_REG_DETAILS = 6;

  public static final int INVALID_MAILING_DETAILS = 7;

  public static final int INVALID_MAILING_INSTRUCTIONS = 8;

  public static final int INVALID_INVESTOR_ID = 9;

  public static final int INVALID_INVESTOR_IDSOURCE = 10;

  public static final int INVALID_DATE_OF_BIRTH = 11;

  public static final int INVALID_COUNTRY = 12;

  public static final int INVALID_DISTRIB_INSTNS = 13;

  public static final int INVALID_PERCENTAGE = 14;

  public static final int INVALID_PAYMENT_METHOD = 15;

  public static final int INVALID_ACCOUNT_NAME = 16;

  public static final int INVALID_AGENT_CODE = 17;

  public static final int INVALID_ACCOUNT_NUM = 18;

  public static final int OTHER = 99;

  public RegistRejReasonCode() {
    super(507);
  }

  public RegistRejReasonCode(Integer data) {
    super(507, data);
  }

  public RegistRejReasonCode(int data) {
    super(507, data);
  }
}
