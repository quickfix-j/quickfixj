/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class QuoteAttributeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2706, };
  protected int[] getGroupFields() { return componentGroups; }

  public QuoteAttributeGrp() {
    super();
  }

  public void set(quickfix.field.NoQuoteAttributes value) {
    setField(value);
  }

  public quickfix.field.NoQuoteAttributes get(quickfix.field.NoQuoteAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteAttributes getNoQuoteAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteAttributes());
  }

  public boolean isSet(quickfix.field.NoQuoteAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteAttributes() {
    return isSetField(2706);
  }

public static class NoQuoteAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2707, 2708, 0};

  public NoQuoteAttributes() {
    super(2706, 2707, ORDER);
  }

  public void set(quickfix.field.QuoteAttributeType value) {
    setField(value);
  }

  public quickfix.field.QuoteAttributeType get(quickfix.field.QuoteAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAttributeType getQuoteAttributeType() throws FieldNotFound {
    return get(new quickfix.field.QuoteAttributeType());
  }

  public boolean isSet(quickfix.field.QuoteAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAttributeType() {
    return isSetField(2707);
  }

  public void set(quickfix.field.QuoteAttributeValue value) {
    setField(value);
  }

  public quickfix.field.QuoteAttributeValue get(quickfix.field.QuoteAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAttributeValue getQuoteAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.QuoteAttributeValue());
  }

  public boolean isSet(quickfix.field.QuoteAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAttributeValue() {
    return isSetField(2708);
  }
}

  public void set(quickfix.field.QuoteAttributeType value) {
    setField(value);
  }

  public quickfix.field.QuoteAttributeType get(quickfix.field.QuoteAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAttributeType getQuoteAttributeType() throws FieldNotFound {
    return get(new quickfix.field.QuoteAttributeType());
  }

  public boolean isSet(quickfix.field.QuoteAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAttributeType() {
    return isSetField(2707);
  }

  public void set(quickfix.field.QuoteAttributeValue value) {
    setField(value);
  }

  public quickfix.field.QuoteAttributeValue get(quickfix.field.QuoteAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuoteAttributeValue getQuoteAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.QuoteAttributeValue());
  }

  public boolean isSet(quickfix.field.QuoteAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetQuoteAttributeValue() {
    return isSetField(2708);
  }
}
