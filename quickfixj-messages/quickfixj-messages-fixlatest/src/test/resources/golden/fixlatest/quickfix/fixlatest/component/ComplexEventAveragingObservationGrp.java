/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventAveragingObservationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40994, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventAveragingObservationGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventAveragingObservations value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventAveragingObservations get(quickfix.field.NoComplexEventAveragingObservations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventAveragingObservations getNoComplexEventAveragingObservations() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventAveragingObservations());
  }

  public boolean isSet(quickfix.field.NoComplexEventAveragingObservations field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventAveragingObservations() {
    return isSetField(40994);
  }

public static class NoComplexEventAveragingObservations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40995, 40996, 0};

  public NoComplexEventAveragingObservations() {
    super(40994, 40995, ORDER);
  }

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}

  public void set(quickfix.field.ComplexEventAveragingObservationNumber value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingObservationNumber get(quickfix.field.ComplexEventAveragingObservationNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingObservationNumber getComplexEventAveragingObservationNumber() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingObservationNumber());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingObservationNumber field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingObservationNumber() {
    return isSetField(40995);
  }

  public void set(quickfix.field.ComplexEventAveragingWeight value) {
    setField(value);
  }

  public quickfix.field.ComplexEventAveragingWeight get(quickfix.field.ComplexEventAveragingWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventAveragingWeight getComplexEventAveragingWeight() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventAveragingWeight());
  }

  public boolean isSet(quickfix.field.ComplexEventAveragingWeight field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventAveragingWeight() {
    return isSetField(40996);
  }
}
