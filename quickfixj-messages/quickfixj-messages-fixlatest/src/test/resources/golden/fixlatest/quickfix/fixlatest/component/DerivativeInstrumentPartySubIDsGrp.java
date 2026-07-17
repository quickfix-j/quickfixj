/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeInstrumentPartySubIDsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1296, };
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeInstrumentPartySubIDsGrp() {
    super();
  }

  public void set(quickfix.field.NoDerivativeInstrumentPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs get(quickfix.field.NoDerivativeInstrumentPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrumentPartySubIDs getNoDerivativeInstrumentPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrumentPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrumentPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrumentPartySubIDs() {
    return isSetField(1296);
  }

public static class NoDerivativeInstrumentPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1297, 1298, 0};

  public NoDerivativeInstrumentPartySubIDs() {
    super(1296, 1297, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubID get(quickfix.field.DerivativeInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubID getDerivativeInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubID() {
    return isSetField(1297);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType get(quickfix.field.DerivativeInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType getDerivativeInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubIDType() {
    return isSetField(1298);
  }
}

  public void set(quickfix.field.DerivativeInstrumentPartySubID value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubID get(quickfix.field.DerivativeInstrumentPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubID getDerivativeInstrumentPartySubID() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubID());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubID() {
    return isSetField(1297);
  }

  public void set(quickfix.field.DerivativeInstrumentPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType get(quickfix.field.DerivativeInstrumentPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrumentPartySubIDType getDerivativeInstrumentPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrumentPartySubIDType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrumentPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrumentPartySubIDType() {
    return isSetField(1298);
  }
}
