/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRateFXConversionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42530, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRateFXConversionGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateFXConversions get(quickfix.field.NoLegReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateFXConversions getNoLegReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateFXConversions() {
    return isSetField(42530);
  }

public static class NoLegReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42531, 42532, 42533, 0};

  public NoLegReturnRateFXConversions() {
    super(42530, 42531, ORDER);
  }

  public void set(quickfix.field.LegReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol get(quickfix.field.LegReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol getLegReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXCurrencySymbol() {
    return isSetField(42531);
  }

  public void set(quickfix.field.LegReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRate get(quickfix.field.LegReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRate getLegReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRate() {
    return isSetField(42532);
  }

  public void set(quickfix.field.LegReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRateCalc get(quickfix.field.LegReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRateCalc getLegReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRateCalc() {
    return isSetField(42533);
  }
}

  public void set(quickfix.field.LegReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol get(quickfix.field.LegReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol getLegReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXCurrencySymbol() {
    return isSetField(42531);
  }

  public void set(quickfix.field.LegReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRate get(quickfix.field.LegReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRate getLegReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRate() {
    return isSetField(42532);
  }

  public void set(quickfix.field.LegReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRateCalc get(quickfix.field.LegReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRateCalc getLegReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRateCalc() {
    return isSetField(42533);
  }
}
