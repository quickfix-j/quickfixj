/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSettlRateFallbackRateSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40366, 40370, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegSettlRateFallbackRateSource() {
    super();
  }

  public void set(quickfix.field.LegSettlRateFallbackRateSource value) {
    setField(value);
  }

  public quickfix.field.LegSettlRateFallbackRateSource get(quickfix.field.LegSettlRateFallbackRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRateFallbackRateSource getLegSettlRateFallbackRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRateFallbackRateSource());
  }

  public boolean isSet(quickfix.field.LegSettlRateFallbackRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRateFallbackRateSource() {
    return isSetField(40366);
  }

  public void set(quickfix.field.LegSettlRateFallbackReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegSettlRateFallbackReferencePage get(quickfix.field.LegSettlRateFallbackReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlRateFallbackReferencePage getLegSettlRateFallbackReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegSettlRateFallbackReferencePage());
  }

  public boolean isSet(quickfix.field.LegSettlRateFallbackReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlRateFallbackReferencePage() {
    return isSetField(40370);
  }
}
