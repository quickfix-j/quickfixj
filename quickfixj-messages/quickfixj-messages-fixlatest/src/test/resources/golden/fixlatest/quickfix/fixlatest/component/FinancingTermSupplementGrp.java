/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FinancingTermSupplementGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40046, };
  protected int[] getGroupFields() { return componentGroups; }

  public FinancingTermSupplementGrp() {
    super();
  }

  public void set(quickfix.field.NoFinancingTermSupplements value) {
    setField(value);
  }

  public quickfix.field.NoFinancingTermSupplements get(quickfix.field.NoFinancingTermSupplements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFinancingTermSupplements getNoFinancingTermSupplements() throws FieldNotFound {
    return get(new quickfix.field.NoFinancingTermSupplements());
  }

  public boolean isSet(quickfix.field.NoFinancingTermSupplements field) {
    return isSetField(field);
  }

  public boolean isSetNoFinancingTermSupplements() {
    return isSetField(40046);
  }

public static class NoFinancingTermSupplements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40047, 40048, 0};

  public NoFinancingTermSupplements() {
    super(40046, 40047, ORDER);
  }

  public void set(quickfix.field.FinancingTermSupplementDesc value) {
    setField(value);
  }

  public quickfix.field.FinancingTermSupplementDesc get(quickfix.field.FinancingTermSupplementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancingTermSupplementDesc getFinancingTermSupplementDesc() throws FieldNotFound {
    return get(new quickfix.field.FinancingTermSupplementDesc());
  }

  public boolean isSet(quickfix.field.FinancingTermSupplementDesc field) {
    return isSetField(field);
  }

  public boolean isSetFinancingTermSupplementDesc() {
    return isSetField(40047);
  }

  public void set(quickfix.field.FinancingTermSupplementDate value) {
    setField(value);
  }

  public quickfix.field.FinancingTermSupplementDate get(quickfix.field.FinancingTermSupplementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancingTermSupplementDate getFinancingTermSupplementDate() throws FieldNotFound {
    return get(new quickfix.field.FinancingTermSupplementDate());
  }

  public boolean isSet(quickfix.field.FinancingTermSupplementDate field) {
    return isSetField(field);
  }

  public boolean isSetFinancingTermSupplementDate() {
    return isSetField(40048);
  }
}

  public void set(quickfix.field.FinancingTermSupplementDesc value) {
    setField(value);
  }

  public quickfix.field.FinancingTermSupplementDesc get(quickfix.field.FinancingTermSupplementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancingTermSupplementDesc getFinancingTermSupplementDesc() throws FieldNotFound {
    return get(new quickfix.field.FinancingTermSupplementDesc());
  }

  public boolean isSet(quickfix.field.FinancingTermSupplementDesc field) {
    return isSetField(field);
  }

  public boolean isSetFinancingTermSupplementDesc() {
    return isSetField(40047);
  }

  public void set(quickfix.field.FinancingTermSupplementDate value) {
    setField(value);
  }

  public quickfix.field.FinancingTermSupplementDate get(quickfix.field.FinancingTermSupplementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancingTermSupplementDate getFinancingTermSupplementDate() throws FieldNotFound {
    return get(new quickfix.field.FinancingTermSupplementDate());
  }

  public boolean isSet(quickfix.field.FinancingTermSupplementDate field) {
    return isSetField(field);
  }

  public boolean isSetFinancingTermSupplementDate() {
    return isSetField(40048);
  }
}
