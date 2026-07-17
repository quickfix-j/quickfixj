/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventRateSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41013, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventRateSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventRateSources get(quickfix.field.NoComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventRateSources getNoComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventRateSources() {
    return isSetField(41013);
  }

public static class NoComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41014, 41015, 41016, 41017, 0};

  public NoComplexEventRateSources() {
    super(41013, 41014, ORDER);
  }

  public void set(quickfix.field.ComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSource get(quickfix.field.ComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSource getComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSource() {
    return isSetField(41014);
  }

  public void set(quickfix.field.ComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSourceType get(quickfix.field.ComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSourceType getComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSourceType() {
    return isSetField(41015);
  }

  public void set(quickfix.field.ComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePage get(quickfix.field.ComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePage getComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePage() {
    return isSetField(41016);
  }

  public void set(quickfix.field.ComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePageHeading get(quickfix.field.ComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePageHeading getComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePageHeading() {
    return isSetField(41017);
  }
}

  public void set(quickfix.field.ComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSource get(quickfix.field.ComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSource getComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSource() {
    return isSetField(41014);
  }

  public void set(quickfix.field.ComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.ComplexEventRateSourceType get(quickfix.field.ComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventRateSourceType getComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.ComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventRateSourceType() {
    return isSetField(41015);
  }

  public void set(quickfix.field.ComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePage get(quickfix.field.ComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePage getComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePage() {
    return isSetField(41016);
  }

  public void set(quickfix.field.ComplexEventReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ComplexEventReferencePageHeading get(quickfix.field.ComplexEventReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventReferencePageHeading getComplexEventReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ComplexEventReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventReferencePageHeading() {
    return isSetField(41017);
  }
}
