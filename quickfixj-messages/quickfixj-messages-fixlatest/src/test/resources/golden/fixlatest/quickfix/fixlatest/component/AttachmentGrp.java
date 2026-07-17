/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AttachmentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2104, };
  protected int[] getGroupFields() { return componentGroups; }

  public AttachmentGrp() {
    super();
  }

  public void set(quickfix.field.NoAttachments value) {
    setField(value);
  }

  public quickfix.field.NoAttachments get(quickfix.field.NoAttachments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAttachments getNoAttachments() throws FieldNotFound {
    return get(new quickfix.field.NoAttachments());
  }

  public boolean isSet(quickfix.field.NoAttachments field) {
    return isSetField(field);
  }

  public boolean isSetNoAttachments() {
    return isSetField(2104);
  }

public static class NoAttachments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2105, 2106, 2107, 2108, 2109, 2110, 2111, 2112, 2113, 0};

  public NoAttachments() {
    super(2104, 2105, ORDER);
  }

  public void set(quickfix.field.AttachmentName value) {
    setField(value);
  }

  public quickfix.field.AttachmentName get(quickfix.field.AttachmentName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentName getAttachmentName() throws FieldNotFound {
    return get(new quickfix.field.AttachmentName());
  }

  public boolean isSet(quickfix.field.AttachmentName field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentName() {
    return isSetField(2105);
  }

  public void set(quickfix.field.AttachmentMediaType value) {
    setField(value);
  }

  public quickfix.field.AttachmentMediaType get(quickfix.field.AttachmentMediaType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentMediaType getAttachmentMediaType() throws FieldNotFound {
    return get(new quickfix.field.AttachmentMediaType());
  }

  public boolean isSet(quickfix.field.AttachmentMediaType field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentMediaType() {
    return isSetField(2106);
  }

  public void set(quickfix.field.AttachmentClassification value) {
    setField(value);
  }

  public quickfix.field.AttachmentClassification get(quickfix.field.AttachmentClassification value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentClassification getAttachmentClassification() throws FieldNotFound {
    return get(new quickfix.field.AttachmentClassification());
  }

  public boolean isSet(quickfix.field.AttachmentClassification field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentClassification() {
    return isSetField(2107);
  }

  public void set(quickfix.field.AttachmentExternalURL value) {
    setField(value);
  }

  public quickfix.field.AttachmentExternalURL get(quickfix.field.AttachmentExternalURL value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentExternalURL getAttachmentExternalURL() throws FieldNotFound {
    return get(new quickfix.field.AttachmentExternalURL());
  }

  public boolean isSet(quickfix.field.AttachmentExternalURL field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentExternalURL() {
    return isSetField(2108);
  }

  public void set(quickfix.field.AttachmentEncodingType value) {
    setField(value);
  }

  public quickfix.field.AttachmentEncodingType get(quickfix.field.AttachmentEncodingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentEncodingType getAttachmentEncodingType() throws FieldNotFound {
    return get(new quickfix.field.AttachmentEncodingType());
  }

  public boolean isSet(quickfix.field.AttachmentEncodingType field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentEncodingType() {
    return isSetField(2109);
  }

  public void set(quickfix.field.UnencodedAttachmentLen value) {
    setField(value);
  }

  public quickfix.field.UnencodedAttachmentLen get(quickfix.field.UnencodedAttachmentLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnencodedAttachmentLen getUnencodedAttachmentLen() throws FieldNotFound {
    return get(new quickfix.field.UnencodedAttachmentLen());
  }

  public boolean isSet(quickfix.field.UnencodedAttachmentLen field) {
    return isSetField(field);
  }

  public boolean isSetUnencodedAttachmentLen() {
    return isSetField(2110);
  }

  public void set(quickfix.field.EncodedAttachmentLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAttachmentLen get(quickfix.field.EncodedAttachmentLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAttachmentLen getEncodedAttachmentLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAttachmentLen());
  }

  public boolean isSet(quickfix.field.EncodedAttachmentLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAttachmentLen() {
    return isSetField(2111);
  }

  public void set(quickfix.field.EncodedAttachment value) {
    setField(value);
  }

  public quickfix.field.EncodedAttachment get(quickfix.field.EncodedAttachment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAttachment getEncodedAttachment() throws FieldNotFound {
    return get(new quickfix.field.EncodedAttachment());
  }

  public boolean isSet(quickfix.field.EncodedAttachment field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAttachment() {
    return isSetField(2112);
  }

  public void set(quickfix.fixlatest.component.AttachmentKeywordGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AttachmentKeywordGrp get(quickfix.fixlatest.component.AttachmentKeywordGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AttachmentKeywordGrp getAttachmentKeywordGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AttachmentKeywordGrp());
  }

  public void set(quickfix.field.NoAttachmentKeywords value) {
    setField(value);
  }

  public quickfix.field.NoAttachmentKeywords get(quickfix.field.NoAttachmentKeywords value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAttachmentKeywords getNoAttachmentKeywords() throws FieldNotFound {
    return get(new quickfix.field.NoAttachmentKeywords());
  }

  public boolean isSet(quickfix.field.NoAttachmentKeywords field) {
    return isSetField(field);
  }

  public boolean isSetNoAttachmentKeywords() {
    return isSetField(2113);
  }

public static class NoAttachmentKeywords extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2114, 0};

  public NoAttachmentKeywords() {
    super(2113, 2114, ORDER);
  }

  public void set(quickfix.field.AttachmentKeyword value) {
    setField(value);
  }

  public quickfix.field.AttachmentKeyword get(quickfix.field.AttachmentKeyword value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentKeyword getAttachmentKeyword() throws FieldNotFound {
    return get(new quickfix.field.AttachmentKeyword());
  }

  public boolean isSet(quickfix.field.AttachmentKeyword field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentKeyword() {
    return isSetField(2114);
  }
}
}

  public void set(quickfix.field.AttachmentName value) {
    setField(value);
  }

  public quickfix.field.AttachmentName get(quickfix.field.AttachmentName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentName getAttachmentName() throws FieldNotFound {
    return get(new quickfix.field.AttachmentName());
  }

  public boolean isSet(quickfix.field.AttachmentName field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentName() {
    return isSetField(2105);
  }

  public void set(quickfix.field.AttachmentMediaType value) {
    setField(value);
  }

  public quickfix.field.AttachmentMediaType get(quickfix.field.AttachmentMediaType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentMediaType getAttachmentMediaType() throws FieldNotFound {
    return get(new quickfix.field.AttachmentMediaType());
  }

  public boolean isSet(quickfix.field.AttachmentMediaType field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentMediaType() {
    return isSetField(2106);
  }

  public void set(quickfix.field.AttachmentClassification value) {
    setField(value);
  }

  public quickfix.field.AttachmentClassification get(quickfix.field.AttachmentClassification value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentClassification getAttachmentClassification() throws FieldNotFound {
    return get(new quickfix.field.AttachmentClassification());
  }

  public boolean isSet(quickfix.field.AttachmentClassification field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentClassification() {
    return isSetField(2107);
  }

  public void set(quickfix.field.AttachmentExternalURL value) {
    setField(value);
  }

  public quickfix.field.AttachmentExternalURL get(quickfix.field.AttachmentExternalURL value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentExternalURL getAttachmentExternalURL() throws FieldNotFound {
    return get(new quickfix.field.AttachmentExternalURL());
  }

  public boolean isSet(quickfix.field.AttachmentExternalURL field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentExternalURL() {
    return isSetField(2108);
  }

  public void set(quickfix.field.AttachmentEncodingType value) {
    setField(value);
  }

  public quickfix.field.AttachmentEncodingType get(quickfix.field.AttachmentEncodingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentEncodingType getAttachmentEncodingType() throws FieldNotFound {
    return get(new quickfix.field.AttachmentEncodingType());
  }

  public boolean isSet(quickfix.field.AttachmentEncodingType field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentEncodingType() {
    return isSetField(2109);
  }

  public void set(quickfix.field.UnencodedAttachmentLen value) {
    setField(value);
  }

  public quickfix.field.UnencodedAttachmentLen get(quickfix.field.UnencodedAttachmentLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnencodedAttachmentLen getUnencodedAttachmentLen() throws FieldNotFound {
    return get(new quickfix.field.UnencodedAttachmentLen());
  }

  public boolean isSet(quickfix.field.UnencodedAttachmentLen field) {
    return isSetField(field);
  }

  public boolean isSetUnencodedAttachmentLen() {
    return isSetField(2110);
  }

  public void set(quickfix.field.EncodedAttachmentLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAttachmentLen get(quickfix.field.EncodedAttachmentLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAttachmentLen getEncodedAttachmentLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAttachmentLen());
  }

  public boolean isSet(quickfix.field.EncodedAttachmentLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAttachmentLen() {
    return isSetField(2111);
  }

  public void set(quickfix.field.EncodedAttachment value) {
    setField(value);
  }

  public quickfix.field.EncodedAttachment get(quickfix.field.EncodedAttachment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAttachment getEncodedAttachment() throws FieldNotFound {
    return get(new quickfix.field.EncodedAttachment());
  }

  public boolean isSet(quickfix.field.EncodedAttachment field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAttachment() {
    return isSetField(2112);
  }

  public void set(quickfix.fixlatest.component.AttachmentKeywordGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AttachmentKeywordGrp get(quickfix.fixlatest.component.AttachmentKeywordGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AttachmentKeywordGrp getAttachmentKeywordGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AttachmentKeywordGrp());
  }

  public void set(quickfix.field.NoAttachmentKeywords value) {
    setField(value);
  }

  public quickfix.field.NoAttachmentKeywords get(quickfix.field.NoAttachmentKeywords value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAttachmentKeywords getNoAttachmentKeywords() throws FieldNotFound {
    return get(new quickfix.field.NoAttachmentKeywords());
  }

  public boolean isSet(quickfix.field.NoAttachmentKeywords field) {
    return isSetField(field);
  }

  public boolean isSetNoAttachmentKeywords() {
    return isSetField(2113);
  }

public static class NoAttachmentKeywords extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2114, 0};

  public NoAttachmentKeywords() {
    super(2113, 2114, ORDER);
  }

  public void set(quickfix.field.AttachmentKeyword value) {
    setField(value);
  }

  public quickfix.field.AttachmentKeyword get(quickfix.field.AttachmentKeyword value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AttachmentKeyword getAttachmentKeyword() throws FieldNotFound {
    return get(new quickfix.field.AttachmentKeyword());
  }

  public boolean isSet(quickfix.field.AttachmentKeyword field) {
    return isSetField(field);
  }

  public boolean isSetAttachmentKeyword() {
    return isSetField(2114);
  }
}
}
