/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MatchingDataPointGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2781, };
  protected int[] getGroupFields() { return componentGroups; }

  public MatchingDataPointGrp() {
    super();
  }

  public void set(quickfix.field.NoMatchingDataPoints value) {
    setField(value);
  }

  public quickfix.field.NoMatchingDataPoints get(quickfix.field.NoMatchingDataPoints value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchingDataPoints getNoMatchingDataPoints() throws FieldNotFound {
    return get(new quickfix.field.NoMatchingDataPoints());
  }

  public boolean isSet(quickfix.field.NoMatchingDataPoints field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchingDataPoints() {
    return isSetField(2781);
  }

public static class NoMatchingDataPoints extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2782, 2783, 2784, 2785, 0};

  public NoMatchingDataPoints() {
    super(2781, 2782, ORDER);
  }

  public void set(quickfix.field.MatchingDataPointIndicator value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointIndicator get(quickfix.field.MatchingDataPointIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointIndicator getMatchingDataPointIndicator() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointIndicator());
  }

  public boolean isSet(quickfix.field.MatchingDataPointIndicator field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointIndicator() {
    return isSetField(2782);
  }

  public void set(quickfix.field.MatchingDataPointValue value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointValue get(quickfix.field.MatchingDataPointValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointValue getMatchingDataPointValue() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointValue());
  }

  public boolean isSet(quickfix.field.MatchingDataPointValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointValue() {
    return isSetField(2783);
  }

  public void set(quickfix.field.MatchingDataPointType value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointType get(quickfix.field.MatchingDataPointType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointType getMatchingDataPointType() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointType());
  }

  public boolean isSet(quickfix.field.MatchingDataPointType field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointType() {
    return isSetField(2784);
  }

  public void set(quickfix.field.MatchingDataPointName value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointName get(quickfix.field.MatchingDataPointName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointName getMatchingDataPointName() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointName());
  }

  public boolean isSet(quickfix.field.MatchingDataPointName field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointName() {
    return isSetField(2785);
  }
}

  public void set(quickfix.field.MatchingDataPointIndicator value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointIndicator get(quickfix.field.MatchingDataPointIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointIndicator getMatchingDataPointIndicator() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointIndicator());
  }

  public boolean isSet(quickfix.field.MatchingDataPointIndicator field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointIndicator() {
    return isSetField(2782);
  }

  public void set(quickfix.field.MatchingDataPointValue value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointValue get(quickfix.field.MatchingDataPointValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointValue getMatchingDataPointValue() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointValue());
  }

  public boolean isSet(quickfix.field.MatchingDataPointValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointValue() {
    return isSetField(2783);
  }

  public void set(quickfix.field.MatchingDataPointType value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointType get(quickfix.field.MatchingDataPointType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointType getMatchingDataPointType() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointType());
  }

  public boolean isSet(quickfix.field.MatchingDataPointType field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointType() {
    return isSetField(2784);
  }

  public void set(quickfix.field.MatchingDataPointName value) {
    setField(value);
  }

  public quickfix.field.MatchingDataPointName get(quickfix.field.MatchingDataPointName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchingDataPointName getMatchingDataPointName() throws FieldNotFound {
    return get(new quickfix.field.MatchingDataPointName());
  }

  public boolean isSet(quickfix.field.MatchingDataPointName field) {
    return isSetField(field);
  }

  public boolean isSetMatchingDataPointName() {
    return isSetField(2785);
  }
}
