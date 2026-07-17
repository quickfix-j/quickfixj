/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class Scope extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 546;

  public static final String LOCAL_MARKET = "1";

  public static final String NATIONAL = "2";

  public static final String GLOBAL = "3";

  public Scope() {
    super(546);
  }

  public Scope(String data) {
    super(546, data);
  }
}
