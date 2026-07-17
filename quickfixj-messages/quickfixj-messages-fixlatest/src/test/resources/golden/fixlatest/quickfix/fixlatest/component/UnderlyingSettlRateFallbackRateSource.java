/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingSettlRateFallbackRateSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40904, 40915, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingSettlRateFallbackRateSource() {
    super();
  }

  public void set(quickfix.field.UnderlyingSettlRateFallbackRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRateFallbackRateSource get(quickfix.field.UnderlyingSettlRateFallbackRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRateFallbackRateSource getUnderlyingSettlRateFallbackRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRateFallbackRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRateFallbackRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRateFallbackRateSource() {
    return isSetField(40904);
  }

  public void set(quickfix.field.UnderlyingSettlRateFallbackReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlRateFallbackReferencePage get(quickfix.field.UnderlyingSettlRateFallbackReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlRateFallbackReferencePage getUnderlyingSettlRateFallbackReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlRateFallbackReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlRateFallbackReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlRateFallbackReferencePage() {
    return isSetField(40915);
  }
}
