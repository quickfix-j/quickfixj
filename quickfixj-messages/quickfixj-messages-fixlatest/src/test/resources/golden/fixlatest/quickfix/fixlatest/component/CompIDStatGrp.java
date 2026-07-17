/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CompIDStatGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {936, };
  protected int[] getGroupFields() { return componentGroups; }

  public CompIDStatGrp() {
    super();
  }

  public void set(quickfix.field.NoCompIDs value) {
    setField(value);
  }

  public quickfix.field.NoCompIDs get(quickfix.field.NoCompIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCompIDs getNoCompIDs() throws FieldNotFound {
    return get(new quickfix.field.NoCompIDs());
  }

  public boolean isSet(quickfix.field.NoCompIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoCompIDs() {
    return isSetField(936);
  }

public static class NoCompIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {930, 931, 283, 284, 928, 929, 0};

  public NoCompIDs() {
    super(936, 930, ORDER);
  }

  public void set(quickfix.field.RefCompID value) {
    setField(value);
  }

  public quickfix.field.RefCompID get(quickfix.field.RefCompID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefCompID getRefCompID() throws FieldNotFound {
    return get(new quickfix.field.RefCompID());
  }

  public boolean isSet(quickfix.field.RefCompID field) {
    return isSetField(field);
  }

  public boolean isSetRefCompID() {
    return isSetField(930);
  }

  public void set(quickfix.field.RefSubID value) {
    setField(value);
  }

  public quickfix.field.RefSubID get(quickfix.field.RefSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefSubID getRefSubID() throws FieldNotFound {
    return get(new quickfix.field.RefSubID());
  }

  public boolean isSet(quickfix.field.RefSubID field) {
    return isSetField(field);
  }

  public boolean isSetRefSubID() {
    return isSetField(931);
  }

  public void set(quickfix.field.LocationID value) {
    setField(value);
  }

  public quickfix.field.LocationID get(quickfix.field.LocationID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LocationID getLocationID() throws FieldNotFound {
    return get(new quickfix.field.LocationID());
  }

  public boolean isSet(quickfix.field.LocationID field) {
    return isSetField(field);
  }

  public boolean isSetLocationID() {
    return isSetField(283);
  }

  public void set(quickfix.field.DeskID value) {
    setField(value);
  }

  public quickfix.field.DeskID get(quickfix.field.DeskID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskID getDeskID() throws FieldNotFound {
    return get(new quickfix.field.DeskID());
  }

  public boolean isSet(quickfix.field.DeskID field) {
    return isSetField(field);
  }

  public boolean isSetDeskID() {
    return isSetField(284);
  }

  public void set(quickfix.field.StatusValue value) {
    setField(value);
  }

  public quickfix.field.StatusValue get(quickfix.field.StatusValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StatusValue getStatusValue() throws FieldNotFound {
    return get(new quickfix.field.StatusValue());
  }

  public boolean isSet(quickfix.field.StatusValue field) {
    return isSetField(field);
  }

  public boolean isSetStatusValue() {
    return isSetField(928);
  }

  public void set(quickfix.field.StatusText value) {
    setField(value);
  }

  public quickfix.field.StatusText get(quickfix.field.StatusText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StatusText getStatusText() throws FieldNotFound {
    return get(new quickfix.field.StatusText());
  }

  public boolean isSet(quickfix.field.StatusText field) {
    return isSetField(field);
  }

  public boolean isSetStatusText() {
    return isSetField(929);
  }
}

  public void set(quickfix.field.RefCompID value) {
    setField(value);
  }

  public quickfix.field.RefCompID get(quickfix.field.RefCompID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefCompID getRefCompID() throws FieldNotFound {
    return get(new quickfix.field.RefCompID());
  }

  public boolean isSet(quickfix.field.RefCompID field) {
    return isSetField(field);
  }

  public boolean isSetRefCompID() {
    return isSetField(930);
  }

  public void set(quickfix.field.RefSubID value) {
    setField(value);
  }

  public quickfix.field.RefSubID get(quickfix.field.RefSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefSubID getRefSubID() throws FieldNotFound {
    return get(new quickfix.field.RefSubID());
  }

  public boolean isSet(quickfix.field.RefSubID field) {
    return isSetField(field);
  }

  public boolean isSetRefSubID() {
    return isSetField(931);
  }

  public void set(quickfix.field.LocationID value) {
    setField(value);
  }

  public quickfix.field.LocationID get(quickfix.field.LocationID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LocationID getLocationID() throws FieldNotFound {
    return get(new quickfix.field.LocationID());
  }

  public boolean isSet(quickfix.field.LocationID field) {
    return isSetField(field);
  }

  public boolean isSetLocationID() {
    return isSetField(283);
  }

  public void set(quickfix.field.DeskID value) {
    setField(value);
  }

  public quickfix.field.DeskID get(quickfix.field.DeskID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeskID getDeskID() throws FieldNotFound {
    return get(new quickfix.field.DeskID());
  }

  public boolean isSet(quickfix.field.DeskID field) {
    return isSetField(field);
  }

  public boolean isSetDeskID() {
    return isSetField(284);
  }

  public void set(quickfix.field.StatusValue value) {
    setField(value);
  }

  public quickfix.field.StatusValue get(quickfix.field.StatusValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StatusValue getStatusValue() throws FieldNotFound {
    return get(new quickfix.field.StatusValue());
  }

  public boolean isSet(quickfix.field.StatusValue field) {
    return isSetField(field);
  }

  public boolean isSetStatusValue() {
    return isSetField(928);
  }

  public void set(quickfix.field.StatusText value) {
    setField(value);
  }

  public quickfix.field.StatusText get(quickfix.field.StatusText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StatusText getStatusText() throws FieldNotFound {
    return get(new quickfix.field.StatusText());
  }

  public boolean isSet(quickfix.field.StatusText field) {
    return isSetField(field);
  }

  public boolean isSetStatusText() {
    return isSetField(929);
  }
}
