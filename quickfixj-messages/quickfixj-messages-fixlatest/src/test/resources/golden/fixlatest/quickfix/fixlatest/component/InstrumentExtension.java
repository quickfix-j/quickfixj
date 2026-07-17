/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentExtension extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {668, 869, 2736, 2738, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentExtension() {
    super();
  }

  public void set(quickfix.field.DeliveryForm value) {
    setField(value);
  }

  public quickfix.field.DeliveryForm get(quickfix.field.DeliveryForm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryForm getDeliveryForm() throws FieldNotFound {
    return get(new quickfix.field.DeliveryForm());
  }

  public boolean isSet(quickfix.field.DeliveryForm field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryForm() {
    return isSetField(668);
  }

  public void set(quickfix.field.PctAtRisk value) {
    setField(value);
  }

  public quickfix.field.PctAtRisk get(quickfix.field.PctAtRisk value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PctAtRisk getPctAtRisk() throws FieldNotFound {
    return get(new quickfix.field.PctAtRisk());
  }

  public boolean isSet(quickfix.field.PctAtRisk field) {
    return isSetField(field);
  }

  public boolean isSetPctAtRisk() {
    return isSetField(869);
  }

  public void set(quickfix.fixlatest.component.AttrbGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AttrbGrp get(quickfix.fixlatest.component.AttrbGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AttrbGrp getAttrbGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AttrbGrp());
  }

  public void set(quickfix.field.NoInstrAttrib value) {
    setField(value);
  }

  public quickfix.field.NoInstrAttrib get(quickfix.field.NoInstrAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrAttrib getNoInstrAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoInstrAttrib());
  }

  public boolean isSet(quickfix.field.NoInstrAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrAttrib() {
    return isSetField(870);
  }

public static class NoInstrAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {871, 872, 0};

  public NoInstrAttrib() {
    super(870, 871, ORDER);
  }

  public void set(quickfix.field.InstrAttribType value) {
    setField(value);
  }

  public quickfix.field.InstrAttribType get(quickfix.field.InstrAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrAttribType getInstrAttribType() throws FieldNotFound {
    return get(new quickfix.field.InstrAttribType());
  }

  public boolean isSet(quickfix.field.InstrAttribType field) {
    return isSetField(field);
  }

  public boolean isSetInstrAttribType() {
    return isSetField(871);
  }

  public void set(quickfix.field.InstrAttribValue value) {
    setField(value);
  }

  public quickfix.field.InstrAttribValue get(quickfix.field.InstrAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrAttribValue getInstrAttribValue() throws FieldNotFound {
    return get(new quickfix.field.InstrAttribValue());
  }

  public boolean isSet(quickfix.field.InstrAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetInstrAttribValue() {
    return isSetField(872);
  }
}

  public void set(quickfix.field.CommodityFinalPriceType value) {
    setField(value);
  }

  public quickfix.field.CommodityFinalPriceType get(quickfix.field.CommodityFinalPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommodityFinalPriceType getCommodityFinalPriceType() throws FieldNotFound {
    return get(new quickfix.field.CommodityFinalPriceType());
  }

  public boolean isSet(quickfix.field.CommodityFinalPriceType field) {
    return isSetField(field);
  }

  public boolean isSetCommodityFinalPriceType() {
    return isSetField(2736);
  }

  public void set(quickfix.fixlatest.component.IndexRollMonthGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.IndexRollMonthGrp get(quickfix.fixlatest.component.IndexRollMonthGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.IndexRollMonthGrp getIndexRollMonthGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.IndexRollMonthGrp());
  }

  public void set(quickfix.field.NoIndexRollMonths value) {
    setField(value);
  }

  public quickfix.field.NoIndexRollMonths get(quickfix.field.NoIndexRollMonths value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoIndexRollMonths getNoIndexRollMonths() throws FieldNotFound {
    return get(new quickfix.field.NoIndexRollMonths());
  }

  public boolean isSet(quickfix.field.NoIndexRollMonths field) {
    return isSetField(field);
  }

  public boolean isSetNoIndexRollMonths() {
    return isSetField(2734);
  }

public static class NoIndexRollMonths extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2733, 0};

  public NoIndexRollMonths() {
    super(2734, 2733, ORDER);
  }

  public void set(quickfix.field.IndexRollMonth value) {
    setField(value);
  }

  public quickfix.field.IndexRollMonth get(quickfix.field.IndexRollMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndexRollMonth getIndexRollMonth() throws FieldNotFound {
    return get(new quickfix.field.IndexRollMonth());
  }

  public boolean isSet(quickfix.field.IndexRollMonth field) {
    return isSetField(field);
  }

  public boolean isSetIndexRollMonth() {
    return isSetField(2733);
  }
}

  public void set(quickfix.field.NextIndexRollDate value) {
    setField(value);
  }

  public quickfix.field.NextIndexRollDate get(quickfix.field.NextIndexRollDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NextIndexRollDate getNextIndexRollDate() throws FieldNotFound {
    return get(new quickfix.field.NextIndexRollDate());
  }

  public boolean isSet(quickfix.field.NextIndexRollDate field) {
    return isSetField(field);
  }

  public boolean isSetNextIndexRollDate() {
    return isSetField(2738);
  }

  public void set(quickfix.fixlatest.component.FloatingRateIndex component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FloatingRateIndex get(quickfix.fixlatest.component.FloatingRateIndex component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FloatingRateIndex getFloatingRateIndexComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FloatingRateIndex());
  }

  public void set(quickfix.fixlatest.component.ReferenceDataDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReferenceDataDateGrp get(quickfix.fixlatest.component.ReferenceDataDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReferenceDataDateGrp getReferenceDataDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReferenceDataDateGrp());
  }

  public void set(quickfix.field.NoReferenceDataDates value) {
    setField(value);
  }

  public quickfix.field.NoReferenceDataDates get(quickfix.field.NoReferenceDataDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReferenceDataDates getNoReferenceDataDates() throws FieldNotFound {
    return get(new quickfix.field.NoReferenceDataDates());
  }

  public boolean isSet(quickfix.field.NoReferenceDataDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReferenceDataDates() {
    return isSetField(2746);
  }

public static class NoReferenceDataDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2747, 2748, 0};

  public NoReferenceDataDates() {
    super(2746, 2747, ORDER);
  }

  public void set(quickfix.field.ReferenceDataDate value) {
    setField(value);
  }

  public quickfix.field.ReferenceDataDate get(quickfix.field.ReferenceDataDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceDataDate getReferenceDataDate() throws FieldNotFound {
    return get(new quickfix.field.ReferenceDataDate());
  }

  public boolean isSet(quickfix.field.ReferenceDataDate field) {
    return isSetField(field);
  }

  public boolean isSetReferenceDataDate() {
    return isSetField(2747);
  }

  public void set(quickfix.field.ReferenceDataDateType value) {
    setField(value);
  }

  public quickfix.field.ReferenceDataDateType get(quickfix.field.ReferenceDataDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceDataDateType getReferenceDataDateType() throws FieldNotFound {
    return get(new quickfix.field.ReferenceDataDateType());
  }

  public boolean isSet(quickfix.field.ReferenceDataDateType field) {
    return isSetField(field);
  }

  public boolean isSetReferenceDataDateType() {
    return isSetField(2748);
  }
}
}
