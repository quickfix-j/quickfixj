/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class News extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "B";

  public News() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public void set(quickfix.fixlatest.component.LinesOfTextGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LinesOfTextGrp get(quickfix.fixlatest.component.LinesOfTextGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LinesOfTextGrp getLinesOfTextGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LinesOfTextGrp());
  }

  public void set(quickfix.field.NoLinesOfText value) {
    setField(value);
  }

  public quickfix.field.NoLinesOfText get(quickfix.field.NoLinesOfText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLinesOfText getNoLinesOfText() throws FieldNotFound {
    return get(new quickfix.field.NoLinesOfText());
  }

  public boolean isSet(quickfix.field.NoLinesOfText field) {
    return isSetField(field);
  }

  public boolean isSetNoLinesOfText() {
    return isSetField(33);
  }

public static class NoLinesOfText extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {58, 0};

  public NoLinesOfText() {
    super(33, 58, ORDER);
  }

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }
}
}
