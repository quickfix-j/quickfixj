/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class PublishTrdIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 852;

  public static final boolean DO_NOT_REPORT_TRADE = false;

  public static final boolean REPORT_TRADE = true;

  public PublishTrdIndicator() {
    super(852);
  }

  public PublishTrdIndicator(Boolean data) {
    super(852, data);
  }

  public PublishTrdIndicator(boolean data) {
    super(852, data);
  }
}
