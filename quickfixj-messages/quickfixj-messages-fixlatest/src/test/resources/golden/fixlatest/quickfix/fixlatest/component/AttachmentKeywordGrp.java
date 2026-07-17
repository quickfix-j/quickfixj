/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AttachmentKeywordGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2113, };
  protected int[] getGroupFields() { return componentGroups; }

  public AttachmentKeywordGrp() {
    super();
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
