/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CommissionData extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {12, 13, 479, 1233, 1238, 497, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public CommissionData() {
    super();
  }

  public void set(quickfix.field.Commission value) {
    setField(value);
  }

  public quickfix.field.Commission get(quickfix.field.Commission value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Commission getCommission() throws FieldNotFound {
    return get(new quickfix.field.Commission());
  }

  public boolean isSet(quickfix.field.Commission field) {
    return isSetField(field);
  }

  public boolean isSetCommission() {
    return isSetField(12);
  }

  public void set(quickfix.field.CommType value) {
    setField(value);
  }

  public quickfix.field.CommType get(quickfix.field.CommType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommType getCommType() throws FieldNotFound {
    return get(new quickfix.field.CommType());
  }

  public boolean isSet(quickfix.field.CommType field) {
    return isSetField(field);
  }

  public boolean isSetCommType() {
    return isSetField(13);
  }

  public void set(quickfix.field.CommCurrency value) {
    setField(value);
  }

  public quickfix.field.CommCurrency get(quickfix.field.CommCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommCurrency getCommCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommCurrency());
  }

  public boolean isSet(quickfix.field.CommCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommCurrency() {
    return isSetField(479);
  }

  public void set(quickfix.field.CommRate value) {
    setField(value);
  }

  public quickfix.field.CommRate get(quickfix.field.CommRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommRate getCommRate() throws FieldNotFound {
    return get(new quickfix.field.CommRate());
  }

  public boolean isSet(quickfix.field.CommRate field) {
    return isSetField(field);
  }

  public boolean isSetCommRate() {
    return isSetField(1233);
  }

  public void set(quickfix.field.CommUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.CommUnitOfMeasure get(quickfix.field.CommUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommUnitOfMeasure getCommUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.CommUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.CommUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetCommUnitOfMeasure() {
    return isSetField(1238);
  }

  public void set(quickfix.field.FundRenewWaiv value) {
    setField(value);
  }

  public quickfix.field.FundRenewWaiv get(quickfix.field.FundRenewWaiv value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
    return get(new quickfix.field.FundRenewWaiv());
  }

  public boolean isSet(quickfix.field.FundRenewWaiv field) {
    return isSetField(field);
  }

  public boolean isSetFundRenewWaiv() {
    return isSetField(497);
  }
}
