/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class ClearingFeeIndicator extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 635;

  public static final String FIRST_YEAR_DELEGATE = "1";

  public static final String SECOND_YEAR_DELEGATE = "2";

  public static final String THIRD_YEAR_DELEGATE = "3";

  public static final String FOURTH_YEAR_DELEGATE = "4";

  public static final String FIFTH_YEAR_DELEGATE = "5";

  public static final String SIXTH_YEAR_DELEGATE = "9";

  public static final String CBOEMEMBER = "B";

  public static final String NON_MEMBER_AND_CUSTOMER = "C";

  public static final String EQUITY_MEMBER_AND_CLEARING_MEMBER = "E";

  public static final String FULL_AND_ASSOCIATE_MEMBER = "F";

  public static final String FIRMS106HAND106J = "H";

  public static final String GIM = "I";

  public static final String LESSEE106FEMPLOYEES = "L";

  public static final String ALL_OTHER_OWNERSHIP_TYPES = "M";

  public ClearingFeeIndicator() {
    super(635);
  }

  public ClearingFeeIndicator(String data) {
    super(635, data);
  }
}
