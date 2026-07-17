/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRateFXConversionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42731, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRateFXConversionGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateFXConversions get(quickfix.field.NoReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateFXConversions getNoReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateFXConversions() {
    return isSetField(42731);
  }

public static class NoReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42732, 42733, 42734, 0};

  public NoReturnRateFXConversions() {
    super(42731, 42732, ORDER);
  }

  public void set(quickfix.field.ReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXCurrencySymbol get(quickfix.field.ReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXCurrencySymbol getReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.ReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXCurrencySymbol() {
    return isSetField(42732);
  }

  public void set(quickfix.field.ReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRate get(quickfix.field.ReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRate getReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRate() {
    return isSetField(42733);
  }

  public void set(quickfix.field.ReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRateCalc get(quickfix.field.ReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRateCalc getReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRateCalc() {
    return isSetField(42734);
  }
}

  public void set(quickfix.field.ReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXCurrencySymbol get(quickfix.field.ReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXCurrencySymbol getReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.ReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXCurrencySymbol() {
    return isSetField(42732);
  }

  public void set(quickfix.field.ReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRate get(quickfix.field.ReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRate getReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRate() {
    return isSetField(42733);
  }

  public void set(quickfix.field.ReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRateCalc get(quickfix.field.ReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRateCalc getReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRateCalc() {
    return isSetField(42734);
  }
}
