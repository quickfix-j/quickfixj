/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class DuplicateClOrdIDIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2829;

  public static final boolean UNIQUE_CL_ORD_ID = false;

  public static final boolean DUPLICATE_CL_ORD_ID = true;

  public DuplicateClOrdIDIndicator() {
    super(2829);
  }

  public DuplicateClOrdIDIndicator(Boolean data) {
    super(2829, data);
  }

  public DuplicateClOrdIDIndicator(boolean data) {
    super(2829, data);
  }
}
