/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TrdRepIndicatorsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1387, };
  protected int[] getGroupFields() { return componentGroups; }

  public TrdRepIndicatorsGrp() {
    super();
  }

  public void set(quickfix.field.NoTrdRepIndicators value) {
    setField(value);
  }

  public quickfix.field.NoTrdRepIndicators get(quickfix.field.NoTrdRepIndicators value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRepIndicators getNoTrdRepIndicators() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRepIndicators());
  }

  public boolean isSet(quickfix.field.NoTrdRepIndicators field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRepIndicators() {
    return isSetField(1387);
  }

public static class NoTrdRepIndicators extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1388, 1389, 0};

  public NoTrdRepIndicators() {
    super(1387, 1388, ORDER);
  }

  public void set(quickfix.field.TrdRepPartyRole value) {
    setField(value);
  }

  public quickfix.field.TrdRepPartyRole get(quickfix.field.TrdRepPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRepPartyRole getTrdRepPartyRole() throws FieldNotFound {
    return get(new quickfix.field.TrdRepPartyRole());
  }

  public boolean isSet(quickfix.field.TrdRepPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetTrdRepPartyRole() {
    return isSetField(1388);
  }

  public void set(quickfix.field.TrdRepIndicator value) {
    setField(value);
  }

  public quickfix.field.TrdRepIndicator get(quickfix.field.TrdRepIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRepIndicator getTrdRepIndicator() throws FieldNotFound {
    return get(new quickfix.field.TrdRepIndicator());
  }

  public boolean isSet(quickfix.field.TrdRepIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTrdRepIndicator() {
    return isSetField(1389);
  }
}

  public void set(quickfix.field.TrdRepPartyRole value) {
    setField(value);
  }

  public quickfix.field.TrdRepPartyRole get(quickfix.field.TrdRepPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRepPartyRole getTrdRepPartyRole() throws FieldNotFound {
    return get(new quickfix.field.TrdRepPartyRole());
  }

  public boolean isSet(quickfix.field.TrdRepPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetTrdRepPartyRole() {
    return isSetField(1388);
  }

  public void set(quickfix.field.TrdRepIndicator value) {
    setField(value);
  }

  public quickfix.field.TrdRepIndicator get(quickfix.field.TrdRepIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRepIndicator getTrdRepIndicator() throws FieldNotFound {
    return get(new quickfix.field.TrdRepIndicator());
  }

  public boolean isSet(quickfix.field.TrdRepIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTrdRepIndicator() {
    return isSetField(1389);
  }
}
