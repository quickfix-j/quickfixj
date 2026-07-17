/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class IndexRollMonthGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2734, };
  protected int[] getGroupFields() { return componentGroups; }

  public IndexRollMonthGrp() {
    super();
  }

  public void set(quickfix.field.NoIndexRollMonths value) {
    setField(value);
  }

  public quickfix.field.NoIndexRollMonths get(quickfix.field.NoIndexRollMonths value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoIndexRollMonths getNoIndexRollMonths() throws FieldNotFound {
    return get(new quickfix.field.NoIndexRollMonths());
  }

  public boolean isSet(quickfix.field.NoIndexRollMonths field) {
    return isSetField(field);
  }

  public boolean isSetNoIndexRollMonths() {
    return isSetField(2734);
  }

public static class NoIndexRollMonths extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2733, 0};

  public NoIndexRollMonths() {
    super(2734, 2733, ORDER);
  }

  public void set(quickfix.field.IndexRollMonth value) {
    setField(value);
  }

  public quickfix.field.IndexRollMonth get(quickfix.field.IndexRollMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexRollMonth getIndexRollMonth() throws FieldNotFound {
    return get(new quickfix.field.IndexRollMonth());
  }

  public boolean isSet(quickfix.field.IndexRollMonth field) {
    return isSetField(field);
  }

  public boolean isSetIndexRollMonth() {
    return isSetField(2733);
  }
}

  public void set(quickfix.field.IndexRollMonth value) {
    setField(value);
  }

  public quickfix.field.IndexRollMonth get(quickfix.field.IndexRollMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexRollMonth getIndexRollMonth() throws FieldNotFound {
    return get(new quickfix.field.IndexRollMonth());
  }

  public boolean isSet(quickfix.field.IndexRollMonth field) {
    return isSetField(field);
  }

  public boolean isSetIndexRollMonth() {
    return isSetField(2733);
  }
}
