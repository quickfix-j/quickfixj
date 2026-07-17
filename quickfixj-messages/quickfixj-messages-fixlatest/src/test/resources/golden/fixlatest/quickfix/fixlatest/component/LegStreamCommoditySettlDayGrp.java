/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommoditySettlDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41680, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommoditySettlDayGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlDays get(quickfix.field.NoLegStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlDays getNoLegStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlDays() {
    return isSetField(41680);
  }

public static class NoLegStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41681, 41682, 41683, 0};

  public NoLegStreamCommoditySettlDays() {
    super(41680, 41681, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDay get(quickfix.field.LegStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDay getLegStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDay() {
    return isSetField(41681);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours get(quickfix.field.LegStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours getLegStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTotalHours() {
    return isSetField(41682);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp getLegStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp());
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
}

  public void set(quickfix.field.LegStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDay get(quickfix.field.LegStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDay getLegStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDay() {
    return isSetField(41681);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours get(quickfix.field.LegStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours getLegStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTotalHours() {
    return isSetField(41682);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp getLegStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp());
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
}
