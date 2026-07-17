/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AlgorithmicTradeIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2667;

  public static final int NON_ALGORITHMIC_TRADE = 0;

  public static final int ALGORITHMIC_TRADE = 1;

  public AlgorithmicTradeIndicator() {
    super(2667);
  }

  public AlgorithmicTradeIndicator(Integer data) {
    super(2667, data);
  }

  public AlgorithmicTradeIndicator(int data) {
    super(2667, data);
  }
}
