/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentScheduleInterimExchangeDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40928, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentScheduleInterimExchangeDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters getNoLegPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40928);
  }

public static class NoLegPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40409, 0};

  public NoLegPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40928, 40409, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter getLegPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40409);
  }
}

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter getLegPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40409);
  }
}
