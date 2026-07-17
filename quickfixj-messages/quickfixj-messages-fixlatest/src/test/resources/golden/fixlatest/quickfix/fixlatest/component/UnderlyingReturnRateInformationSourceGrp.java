/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRateInformationSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43060, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRateInformationSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateInformationSources get(quickfix.field.NoUnderlyingReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateInformationSources getNoUnderlyingReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateInformationSources() {
    return isSetField(43060);
  }

public static class NoUnderlyingReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43061, 43062, 43063, 0};

  public NoUnderlyingReturnRateInformationSources() {
    super(43060, 43061, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateInformationSource get(quickfix.field.UnderlyingReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateInformationSource getUnderlyingReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateInformationSource() {
    return isSetField(43061);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePage get(quickfix.field.UnderlyingReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePage getUnderlyingReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePage() {
    return isSetField(43062);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading get(quickfix.field.UnderlyingReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading getUnderlyingReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePageHeading() {
    return isSetField(43063);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateInformationSource get(quickfix.field.UnderlyingReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateInformationSource getUnderlyingReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateInformationSource() {
    return isSetField(43061);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePage get(quickfix.field.UnderlyingReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePage getUnderlyingReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePage() {
    return isSetField(43062);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading get(quickfix.field.UnderlyingReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading getUnderlyingReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePageHeading() {
    return isSetField(43063);
  }
}
