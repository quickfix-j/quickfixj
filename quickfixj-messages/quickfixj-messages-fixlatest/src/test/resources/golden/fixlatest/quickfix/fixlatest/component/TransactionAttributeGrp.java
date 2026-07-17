/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TransactionAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2871, };
  protected int[] getGroupFields() { return componentGroups; }

  public TransactionAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoTransactionAttributes value) {
    setField(value);
  }

  public quickfix.field.NoTransactionAttributes get(quickfix.field.NoTransactionAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTransactionAttributes getNoTransactionAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoTransactionAttributes());
  }

  public boolean isSet(quickfix.field.NoTransactionAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoTransactionAttributes() {
    return isSetField(2871);
  }

public static class NoTransactionAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2872, 2873, 0};

  public NoTransactionAttributes() {
    super(2871, 2872, ORDER);
  }

  public void set(quickfix.field.TransactionAttributeType value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeType get(quickfix.field.TransactionAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeType getTransactionAttributeType() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeType());
  }

  public boolean isSet(quickfix.field.TransactionAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeType() {
    return isSetField(2872);
  }

  public void set(quickfix.field.TransactionAttributeValue value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeValue get(quickfix.field.TransactionAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeValue getTransactionAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeValue());
  }

  public boolean isSet(quickfix.field.TransactionAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeValue() {
    return isSetField(2873);
  }
}

  public void set(quickfix.field.TransactionAttributeType value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeType get(quickfix.field.TransactionAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeType getTransactionAttributeType() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeType());
  }

  public boolean isSet(quickfix.field.TransactionAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeType() {
    return isSetField(2872);
  }

  public void set(quickfix.field.TransactionAttributeValue value) {
    setField(value);
  }

  public quickfix.field.TransactionAttributeValue get(quickfix.field.TransactionAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactionAttributeValue getTransactionAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.TransactionAttributeValue());
  }

  public boolean isSet(quickfix.field.TransactionAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetTransactionAttributeValue() {
    return isSetField(2873);
  }
}
