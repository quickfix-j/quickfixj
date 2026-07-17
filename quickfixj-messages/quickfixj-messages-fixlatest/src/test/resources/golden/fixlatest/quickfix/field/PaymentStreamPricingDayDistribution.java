/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamPricingDayDistribution extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41214;

  public static final int ALL = 0;

  public static final int FIRST = 1;

  public static final int LAST = 2;

  public static final int PENULTIMATE = 3;

  public PaymentStreamPricingDayDistribution() {
    super(41214);
  }

  public PaymentStreamPricingDayDistribution(Integer data) {
    super(41214, data);
  }

  public PaymentStreamPricingDayDistribution(int data) {
    super(41214, data);
  }
}
