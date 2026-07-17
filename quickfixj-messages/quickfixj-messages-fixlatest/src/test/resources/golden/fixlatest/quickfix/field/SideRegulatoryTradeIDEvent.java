/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideRegulatoryTradeIDEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1974;

  public static final int INITIAL_BLOCK_TRADE = 0;

  public static final int ALLOCATION = 1;

  public static final int CLEARING = 2;

  public static final int COMPRESSION = 3;

  public static final int NOVATION = 4;

  public static final int TERMINATION = 5;

  public static final int POST_TRD_VAL = 6;

  public SideRegulatoryTradeIDEvent() {
    super(1974);
  }

  public SideRegulatoryTradeIDEvent(Integer data) {
    super(1974, data);
  }

  public SideRegulatoryTradeIDEvent(int data) {
    super(1974, data);
  }
}
