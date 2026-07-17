/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ProcessCode extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 81;

  public static final char REGULAR = '0';

  public static final char SOFT_DOLLAR = '1';

  public static final char STEP_IN = '2';

  public static final char STEP_OUT = '3';

  public static final char SOFT_DOLLAR_STEP_IN = '4';

  public static final char SOFT_DOLLAR_STEP_OUT = '5';

  public static final char PLAN_SPONSOR = '6';

  public ProcessCode() {
    super(81);
  }

  public ProcessCode(Character data) {
    super(81, data);
  }

  public ProcessCode(char data) {
    super(81, data);
  }
}
