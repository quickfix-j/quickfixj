/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CpctyConfGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {862, };
  protected int[] getGroupFields() { return componentGroups; }

  public CpctyConfGrp() {
    super();
  }

  public void set(quickfix.field.NoCapacities value) {
    setField(value);
  }

  public quickfix.field.NoCapacities get(quickfix.field.NoCapacities value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCapacities getNoCapacities() throws FieldNotFound {
    return get(new quickfix.field.NoCapacities());
  }

  public boolean isSet(quickfix.field.NoCapacities field) {
    return isSetField(field);
  }

  public boolean isSetNoCapacities() {
    return isSetField(862);
  }

public static class NoCapacities extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {528, 529, 863, 0};

  public NoCapacities() {
    super(862, 528, ORDER);
  }

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.OrderCapacityQty value) {
    setField(value);
  }

  public quickfix.field.OrderCapacityQty get(quickfix.field.OrderCapacityQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacityQty getOrderCapacityQty() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacityQty());
  }

  public boolean isSet(quickfix.field.OrderCapacityQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacityQty() {
    return isSetField(863);
  }
}

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.OrderCapacityQty value) {
    setField(value);
  }

  public quickfix.field.OrderCapacityQty get(quickfix.field.OrderCapacityQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacityQty getOrderCapacityQty() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacityQty());
  }

  public boolean isSet(quickfix.field.OrderCapacityQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacityQty() {
    return isSetField(863);
  }
}
