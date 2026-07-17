/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class OrderCategory extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1115;

  public static final char ORDER = '1';

  public static final char QUOTE = '2';

  public static final char PRIVATELY_NEGOTIATED_TRADE = '3';

  public static final char MULTILEG_ORDER = '4';

  public static final char LINKED_ORDER = '5';

  public static final char QUOTE_REQUEST = '6';

  public static final char IMPLIED_ORDER = '7';

  public static final char CROSS_ORDER = '8';

  public static final char STREAMING_PRICE = '9';

  public static final char INTERNAL_CROSS_ORDER = 'A';

  public OrderCategory() {
    super(1115);
  }

  public OrderCategory(Character data) {
    super(1115, data);
  }

  public OrderCategory(char data) {
    super(1115, data);
  }
}
