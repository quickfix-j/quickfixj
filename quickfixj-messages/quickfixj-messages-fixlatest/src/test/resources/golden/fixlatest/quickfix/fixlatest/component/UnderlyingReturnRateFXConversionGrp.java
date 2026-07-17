/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRateFXConversionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43030, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRateFXConversionGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateFXConversions get(quickfix.field.NoUnderlyingReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateFXConversions getNoUnderlyingReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateFXConversions() {
    return isSetField(43030);
  }

public static class NoUnderlyingReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43031, 43032, 43033, 0};

  public NoUnderlyingReturnRateFXConversions() {
    super(43030, 43031, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol get(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol getUnderlyingReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXCurrencySymbol() {
    return isSetField(43031);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRate get(quickfix.field.UnderlyingReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRate getUnderlyingReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRate() {
    return isSetField(43032);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc get(quickfix.field.UnderlyingReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc getUnderlyingReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRateCalc() {
    return isSetField(43033);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol get(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol getUnderlyingReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXCurrencySymbol() {
    return isSetField(43031);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRate get(quickfix.field.UnderlyingReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRate getUnderlyingReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRate() {
    return isSetField(43032);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc get(quickfix.field.UnderlyingReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc getUnderlyingReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRateCalc() {
    return isSetField(43033);
  }
}
