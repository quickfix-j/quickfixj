/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FundingSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2849, };
  protected int[] getGroupFields() { return componentGroups; }

  public FundingSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoFundingSources value) {
    setField(value);
  }

  public quickfix.field.NoFundingSources get(quickfix.field.NoFundingSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFundingSources getNoFundingSources() throws FieldNotFound {
    return get(new quickfix.field.NoFundingSources());
  }

  public boolean isSet(quickfix.field.NoFundingSources field) {
    return isSetField(field);
  }

  public boolean isSetNoFundingSources() {
    return isSetField(2849);
  }

public static class NoFundingSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2846, 2848, 2847, 0};

  public NoFundingSources() {
    super(2849, 2846, ORDER);
  }

  public void set(quickfix.field.FundingSource value) {
    setField(value);
  }

  public quickfix.field.FundingSource get(quickfix.field.FundingSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSource getFundingSource() throws FieldNotFound {
    return get(new quickfix.field.FundingSource());
  }

  public boolean isSet(quickfix.field.FundingSource field) {
    return isSetField(field);
  }

  public boolean isSetFundingSource() {
    return isSetField(2846);
  }

  public void set(quickfix.field.FundingSourceMarketValue value) {
    setField(value);
  }

  public quickfix.field.FundingSourceMarketValue get(quickfix.field.FundingSourceMarketValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSourceMarketValue getFundingSourceMarketValue() throws FieldNotFound {
    return get(new quickfix.field.FundingSourceMarketValue());
  }

  public boolean isSet(quickfix.field.FundingSourceMarketValue field) {
    return isSetField(field);
  }

  public boolean isSetFundingSourceMarketValue() {
    return isSetField(2848);
  }

  public void set(quickfix.field.FundingSourceCurrency value) {
    setField(value);
  }

  public quickfix.field.FundingSourceCurrency get(quickfix.field.FundingSourceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSourceCurrency getFundingSourceCurrency() throws FieldNotFound {
    return get(new quickfix.field.FundingSourceCurrency());
  }

  public boolean isSet(quickfix.field.FundingSourceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetFundingSourceCurrency() {
    return isSetField(2847);
  }
}

  public void set(quickfix.field.FundingSource value) {
    setField(value);
  }

  public quickfix.field.FundingSource get(quickfix.field.FundingSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSource getFundingSource() throws FieldNotFound {
    return get(new quickfix.field.FundingSource());
  }

  public boolean isSet(quickfix.field.FundingSource field) {
    return isSetField(field);
  }

  public boolean isSetFundingSource() {
    return isSetField(2846);
  }

  public void set(quickfix.field.FundingSourceMarketValue value) {
    setField(value);
  }

  public quickfix.field.FundingSourceMarketValue get(quickfix.field.FundingSourceMarketValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSourceMarketValue getFundingSourceMarketValue() throws FieldNotFound {
    return get(new quickfix.field.FundingSourceMarketValue());
  }

  public boolean isSet(quickfix.field.FundingSourceMarketValue field) {
    return isSetField(field);
  }

  public boolean isSetFundingSourceMarketValue() {
    return isSetField(2848);
  }

  public void set(quickfix.field.FundingSourceCurrency value) {
    setField(value);
  }

  public quickfix.field.FundingSourceCurrency get(quickfix.field.FundingSourceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundingSourceCurrency getFundingSourceCurrency() throws FieldNotFound {
    return get(new quickfix.field.FundingSourceCurrency());
  }

  public boolean isSet(quickfix.field.FundingSourceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetFundingSourceCurrency() {
    return isSetField(2847);
  }
}
