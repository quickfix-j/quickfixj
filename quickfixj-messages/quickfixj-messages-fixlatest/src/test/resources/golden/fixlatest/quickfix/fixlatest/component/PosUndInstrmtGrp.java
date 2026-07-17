/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PosUndInstrmtGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {711, };
  protected int[] getGroupFields() { return componentGroups; }

  public PosUndInstrmtGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyings());
  }

  public boolean isSet(quickfix.field.NoUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyings() {
    return isSetField(711);
  }

public static class NoUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {311, 312, 309, 305, 457, 2874, 462, 1874, 1875, 1876, 463, 2894, 310, 763, 313, 542, 1213, 1837, 241, 1453, 1454, 2614, 2615, 2616, 2617, 2619, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 2363, 1441, 998, 1423, 1718, 1424, 1425, 1719, 1000, 1419, 1526, 435, 308, 306, 362, 363, 2742, 2720, 2721, 2722, 2723, 2724, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 2885, 2886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 2683, 2687, 1988, 1989, 1990, 1991, 1992, 1993, 2881, 1994, 1995, 1996, 1997, 2620, 2621, 1981, 1998, 1999, 2000, 2003, 2004, 2005, 2006, 2284, 2285, 2286, 2287, 2288, 2007, 2008, 2009, 2010, 2011, 2012, 2491, 2013, 2014, 2015, 2744, 2080, 2312, 2016, 2289, 2017, 2018, 2019, 2020, 2021, 2022, 2290, 2622, 2291, 2623, 2292, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2757, 2030, 2031, 2293, 2294, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 41314, 41315, 2045, 2295, 2296, 2297, 2756, 2298, 2299, 40964, 40962, 40965, 41949, 41950, 41947, 41951, 41952, 41953, 41859, 41864, 41860, 41866, 41868, 41861, 41862, 41863, 41810, 41811, 41812, 41813, 41814, 41815, 41816, 41817, 41818, 41819, 42887, 43076, 43077, 43074, 43078, 43079, 43080, 43081, 43082, 41822, 41820, 41841, 41823, 41824, 41825, 41826, 41827, 41828, 41829, 41830, 41831, 41832, 41833, 41834, 41835, 41836, 41837, 41838, 41839, 41840, 41846, 41844, 41856, 41847, 41848, 41849, 41850, 41851, 41852, 41853, 41854, 41855, 42888, 42889, 42890, 42891, 42892, 42893, 42894, 40540, 42149, 42036, 42068, 42041, 42060, 43004, 43005, 42860, 42861, 42855, 42884, 2624, 2625, 2626, 2627, 2628, 2629, 2630, 2631, 732, 733, 1037, 984, 0};

  public NoUnderlyings() {
    super(711, 311, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingInstrument get(quickfix.fixlatest.component.UnderlyingInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingInstrument getUnderlyingInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingInstrument());
  }

  public void set(quickfix.field.UnderlyingSettlPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlPrice get(quickfix.field.UnderlyingSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlPrice getUnderlyingSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlPrice() {
    return isSetField(732);
  }

  public void set(quickfix.field.UnderlyingSettlPriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlPriceType get(quickfix.field.UnderlyingSettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlPriceType getUnderlyingSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlPriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlPriceType() {
    return isSetField(733);
  }

  public void set(quickfix.field.UnderlyingDeliveryAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryAmount get(quickfix.field.UnderlyingDeliveryAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryAmount getUnderlyingDeliveryAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryAmount() {
    return isSetField(1037);
  }

  public void set(quickfix.fixlatest.component.UnderlyingAmount component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAmount get(quickfix.fixlatest.component.UnderlyingAmount component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAmount getUnderlyingAmountComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAmount());
  }

  public void set(quickfix.field.NoUnderlyingAmounts value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAmounts get(quickfix.field.NoUnderlyingAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAmounts getNoUnderlyingAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAmounts());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAmounts() {
    return isSetField(984);
  }

public static class NoUnderlyingAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {985, 986, 987, 988, 0};

  public NoUnderlyingAmounts() {
    super(984, 985, ORDER);
  }

  public void set(quickfix.field.UnderlyingPayAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPayAmount get(quickfix.field.UnderlyingPayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPayAmount getUnderlyingPayAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPayAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPayAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPayAmount() {
    return isSetField(985);
  }

  public void set(quickfix.field.UnderlyingCollectAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCollectAmount get(quickfix.field.UnderlyingCollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCollectAmount getUnderlyingCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCollectAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCollectAmount() {
    return isSetField(986);
  }

  public void set(quickfix.field.UnderlyingSettlementDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementDate get(quickfix.field.UnderlyingSettlementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementDate getUnderlyingSettlementDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementDate());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementDate() {
    return isSetField(987);
  }

  public void set(quickfix.field.UnderlyingSettlementStatus value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementStatus get(quickfix.field.UnderlyingSettlementStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementStatus getUnderlyingSettlementStatus() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementStatus());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementStatus field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementStatus() {
    return isSetField(988);
  }
}
}

  public void set(quickfix.fixlatest.component.UnderlyingInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingInstrument get(quickfix.fixlatest.component.UnderlyingInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingInstrument getUnderlyingInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingInstrument());
  }

  public void set(quickfix.field.UnderlyingSettlPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlPrice get(quickfix.field.UnderlyingSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlPrice getUnderlyingSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlPrice() {
    return isSetField(732);
  }

  public void set(quickfix.field.UnderlyingSettlPriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlPriceType get(quickfix.field.UnderlyingSettlPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlPriceType getUnderlyingSettlPriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlPriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlPriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlPriceType() {
    return isSetField(733);
  }

  public void set(quickfix.field.UnderlyingDeliveryAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryAmount get(quickfix.field.UnderlyingDeliveryAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryAmount getUnderlyingDeliveryAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryAmount() {
    return isSetField(1037);
  }

  public void set(quickfix.fixlatest.component.UnderlyingAmount component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAmount get(quickfix.fixlatest.component.UnderlyingAmount component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAmount getUnderlyingAmountComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAmount());
  }

  public void set(quickfix.field.NoUnderlyingAmounts value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAmounts get(quickfix.field.NoUnderlyingAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAmounts getNoUnderlyingAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAmounts());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAmounts() {
    return isSetField(984);
  }

public static class NoUnderlyingAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {985, 986, 987, 988, 0};

  public NoUnderlyingAmounts() {
    super(984, 985, ORDER);
  }

  public void set(quickfix.field.UnderlyingPayAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPayAmount get(quickfix.field.UnderlyingPayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPayAmount getUnderlyingPayAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPayAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPayAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPayAmount() {
    return isSetField(985);
  }

  public void set(quickfix.field.UnderlyingCollectAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCollectAmount get(quickfix.field.UnderlyingCollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCollectAmount getUnderlyingCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCollectAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCollectAmount() {
    return isSetField(986);
  }

  public void set(quickfix.field.UnderlyingSettlementDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementDate get(quickfix.field.UnderlyingSettlementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementDate getUnderlyingSettlementDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementDate());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementDate() {
    return isSetField(987);
  }

  public void set(quickfix.field.UnderlyingSettlementStatus value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementStatus get(quickfix.field.UnderlyingSettlementStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementStatus getUnderlyingSettlementStatus() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementStatus());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementStatus field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementStatus() {
    return isSetField(988);
  }
}
}
