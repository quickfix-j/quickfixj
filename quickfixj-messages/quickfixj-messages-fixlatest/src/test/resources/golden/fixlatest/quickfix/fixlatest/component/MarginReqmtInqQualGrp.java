/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarginReqmtInqQualGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1636, };
  protected int[] getGroupFields() { return componentGroups; }

  public MarginReqmtInqQualGrp() {
    super();
  }

  public void set(quickfix.field.NoMarginReqmtInqQualifier value) {
    setField(value);
  }

  public quickfix.field.NoMarginReqmtInqQualifier get(quickfix.field.NoMarginReqmtInqQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarginReqmtInqQualifier getNoMarginReqmtInqQualifier() throws FieldNotFound {
    return get(new quickfix.field.NoMarginReqmtInqQualifier());
  }

  public boolean isSet(quickfix.field.NoMarginReqmtInqQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNoMarginReqmtInqQualifier() {
    return isSetField(1636);
  }

public static class NoMarginReqmtInqQualifier extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1637, 0};

  public NoMarginReqmtInqQualifier() {
    super(1636, 1637, ORDER);
  }

  public void set(quickfix.field.MarginReqmtInqQualifier value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtInqQualifier get(quickfix.field.MarginReqmtInqQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtInqQualifier getMarginReqmtInqQualifier() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtInqQualifier());
  }

  public boolean isSet(quickfix.field.MarginReqmtInqQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtInqQualifier() {
    return isSetField(1637);
  }
}

  public void set(quickfix.field.MarginReqmtInqQualifier value) {
    setField(value);
  }

  public quickfix.field.MarginReqmtInqQualifier get(quickfix.field.MarginReqmtInqQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginReqmtInqQualifier getMarginReqmtInqQualifier() throws FieldNotFound {
    return get(new quickfix.field.MarginReqmtInqQualifier());
  }

  public boolean isSet(quickfix.field.MarginReqmtInqQualifier field) {
    return isSetField(field);
  }

  public boolean isSetMarginReqmtInqQualifier() {
    return isSetField(1637);
  }
}
