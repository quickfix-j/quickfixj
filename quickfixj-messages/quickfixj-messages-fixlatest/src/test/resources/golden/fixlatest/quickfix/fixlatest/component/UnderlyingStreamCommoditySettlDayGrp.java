/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommoditySettlDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41996, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommoditySettlDayGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays get(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays getNoUnderlyingStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlDays() {
    return isSetField(41996);
  }

public static class NoUnderlyingStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41997, 41998, 41999, 0};

  public NoUnderlyingStreamCommoditySettlDays() {
    super(41996, 41997, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay get(quickfix.field.UnderlyingStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay getUnderlyingStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDay() {
    return isSetField(41997);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours get(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours getUnderlyingStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTotalHours() {
    return isSetField(41998);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp getUnderlyingStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes get(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes getNoUnderlyingStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlTimes() {
    return isSetField(41999);
  }

public static class NoUnderlyingStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42000, 42001, 41936, 0};

  public NoUnderlyingStreamCommoditySettlTimes() {
    super(41999, 42000, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay get(quickfix.field.UnderlyingStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay getUnderlyingStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDay() {
    return isSetField(41997);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours get(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours getUnderlyingStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTotalHours() {
    return isSetField(41998);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp getUnderlyingStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes get(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes getNoUnderlyingStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlTimes() {
    return isSetField(41999);
  }

public static class NoUnderlyingStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42000, 42001, 41936, 0};

  public NoUnderlyingStreamCommoditySettlTimes() {
    super(41999, 42000, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}
}
