/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ExpirationQty extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {981, };
  protected int[] getGroupFields() { return componentGroups; }

  public ExpirationQty() {
    super();
  }

  public void set(quickfix.field.NoExpiration value) {
    setField(value);
  }

  public quickfix.field.NoExpiration get(quickfix.field.NoExpiration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExpiration getNoExpiration() throws FieldNotFound {
    return get(new quickfix.field.NoExpiration());
  }

  public boolean isSet(quickfix.field.NoExpiration field) {
    return isSetField(field);
  }

  public boolean isSetNoExpiration() {
    return isSetField(981);
  }

public static class NoExpiration extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {982, 983, 0};

  public NoExpiration() {
    super(981, 982, ORDER);
  }

  public void set(quickfix.field.ExpirationQtyType value) {
    setField(value);
  }

  public quickfix.field.ExpirationQtyType get(quickfix.field.ExpirationQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpirationQtyType getExpirationQtyType() throws FieldNotFound {
    return get(new quickfix.field.ExpirationQtyType());
  }

  public boolean isSet(quickfix.field.ExpirationQtyType field) {
    return isSetField(field);
  }

  public boolean isSetExpirationQtyType() {
    return isSetField(982);
  }

  public void set(quickfix.field.ExpQty value) {
    setField(value);
  }

  public quickfix.field.ExpQty get(quickfix.field.ExpQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpQty getExpQty() throws FieldNotFound {
    return get(new quickfix.field.ExpQty());
  }

  public boolean isSet(quickfix.field.ExpQty field) {
    return isSetField(field);
  }

  public boolean isSetExpQty() {
    return isSetField(983);
  }
}

  public void set(quickfix.field.ExpirationQtyType value) {
    setField(value);
  }

  public quickfix.field.ExpirationQtyType get(quickfix.field.ExpirationQtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpirationQtyType getExpirationQtyType() throws FieldNotFound {
    return get(new quickfix.field.ExpirationQtyType());
  }

  public boolean isSet(quickfix.field.ExpirationQtyType field) {
    return isSetField(field);
  }

  public boolean isSetExpirationQtyType() {
    return isSetField(982);
  }

  public void set(quickfix.field.ExpQty value) {
    setField(value);
  }

  public quickfix.field.ExpQty get(quickfix.field.ExpQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpQty getExpQty() throws FieldNotFound {
    return get(new quickfix.field.ExpQty());
  }

  public boolean isSet(quickfix.field.ExpQty field) {
    return isSetField(field);
  }

  public boolean isSetExpQty() {
    return isSetField(983);
  }
}
