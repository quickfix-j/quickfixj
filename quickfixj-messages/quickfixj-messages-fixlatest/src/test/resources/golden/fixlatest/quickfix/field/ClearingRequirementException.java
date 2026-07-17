/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ClearingRequirementException extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1932;

  public static final int NO_EXCEPTION = 0;

  public static final int EXCEPTION = 1;

  public static final int END_USER_EXCEPTION = 2;

  public static final int INTER_AFFILIATE_EXCEPTION = 3;

  public static final int TREASURY_AFFILIATE_EXCEPTION = 4;

  public static final int COOPERATIVE_EXCEPTION = 5;

  public ClearingRequirementException() {
    super(1932);
  }

  public ClearingRequirementException(Integer data) {
    super(1932, data);
  }

  public ClearingRequirementException(int data) {
    super(1932, data);
  }
}
