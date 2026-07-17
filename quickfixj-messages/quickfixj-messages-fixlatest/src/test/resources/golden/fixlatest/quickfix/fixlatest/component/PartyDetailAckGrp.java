/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PartyDetailAckGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1676, };
  protected int[] getGroupFields() { return componentGroups; }

  public PartyDetailAckGrp() {
    super();
  }

  public void set(quickfix.field.NoPartyUpdates value) {
    setField(value);
  }

  public quickfix.field.NoPartyUpdates get(quickfix.field.NoPartyUpdates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyUpdates getNoPartyUpdates() throws FieldNotFound {
    return get(new quickfix.field.NoPartyUpdates());
  }

  public boolean isSet(quickfix.field.NoPartyUpdates field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyUpdates() {
    return isSetField(1676);
  }

public static class NoPartyUpdates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1324, 1879, 1880, 1328, 1664, 1665, 1671, 0};

  public NoPartyUpdates() {
    super(1676, 1324, ORDER);
  }

  public void set(quickfix.field.ListUpdateAction value) {
    setField(value);
  }

  public quickfix.field.ListUpdateAction get(quickfix.field.ListUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListUpdateAction getListUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.ListUpdateAction());
  }

  public boolean isSet(quickfix.field.ListUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetListUpdateAction() {
    return isSetField(1324);
  }

  public void set(quickfix.field.PartyDetailDefinitionStatus value) {
    setField(value);
  }

  public quickfix.field.PartyDetailDefinitionStatus get(quickfix.field.PartyDetailDefinitionStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailDefinitionStatus getPartyDetailDefinitionStatus() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailDefinitionStatus());
  }

  public boolean isSet(quickfix.field.PartyDetailDefinitionStatus field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailDefinitionStatus() {
    return isSetField(1879);
  }

  public void set(quickfix.field.PartyDetailDefinitionResult value) {
    setField(value);
  }

  public quickfix.field.PartyDetailDefinitionResult get(quickfix.field.PartyDetailDefinitionResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailDefinitionResult getPartyDetailDefinitionResult() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailDefinitionResult());
  }

  public boolean isSet(quickfix.field.PartyDetailDefinitionResult field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailDefinitionResult() {
    return isSetField(1880);
  }

  public void set(quickfix.field.RejectText value) {
    setField(value);
  }

  public quickfix.field.RejectText get(quickfix.field.RejectText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RejectText getRejectText() throws FieldNotFound {
    return get(new quickfix.field.RejectText());
  }

  public boolean isSet(quickfix.field.RejectText field) {
    return isSetField(field);
  }

  public boolean isSetRejectText() {
    return isSetField(1328);
  }

  public void set(quickfix.field.EncodedRejectTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedRejectTextLen get(quickfix.field.EncodedRejectTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedRejectTextLen getEncodedRejectTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedRejectTextLen());
  }

  public boolean isSet(quickfix.field.EncodedRejectTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedRejectTextLen() {
    return isSetField(1664);
  }

  public void set(quickfix.field.EncodedRejectText value) {
    setField(value);
  }

  public quickfix.field.EncodedRejectText get(quickfix.field.EncodedRejectText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedRejectText getEncodedRejectText() throws FieldNotFound {
    return get(new quickfix.field.EncodedRejectText());
  }

  public boolean isSet(quickfix.field.EncodedRejectText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedRejectText() {
    return isSetField(1665);
  }

  public void set(quickfix.fixlatest.component.PartyDetailGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailGrp get(quickfix.fixlatest.component.PartyDetailGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailGrp getPartyDetailGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailGrp());
  }

  public void set(quickfix.field.NoPartyDetails value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetails get(quickfix.field.NoPartyDetails value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetails getNoPartyDetails() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetails());
  }

  public boolean isSet(quickfix.field.NoPartyDetails field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetails() {
    return isSetField(1671);
  }

public static class NoPartyDetails extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1691, 1692, 1693, 1674, 1694, 1516, 1562, 1672, 0};

  public NoPartyDetails() {
    super(1671, 1691, ORDER);
  }

  public void set(quickfix.field.PartyDetailID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailID get(quickfix.field.PartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailID getPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailID());
  }

  public boolean isSet(quickfix.field.PartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailID() {
    return isSetField(1691);
  }

  public void set(quickfix.field.PartyDetailIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailIDSource get(quickfix.field.PartyDetailIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailIDSource getPartyDetailIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailIDSource() {
    return isSetField(1692);
  }

  public void set(quickfix.field.PartyDetailRole value) {
    setField(value);
  }

  public quickfix.field.PartyDetailRole get(quickfix.field.PartyDetailRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailRole getPartyDetailRole() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailRole());
  }

  public boolean isSet(quickfix.field.PartyDetailRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailRole() {
    return isSetField(1693);
  }

  public void set(quickfix.field.PartyDetailRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyDetailRoleQualifier get(quickfix.field.PartyDetailRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailRoleQualifier getPartyDetailRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyDetailRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailRoleQualifier() {
    return isSetField(1674);
  }

  public void set(quickfix.fixlatest.component.PartyDetailSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailSubGrp get(quickfix.fixlatest.component.PartyDetailSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailSubGrp getPartyDetailSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailSubIDs get(quickfix.field.NoPartyDetailSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailSubIDs getNoPartyDetailSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailSubIDs() {
    return isSetField(1694);
  }

public static class NoPartyDetailSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1695, 1696, 0};

  public NoPartyDetailSubIDs() {
    super(1694, 1695, ORDER);
  }

  public void set(quickfix.field.PartyDetailSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailSubID get(quickfix.field.PartyDetailSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailSubID getPartyDetailSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailSubID() {
    return isSetField(1695);
  }

  public void set(quickfix.field.PartyDetailSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailSubIDType get(quickfix.field.PartyDetailSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailSubIDType getPartyDetailSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailSubIDType() {
    return isSetField(1696);
  }
}

  public void set(quickfix.fixlatest.component.PartyDetailAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltIDGrp get(quickfix.fixlatest.component.PartyDetailAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltIDGrp getPartyDetailAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltIDGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltID get(quickfix.field.NoPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltID getNoPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltID() {
    return isSetField(1516);
  }

public static class NoPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1517, 1518, 1519, 0};

  public NoPartyDetailAltID() {
    super(1516, 1517, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltID get(quickfix.field.PartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltID getPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltID() {
    return isSetField(1517);
  }

  public void set(quickfix.field.PartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltIDSource get(quickfix.field.PartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltIDSource getPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltIDSource() {
    return isSetField(1518);
  }

  public void set(quickfix.fixlatest.component.PartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp get(quickfix.fixlatest.component.PartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp getPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltSubIDs get(quickfix.field.NoPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltSubIDs getNoPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltSubIDs() {
    return isSetField(1519);
  }

public static class NoPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1520, 1521, 0};

  public NoPartyDetailAltSubIDs() {
    super(1519, 1520, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubID get(quickfix.field.PartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubID getPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubID() {
    return isSetField(1520);
  }

  public void set(quickfix.field.PartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubIDType get(quickfix.field.PartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubIDType getPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubIDType() {
    return isSetField(1521);
  }
}
}

  public void set(quickfix.fixlatest.component.RelatedPartyDetailGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailGrp get(quickfix.fixlatest.component.RelatedPartyDetailGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailGrp getRelatedPartyDetailGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailID value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailID get(quickfix.field.NoRelatedPartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailID getNoRelatedPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailID());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailID() {
    return isSetField(1562);
  }

public static class NoRelatedPartyDetailID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1563, 1564, 1565, 1675, 1566, 1569, 1514, 0};

  public NoRelatedPartyDetailID() {
    super(1562, 1563, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailID get(quickfix.field.RelatedPartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailID getRelatedPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailID() {
    return isSetField(1563);
  }

  public void set(quickfix.field.RelatedPartyDetailIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailIDSource get(quickfix.field.RelatedPartyDetailIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailIDSource getRelatedPartyDetailIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailIDSource() {
    return isSetField(1564);
  }

  public void set(quickfix.field.RelatedPartyDetailRole value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailRole get(quickfix.field.RelatedPartyDetailRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailRole getRelatedPartyDetailRole() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailRole());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailRole field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailRole() {
    return isSetField(1565);
  }

  public void set(quickfix.field.RelatedPartyDetailRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailRoleQualifier get(quickfix.field.RelatedPartyDetailRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailRoleQualifier getRelatedPartyDetailRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailRoleQualifier());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailRoleQualifier() {
    return isSetField(1675);
  }

  public void set(quickfix.fixlatest.component.RelatedPartyDetailSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailSubGrp get(quickfix.fixlatest.component.RelatedPartyDetailSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailSubGrp getRelatedPartyDetailSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailSubGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailSubIDs get(quickfix.field.NoRelatedPartyDetailSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailSubIDs getNoRelatedPartyDetailSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailSubIDs());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailSubIDs() {
    return isSetField(1566);
  }

public static class NoRelatedPartyDetailSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1567, 1568, 0};

  public NoRelatedPartyDetailSubIDs() {
    super(1566, 1567, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailSubID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailSubID get(quickfix.field.RelatedPartyDetailSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailSubID getRelatedPartyDetailSubID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailSubID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailSubID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailSubID() {
    return isSetField(1567);
  }

  public void set(quickfix.field.RelatedPartyDetailSubIDType value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailSubIDType get(quickfix.field.RelatedPartyDetailSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailSubIDType getRelatedPartyDetailSubIDType() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailSubIDType());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailSubIDType() {
    return isSetField(1568);
  }
}

  public void set(quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp get(quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp getRelatedPartyDetailAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailAltID get(quickfix.field.NoRelatedPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailAltID getNoRelatedPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailAltID() {
    return isSetField(1569);
  }

public static class NoRelatedPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1570, 1571, 1572, 0};

  public NoRelatedPartyDetailAltID() {
    super(1569, 1570, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltID get(quickfix.field.RelatedPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltID getRelatedPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltID() {
    return isSetField(1570);
  }

  public void set(quickfix.field.RelatedPartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltIDSource get(quickfix.field.RelatedPartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltIDSource getRelatedPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltIDSource() {
    return isSetField(1571);
  }

  public void set(quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp get(quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp getRelatedPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailAltSubIDs get(quickfix.field.NoRelatedPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailAltSubIDs getNoRelatedPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailAltSubIDs() {
    return isSetField(1572);
  }

public static class NoRelatedPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1573, 1574, 0};

  public NoRelatedPartyDetailAltSubIDs() {
    super(1572, 1573, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltSubID get(quickfix.field.RelatedPartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltSubID getRelatedPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltSubID() {
    return isSetField(1573);
  }

  public void set(quickfix.field.RelatedPartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltSubIDType get(quickfix.field.RelatedPartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltSubIDType getRelatedPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltSubIDType() {
    return isSetField(1574);
  }
}
}

  public void set(quickfix.fixlatest.component.PartyRelationshipGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyRelationshipGrp get(quickfix.fixlatest.component.PartyRelationshipGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyRelationshipGrp getPartyRelationshipGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyRelationshipGrp());
  }

  public void set(quickfix.field.NoPartyRelationships value) {
    setField(value);
  }

  public quickfix.field.NoPartyRelationships get(quickfix.field.NoPartyRelationships value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyRelationships getNoPartyRelationships() throws FieldNotFound {
    return get(new quickfix.field.NoPartyRelationships());
  }

  public boolean isSet(quickfix.field.NoPartyRelationships field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyRelationships() {
    return isSetField(1514);
  }

public static class NoPartyRelationships extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1515, 0};

  public NoPartyRelationships() {
    super(1514, 1515, ORDER);
  }

  public void set(quickfix.field.PartyRelationship value) {
    setField(value);
  }

  public quickfix.field.PartyRelationship get(quickfix.field.PartyRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRelationship getPartyRelationship() throws FieldNotFound {
    return get(new quickfix.field.PartyRelationship());
  }

  public boolean isSet(quickfix.field.PartyRelationship field) {
    return isSetField(field);
  }

  public boolean isSetPartyRelationship() {
    return isSetField(1515);
  }
}
}

  public void set(quickfix.field.PartyDetailStatus value) {
    setField(value);
  }

  public quickfix.field.PartyDetailStatus get(quickfix.field.PartyDetailStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailStatus getPartyDetailStatus() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailStatus());
  }

  public boolean isSet(quickfix.field.PartyDetailStatus field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailStatus() {
    return isSetField(1672);
  }
}
}

  public void set(quickfix.field.ListUpdateAction value) {
    setField(value);
  }

  public quickfix.field.ListUpdateAction get(quickfix.field.ListUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListUpdateAction getListUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.ListUpdateAction());
  }

  public boolean isSet(quickfix.field.ListUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetListUpdateAction() {
    return isSetField(1324);
  }

  public void set(quickfix.field.PartyDetailDefinitionStatus value) {
    setField(value);
  }

  public quickfix.field.PartyDetailDefinitionStatus get(quickfix.field.PartyDetailDefinitionStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailDefinitionStatus getPartyDetailDefinitionStatus() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailDefinitionStatus());
  }

  public boolean isSet(quickfix.field.PartyDetailDefinitionStatus field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailDefinitionStatus() {
    return isSetField(1879);
  }

  public void set(quickfix.field.PartyDetailDefinitionResult value) {
    setField(value);
  }

  public quickfix.field.PartyDetailDefinitionResult get(quickfix.field.PartyDetailDefinitionResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailDefinitionResult getPartyDetailDefinitionResult() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailDefinitionResult());
  }

  public boolean isSet(quickfix.field.PartyDetailDefinitionResult field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailDefinitionResult() {
    return isSetField(1880);
  }

  public void set(quickfix.field.RejectText value) {
    setField(value);
  }

  public quickfix.field.RejectText get(quickfix.field.RejectText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RejectText getRejectText() throws FieldNotFound {
    return get(new quickfix.field.RejectText());
  }

  public boolean isSet(quickfix.field.RejectText field) {
    return isSetField(field);
  }

  public boolean isSetRejectText() {
    return isSetField(1328);
  }

  public void set(quickfix.field.EncodedRejectTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedRejectTextLen get(quickfix.field.EncodedRejectTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedRejectTextLen getEncodedRejectTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedRejectTextLen());
  }

  public boolean isSet(quickfix.field.EncodedRejectTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedRejectTextLen() {
    return isSetField(1664);
  }

  public void set(quickfix.field.EncodedRejectText value) {
    setField(value);
  }

  public quickfix.field.EncodedRejectText get(quickfix.field.EncodedRejectText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedRejectText getEncodedRejectText() throws FieldNotFound {
    return get(new quickfix.field.EncodedRejectText());
  }

  public boolean isSet(quickfix.field.EncodedRejectText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedRejectText() {
    return isSetField(1665);
  }

  public void set(quickfix.fixlatest.component.PartyDetailGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailGrp get(quickfix.fixlatest.component.PartyDetailGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailGrp getPartyDetailGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailGrp());
  }

  public void set(quickfix.field.NoPartyDetails value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetails get(quickfix.field.NoPartyDetails value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetails getNoPartyDetails() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetails());
  }

  public boolean isSet(quickfix.field.NoPartyDetails field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetails() {
    return isSetField(1671);
  }

public static class NoPartyDetails extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1691, 1692, 1693, 1674, 1694, 1516, 1562, 1672, 0};

  public NoPartyDetails() {
    super(1671, 1691, ORDER);
  }

  public void set(quickfix.field.PartyDetailID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailID get(quickfix.field.PartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailID getPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailID());
  }

  public boolean isSet(quickfix.field.PartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailID() {
    return isSetField(1691);
  }

  public void set(quickfix.field.PartyDetailIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailIDSource get(quickfix.field.PartyDetailIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailIDSource getPartyDetailIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailIDSource() {
    return isSetField(1692);
  }

  public void set(quickfix.field.PartyDetailRole value) {
    setField(value);
  }

  public quickfix.field.PartyDetailRole get(quickfix.field.PartyDetailRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailRole getPartyDetailRole() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailRole());
  }

  public boolean isSet(quickfix.field.PartyDetailRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailRole() {
    return isSetField(1693);
  }

  public void set(quickfix.field.PartyDetailRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyDetailRoleQualifier get(quickfix.field.PartyDetailRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailRoleQualifier getPartyDetailRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyDetailRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailRoleQualifier() {
    return isSetField(1674);
  }

  public void set(quickfix.fixlatest.component.PartyDetailSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailSubGrp get(quickfix.fixlatest.component.PartyDetailSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailSubGrp getPartyDetailSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailSubIDs get(quickfix.field.NoPartyDetailSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailSubIDs getNoPartyDetailSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailSubIDs() {
    return isSetField(1694);
  }

public static class NoPartyDetailSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1695, 1696, 0};

  public NoPartyDetailSubIDs() {
    super(1694, 1695, ORDER);
  }

  public void set(quickfix.field.PartyDetailSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailSubID get(quickfix.field.PartyDetailSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailSubID getPartyDetailSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailSubID() {
    return isSetField(1695);
  }

  public void set(quickfix.field.PartyDetailSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailSubIDType get(quickfix.field.PartyDetailSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailSubIDType getPartyDetailSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailSubIDType() {
    return isSetField(1696);
  }
}

  public void set(quickfix.fixlatest.component.PartyDetailAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltIDGrp get(quickfix.fixlatest.component.PartyDetailAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltIDGrp getPartyDetailAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltIDGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltID get(quickfix.field.NoPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltID getNoPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltID() {
    return isSetField(1516);
  }

public static class NoPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1517, 1518, 1519, 0};

  public NoPartyDetailAltID() {
    super(1516, 1517, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltID get(quickfix.field.PartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltID getPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltID() {
    return isSetField(1517);
  }

  public void set(quickfix.field.PartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltIDSource get(quickfix.field.PartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltIDSource getPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.PartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltIDSource() {
    return isSetField(1518);
  }

  public void set(quickfix.fixlatest.component.PartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp get(quickfix.fixlatest.component.PartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyDetailAltSubGrp getPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyDetailAltSubIDs get(quickfix.field.NoPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyDetailAltSubIDs getNoPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyDetailAltSubIDs() {
    return isSetField(1519);
  }

public static class NoPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1520, 1521, 0};

  public NoPartyDetailAltSubIDs() {
    super(1519, 1520, ORDER);
  }

  public void set(quickfix.field.PartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubID get(quickfix.field.PartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubID getPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubID() {
    return isSetField(1520);
  }

  public void set(quickfix.field.PartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.PartyDetailAltSubIDType get(quickfix.field.PartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailAltSubIDType getPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.PartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailAltSubIDType() {
    return isSetField(1521);
  }
}
}

  public void set(quickfix.fixlatest.component.RelatedPartyDetailGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailGrp get(quickfix.fixlatest.component.RelatedPartyDetailGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailGrp getRelatedPartyDetailGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailID value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailID get(quickfix.field.NoRelatedPartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailID getNoRelatedPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailID());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailID() {
    return isSetField(1562);
  }

public static class NoRelatedPartyDetailID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1563, 1564, 1565, 1675, 1566, 1569, 1514, 0};

  public NoRelatedPartyDetailID() {
    super(1562, 1563, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailID get(quickfix.field.RelatedPartyDetailID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailID getRelatedPartyDetailID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailID() {
    return isSetField(1563);
  }

  public void set(quickfix.field.RelatedPartyDetailIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailIDSource get(quickfix.field.RelatedPartyDetailIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailIDSource getRelatedPartyDetailIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailIDSource() {
    return isSetField(1564);
  }

  public void set(quickfix.field.RelatedPartyDetailRole value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailRole get(quickfix.field.RelatedPartyDetailRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailRole getRelatedPartyDetailRole() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailRole());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailRole field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailRole() {
    return isSetField(1565);
  }

  public void set(quickfix.field.RelatedPartyDetailRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailRoleQualifier get(quickfix.field.RelatedPartyDetailRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailRoleQualifier getRelatedPartyDetailRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailRoleQualifier());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailRoleQualifier() {
    return isSetField(1675);
  }

  public void set(quickfix.fixlatest.component.RelatedPartyDetailSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailSubGrp get(quickfix.fixlatest.component.RelatedPartyDetailSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailSubGrp getRelatedPartyDetailSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailSubGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailSubIDs get(quickfix.field.NoRelatedPartyDetailSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailSubIDs getNoRelatedPartyDetailSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailSubIDs());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailSubIDs() {
    return isSetField(1566);
  }

public static class NoRelatedPartyDetailSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1567, 1568, 0};

  public NoRelatedPartyDetailSubIDs() {
    super(1566, 1567, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailSubID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailSubID get(quickfix.field.RelatedPartyDetailSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailSubID getRelatedPartyDetailSubID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailSubID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailSubID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailSubID() {
    return isSetField(1567);
  }

  public void set(quickfix.field.RelatedPartyDetailSubIDType value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailSubIDType get(quickfix.field.RelatedPartyDetailSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailSubIDType getRelatedPartyDetailSubIDType() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailSubIDType());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailSubIDType() {
    return isSetField(1568);
  }
}

  public void set(quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp get(quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp getRelatedPartyDetailAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailAltIDGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailAltID get(quickfix.field.NoRelatedPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailAltID getNoRelatedPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailAltID() {
    return isSetField(1569);
  }

public static class NoRelatedPartyDetailAltID extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1570, 1571, 1572, 0};

  public NoRelatedPartyDetailAltID() {
    super(1569, 1570, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailAltID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltID get(quickfix.field.RelatedPartyDetailAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltID getRelatedPartyDetailAltID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltID() {
    return isSetField(1570);
  }

  public void set(quickfix.field.RelatedPartyDetailAltIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltIDSource get(quickfix.field.RelatedPartyDetailAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltIDSource getRelatedPartyDetailAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltIDSource() {
    return isSetField(1571);
  }

  public void set(quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp get(quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp getRelatedPartyDetailAltSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedPartyDetailAltSubGrp());
  }

  public void set(quickfix.field.NoRelatedPartyDetailAltSubIDs value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPartyDetailAltSubIDs get(quickfix.field.NoRelatedPartyDetailAltSubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPartyDetailAltSubIDs getNoRelatedPartyDetailAltSubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPartyDetailAltSubIDs());
  }

  public boolean isSet(quickfix.field.NoRelatedPartyDetailAltSubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPartyDetailAltSubIDs() {
    return isSetField(1572);
  }

public static class NoRelatedPartyDetailAltSubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1573, 1574, 0};

  public NoRelatedPartyDetailAltSubIDs() {
    super(1572, 1573, ORDER);
  }

  public void set(quickfix.field.RelatedPartyDetailAltSubID value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltSubID get(quickfix.field.RelatedPartyDetailAltSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltSubID getRelatedPartyDetailAltSubID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltSubID());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltSubID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltSubID() {
    return isSetField(1573);
  }

  public void set(quickfix.field.RelatedPartyDetailAltSubIDType value) {
    setField(value);
  }

  public quickfix.field.RelatedPartyDetailAltSubIDType get(quickfix.field.RelatedPartyDetailAltSubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPartyDetailAltSubIDType getRelatedPartyDetailAltSubIDType() throws FieldNotFound {
    return get(new quickfix.field.RelatedPartyDetailAltSubIDType());
  }

  public boolean isSet(quickfix.field.RelatedPartyDetailAltSubIDType field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPartyDetailAltSubIDType() {
    return isSetField(1574);
  }
}
}

  public void set(quickfix.fixlatest.component.PartyRelationshipGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PartyRelationshipGrp get(quickfix.fixlatest.component.PartyRelationshipGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PartyRelationshipGrp getPartyRelationshipGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PartyRelationshipGrp());
  }

  public void set(quickfix.field.NoPartyRelationships value) {
    setField(value);
  }

  public quickfix.field.NoPartyRelationships get(quickfix.field.NoPartyRelationships value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyRelationships getNoPartyRelationships() throws FieldNotFound {
    return get(new quickfix.field.NoPartyRelationships());
  }

  public boolean isSet(quickfix.field.NoPartyRelationships field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyRelationships() {
    return isSetField(1514);
  }

public static class NoPartyRelationships extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1515, 0};

  public NoPartyRelationships() {
    super(1514, 1515, ORDER);
  }

  public void set(quickfix.field.PartyRelationship value) {
    setField(value);
  }

  public quickfix.field.PartyRelationship get(quickfix.field.PartyRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRelationship getPartyRelationship() throws FieldNotFound {
    return get(new quickfix.field.PartyRelationship());
  }

  public boolean isSet(quickfix.field.PartyRelationship field) {
    return isSetField(field);
  }

  public boolean isSetPartyRelationship() {
    return isSetField(1515);
  }
}
}

  public void set(quickfix.field.PartyDetailStatus value) {
    setField(value);
  }

  public quickfix.field.PartyDetailStatus get(quickfix.field.PartyDetailStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyDetailStatus getPartyDetailStatus() throws FieldNotFound {
    return get(new quickfix.field.PartyDetailStatus());
  }

  public boolean isSet(quickfix.field.PartyDetailStatus field) {
    return isSetField(field);
  }

  public boolean isSetPartyDetailStatus() {
    return isSetField(1672);
  }
}
}
