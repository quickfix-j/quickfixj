/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingMarketDisruptionProvision extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41859;

  public static final int NOT_APPLICABLE = 0;

  public static final int APPLICABLE = 1;

  public static final int AS_IN_MASTER_AGREEMENT = 2;

  public static final int AS_IN_CONFIRMATION = 3;

  public UnderlyingMarketDisruptionProvision() {
    super(41859);
  }

  public UnderlyingMarketDisruptionProvision(Integer data) {
    super(41859, data);
  }

  public UnderlyingMarketDisruptionProvision(int data) {
    super(41859, data);
  }
}
