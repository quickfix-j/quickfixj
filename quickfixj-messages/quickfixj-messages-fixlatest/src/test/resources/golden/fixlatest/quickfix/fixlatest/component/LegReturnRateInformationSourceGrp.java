/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRateInformationSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42560, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRateInformationSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateInformationSources get(quickfix.field.NoLegReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateInformationSources getNoLegReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateInformationSources() {
    return isSetField(42560);
  }

public static class NoLegReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42561, 42562, 42563, 0};

  public NoLegReturnRateInformationSources() {
    super(42560, 42561, ORDER);
  }

  public void set(quickfix.field.LegReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateInformationSource get(quickfix.field.LegReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateInformationSource getLegReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.LegReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateInformationSource() {
    return isSetField(42561);
  }

  public void set(quickfix.field.LegReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePage get(quickfix.field.LegReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePage getLegReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePage() {
    return isSetField(42562);
  }

  public void set(quickfix.field.LegReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePageHeading get(quickfix.field.LegReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePageHeading getLegReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePageHeading() {
    return isSetField(42563);
  }
}

  public void set(quickfix.field.LegReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateInformationSource get(quickfix.field.LegReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateInformationSource getLegReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.LegReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateInformationSource() {
    return isSetField(42561);
  }

  public void set(quickfix.field.LegReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePage get(quickfix.field.LegReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePage getLegReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePage() {
    return isSetField(42562);
  }

  public void set(quickfix.field.LegReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePageHeading get(quickfix.field.LegReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePageHeading getLegReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePageHeading() {
    return isSetField(42563);
  }
}
