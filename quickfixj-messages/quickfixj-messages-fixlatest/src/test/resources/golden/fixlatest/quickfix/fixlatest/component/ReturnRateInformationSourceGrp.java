/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRateInformationSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42761, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRateInformationSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateInformationSources get(quickfix.field.NoReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateInformationSources getNoReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateInformationSources() {
    return isSetField(42761);
  }

public static class NoReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42762, 42763, 42764, 0};

  public NoReturnRateInformationSources() {
    super(42761, 42762, ORDER);
  }

  public void set(quickfix.field.ReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.ReturnRateInformationSource get(quickfix.field.ReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateInformationSource getReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.ReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateInformationSource() {
    return isSetField(42762);
  }

  public void set(quickfix.field.ReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePage get(quickfix.field.ReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePage getReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePage() {
    return isSetField(42763);
  }

  public void set(quickfix.field.ReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePageHeading get(quickfix.field.ReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePageHeading getReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePageHeading() {
    return isSetField(42764);
  }
}

  public void set(quickfix.field.ReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.ReturnRateInformationSource get(quickfix.field.ReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateInformationSource getReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.ReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateInformationSource() {
    return isSetField(42762);
  }

  public void set(quickfix.field.ReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePage get(quickfix.field.ReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePage getReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePage() {
    return isSetField(42763);
  }

  public void set(quickfix.field.ReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePageHeading get(quickfix.field.ReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePageHeading getReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePageHeading() {
    return isSetField(42764);
  }
}
