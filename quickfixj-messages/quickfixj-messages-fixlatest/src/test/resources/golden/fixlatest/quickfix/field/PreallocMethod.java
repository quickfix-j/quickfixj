/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class PreallocMethod extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 591;

  public static final char PRO_RATA = '0';

  public static final char DO_NOT_PRO_RATA = '1';

  public PreallocMethod() {
    super(591);
  }

  public PreallocMethod(Character data) {
    super(591, data);
  }

  public PreallocMethod(char data) {
    super(591, data);
  }
}
