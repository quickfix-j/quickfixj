/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RoutingGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {215, };
  protected int[] getGroupFields() { return componentGroups; }

  public RoutingGrp() {
    super();
  }

  public void set(quickfix.field.NoRoutingIDs value) {
    setField(value);
  }

  public quickfix.field.NoRoutingIDs get(quickfix.field.NoRoutingIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRoutingIDs getNoRoutingIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRoutingIDs());
  }

  public boolean isSet(quickfix.field.NoRoutingIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRoutingIDs() {
    return isSetField(215);
  }

public static class NoRoutingIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {216, 217, 0};

  public NoRoutingIDs() {
    super(215, 216, ORDER);
  }

  public void set(quickfix.field.RoutingType value) {
    setField(value);
  }

  public quickfix.field.RoutingType get(quickfix.field.RoutingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingType getRoutingType() throws FieldNotFound {
    return get(new quickfix.field.RoutingType());
  }

  public boolean isSet(quickfix.field.RoutingType field) {
    return isSetField(field);
  }

  public boolean isSetRoutingType() {
    return isSetField(216);
  }

  public void set(quickfix.field.RoutingID value) {
    setField(value);
  }

  public quickfix.field.RoutingID get(quickfix.field.RoutingID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingID getRoutingID() throws FieldNotFound {
    return get(new quickfix.field.RoutingID());
  }

  public boolean isSet(quickfix.field.RoutingID field) {
    return isSetField(field);
  }

  public boolean isSetRoutingID() {
    return isSetField(217);
  }
}

  public void set(quickfix.field.RoutingType value) {
    setField(value);
  }

  public quickfix.field.RoutingType get(quickfix.field.RoutingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingType getRoutingType() throws FieldNotFound {
    return get(new quickfix.field.RoutingType());
  }

  public boolean isSet(quickfix.field.RoutingType field) {
    return isSetField(field);
  }

  public boolean isSetRoutingType() {
    return isSetField(216);
  }

  public void set(quickfix.field.RoutingID value) {
    setField(value);
  }

  public quickfix.field.RoutingID get(quickfix.field.RoutingID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingID getRoutingID() throws FieldNotFound {
    return get(new quickfix.field.RoutingID());
  }

  public boolean isSet(quickfix.field.RoutingID field) {
    return isSetField(field);
  }

  public boolean isSetRoutingID() {
    return isSetField(217);
  }
}
