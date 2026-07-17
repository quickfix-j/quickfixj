/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class BookingUnit extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 590;

  public static final char EACH_PARTIAL_EXECUTION_IS_ABOOKABLE_UNIT = '0';

  public static final char AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER = '1';

  public static final char AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL = '2';

  public BookingUnit() {
    super(590);
  }

  public BookingUnit(Character data) {
    super(590, data);
  }

  public BookingUnit(char data) {
    super(590, data);
  }
}
