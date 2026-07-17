/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class StrategyType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2141;

  public static final String STRADDLE = "STD";

  public static final String STRANGLE = "STG";

  public static final String BUTTERFLY = "BF";

  public static final String CONDOR = "CNDR";

  public static final String CALLABLE_INVERSIBLE_SNOWBALL = "CISN";

  public static final String OTHER = "OTHER";

  public StrategyType() {
    super(2141);
  }

  public StrategyType(String data) {
    super(2141, data);
  }
}
