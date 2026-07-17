/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommoditySettlTimeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41683, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommoditySettlTimeGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes get(quickfix.field.NoLegStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes getNoLegStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlTimes() {
    return isSetField(41683);
  }

public static class NoLegStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41684, 41685, 41935, 0};

  public NoLegStreamCommoditySettlTimes() {
    super(41683, 41684, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlStart get(quickfix.field.LegStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlStart getLegStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlStart() {
    return isSetField(41684);
  }

  public void set(quickfix.field.LegStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlEnd get(quickfix.field.LegStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlEnd getLegStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlEnd() {
    return isSetField(41685);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeType get(quickfix.field.LegStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeType getLegStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeType() {
    return isSetField(41935);
  }
}

  public void set(quickfix.field.LegStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlStart get(quickfix.field.LegStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlStart getLegStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlStart() {
    return isSetField(41684);
  }

  public void set(quickfix.field.LegStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlEnd get(quickfix.field.LegStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlEnd getLegStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlEnd() {
    return isSetField(41685);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeType get(quickfix.field.LegStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeType getLegStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeType() {
    return isSetField(41935);
  }
}
