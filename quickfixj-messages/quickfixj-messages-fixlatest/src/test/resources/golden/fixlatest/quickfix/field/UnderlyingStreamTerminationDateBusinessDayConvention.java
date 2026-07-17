/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingStreamTerminationDateBusinessDayConvention extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40549;

  public static final int NOT_APPLICABLE = 0;

  public static final int NONE = 1;

  public static final int FOLLOWING_DAY = 2;

  public static final int FLOATING_RATE_NOTE = 3;

  public static final int MODIFIED_FOLLOWING_DAY = 4;

  public static final int PRECEDING_DAY = 5;

  public static final int MODIFIED_PRECEDING_DAY = 6;

  public static final int NEAREST_DAY = 7;

  public UnderlyingStreamTerminationDateBusinessDayConvention() {
    super(40549);
  }

  public UnderlyingStreamTerminationDateBusinessDayConvention(Integer data) {
    super(40549, data);
  }

  public UnderlyingStreamTerminationDateBusinessDayConvention(int data) {
    super(40549, data);
  }
}
