/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RelatedTradeIDSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1857;

  public static final int NON_FIXSOURCE = 0;

  public static final int TRADE_ID = 1;

  public static final int SECONDARY_TRADE_ID = 2;

  public static final int TRADE_REPORT_ID = 3;

  public static final int FIRM_TRADE_ID = 4;

  public static final int SECONDARY_FIRM_TRADE_ID = 5;

  public static final int REGULATORY_TRADE_ID = 6;

  public RelatedTradeIDSource() {
    super(1857);
  }

  public RelatedTradeIDSource(Integer data) {
    super(1857, data);
  }

  public RelatedTradeIDSource(int data) {
    super(1857, data);
  }
}
