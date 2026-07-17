/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RelatedInstrumentType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1648;

  public static final int HEDGES_FOR_INSTRUMENT = 1;

  public static final int UNDERLIER = 2;

  public static final int EQUITY_EQUIVALENT = 3;

  public static final int NEAREST_EXCHANGE_TRADED_CONTRACT = 4;

  public static final int RETAIL_EQUIVALENT = 5;

  public static final int LEG = 6;

  public RelatedInstrumentType() {
    super(1648);
  }

  public RelatedInstrumentType(Integer data) {
    super(1648, data);
  }

  public RelatedInstrumentType(int data) {
    super(1648, data);
  }
}
