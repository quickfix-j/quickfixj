/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocRegulatoryTradeIDEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1911;

  public static final int INITIAL_BLOCK_TRADE = 0;

  public static final int ALLOCATION = 1;

  public static final int CLEARING = 2;

  public static final int COMPRESSION = 3;

  public static final int NOVATION = 4;

  public static final int TERMINATION = 5;

  public static final int POST_TRD_VAL = 6;

  public AllocRegulatoryTradeIDEvent() {
    super(1911);
  }

  public AllocRegulatoryTradeIDEvent(Integer data) {
    super(1911, data);
  }

  public AllocRegulatoryTradeIDEvent(int data) {
    super(1911, data);
  }
}
