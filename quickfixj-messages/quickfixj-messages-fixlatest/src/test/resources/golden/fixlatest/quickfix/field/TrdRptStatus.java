/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TrdRptStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 939;

  public static final int ACCEPTED = 0;

  public static final int REJECTED = 1;

  public static final int CANCELLED = 2;

  public static final int ACCEPTED_WITH_ERRORS = 3;

  public static final int PENDING_NEW = 4;

  public static final int PENDING_CANCEL = 5;

  public static final int PENDING_REPLACE = 6;

  public static final int TERMINATED = 7;

  public static final int PENDING_VERIFICATION = 8;

  public static final int DEEMED_VERIFIED = 9;

  public static final int VERIFIED = 10;

  public static final int DISPUTED = 11;

  public TrdRptStatus() {
    super(939);
  }

  public TrdRptStatus(Integer data) {
    super(939, data);
  }

  public TrdRptStatus(int data) {
    super(939, data);
  }
}
