/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MatchingInstructions extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1624, };
  protected int[] getGroupFields() { return componentGroups; }

  public MatchingInstructions() {
    super();
  }

  public void set(quickfix.field.NoMatchInst value) {
    setField(value);
  }

  public quickfix.field.NoMatchInst get(quickfix.field.NoMatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchInst getNoMatchInst() throws FieldNotFound {
    return get(new quickfix.field.NoMatchInst());
  }

  public boolean isSet(quickfix.field.NoMatchInst field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchInst() {
    return isSetField(1624);
  }

public static class NoMatchInst extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1625, 1673, 1626, 1627, 0};

  public NoMatchInst() {
    super(1624, 1625, ORDER);
  }

  public void set(quickfix.field.MatchInst value) {
    setField(value);
  }

  public quickfix.field.MatchInst get(quickfix.field.MatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInst getMatchInst() throws FieldNotFound {
    return get(new quickfix.field.MatchInst());
  }

  public boolean isSet(quickfix.field.MatchInst field) {
    return isSetField(field);
  }

  public boolean isSetMatchInst() {
    return isSetField(1625);
  }

  public void set(quickfix.field.MatchInstMarketID value) {
    setField(value);
  }

  public quickfix.field.MatchInstMarketID get(quickfix.field.MatchInstMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInstMarketID getMatchInstMarketID() throws FieldNotFound {
    return get(new quickfix.field.MatchInstMarketID());
  }

  public boolean isSet(quickfix.field.MatchInstMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMatchInstMarketID() {
    return isSetField(1673);
  }

  public void set(quickfix.field.MatchAttribTagID value) {
    setField(value);
  }

  public quickfix.field.MatchAttribTagID get(quickfix.field.MatchAttribTagID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribTagID getMatchAttribTagID() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribTagID());
  }

  public boolean isSet(quickfix.field.MatchAttribTagID field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribTagID() {
    return isSetField(1626);
  }

  public void set(quickfix.field.MatchAttribValue value) {
    setField(value);
  }

  public quickfix.field.MatchAttribValue get(quickfix.field.MatchAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribValue getMatchAttribValue() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribValue());
  }

  public boolean isSet(quickfix.field.MatchAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribValue() {
    return isSetField(1627);
  }
}

  public void set(quickfix.field.MatchInst value) {
    setField(value);
  }

  public quickfix.field.MatchInst get(quickfix.field.MatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInst getMatchInst() throws FieldNotFound {
    return get(new quickfix.field.MatchInst());
  }

  public boolean isSet(quickfix.field.MatchInst field) {
    return isSetField(field);
  }

  public boolean isSetMatchInst() {
    return isSetField(1625);
  }

  public void set(quickfix.field.MatchInstMarketID value) {
    setField(value);
  }

  public quickfix.field.MatchInstMarketID get(quickfix.field.MatchInstMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInstMarketID getMatchInstMarketID() throws FieldNotFound {
    return get(new quickfix.field.MatchInstMarketID());
  }

  public boolean isSet(quickfix.field.MatchInstMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMatchInstMarketID() {
    return isSetField(1673);
  }

  public void set(quickfix.field.MatchAttribTagID value) {
    setField(value);
  }

  public quickfix.field.MatchAttribTagID get(quickfix.field.MatchAttribTagID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribTagID getMatchAttribTagID() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribTagID());
  }

  public boolean isSet(quickfix.field.MatchAttribTagID field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribTagID() {
    return isSetField(1626);
  }

  public void set(quickfix.field.MatchAttribValue value) {
    setField(value);
  }

  public quickfix.field.MatchAttribValue get(quickfix.field.MatchAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribValue getMatchAttribValue() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribValue());
  }

  public boolean isSet(quickfix.field.MatchAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribValue() {
    return isSetField(1627);
  }
}
