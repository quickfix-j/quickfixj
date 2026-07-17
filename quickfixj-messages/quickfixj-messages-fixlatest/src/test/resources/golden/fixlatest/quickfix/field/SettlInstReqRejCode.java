/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SettlInstReqRejCode extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 792;

  public static final int UNABLE_TO_PROCESS_REQUEST = 0;

  public static final int UNKNOWN_ACCOUNT = 1;

  public static final int NO_MATCHING_SETTLEMENT_INSTRUCTIONS_FOUND = 2;

  public static final int OTHER = 99;

  public SettlInstReqRejCode() {
    super(792);
  }

  public SettlInstReqRejCode(Integer data) {
    super(792, data);
  }

  public SettlInstReqRejCode(int data) {
    super(792, data);
  }
}
