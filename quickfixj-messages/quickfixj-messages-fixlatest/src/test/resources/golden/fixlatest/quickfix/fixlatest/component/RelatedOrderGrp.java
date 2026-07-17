/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RelatedOrderGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {73, };
  protected int[] getGroupFields() { return componentGroups; }

  public RelatedOrderGrp() {
    super();
  }

  public void set(quickfix.field.NoOrders value) {
    setField(value);
  }

  public quickfix.field.NoOrders get(quickfix.field.NoOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrders getNoOrders() throws FieldNotFound {
    return get(new quickfix.field.NoOrders());
  }

  public boolean isSet(quickfix.field.NoOrders field) {
    return isSetField(field);
  }

  public boolean isSetNoOrders() {
    return isSetField(73);
  }

public static class NoOrders extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2887, 2888, 2836, 2889, 2890, 2835, 0};

  public NoOrders() {
    super(73, 2887, ORDER);
  }

  public void set(quickfix.field.RelatedOrderID value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderID get(quickfix.field.RelatedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderID getRelatedOrderID() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderID());
  }

  public boolean isSet(quickfix.field.RelatedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderID() {
    return isSetField(2887);
  }

  public void set(quickfix.field.RelatedOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderIDSource get(quickfix.field.RelatedOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderIDSource getRelatedOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderIDSource());
  }

  public boolean isSet(quickfix.field.RelatedOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderIDSource() {
    return isSetField(2888);
  }

  public void set(quickfix.field.RelatedOrderTime value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderTime get(quickfix.field.RelatedOrderTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderTime getRelatedOrderTime() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderTime());
  }

  public boolean isSet(quickfix.field.RelatedOrderTime field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderTime() {
    return isSetField(2836);
  }

  public void set(quickfix.field.RelatedOrderQty value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderQty get(quickfix.field.RelatedOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderQty getRelatedOrderQty() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderQty());
  }

  public boolean isSet(quickfix.field.RelatedOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderQty() {
    return isSetField(2889);
  }

  public void set(quickfix.field.OrderRelationship value) {
    setField(value);
  }

  public quickfix.field.OrderRelationship get(quickfix.field.OrderRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRelationship getOrderRelationship() throws FieldNotFound {
    return get(new quickfix.field.OrderRelationship());
  }

  public boolean isSet(quickfix.field.OrderRelationship field) {
    return isSetField(field);
  }

  public boolean isSetOrderRelationship() {
    return isSetField(2890);
  }

  public void set(quickfix.field.OrderOriginationFirmID value) {
    setField(value);
  }

  public quickfix.field.OrderOriginationFirmID get(quickfix.field.OrderOriginationFirmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOriginationFirmID getOrderOriginationFirmID() throws FieldNotFound {
    return get(new quickfix.field.OrderOriginationFirmID());
  }

  public boolean isSet(quickfix.field.OrderOriginationFirmID field) {
    return isSetField(field);
  }

  public boolean isSetOrderOriginationFirmID() {
    return isSetField(2835);
  }
}

  public void set(quickfix.field.RelatedOrderID value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderID get(quickfix.field.RelatedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderID getRelatedOrderID() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderID());
  }

  public boolean isSet(quickfix.field.RelatedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderID() {
    return isSetField(2887);
  }

  public void set(quickfix.field.RelatedOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderIDSource get(quickfix.field.RelatedOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderIDSource getRelatedOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderIDSource());
  }

  public boolean isSet(quickfix.field.RelatedOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderIDSource() {
    return isSetField(2888);
  }

  public void set(quickfix.field.RelatedOrderTime value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderTime get(quickfix.field.RelatedOrderTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderTime getRelatedOrderTime() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderTime());
  }

  public boolean isSet(quickfix.field.RelatedOrderTime field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderTime() {
    return isSetField(2836);
  }

  public void set(quickfix.field.RelatedOrderQty value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderQty get(quickfix.field.RelatedOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderQty getRelatedOrderQty() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderQty());
  }

  public boolean isSet(quickfix.field.RelatedOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderQty() {
    return isSetField(2889);
  }

  public void set(quickfix.field.OrderRelationship value) {
    setField(value);
  }

  public quickfix.field.OrderRelationship get(quickfix.field.OrderRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRelationship getOrderRelationship() throws FieldNotFound {
    return get(new quickfix.field.OrderRelationship());
  }

  public boolean isSet(quickfix.field.OrderRelationship field) {
    return isSetField(field);
  }

  public boolean isSetOrderRelationship() {
    return isSetField(2890);
  }

  public void set(quickfix.field.OrderOriginationFirmID value) {
    setField(value);
  }

  public quickfix.field.OrderOriginationFirmID get(quickfix.field.OrderOriginationFirmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOriginationFirmID getOrderOriginationFirmID() throws FieldNotFound {
    return get(new quickfix.field.OrderOriginationFirmID());
  }

  public boolean isSet(quickfix.field.OrderOriginationFirmID field) {
    return isSetField(field);
  }

  public boolean isSetOrderOriginationFirmID() {
    return isSetField(2835);
  }
}
