/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CollInqQualGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {938, };
  protected int[] getGroupFields() { return componentGroups; }

  public CollInqQualGrp() {
    super();
  }

  public void set(quickfix.field.NoCollInquiryQualifier value) {
    setField(value);
  }

  public quickfix.field.NoCollInquiryQualifier get(quickfix.field.NoCollInquiryQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCollInquiryQualifier getNoCollInquiryQualifier() throws FieldNotFound {
    return get(new quickfix.field.NoCollInquiryQualifier());
  }

  public boolean isSet(quickfix.field.NoCollInquiryQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNoCollInquiryQualifier() {
    return isSetField(938);
  }

public static class NoCollInquiryQualifier extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {896, 0};

  public NoCollInquiryQualifier() {
    super(938, 896, ORDER);
  }

  public void set(quickfix.field.CollInquiryQualifier value) {
    setField(value);
  }

  public quickfix.field.CollInquiryQualifier get(quickfix.field.CollInquiryQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollInquiryQualifier getCollInquiryQualifier() throws FieldNotFound {
    return get(new quickfix.field.CollInquiryQualifier());
  }

  public boolean isSet(quickfix.field.CollInquiryQualifier field) {
    return isSetField(field);
  }

  public boolean isSetCollInquiryQualifier() {
    return isSetField(896);
  }
}

  public void set(quickfix.field.CollInquiryQualifier value) {
    setField(value);
  }

  public quickfix.field.CollInquiryQualifier get(quickfix.field.CollInquiryQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollInquiryQualifier getCollInquiryQualifier() throws FieldNotFound {
    return get(new quickfix.field.CollInquiryQualifier());
  }

  public boolean isSet(quickfix.field.CollInquiryQualifier field) {
    return isSetField(field);
  }

  public boolean isSetCollInquiryQualifier() {
    return isSetField(896);
  }
}
