/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventAveragingObservationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41363, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventAveragingObservationGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventAveragingObservations get(quickfix.field.NoLegComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventAveragingObservations getNoLegComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventAveragingObservations() {
    return isSetField(41363);
  }

public static class NoLegComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41364, 41365, 0};

  public NoLegComplexEventAveragingObservations() {
    super(41363, 41364, ORDER);
  }

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}

  public void set(quickfix.field.LegComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber get(quickfix.field.LegComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingObservationNumber getLegComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingObservationNumber() {
    return isSetField(41364);
  }

  public void set(quickfix.field.LegComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventAveragingWeight get(quickfix.field.LegComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventAveragingWeight getLegComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.LegComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventAveragingWeight() {
    return isSetField(41365);
  }
}
