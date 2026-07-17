/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarketDisruptionProvision extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41087;

  public static final int NOT_APPLICABLE = 0;

  public static final int APPLICABLE = 1;

  public static final int AS_IN_MASTER_AGREEMENT = 2;

  public static final int AS_IN_CONFIRMATION = 3;

  public MarketDisruptionProvision() {
    super(41087);
  }

  public MarketDisruptionProvision(Integer data) {
    super(41087, data);
  }

  public MarketDisruptionProvision(int data) {
    super(41087, data);
  }
}
