/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class QuotQualGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {735, };
  protected int[] getGroupFields() { return componentGroups; }

  public QuotQualGrp() {
    super();
  }

  public void set(quickfix.field.NoQuoteQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoQuoteQualifiers get(quickfix.field.NoQuoteQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteQualifiers getNoQuoteQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteQualifiers());
  }

  public boolean isSet(quickfix.field.NoQuoteQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteQualifiers() {
    return isSetField(735);
  }

public static class NoQuoteQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {695, 0};

  public NoQuoteQualifiers() {
    super(735, 695, ORDER);
  }

  public void set(quickfix.field.QuoteQualifier value) {
    setField(value);
  }

  public quickfix.field.QuoteQualifier get(quickfix.field.QuoteQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteQualifier getQuoteQualifier() throws FieldNotFound {
    return get(new quickfix.field.QuoteQualifier());
  }

  public boolean isSet(quickfix.field.QuoteQualifier field) {
    return isSetField(field);
  }

  public boolean isSetQuoteQualifier() {
    return isSetField(695);
  }
}

  public void set(quickfix.field.QuoteQualifier value) {
    setField(value);
  }

  public quickfix.field.QuoteQualifier get(quickfix.field.QuoteQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteQualifier getQuoteQualifier() throws FieldNotFound {
    return get(new quickfix.field.QuoteQualifier());
  }

  public boolean isSet(quickfix.field.QuoteQualifier field) {
    return isSetField(field);
  }

  public boolean isSetQuoteQualifier() {
    return isSetField(695);
  }
}
