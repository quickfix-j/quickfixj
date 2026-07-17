/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MatchStatus extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 573;

  public static final char COMPARED = '0';

  public static final char UNCOMPARED = '1';

  public static final char ADVISORY_OR_ALERT = '2';

  public static final char MISMATCHED = '3';

  public MatchStatus() {
    super(573);
  }

  public MatchStatus(Character data) {
    super(573, data);
  }

  public MatchStatus(char data) {
    super(573, data);
  }
}
