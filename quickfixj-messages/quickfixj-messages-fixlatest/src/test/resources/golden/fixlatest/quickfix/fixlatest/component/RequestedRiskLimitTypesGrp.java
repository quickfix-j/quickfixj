/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RequestedRiskLimitTypesGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1668, };
  protected int[] getGroupFields() { return componentGroups; }

  public RequestedRiskLimitTypesGrp() {
    super();
  }

  public void set(quickfix.field.NoRequestedRiskLimitType value) {
    setField(value);
  }

  public quickfix.field.NoRequestedRiskLimitType get(quickfix.field.NoRequestedRiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRequestedRiskLimitType getNoRequestedRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.NoRequestedRiskLimitType());
  }

  public boolean isSet(quickfix.field.NoRequestedRiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetNoRequestedRiskLimitType() {
    return isSetField(1668);
  }

public static class NoRequestedRiskLimitType extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1530, 0};

  public NoRequestedRiskLimitType() {
    super(1668, 1530, ORDER);
  }

  public void set(quickfix.field.RiskLimitType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitType get(quickfix.field.RiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitType getRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitType());
  }

  public boolean isSet(quickfix.field.RiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitType() {
    return isSetField(1530);
  }
}

  public void set(quickfix.field.RiskLimitType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitType get(quickfix.field.RiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitType getRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitType());
  }

  public boolean isSet(quickfix.field.RiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitType() {
    return isSetField(1530);
  }
}
