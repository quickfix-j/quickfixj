/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventRateSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41382, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventRateSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventRateSources get(quickfix.field.NoLegComplexEventRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventRateSources getNoLegComplexEventRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventRateSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventRateSources() {
    return isSetField(41382);
  }

public static class NoLegComplexEventRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41383, 41384, 41385, 41386, 0};

  public NoLegComplexEventRateSources() {
    super(41382, 41383, ORDER);
  }

  public void set(quickfix.field.LegComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSource get(quickfix.field.LegComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSource getLegComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSource() {
    return isSetField(41383);
  }

  public void set(quickfix.field.LegComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSourceType get(quickfix.field.LegComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSourceType getLegComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSourceType() {
    return isSetField(41384);
  }

  public void set(quickfix.field.LegComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventReferencePage get(quickfix.field.LegComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventReferencePage getLegComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.LegComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventReferencePage() {
    return isSetField(41385);
  }

  public void set(quickfix.field.LegComplexEvenReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegComplexEvenReferencePageHeading get(quickfix.field.LegComplexEvenReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEvenReferencePageHeading getLegComplexEvenReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEvenReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegComplexEvenReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEvenReferencePageHeading() {
    return isSetField(41386);
  }
}

  public void set(quickfix.field.LegComplexEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSource get(quickfix.field.LegComplexEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSource getLegComplexEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSource() {
    return isSetField(41383);
  }

  public void set(quickfix.field.LegComplexEventRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventRateSourceType get(quickfix.field.LegComplexEventRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventRateSourceType getLegComplexEventRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventRateSourceType());
  }

  public boolean isSet(quickfix.field.LegComplexEventRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventRateSourceType() {
    return isSetField(41384);
  }

  public void set(quickfix.field.LegComplexEventReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventReferencePage get(quickfix.field.LegComplexEventReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventReferencePage getLegComplexEventReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventReferencePage());
  }

  public boolean isSet(quickfix.field.LegComplexEventReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventReferencePage() {
    return isSetField(41385);
  }

  public void set(quickfix.field.LegComplexEvenReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegComplexEvenReferencePageHeading get(quickfix.field.LegComplexEvenReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEvenReferencePageHeading getLegComplexEvenReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEvenReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegComplexEvenReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEvenReferencePageHeading() {
    return isSetField(41386);
  }
}
