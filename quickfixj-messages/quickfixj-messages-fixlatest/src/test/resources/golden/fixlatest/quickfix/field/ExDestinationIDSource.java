/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ExDestinationIDSource extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1133;

  public static final char BIC = 'B';

  public static final char GENERAL_IDENTIFIER = 'C';

  public static final char PROPRIETARY = 'D';

  public static final char ISOCOUNTRY_CODE = 'E';

  public static final char MIC = 'G';

  public ExDestinationIDSource() {
    super(1133);
  }

  public ExDestinationIDSource(Character data) {
    super(1133, data);
  }

  public ExDestinationIDSource(char data) {
    super(1133, data);
  }
}
