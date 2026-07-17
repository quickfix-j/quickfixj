/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegMarketDisruptionProvision extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41462;

  public static final int NOT_APPLICABLE = 0;

  public static final int APPLICABLE = 1;

  public static final int AS_IN_MASTER_AGREEMENT = 2;

  public static final int AS_IN_CONFIRMATION = 3;

  public LegMarketDisruptionProvision() {
    super(41462);
  }

  public LegMarketDisruptionProvision(Integer data) {
    super(41462, data);
  }

  public LegMarketDisruptionProvision(int data) {
    super(41462, data);
  }
}
