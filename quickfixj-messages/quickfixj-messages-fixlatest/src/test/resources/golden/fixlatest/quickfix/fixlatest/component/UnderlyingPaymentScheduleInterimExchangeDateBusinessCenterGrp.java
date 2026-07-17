/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40967, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters getNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40967);
  }

public static class NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40699, 0};

  public NoUnderlyingPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40967, 40699, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter getUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40699);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter getUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40699);
  }
}
