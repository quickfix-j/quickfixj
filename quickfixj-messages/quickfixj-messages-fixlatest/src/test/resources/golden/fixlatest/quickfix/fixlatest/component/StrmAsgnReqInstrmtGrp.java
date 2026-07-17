/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StrmAsgnReqInstrmtGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {146, };
  protected int[] getGroupFields() { return componentGroups; }

  public StrmAsgnReqInstrmtGrp() {
    super();
  }

  public void set(quickfix.field.NoRelatedSym value) {
    setField(value);
  }

  public quickfix.field.NoRelatedSym get(quickfix.field.NoRelatedSym value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedSym());
  }

  public boolean isSet(quickfix.field.NoRelatedSym field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedSym() {
    return isSetField(146);
  }

public static class NoRelatedSym extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {55, 65, 48, 22, 454, 460, 1227, 1151, 461, 2891, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 1739, 2210, 1938, 1939, 1940, 2735, 1976, 2304, 1941, 1575, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 2879, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1577, 1580, 1581, 1678, 1697, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 2578, 2577, 947, 967, 968, 1698, 1866, 2600, 2001, 2601, 1478, 1479, 1480, 1481, 206, 231, 1435, 2353, 1439, 969, 1146, 996, 1147, 1716, 1191, 1192, 1717, 1193, 2579, 1194, 1482, 1195, 2753, 1196, 1197, 2002, 2140, 1524, 1198, 1199, 1200, 201, 2681, 2685, 1244, 1242, 2575, 2574, 997, 223, 207, 970, 971, 106, 348, 349, 2737, 2714, 2715, 2716, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1687, 1483, 1787, 2141, 2142, 2143, 2752, 2144, 2145, 2576, 40921, 40278, 40922, 41232, 41233, 41230, 41234, 41235, 41236, 41087, 41092, 41088, 41094, 41096, 41089, 41090, 41091, 41106, 41107, 41108, 41109, 41110, 41111, 41112, 41113, 41114, 41115, 42590, 42777, 42778, 42775, 42779, 42780, 42781, 42782, 42783, 41118, 41116, 41137, 41119, 41120, 41121, 41122, 41123, 41124, 41125, 41126, 41127, 41128, 41129, 41130, 41131, 41132, 41133, 41134, 41135, 41136, 41142, 41140, 41152, 41143, 41144, 41145, 41146, 41147, 41148, 41149, 41150, 41151, 42591, 42592, 42593, 42594, 42595, 42596, 42597, 40049, 40090, 40019, 40181, 40022, 40204, 42296, 2602, 2603, 63, 271, 1500, 0};

  public NoRelatedSym() {
    super(146, 55, ORDER);
  }

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }

  public void set(quickfix.field.SettlType value) {
    setField(value);
  }

  public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlType getSettlType() throws FieldNotFound {
    return get(new quickfix.field.SettlType());
  }

  public boolean isSet(quickfix.field.SettlType field) {
    return isSetField(field);
  }

  public boolean isSetSettlType() {
    return isSetField(63);
  }

  public void set(quickfix.field.MDEntrySize value) {
    setField(value);
  }

  public quickfix.field.MDEntrySize get(quickfix.field.MDEntrySize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySize());
  }

  public boolean isSet(quickfix.field.MDEntrySize field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySize() {
    return isSetField(271);
  }

  public void set(quickfix.field.MDStreamID value) {
    setField(value);
  }

  public quickfix.field.MDStreamID get(quickfix.field.MDStreamID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStreamID getMDStreamID() throws FieldNotFound {
    return get(new quickfix.field.MDStreamID());
  }

  public boolean isSet(quickfix.field.MDStreamID field) {
    return isSetField(field);
  }

  public boolean isSetMDStreamID() {
    return isSetField(1500);
  }
}

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }

  public void set(quickfix.field.SettlType value) {
    setField(value);
  }

  public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlType getSettlType() throws FieldNotFound {
    return get(new quickfix.field.SettlType());
  }

  public boolean isSet(quickfix.field.SettlType field) {
    return isSetField(field);
  }

  public boolean isSetSettlType() {
    return isSetField(63);
  }

  public void set(quickfix.field.MDEntrySize value) {
    setField(value);
  }

  public quickfix.field.MDEntrySize get(quickfix.field.MDEntrySize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
    return get(new quickfix.field.MDEntrySize());
  }

  public boolean isSet(quickfix.field.MDEntrySize field) {
    return isSetField(field);
  }

  public boolean isSetMDEntrySize() {
    return isSetField(271);
  }

  public void set(quickfix.field.MDStreamID value) {
    setField(value);
  }

  public quickfix.field.MDStreamID get(quickfix.field.MDStreamID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStreamID getMDStreamID() throws FieldNotFound {
    return get(new quickfix.field.MDStreamID());
  }

  public boolean isSet(quickfix.field.MDStreamID field) {
    return isSetField(field);
  }

  public boolean isSetMDStreamID() {
    return isSetField(1500);
  }
}
