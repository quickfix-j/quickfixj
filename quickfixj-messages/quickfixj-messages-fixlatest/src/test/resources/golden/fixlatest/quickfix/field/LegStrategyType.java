/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegStrategyType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2211;

  public static final String STRADDLE = "STD";

  public static final String STRANGLE = "STG";

  public static final String BUTTERFLY = "BF";

  public static final String CONDOR = "CNDR";

  public static final String CALLABLE_INVERSIBLE_SNOWBALL = "CISN";

  public static final String OTHER = "OTHER";

  public LegStrategyType() {
    super(2211);
  }

  public LegStrategyType(String data) {
    super(2211, data);
  }
}
