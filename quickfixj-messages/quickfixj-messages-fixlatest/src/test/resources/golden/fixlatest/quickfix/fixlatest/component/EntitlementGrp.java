/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class EntitlementGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1773, };
  protected int[] getGroupFields() { return componentGroups; }

  public EntitlementGrp() {
    super();
  }

  public void set(quickfix.field.NoEntitlements value) {
    setField(value);
  }

  public quickfix.field.NoEntitlements get(quickfix.field.NoEntitlements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlements getNoEntitlements() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlements());
  }

  public boolean isSet(quickfix.field.NoEntitlements field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlements() {
    return isSetField(1773);
  }

public static class NoEntitlements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1774, 1775, 2402, 1777, 1776, 1784, 1656, 1310, 1782, 1783, 0};

  public NoEntitlements() {
    super(1773, 1774, ORDER);
  }

  public void set(quickfix.field.EntitlementIndicator value) {
    setField(value);
  }

  public quickfix.field.EntitlementIndicator get(quickfix.field.EntitlementIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementIndicator getEntitlementIndicator() throws FieldNotFound {
    return get(new quickfix.field.EntitlementIndicator());
  }

  public boolean isSet(quickfix.field.EntitlementIndicator field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementIndicator() {
    return isSetField(1774);
  }

  public void set(quickfix.field.EntitlementType value) {
    setField(value);
  }

  public quickfix.field.EntitlementType get(quickfix.field.EntitlementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementType getEntitlementType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementType());
  }

  public boolean isSet(quickfix.field.EntitlementType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementType() {
    return isSetField(1775);
  }

  public void set(quickfix.field.EntitlementSubType value) {
    setField(value);
  }

  public quickfix.field.EntitlementSubType get(quickfix.field.EntitlementSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementSubType getEntitlementSubType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementSubType());
  }

  public boolean isSet(quickfix.field.EntitlementSubType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementSubType() {
    return isSetField(2402);
  }

  public void set(quickfix.fixlatest.component.EntitlementAttribGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.EntitlementAttribGrp get(quickfix.fixlatest.component.EntitlementAttribGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.EntitlementAttribGrp getEntitlementAttribGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.EntitlementAttribGrp());
  }

  public void set(quickfix.field.NoEntitlementAttrib value) {
    setField(value);
  }

  public quickfix.field.NoEntitlementAttrib get(quickfix.field.NoEntitlementAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlementAttrib getNoEntitlementAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlementAttrib());
  }

  public boolean isSet(quickfix.field.NoEntitlementAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlementAttrib() {
    return isSetField(1777);
  }

public static class NoEntitlementAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1778, 1779, 1780, 1781, 0};

  public NoEntitlementAttrib() {
    super(1777, 1778, ORDER);
  }

  public void set(quickfix.field.EntitlementAttribType value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribType get(quickfix.field.EntitlementAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribType getEntitlementAttribType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribType());
  }

  public boolean isSet(quickfix.field.EntitlementAttribType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribType() {
    return isSetField(1778);
  }

  public void set(quickfix.field.EntitlementAttribDatatype value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribDatatype get(quickfix.field.EntitlementAttribDatatype value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribDatatype getEntitlementAttribDatatype() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribDatatype());
  }

  public boolean isSet(quickfix.field.EntitlementAttribDatatype field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribDatatype() {
    return isSetField(1779);
  }

  public void set(quickfix.field.EntitlementAttribValue value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribValue get(quickfix.field.EntitlementAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribValue getEntitlementAttribValue() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribValue());
  }

  public boolean isSet(quickfix.field.EntitlementAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribValue() {
    return isSetField(1780);
  }

  public void set(quickfix.field.EntitlementAttribCurrency value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribCurrency get(quickfix.field.EntitlementAttribCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribCurrency getEntitlementAttribCurrency() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribCurrency());
  }

  public boolean isSet(quickfix.field.EntitlementAttribCurrency field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribCurrency() {
    return isSetField(1781);
  }
}

  public void set(quickfix.field.EntitlementID value) {
    setField(value);
  }

  public quickfix.field.EntitlementID get(quickfix.field.EntitlementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementID getEntitlementID() throws FieldNotFound {
    return get(new quickfix.field.EntitlementID());
  }

  public boolean isSet(quickfix.field.EntitlementID field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementID() {
    return isSetField(1776);
  }

  public void set(quickfix.field.EntitlementPlatform value) {
    setField(value);
  }

  public quickfix.field.EntitlementPlatform get(quickfix.field.EntitlementPlatform value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementPlatform getEntitlementPlatform() throws FieldNotFound {
    return get(new quickfix.field.EntitlementPlatform());
  }

  public boolean isSet(quickfix.field.EntitlementPlatform field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementPlatform() {
    return isSetField(1784);
  }

  public void set(quickfix.fixlatest.component.InstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp get(quickfix.fixlatest.component.InstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp getInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScopeGrp());
  }

  public void set(quickfix.field.NoInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentScopes get(quickfix.field.NoInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentScopes getNoInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentScopes() {
    return isSetField(1656);
  }

public static class NoInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 0};

  public NoInstrumentScopes() {
    super(1656, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }
}

  public void set(quickfix.fixlatest.component.MarketSegmentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketSegmentScopeGrp get(quickfix.fixlatest.component.MarketSegmentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketSegmentScopeGrp getMarketSegmentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketSegmentScopeGrp());
  }

  public void set(quickfix.field.NoMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoMarketSegments get(quickfix.field.NoMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketSegments getNoMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoMarketSegments());
  }

  public boolean isSet(quickfix.field.NoMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketSegments() {
    return isSetField(1310);
  }

public static class NoMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1301, 1300, 0};

  public NoMarketSegments() {
    super(1310, 1301, ORDER);
  }

  public void set(quickfix.field.MarketID value) {
    setField(value);
  }

  public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketID getMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarketID());
  }

  public boolean isSet(quickfix.field.MarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarketID() {
    return isSetField(1301);
  }

  public void set(quickfix.field.MarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentID() {
    return isSetField(1300);
  }
}

  public void set(quickfix.field.EntitlementStartDate value) {
    setField(value);
  }

  public quickfix.field.EntitlementStartDate get(quickfix.field.EntitlementStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementStartDate getEntitlementStartDate() throws FieldNotFound {
    return get(new quickfix.field.EntitlementStartDate());
  }

  public boolean isSet(quickfix.field.EntitlementStartDate field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementStartDate() {
    return isSetField(1782);
  }

  public void set(quickfix.field.EntitlementEndDate value) {
    setField(value);
  }

  public quickfix.field.EntitlementEndDate get(quickfix.field.EntitlementEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementEndDate getEntitlementEndDate() throws FieldNotFound {
    return get(new quickfix.field.EntitlementEndDate());
  }

  public boolean isSet(quickfix.field.EntitlementEndDate field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementEndDate() {
    return isSetField(1783);
  }
}

  public void set(quickfix.field.EntitlementIndicator value) {
    setField(value);
  }

  public quickfix.field.EntitlementIndicator get(quickfix.field.EntitlementIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementIndicator getEntitlementIndicator() throws FieldNotFound {
    return get(new quickfix.field.EntitlementIndicator());
  }

  public boolean isSet(quickfix.field.EntitlementIndicator field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementIndicator() {
    return isSetField(1774);
  }

  public void set(quickfix.field.EntitlementType value) {
    setField(value);
  }

  public quickfix.field.EntitlementType get(quickfix.field.EntitlementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementType getEntitlementType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementType());
  }

  public boolean isSet(quickfix.field.EntitlementType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementType() {
    return isSetField(1775);
  }

  public void set(quickfix.field.EntitlementSubType value) {
    setField(value);
  }

  public quickfix.field.EntitlementSubType get(quickfix.field.EntitlementSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementSubType getEntitlementSubType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementSubType());
  }

  public boolean isSet(quickfix.field.EntitlementSubType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementSubType() {
    return isSetField(2402);
  }

  public void set(quickfix.fixlatest.component.EntitlementAttribGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.EntitlementAttribGrp get(quickfix.fixlatest.component.EntitlementAttribGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.EntitlementAttribGrp getEntitlementAttribGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.EntitlementAttribGrp());
  }

  public void set(quickfix.field.NoEntitlementAttrib value) {
    setField(value);
  }

  public quickfix.field.NoEntitlementAttrib get(quickfix.field.NoEntitlementAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoEntitlementAttrib getNoEntitlementAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoEntitlementAttrib());
  }

  public boolean isSet(quickfix.field.NoEntitlementAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoEntitlementAttrib() {
    return isSetField(1777);
  }

public static class NoEntitlementAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1778, 1779, 1780, 1781, 0};

  public NoEntitlementAttrib() {
    super(1777, 1778, ORDER);
  }

  public void set(quickfix.field.EntitlementAttribType value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribType get(quickfix.field.EntitlementAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribType getEntitlementAttribType() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribType());
  }

  public boolean isSet(quickfix.field.EntitlementAttribType field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribType() {
    return isSetField(1778);
  }

  public void set(quickfix.field.EntitlementAttribDatatype value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribDatatype get(quickfix.field.EntitlementAttribDatatype value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribDatatype getEntitlementAttribDatatype() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribDatatype());
  }

  public boolean isSet(quickfix.field.EntitlementAttribDatatype field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribDatatype() {
    return isSetField(1779);
  }

  public void set(quickfix.field.EntitlementAttribValue value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribValue get(quickfix.field.EntitlementAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribValue getEntitlementAttribValue() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribValue());
  }

  public boolean isSet(quickfix.field.EntitlementAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribValue() {
    return isSetField(1780);
  }

  public void set(quickfix.field.EntitlementAttribCurrency value) {
    setField(value);
  }

  public quickfix.field.EntitlementAttribCurrency get(quickfix.field.EntitlementAttribCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementAttribCurrency getEntitlementAttribCurrency() throws FieldNotFound {
    return get(new quickfix.field.EntitlementAttribCurrency());
  }

  public boolean isSet(quickfix.field.EntitlementAttribCurrency field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementAttribCurrency() {
    return isSetField(1781);
  }
}

  public void set(quickfix.field.EntitlementID value) {
    setField(value);
  }

  public quickfix.field.EntitlementID get(quickfix.field.EntitlementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementID getEntitlementID() throws FieldNotFound {
    return get(new quickfix.field.EntitlementID());
  }

  public boolean isSet(quickfix.field.EntitlementID field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementID() {
    return isSetField(1776);
  }

  public void set(quickfix.field.EntitlementPlatform value) {
    setField(value);
  }

  public quickfix.field.EntitlementPlatform get(quickfix.field.EntitlementPlatform value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementPlatform getEntitlementPlatform() throws FieldNotFound {
    return get(new quickfix.field.EntitlementPlatform());
  }

  public boolean isSet(quickfix.field.EntitlementPlatform field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementPlatform() {
    return isSetField(1784);
  }

  public void set(quickfix.fixlatest.component.InstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp get(quickfix.fixlatest.component.InstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp getInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScopeGrp());
  }

  public void set(quickfix.field.NoInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentScopes get(quickfix.field.NoInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentScopes getNoInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentScopes() {
    return isSetField(1656);
  }

public static class NoInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 0};

  public NoInstrumentScopes() {
    super(1656, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }
}

  public void set(quickfix.fixlatest.component.MarketSegmentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketSegmentScopeGrp get(quickfix.fixlatest.component.MarketSegmentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketSegmentScopeGrp getMarketSegmentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketSegmentScopeGrp());
  }

  public void set(quickfix.field.NoMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoMarketSegments get(quickfix.field.NoMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketSegments getNoMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoMarketSegments());
  }

  public boolean isSet(quickfix.field.NoMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketSegments() {
    return isSetField(1310);
  }

public static class NoMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1301, 1300, 0};

  public NoMarketSegments() {
    super(1310, 1301, ORDER);
  }

  public void set(quickfix.field.MarketID value) {
    setField(value);
  }

  public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketID getMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarketID());
  }

  public boolean isSet(quickfix.field.MarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarketID() {
    return isSetField(1301);
  }

  public void set(quickfix.field.MarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentID() {
    return isSetField(1300);
  }
}

  public void set(quickfix.field.EntitlementStartDate value) {
    setField(value);
  }

  public quickfix.field.EntitlementStartDate get(quickfix.field.EntitlementStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementStartDate getEntitlementStartDate() throws FieldNotFound {
    return get(new quickfix.field.EntitlementStartDate());
  }

  public boolean isSet(quickfix.field.EntitlementStartDate field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementStartDate() {
    return isSetField(1782);
  }

  public void set(quickfix.field.EntitlementEndDate value) {
    setField(value);
  }

  public quickfix.field.EntitlementEndDate get(quickfix.field.EntitlementEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EntitlementEndDate getEntitlementEndDate() throws FieldNotFound {
    return get(new quickfix.field.EntitlementEndDate());
  }

  public boolean isSet(quickfix.field.EntitlementEndDate field) {
    return isSetField(field);
  }

  public boolean isSetEntitlementEndDate() {
    return isSetField(1783);
  }
}
