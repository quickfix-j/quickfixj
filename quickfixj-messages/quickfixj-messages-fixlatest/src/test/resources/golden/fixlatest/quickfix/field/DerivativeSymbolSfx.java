/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class DerivativeSymbolSfx extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1215;

  public static final String EUCPWITH_LUMP_SUM_INTEREST = "CD";

  public static final String WHEN_ISSUED = "WI";

  public DerivativeSymbolSfx() {
    super(1215);
  }

  public DerivativeSymbolSfx(String data) {
    super(1215, data);
  }
}
