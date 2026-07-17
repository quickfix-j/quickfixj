/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1607;

  public static final int INVALID_INSTRUMENT_REQUESTED = 1;

  public static final int INSTRUMENT_ALREADY_EXISTS = 2;

  public static final int REQUEST_TYPE_NOT_SUPPORTED = 3;

  public static final int SYSTEM_UNAVAILABLE_FOR_INSTRUMENT_CREATION = 4;

  public static final int INELIGIBLE_INSTRUMENT_GROUP = 5;

  public static final int INSTRUMENT_IDUNAVAILABLE = 6;

  public static final int INVALID_OR_MISSING_DATA_ON_OPTION_LEG = 7;

  public static final int INVALID_OR_MISSING_DATA_ON_FUTURE_LEG = 8;

  public static final int INVALID_OR_MISSING_DATA_ON_FXLEG = 10;

  public static final int INVALID_LEG_PRICE_SPECIFIED = 11;

  public static final int INVALID_INSTRUMENT_STRUCTURE_SPECIFIED = 12;

  public SecurityRejectReason() {
    super(1607);
  }

  public SecurityRejectReason(Integer data) {
    super(1607, data);
  }

  public SecurityRejectReason(int data) {
    super(1607, data);
  }
}
