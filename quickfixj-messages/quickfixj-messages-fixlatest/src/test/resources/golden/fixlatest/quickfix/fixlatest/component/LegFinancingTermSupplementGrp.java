/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegFinancingTermSupplementGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42200, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegFinancingTermSupplementGrp() {
    super();
  }

  public void set(quickfix.field.NoLegFinancingTermSupplements value) {
    setField(value);
  }

  public quickfix.field.NoLegFinancingTermSupplements get(quickfix.field.NoLegFinancingTermSupplements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegFinancingTermSupplements getNoLegFinancingTermSupplements() throws FieldNotFound {
    return get(new quickfix.field.NoLegFinancingTermSupplements());
  }

  public boolean isSet(quickfix.field.NoLegFinancingTermSupplements field) {
    return isSetField(field);
  }

  public boolean isSetNoLegFinancingTermSupplements() {
    return isSetField(42200);
  }

public static class NoLegFinancingTermSupplements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42201, 42202, 0};

  public NoLegFinancingTermSupplements() {
    super(42200, 42201, ORDER);
  }

  public void set(quickfix.field.LegFinancingTermSupplementDesc value) {
    setField(value);
  }

  public quickfix.field.LegFinancingTermSupplementDesc get(quickfix.field.LegFinancingTermSupplementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancingTermSupplementDesc getLegFinancingTermSupplementDesc() throws FieldNotFound {
    return get(new quickfix.field.LegFinancingTermSupplementDesc());
  }

  public boolean isSet(quickfix.field.LegFinancingTermSupplementDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancingTermSupplementDesc() {
    return isSetField(42201);
  }

  public void set(quickfix.field.LegFinancingTermSupplementDate value) {
    setField(value);
  }

  public quickfix.field.LegFinancingTermSupplementDate get(quickfix.field.LegFinancingTermSupplementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancingTermSupplementDate getLegFinancingTermSupplementDate() throws FieldNotFound {
    return get(new quickfix.field.LegFinancingTermSupplementDate());
  }

  public boolean isSet(quickfix.field.LegFinancingTermSupplementDate field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancingTermSupplementDate() {
    return isSetField(42202);
  }
}

  public void set(quickfix.field.LegFinancingTermSupplementDesc value) {
    setField(value);
  }

  public quickfix.field.LegFinancingTermSupplementDesc get(quickfix.field.LegFinancingTermSupplementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancingTermSupplementDesc getLegFinancingTermSupplementDesc() throws FieldNotFound {
    return get(new quickfix.field.LegFinancingTermSupplementDesc());
  }

  public boolean isSet(quickfix.field.LegFinancingTermSupplementDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancingTermSupplementDesc() {
    return isSetField(42201);
  }

  public void set(quickfix.field.LegFinancingTermSupplementDate value) {
    setField(value);
  }

  public quickfix.field.LegFinancingTermSupplementDate get(quickfix.field.LegFinancingTermSupplementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancingTermSupplementDate getLegFinancingTermSupplementDate() throws FieldNotFound {
    return get(new quickfix.field.LegFinancingTermSupplementDate());
  }

  public boolean isSet(quickfix.field.LegFinancingTermSupplementDate field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancingTermSupplementDate() {
    return isSetField(42202);
  }
}
