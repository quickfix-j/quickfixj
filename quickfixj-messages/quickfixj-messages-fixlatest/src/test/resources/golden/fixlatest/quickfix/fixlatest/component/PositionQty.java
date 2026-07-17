/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PositionQty extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {702, };
  protected int[] getGroupFields() { return componentGroups; }

  public PositionQty() {
    super();
  }

  public void set(quickfix.field.NoPositions value) {
    setField(value);
  }

  public quickfix.field.NoPositions get(quickfix.field.NoPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPositions getNoPositions() throws FieldNotFound {
    return get(new quickfix.field.NoPositions());
  }

  public boolean isSet(quickfix.field.NoPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoPositions() {
    return isSetField(702);
  }

public static class NoPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {703, 704, 705, 1654, 706, 976, 1836, 1835, 539, 0};

  public NoPositions() {
    super(702, 703, ORDER);
  }

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasure get(quickfix.field.PosQtyUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasure getPosQtyUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasure() {
    return isSetField(1836);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency get(quickfix.field.PosQtyUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency getPosQtyUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasureCurrency() {
    return isSetField(1835);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}
}

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasure get(quickfix.field.PosQtyUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasure getPosQtyUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasure() {
    return isSetField(1836);
  }

  public void set(quickfix.field.PosQtyUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency get(quickfix.field.PosQtyUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyUnitOfMeasureCurrency getPosQtyUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.PosQtyUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.PosQtyUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyUnitOfMeasureCurrency() {
    return isSetField(1835);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}
}
