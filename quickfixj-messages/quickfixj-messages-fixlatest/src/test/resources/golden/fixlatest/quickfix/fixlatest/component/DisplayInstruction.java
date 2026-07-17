/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DisplayInstruction extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1138, 1082, 1608, 2828, 1083, 1084, 1085, 1086, 1087, 1088, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DisplayInstruction() {
    super();
  }

  public void set(quickfix.field.DisplayQty value) {
    setField(value);
  }

  public quickfix.field.DisplayQty get(quickfix.field.DisplayQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayQty getDisplayQty() throws FieldNotFound {
    return get(new quickfix.field.DisplayQty());
  }

  public boolean isSet(quickfix.field.DisplayQty field) {
    return isSetField(field);
  }

  public boolean isSetDisplayQty() {
    return isSetField(1138);
  }

  public void set(quickfix.field.SecondaryDisplayQty value) {
    setField(value);
  }

  public quickfix.field.SecondaryDisplayQty get(quickfix.field.SecondaryDisplayQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryDisplayQty getSecondaryDisplayQty() throws FieldNotFound {
    return get(new quickfix.field.SecondaryDisplayQty());
  }

  public boolean isSet(quickfix.field.SecondaryDisplayQty field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryDisplayQty() {
    return isSetField(1082);
  }

  public void set(quickfix.field.InitialDisplayQty value) {
    setField(value);
  }

  public quickfix.field.InitialDisplayQty get(quickfix.field.InitialDisplayQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InitialDisplayQty getInitialDisplayQty() throws FieldNotFound {
    return get(new quickfix.field.InitialDisplayQty());
  }

  public boolean isSet(quickfix.field.InitialDisplayQty field) {
    return isSetField(field);
  }

  public boolean isSetInitialDisplayQty() {
    return isSetField(1608);
  }

  public void set(quickfix.field.CurrentDisplayPrice value) {
    setField(value);
  }

  public quickfix.field.CurrentDisplayPrice get(quickfix.field.CurrentDisplayPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentDisplayPrice getCurrentDisplayPrice() throws FieldNotFound {
    return get(new quickfix.field.CurrentDisplayPrice());
  }

  public boolean isSet(quickfix.field.CurrentDisplayPrice field) {
    return isSetField(field);
  }

  public boolean isSetCurrentDisplayPrice() {
    return isSetField(2828);
  }

  public void set(quickfix.field.DisplayWhen value) {
    setField(value);
  }

  public quickfix.field.DisplayWhen get(quickfix.field.DisplayWhen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayWhen getDisplayWhen() throws FieldNotFound {
    return get(new quickfix.field.DisplayWhen());
  }

  public boolean isSet(quickfix.field.DisplayWhen field) {
    return isSetField(field);
  }

  public boolean isSetDisplayWhen() {
    return isSetField(1083);
  }

  public void set(quickfix.field.DisplayMethod value) {
    setField(value);
  }

  public quickfix.field.DisplayMethod get(quickfix.field.DisplayMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayMethod getDisplayMethod() throws FieldNotFound {
    return get(new quickfix.field.DisplayMethod());
  }

  public boolean isSet(quickfix.field.DisplayMethod field) {
    return isSetField(field);
  }

  public boolean isSetDisplayMethod() {
    return isSetField(1084);
  }

  public void set(quickfix.field.DisplayLowQty value) {
    setField(value);
  }

  public quickfix.field.DisplayLowQty get(quickfix.field.DisplayLowQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayLowQty getDisplayLowQty() throws FieldNotFound {
    return get(new quickfix.field.DisplayLowQty());
  }

  public boolean isSet(quickfix.field.DisplayLowQty field) {
    return isSetField(field);
  }

  public boolean isSetDisplayLowQty() {
    return isSetField(1085);
  }

  public void set(quickfix.field.DisplayHighQty value) {
    setField(value);
  }

  public quickfix.field.DisplayHighQty get(quickfix.field.DisplayHighQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayHighQty getDisplayHighQty() throws FieldNotFound {
    return get(new quickfix.field.DisplayHighQty());
  }

  public boolean isSet(quickfix.field.DisplayHighQty field) {
    return isSetField(field);
  }

  public boolean isSetDisplayHighQty() {
    return isSetField(1086);
  }

  public void set(quickfix.field.DisplayMinIncr value) {
    setField(value);
  }

  public quickfix.field.DisplayMinIncr get(quickfix.field.DisplayMinIncr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisplayMinIncr getDisplayMinIncr() throws FieldNotFound {
    return get(new quickfix.field.DisplayMinIncr());
  }

  public boolean isSet(quickfix.field.DisplayMinIncr field) {
    return isSetField(field);
  }

  public boolean isSetDisplayMinIncr() {
    return isSetField(1087);
  }

  public void set(quickfix.field.RefreshQty value) {
    setField(value);
  }

  public quickfix.field.RefreshQty get(quickfix.field.RefreshQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefreshQty getRefreshQty() throws FieldNotFound {
    return get(new quickfix.field.RefreshQty());
  }

  public boolean isSet(quickfix.field.RefreshQty field) {
    return isSetField(field);
  }

  public boolean isSetRefreshQty() {
    return isSetField(1088);
  }
}
