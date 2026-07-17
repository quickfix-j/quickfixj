/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ContraGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {382, };
  protected int[] getGroupFields() { return componentGroups; }

  public ContraGrp() {
    super();
  }

  public void set(quickfix.field.NoContraBrokers value) {
    setField(value);
  }

  public quickfix.field.NoContraBrokers get(quickfix.field.NoContraBrokers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContraBrokers getNoContraBrokers() throws FieldNotFound {
    return get(new quickfix.field.NoContraBrokers());
  }

  public boolean isSet(quickfix.field.NoContraBrokers field) {
    return isSetField(field);
  }

  public boolean isSetNoContraBrokers() {
    return isSetField(382);
  }

public static class NoContraBrokers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {375, 337, 437, 438, 655, 0};

  public NoContraBrokers() {
    super(382, 375, ORDER);
  }

  public void set(quickfix.field.ContraBroker value) {
    setField(value);
  }

  public quickfix.field.ContraBroker get(quickfix.field.ContraBroker value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraBroker getContraBroker() throws FieldNotFound {
    return get(new quickfix.field.ContraBroker());
  }

  public boolean isSet(quickfix.field.ContraBroker field) {
    return isSetField(field);
  }

  public boolean isSetContraBroker() {
    return isSetField(375);
  }

  public void set(quickfix.field.ContraTrader value) {
    setField(value);
  }

  public quickfix.field.ContraTrader get(quickfix.field.ContraTrader value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTrader getContraTrader() throws FieldNotFound {
    return get(new quickfix.field.ContraTrader());
  }

  public boolean isSet(quickfix.field.ContraTrader field) {
    return isSetField(field);
  }

  public boolean isSetContraTrader() {
    return isSetField(337);
  }

  public void set(quickfix.field.ContraTradeQty value) {
    setField(value);
  }

  public quickfix.field.ContraTradeQty get(quickfix.field.ContraTradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTradeQty getContraTradeQty() throws FieldNotFound {
    return get(new quickfix.field.ContraTradeQty());
  }

  public boolean isSet(quickfix.field.ContraTradeQty field) {
    return isSetField(field);
  }

  public boolean isSetContraTradeQty() {
    return isSetField(437);
  }

  public void set(quickfix.field.ContraTradeTime value) {
    setField(value);
  }

  public quickfix.field.ContraTradeTime get(quickfix.field.ContraTradeTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTradeTime getContraTradeTime() throws FieldNotFound {
    return get(new quickfix.field.ContraTradeTime());
  }

  public boolean isSet(quickfix.field.ContraTradeTime field) {
    return isSetField(field);
  }

  public boolean isSetContraTradeTime() {
    return isSetField(438);
  }

  public void set(quickfix.field.ContraLegRefID value) {
    setField(value);
  }

  public quickfix.field.ContraLegRefID get(quickfix.field.ContraLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraLegRefID getContraLegRefID() throws FieldNotFound {
    return get(new quickfix.field.ContraLegRefID());
  }

  public boolean isSet(quickfix.field.ContraLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetContraLegRefID() {
    return isSetField(655);
  }
}

  public void set(quickfix.field.ContraBroker value) {
    setField(value);
  }

  public quickfix.field.ContraBroker get(quickfix.field.ContraBroker value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraBroker getContraBroker() throws FieldNotFound {
    return get(new quickfix.field.ContraBroker());
  }

  public boolean isSet(quickfix.field.ContraBroker field) {
    return isSetField(field);
  }

  public boolean isSetContraBroker() {
    return isSetField(375);
  }

  public void set(quickfix.field.ContraTrader value) {
    setField(value);
  }

  public quickfix.field.ContraTrader get(quickfix.field.ContraTrader value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTrader getContraTrader() throws FieldNotFound {
    return get(new quickfix.field.ContraTrader());
  }

  public boolean isSet(quickfix.field.ContraTrader field) {
    return isSetField(field);
  }

  public boolean isSetContraTrader() {
    return isSetField(337);
  }

  public void set(quickfix.field.ContraTradeQty value) {
    setField(value);
  }

  public quickfix.field.ContraTradeQty get(quickfix.field.ContraTradeQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTradeQty getContraTradeQty() throws FieldNotFound {
    return get(new quickfix.field.ContraTradeQty());
  }

  public boolean isSet(quickfix.field.ContraTradeQty field) {
    return isSetField(field);
  }

  public boolean isSetContraTradeQty() {
    return isSetField(437);
  }

  public void set(quickfix.field.ContraTradeTime value) {
    setField(value);
  }

  public quickfix.field.ContraTradeTime get(quickfix.field.ContraTradeTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraTradeTime getContraTradeTime() throws FieldNotFound {
    return get(new quickfix.field.ContraTradeTime());
  }

  public boolean isSet(quickfix.field.ContraTradeTime field) {
    return isSetField(field);
  }

  public boolean isSetContraTradeTime() {
    return isSetField(438);
  }

  public void set(quickfix.field.ContraLegRefID value) {
    setField(value);
  }

  public quickfix.field.ContraLegRefID get(quickfix.field.ContraLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContraLegRefID getContraLegRefID() throws FieldNotFound {
    return get(new quickfix.field.ContraLegRefID());
  }

  public boolean isSet(quickfix.field.ContraLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetContraLegRefID() {
    return isSetField(655);
  }
}
