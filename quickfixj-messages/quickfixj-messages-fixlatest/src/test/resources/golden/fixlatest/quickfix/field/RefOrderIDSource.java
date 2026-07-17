/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class RefOrderIDSource extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1081;

  public static final char SECONDARY_ORDER_ID = '0';

  public static final char ORDER_ID = '1';

  public static final char MDENTRY_ID = '2';

  public static final char QUOTE_ENTRY_ID = '3';

  public static final char ORIGINAL_ORDER_ID = '4';

  public static final char QUOTE_ID = '5';

  public static final char QUOTE_REQ_ID = '6';

  public static final char PREVIOUS_ORDER_IDENTIFIER = '7';

  public static final char PREVIOUS_QUOTE_IDENTIFIER = '8';

  public static final char PARENT_ORDER_IDENTIFIER = '9';

  public RefOrderIDSource() {
    super(1081);
  }

  public RefOrderIDSource(Character data) {
    super(1081, data);
  }

  public RefOrderIDSource(char data) {
    super(1081, data);
  }
}
