/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class NewsRefGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1475, };
  protected int[] getGroupFields() { return componentGroups; }

  public NewsRefGrp() {
    super();
  }

  public void set(quickfix.field.NoNewsRefIDs value) {
    setField(value);
  }

  public quickfix.field.NoNewsRefIDs get(quickfix.field.NoNewsRefIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNewsRefIDs getNoNewsRefIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNewsRefIDs());
  }

  public boolean isSet(quickfix.field.NoNewsRefIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNewsRefIDs() {
    return isSetField(1475);
  }

public static class NoNewsRefIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1476, 1477, 0};

  public NoNewsRefIDs() {
    super(1475, 1476, ORDER);
  }

  public void set(quickfix.field.NewsRefID value) {
    setField(value);
  }

  public quickfix.field.NewsRefID get(quickfix.field.NewsRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NewsRefID getNewsRefID() throws FieldNotFound {
    return get(new quickfix.field.NewsRefID());
  }

  public boolean isSet(quickfix.field.NewsRefID field) {
    return isSetField(field);
  }

  public boolean isSetNewsRefID() {
    return isSetField(1476);
  }

  public void set(quickfix.field.NewsRefType value) {
    setField(value);
  }

  public quickfix.field.NewsRefType get(quickfix.field.NewsRefType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NewsRefType getNewsRefType() throws FieldNotFound {
    return get(new quickfix.field.NewsRefType());
  }

  public boolean isSet(quickfix.field.NewsRefType field) {
    return isSetField(field);
  }

  public boolean isSetNewsRefType() {
    return isSetField(1477);
  }
}

  public void set(quickfix.field.NewsRefID value) {
    setField(value);
  }

  public quickfix.field.NewsRefID get(quickfix.field.NewsRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NewsRefID getNewsRefID() throws FieldNotFound {
    return get(new quickfix.field.NewsRefID());
  }

  public boolean isSet(quickfix.field.NewsRefID field) {
    return isSetField(field);
  }

  public boolean isSetNewsRefID() {
    return isSetField(1476);
  }

  public void set(quickfix.field.NewsRefType value) {
    setField(value);
  }

  public quickfix.field.NewsRefType get(quickfix.field.NewsRefType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NewsRefType getNewsRefType() throws FieldNotFound {
    return get(new quickfix.field.NewsRefType());
  }

  public boolean isSet(quickfix.field.NewsRefType field) {
    return isSetField(field);
  }

  public boolean isSetNewsRefType() {
    return isSetField(1477);
  }
}
