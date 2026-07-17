/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventAveragingObservationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41713, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventAveragingObservationGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations get(quickfix.field.NoUnderlyingComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventAveragingObservations getNoUnderlyingComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventAveragingObservations() {
    return isSetField(41713);
  }

public static class NoUnderlyingComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41714, 41715, 0};

  public NoUnderlyingComplexEventAveragingObservations() {
    super(41713, 41714, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber get(quickfix.field.UnderlyingComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingObservationNumber getUnderlyingComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingObservationNumber() {
    return isSetField(41714);
  }

  public void set(quickfix.field.UnderlyingComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight get(quickfix.field.UnderlyingComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventAveragingWeight getUnderlyingComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventAveragingWeight() {
    return isSetField(41715);
  }
}
