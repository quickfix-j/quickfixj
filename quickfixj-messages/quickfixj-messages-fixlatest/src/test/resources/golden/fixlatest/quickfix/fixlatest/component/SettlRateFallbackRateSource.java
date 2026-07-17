/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlRateFallbackRateSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40373, 40655, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public SettlRateFallbackRateSource() {
    super();
  }

  public void set(quickfix.field.SettlRateFallbackRateSource value) {
    setField(value);
  }

  public quickfix.field.SettlRateFallbackRateSource get(quickfix.field.SettlRateFallbackRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRateFallbackRateSource getSettlRateFallbackRateSource() throws FieldNotFound {
    return get(new quickfix.field.SettlRateFallbackRateSource());
  }

  public boolean isSet(quickfix.field.SettlRateFallbackRateSource field) {
    return isSetField(field);
  }

  public boolean isSetSettlRateFallbackRateSource() {
    return isSetField(40373);
  }

  public void set(quickfix.field.SettlRateFallbackReferencePage value) {
    setField(value);
  }

  public quickfix.field.SettlRateFallbackReferencePage get(quickfix.field.SettlRateFallbackReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlRateFallbackReferencePage getSettlRateFallbackReferencePage() throws FieldNotFound {
    return get(new quickfix.field.SettlRateFallbackReferencePage());
  }

  public boolean isSet(quickfix.field.SettlRateFallbackReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetSettlRateFallbackReferencePage() {
    return isSetField(40655);
  }
}
