/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommodityDataSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41677, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommodityDataSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCommodityDataSources value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommodityDataSources get(quickfix.field.NoLegStreamCommodityDataSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommodityDataSources getNoLegStreamCommodityDataSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommodityDataSources());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommodityDataSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommodityDataSources() {
    return isSetField(41677);
  }

public static class NoLegStreamCommodityDataSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41678, 41679, 0};

  public NoLegStreamCommodityDataSources() {
    super(41677, 41678, ORDER);
  }

  public void set(quickfix.field.LegStreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDataSourceID get(quickfix.field.LegStreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDataSourceID getLegStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDataSourceID() {
    return isSetField(41678);
  }

  public void set(quickfix.field.LegStreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDataSourceIDType get(quickfix.field.LegStreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDataSourceIDType getLegStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDataSourceIDType() {
    return isSetField(41679);
  }
}

  public void set(quickfix.field.LegStreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDataSourceID get(quickfix.field.LegStreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDataSourceID getLegStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDataSourceID() {
    return isSetField(41678);
  }

  public void set(quickfix.field.LegStreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDataSourceIDType get(quickfix.field.LegStreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDataSourceIDType getLegStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDataSourceIDType() {
    return isSetField(41679);
  }
}
