/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TrdRegPublicationType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2669;

  public static final int PRE_TRADE_TRANSPARENCY_WAIVER = 0;

  public static final int POST_TRADE_DEFERRAL = 1;

  public static final int EXEMPT_FROM_PUBLICATION = 2;

  public static final int ORDER_LEVEL_PUBLICATION_TO_SUBSCRIBERS = 3;

  public static final int PRICE_LEVEL_PUBLICATION_TO_SUBSCRIBERS = 4;

  public static final int ORDER_LEVEL_PUBLICATION_TO_THE_PUBLIC = 5;

  public static final int PUBLICATION_INTERNAL_TO_EXECUTION_VENUE = 6;

  public TrdRegPublicationType() {
    super(2669);
  }

  public TrdRegPublicationType(Integer data) {
    super(2669, data);
  }

  public TrdRegPublicationType(int data) {
    super(2669, data);
  }
}
