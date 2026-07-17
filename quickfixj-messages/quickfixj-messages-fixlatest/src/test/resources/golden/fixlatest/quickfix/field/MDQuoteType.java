/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDQuoteType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1070;

  public static final int INDICATIVE = 0;

  public static final int TRADEABLE = 1;

  public static final int RESTRICTED_TRADEABLE = 2;

  public static final int COUNTER = 3;

  public static final int INDICATIVE_AND_TRADEABLE = 4;

  public MDQuoteType() {
    super(1070);
  }

  public MDQuoteType(Integer data) {
    super(1070, data);
  }

  public MDQuoteType(int data) {
    super(1070, data);
  }
}
