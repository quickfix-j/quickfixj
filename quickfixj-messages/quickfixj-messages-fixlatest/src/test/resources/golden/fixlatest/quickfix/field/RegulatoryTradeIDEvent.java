/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RegulatoryTradeIDEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1904;

  public static final int INITIAL_BLOCK_TRADE = 0;

  public static final int ALLOCATION = 1;

  public static final int CLEARING = 2;

  public static final int COMPRESSION = 3;

  public static final int NOVATION = 4;

  public static final int TERMINATION = 5;

  public static final int POST_TRD_VAL = 6;

  public RegulatoryTradeIDEvent() {
    super(1904);
  }

  public RegulatoryTradeIDEvent(Integer data) {
    super(1904, data);
  }

  public RegulatoryTradeIDEvent(int data) {
    super(1904, data);
  }
}
