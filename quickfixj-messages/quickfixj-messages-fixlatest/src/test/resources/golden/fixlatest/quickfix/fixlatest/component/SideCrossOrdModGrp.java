/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SideCrossOrdModGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {552, };
  protected int[] getGroupFields() { return componentGroups; }

  public SideCrossOrdModGrp() {
    super();
  }

  public void set(quickfix.field.NoSides value) {
    setField(value);
  }

  public quickfix.field.NoSides get(quickfix.field.NoSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSides getNoSides() throws FieldNotFound {
    return get(new quickfix.field.NoSides());
  }

  public boolean isSet(quickfix.field.NoSides field) {
    return isSetField(field);
  }

  public boolean isSetNoSides() {
    return isSetField(552);
  }

public static class NoSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {54, 2102, 41, 11, 526, 583, 453, 1829, 1690, 229, 75, 1, 660, 581, 589, 590, 591, 70, 78, 854, 38, 152, 516, 468, 469, 12, 13, 479, 1233, 1238, 497, 2639, 528, 529, 1724, 1725, 1726, 2883, 1091, 582, 121, 120, 775, 58, 354, 355, 1816, 77, 203, 544, 635, 377, 659, 962, 0};

  public NoSides() {
    super(552, 54, ORDER);
  }

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.field.ShortMarkingExemptIndicator value) {
    setField(value);
  }

  public quickfix.field.ShortMarkingExemptIndicator get(quickfix.field.ShortMarkingExemptIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortMarkingExemptIndicator getShortMarkingExemptIndicator() throws FieldNotFound {
    return get(new quickfix.field.ShortMarkingExemptIndicator());
  }

  public boolean isSet(quickfix.field.ShortMarkingExemptIndicator field) {
    return isSetField(field);
  }

  public boolean isSetShortMarkingExemptIndicator() {
    return isSetField(2102);
  }

  public void set(quickfix.field.OrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.OrigClOrdID());
  }

  public boolean isSet(quickfix.field.OrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID() {
    return isSetField(41);
  }

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.SecondaryClOrdID value) {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryClOrdID());
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID() {
    return isSetField(526);
  }

  public void set(quickfix.field.ClOrdLinkID value) {
    setField(value);
  }

  public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdLinkID());
  }

  public boolean isSet(quickfix.field.ClOrdLinkID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdLinkID() {
    return isSetField(583);
  }

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
  }

  public void set(quickfix.field.NoPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs() {
    return isSetField(802);
  }

public static class NoPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

  public NoPartySubIDs() {
    super(802, 523, ORDER);
  }

  public void set(quickfix.field.PartySubID value) {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PartySubID());
  }

  public boolean isSet(quickfix.field.PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPartySubID() {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartySubIDType());
  }

  public boolean isSet(quickfix.field.PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType() {
    return isSetField(803);
  }
}
}

  public void set(quickfix.fixlatest.component.SideCrossLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCrossLegGrp get(quickfix.fixlatest.component.SideCrossLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCrossLegGrp getSideCrossLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCrossLegGrp());
  }

  public void set(quickfix.field.NoCrossLegs value) {
    setField(value);
  }

  public quickfix.field.NoCrossLegs get(quickfix.field.NoCrossLegs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCrossLegs getNoCrossLegs() throws FieldNotFound {
    return get(new quickfix.field.NoCrossLegs());
  }

  public boolean isSet(quickfix.field.NoCrossLegs field) {
    return isSetField(field);
  }

  public boolean isSetNoCrossLegs() {
    return isSetField(1829);
  }

public static class NoCrossLegs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {654, 685, 690, 683, 1366, 670, 1817, 564, 565, 948, 587, 588, 675, 1379, 1381, 1383, 1384, 1689, 0};

  public NoCrossLegs() {
    super(1829, 654, ORDER);
  }

  public void set(quickfix.field.LegRefID value) {
    setField(value);
  }

  public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
    return get(new quickfix.field.LegRefID());
  }

  public boolean isSet(quickfix.field.LegRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegRefID() {
    return isSetField(654);
  }

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
}

  public void set(quickfix.field.LegAllocID value) {
    setField(value);
  }

  public quickfix.field.LegAllocID get(quickfix.field.LegAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocID getLegAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegAllocID());
  }

  public boolean isSet(quickfix.field.LegAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocID() {
    return isSetField(1366);
  }

  public void set(quickfix.fixlatest.component.LegPreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPreAllocGrp get(quickfix.fixlatest.component.LegPreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPreAllocGrp getLegPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPreAllocGrp());
  }

  public void set(quickfix.field.NoLegAllocs value) {
    setField(value);
  }

  public quickfix.field.NoLegAllocs get(quickfix.field.NoLegAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAllocs getNoLegAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAllocs());
  }

  public boolean isSet(quickfix.field.NoLegAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAllocs() {
    return isSetField(670);
  }

public static class NoLegAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {671, 672, 756, 673, 674, 1367, 1756, 1757, 1758, 1759, 0};

  public NoLegAllocs() {
    super(670, 671, ORDER);
  }

  public void set(quickfix.field.LegAllocAccount value) {
    setField(value);
  }

  public quickfix.field.LegAllocAccount get(quickfix.field.LegAllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAccount getLegAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAccount());
  }

  public boolean isSet(quickfix.field.LegAllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAccount() {
    return isSetField(671);
  }

  public void set(quickfix.field.LegIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.LegIndividualAllocID get(quickfix.field.LegIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndividualAllocID getLegIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegIndividualAllocID());
  }

  public boolean isSet(quickfix.field.LegIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegIndividualAllocID() {
    return isSetField(672);
  }

  public void set(quickfix.fixlatest.component.NestedParties2 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties2 get(quickfix.fixlatest.component.NestedParties2 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties2 getNestedParties2Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties2());
  }

  public void set(quickfix.field.NoNested2PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs() {
    return isSetField(756);
  }

public static class NoNested2PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {757, 758, 759, 2381, 806, 0};

  public NoNested2PartyIDs() {
    super(756, 757, ORDER);
  }

  public void set(quickfix.field.Nested2PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyID());
  }

  public boolean isSet(quickfix.field.Nested2PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID() {
    return isSetField(757);
  }

  public void set(quickfix.field.Nested2PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource() {
    return isSetField(758);
  }

  public void set(quickfix.field.Nested2PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRole());
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole() {
    return isSetField(759);
  }

  public void set(quickfix.field.Nested2PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRoleQualifier get(quickfix.field.Nested2PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRoleQualifier getNested2PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested2PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRoleQualifier() {
    return isSetField(2381);
  }

  public void set(quickfix.fixlatest.component.NstdPtys2SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp get(quickfix.fixlatest.component.NstdPtys2SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp getNstdPtys2SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys2SubGrp());
  }

  public void set(quickfix.field.NoNested2PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs() {
    return isSetField(806);
  }

public static class NoNested2PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {760, 807, 0};

  public NoNested2PartySubIDs() {
    super(806, 760, ORDER);
  }

  public void set(quickfix.field.Nested2PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubID());
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID() {
    return isSetField(760);
  }

  public void set(quickfix.field.Nested2PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType() {
    return isSetField(807);
  }
}
}

  public void set(quickfix.field.LegAllocQty value) {
    setField(value);
  }

  public quickfix.field.LegAllocQty get(quickfix.field.LegAllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocQty getLegAllocQty() throws FieldNotFound {
    return get(new quickfix.field.LegAllocQty());
  }

  public boolean isSet(quickfix.field.LegAllocQty field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocQty() {
    return isSetField(673);
  }

  public void set(quickfix.field.LegAllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAllocAcctIDSource get(quickfix.field.LegAllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAcctIDSource getLegAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.LegAllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAcctIDSource() {
    return isSetField(674);
  }

  public void set(quickfix.field.LegAllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAllocSettlCurrency get(quickfix.field.LegAllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocSettlCurrency getLegAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegAllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocSettlCurrency() {
    return isSetField(1367);
  }

  public void set(quickfix.field.LegCustodialLotID value) {
    setField(value);
  }

  public quickfix.field.LegCustodialLotID get(quickfix.field.LegCustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCustodialLotID getLegCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.LegCustodialLotID());
  }

  public boolean isSet(quickfix.field.LegCustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetLegCustodialLotID() {
    return isSetField(1756);
  }

  public void set(quickfix.field.LegVersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchaseDate get(quickfix.field.LegVersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchaseDate getLegVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.LegVersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchaseDate() {
    return isSetField(1757);
  }

  public void set(quickfix.field.LegVersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchasePrice get(quickfix.field.LegVersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchasePrice getLegVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.LegVersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchasePrice() {
    return isSetField(1758);
  }

  public void set(quickfix.field.LegCurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.LegCurrentCostBasis get(quickfix.field.LegCurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrentCostBasis getLegCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.LegCurrentCostBasis());
  }

  public boolean isSet(quickfix.field.LegCurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrentCostBasis() {
    return isSetField(1759);
  }
}

  public void set(quickfix.field.LegClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.LegClearingAccountType get(quickfix.field.LegClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegClearingAccountType getLegClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.LegClearingAccountType());
  }

  public boolean isSet(quickfix.field.LegClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetLegClearingAccountType() {
    return isSetField(1817);
  }

  public void set(quickfix.field.LegPositionEffect value) {
    setField(value);
  }

  public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.LegPositionEffect());
  }

  public boolean isSet(quickfix.field.LegPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionEffect() {
    return isSetField(564);
  }

  public void set(quickfix.field.LegCoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.LegCoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetLegCoveredOrUncovered() {
    return isSetField(565);
  }

  public void set(quickfix.fixlatest.component.NestedParties3 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties3 get(quickfix.fixlatest.component.NestedParties3 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties3 getNestedParties3Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties3());
  }

  public void set(quickfix.field.NoNested3PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartyIDs get(quickfix.field.NoNested3PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartyIDs getNoNested3PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartyIDs() {
    return isSetField(948);
  }

public static class NoNested3PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {949, 950, 951, 2382, 952, 0};

  public NoNested3PartyIDs() {
    super(948, 949, ORDER);
  }

  public void set(quickfix.field.Nested3PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyID get(quickfix.field.Nested3PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyID getNested3PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyID());
  }

  public boolean isSet(quickfix.field.Nested3PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyID() {
    return isSetField(949);
  }

  public void set(quickfix.field.Nested3PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyIDSource get(quickfix.field.Nested3PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyIDSource getNested3PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested3PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyIDSource() {
    return isSetField(950);
  }

  public void set(quickfix.field.Nested3PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRole get(quickfix.field.Nested3PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRole getNested3PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRole());
  }

  public boolean isSet(quickfix.field.Nested3PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRole() {
    return isSetField(951);
  }

  public void set(quickfix.field.Nested3PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRoleQualifier get(quickfix.field.Nested3PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRoleQualifier getNested3PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested3PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRoleQualifier() {
    return isSetField(2382);
  }

  public void set(quickfix.fixlatest.component.NstdPtys3SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp get(quickfix.fixlatest.component.NstdPtys3SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp getNstdPtys3SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys3SubGrp());
  }

  public void set(quickfix.field.NoNested3PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartySubIDs get(quickfix.field.NoNested3PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartySubIDs() {
    return isSetField(952);
  }

public static class NoNested3PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {953, 954, 0};

  public NoNested3PartySubIDs() {
    super(952, 953, ORDER);
  }

  public void set(quickfix.field.Nested3PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubID get(quickfix.field.Nested3PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubID getNested3PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubID());
  }

  public boolean isSet(quickfix.field.Nested3PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubID() {
    return isSetField(953);
  }

  public void set(quickfix.field.Nested3PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubIDType get(quickfix.field.Nested3PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubIDType() {
    return isSetField(954);
  }
}
}

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
  }

  public void set(quickfix.field.LegSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlCurrency() {
    return isSetField(675);
  }

  public void set(quickfix.field.LegVolatility value) {
    setField(value);
  }

  public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
    return get(new quickfix.field.LegVolatility());
  }

  public boolean isSet(quickfix.field.LegVolatility field) {
    return isSetField(field);
  }

  public boolean isSetLegVolatility() {
    return isSetField(1379);
  }

  public void set(quickfix.field.LegDividendYield value) {
    setField(value);
  }

  public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
    return get(new quickfix.field.LegDividendYield());
  }

  public boolean isSet(quickfix.field.LegDividendYield field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendYield() {
    return isSetField(1381);
  }

  public void set(quickfix.field.LegCurrencyRatio value) {
    setField(value);
  }

  public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
    return get(new quickfix.field.LegCurrencyRatio());
  }

  public boolean isSet(quickfix.field.LegCurrencyRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrencyRatio() {
    return isSetField(1383);
  }

  public void set(quickfix.field.LegExecInst value) {
    setField(value);
  }

  public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
    return get(new quickfix.field.LegExecInst());
  }

  public boolean isSet(quickfix.field.LegExecInst field) {
    return isSetField(field);
  }

  public boolean isSetLegExecInst() {
    return isSetField(1384);
  }

  public void set(quickfix.field.LegShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleExemptionReason get(quickfix.field.LegShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleExemptionReason getLegShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.LegShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleExemptionReason() {
    return isSetField(1689);
  }
}

  public void set(quickfix.field.SideShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.SideShortSaleExemptionReason get(quickfix.field.SideShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideShortSaleExemptionReason getSideShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.SideShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.SideShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetSideShortSaleExemptionReason() {
    return isSetField(1690);
  }

  public void set(quickfix.field.TradeOriginationDate value) {
    setField(value);
  }

  public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
    return get(new quickfix.field.TradeOriginationDate());
  }

  public boolean isSet(quickfix.field.TradeOriginationDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeOriginationDate() {
    return isSetField(229);
  }

  public void set(quickfix.field.TradeDate value) {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
    return get(new quickfix.field.TradeDate());
  }

  public boolean isSet(quickfix.field.TradeDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeDate() {
    return isSetField(75);
  }

  public void set(quickfix.field.Account value) {
    setField(value);
  }

  public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Account getAccount() throws FieldNotFound {
    return get(new quickfix.field.Account());
  }

  public boolean isSet(quickfix.field.Account field) {
    return isSetField(field);
  }

  public boolean isSetAccount() {
    return isSetField(1);
  }

  public void set(quickfix.field.AcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AcctIDSource());
  }

  public boolean isSet(quickfix.field.AcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAcctIDSource() {
    return isSetField(660);
  }

  public void set(quickfix.field.AccountType value) {
    setField(value);
  }

  public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccountType getAccountType() throws FieldNotFound {
    return get(new quickfix.field.AccountType());
  }

  public boolean isSet(quickfix.field.AccountType field) {
    return isSetField(field);
  }

  public boolean isSetAccountType() {
    return isSetField(581);
  }

  public void set(quickfix.field.DayBookingInst value) {
    setField(value);
  }

  public quickfix.field.DayBookingInst get(quickfix.field.DayBookingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound {
    return get(new quickfix.field.DayBookingInst());
  }

  public boolean isSet(quickfix.field.DayBookingInst field) {
    return isSetField(field);
  }

  public boolean isSetDayBookingInst() {
    return isSetField(589);
  }

  public void set(quickfix.field.BookingUnit value) {
    setField(value);
  }

  public quickfix.field.BookingUnit get(quickfix.field.BookingUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound {
    return get(new quickfix.field.BookingUnit());
  }

  public boolean isSet(quickfix.field.BookingUnit field) {
    return isSetField(field);
  }

  public boolean isSetBookingUnit() {
    return isSetField(590);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.PreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PreAllocGrp get(quickfix.fixlatest.component.PreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PreAllocGrp getPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PreAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 2727, 539, 209, 80, 1752, 1753, 1754, 1755, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }
}

  public void set(quickfix.field.QtyType value) {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound {
    return get(new quickfix.field.QtyType());
  }

  public boolean isSet(quickfix.field.QtyType field) {
    return isSetField(field);
  }

  public boolean isSetQtyType() {
    return isSetField(854);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
  }

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
  }

  public void set(quickfix.fixlatest.component.CommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionDataGrp get(quickfix.fixlatest.component.CommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionDataGrp getCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionDataGrp());
  }

  public void set(quickfix.field.NoCommissions value) {
    setField(value);
  }

  public quickfix.field.NoCommissions get(quickfix.field.NoCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCommissions getNoCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoCommissions());
  }

  public boolean isSet(quickfix.field.NoCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoCommissions() {
    return isSetField(2639);
  }

public static class NoCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2640, 2641, 2725, 2642, 2643, 2644, 2645, 2646, 2647, 2648, 2649, 2650, 2651, 2652, 0};

  public NoCommissions() {
    super(2639, 2640, ORDER);
  }

  public void set(quickfix.field.CommissionAmount value) {
    setField(value);
  }

  public quickfix.field.CommissionAmount get(quickfix.field.CommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmount getCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmount());
  }

  public boolean isSet(quickfix.field.CommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmount() {
    return isSetField(2640);
  }

  public void set(quickfix.field.CommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountType get(quickfix.field.CommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountType getCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountType());
  }

  public boolean isSet(quickfix.field.CommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountType() {
    return isSetField(2641);
  }

  public void set(quickfix.field.CommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountSubType get(quickfix.field.CommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountSubType getCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.CommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountSubType() {
    return isSetField(2725);
  }

  public void set(quickfix.field.CommissionBasis value) {
    setField(value);
  }

  public quickfix.field.CommissionBasis get(quickfix.field.CommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionBasis getCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.CommissionBasis());
  }

  public boolean isSet(quickfix.field.CommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetCommissionBasis() {
    return isSetField(2642);
  }

  public void set(quickfix.field.CommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionCurrency get(quickfix.field.CommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionCurrency getCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionCurrency());
  }

  public boolean isSet(quickfix.field.CommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionCurrency() {
    return isSetField(2643);
  }

  public void set(quickfix.field.CommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasure get(quickfix.field.CommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasure getCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasure() {
    return isSetField(2644);
  }

  public void set(quickfix.field.CommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency get(quickfix.field.CommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency getCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasureCurrency() {
    return isSetField(2645);
  }

  public void set(quickfix.field.CommissionRate value) {
    setField(value);
  }

  public quickfix.field.CommissionRate get(quickfix.field.CommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionRate getCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.CommissionRate());
  }

  public boolean isSet(quickfix.field.CommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetCommissionRate() {
    return isSetField(2646);
  }

  public void set(quickfix.field.CommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.CommissionSharedIndicator get(quickfix.field.CommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionSharedIndicator getCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.CommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.CommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCommissionSharedIndicator() {
    return isSetField(2647);
  }

  public void set(quickfix.field.CommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountShared get(quickfix.field.CommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountShared getCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountShared());
  }

  public boolean isSet(quickfix.field.CommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountShared() {
    return isSetField(2648);
  }

  public void set(quickfix.field.CommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.CommissionLegRefID get(quickfix.field.CommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionLegRefID getCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.CommissionLegRefID());
  }

  public boolean isSet(quickfix.field.CommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetCommissionLegRefID() {
    return isSetField(2649);
  }

  public void set(quickfix.field.CommissionDesc value) {
    setField(value);
  }

  public quickfix.field.CommissionDesc get(quickfix.field.CommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionDesc getCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.CommissionDesc());
  }

  public boolean isSet(quickfix.field.CommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetCommissionDesc() {
    return isSetField(2650);
  }

  public void set(quickfix.field.EncodedCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDescLen get(quickfix.field.EncodedCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDescLen getEncodedCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDescLen() {
    return isSetField(2651);
  }

  public void set(quickfix.field.EncodedCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDesc get(quickfix.field.EncodedCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDesc getEncodedCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDesc() {
    return isSetField(2652);
  }
}

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.OrderOrigination value) {
    setField(value);
  }

  public quickfix.field.OrderOrigination get(quickfix.field.OrderOrigination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOrigination getOrderOrigination() throws FieldNotFound {
    return get(new quickfix.field.OrderOrigination());
  }

  public boolean isSet(quickfix.field.OrderOrigination field) {
    return isSetField(field);
  }

  public boolean isSetOrderOrigination() {
    return isSetField(1724);
  }

  public void set(quickfix.field.OriginatingDeptID value) {
    setField(value);
  }

  public quickfix.field.OriginatingDeptID get(quickfix.field.OriginatingDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OriginatingDeptID getOriginatingDeptID() throws FieldNotFound {
    return get(new quickfix.field.OriginatingDeptID());
  }

  public boolean isSet(quickfix.field.OriginatingDeptID field) {
    return isSetField(field);
  }

  public boolean isSetOriginatingDeptID() {
    return isSetField(1725);
  }

  public void set(quickfix.field.ReceivingDeptID value) {
    setField(value);
  }

  public quickfix.field.ReceivingDeptID get(quickfix.field.ReceivingDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReceivingDeptID getReceivingDeptID() throws FieldNotFound {
    return get(new quickfix.field.ReceivingDeptID());
  }

  public boolean isSet(quickfix.field.ReceivingDeptID field) {
    return isSetField(field);
  }

  public boolean isSetReceivingDeptID() {
    return isSetField(1726);
  }

  public void set(quickfix.field.RoutingArrangmentIndicator value) {
    setField(value);
  }

  public quickfix.field.RoutingArrangmentIndicator get(quickfix.field.RoutingArrangmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingArrangmentIndicator getRoutingArrangmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.RoutingArrangmentIndicator());
  }

  public boolean isSet(quickfix.field.RoutingArrangmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetRoutingArrangmentIndicator() {
    return isSetField(2883);
  }

  public void set(quickfix.field.PreTradeAnonymity value) {
    setField(value);
  }

  public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
    return get(new quickfix.field.PreTradeAnonymity());
  }

  public boolean isSet(quickfix.field.PreTradeAnonymity field) {
    return isSetField(field);
  }

  public boolean isSetPreTradeAnonymity() {
    return isSetField(1091);
  }

  public void set(quickfix.field.CustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.CustOrderCapacity());
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity() {
    return isSetField(582);
  }

  public void set(quickfix.field.ForexReq value) {
    setField(value);
  }

  public quickfix.field.ForexReq get(quickfix.field.ForexReq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ForexReq getForexReq() throws FieldNotFound {
    return get(new quickfix.field.ForexReq());
  }

  public boolean isSet(quickfix.field.ForexReq field) {
    return isSetField(field);
  }

  public boolean isSetForexReq() {
    return isSetField(121);
  }

  public void set(quickfix.field.SettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrency());
  }

  public boolean isSet(quickfix.field.SettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrency() {
    return isSetField(120);
  }

  public void set(quickfix.field.BookingType value) {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound {
    return get(new quickfix.field.BookingType());
  }

  public boolean isSet(quickfix.field.BookingType field) {
    return isSetField(field);
  }

  public boolean isSetBookingType() {
    return isSetField(775);
  }

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
  }

  public void set(quickfix.field.CoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.CoveredOrUncovered get(quickfix.field.CoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.CoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.CoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetCoveredOrUncovered() {
    return isSetField(203);
  }

  public void set(quickfix.field.CashMargin value) {
    setField(value);
  }

  public quickfix.field.CashMargin get(quickfix.field.CashMargin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashMargin getCashMargin() throws FieldNotFound {
    return get(new quickfix.field.CashMargin());
  }

  public boolean isSet(quickfix.field.CashMargin field) {
    return isSetField(field);
  }

  public boolean isSetCashMargin() {
    return isSetField(544);
  }

  public void set(quickfix.field.ClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearingFeeIndicator() {
    return isSetField(635);
  }

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
  }

  public void set(quickfix.field.SideComplianceID value) {
    setField(value);
  }

  public quickfix.field.SideComplianceID get(quickfix.field.SideComplianceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideComplianceID getSideComplianceID() throws FieldNotFound {
    return get(new quickfix.field.SideComplianceID());
  }

  public boolean isSet(quickfix.field.SideComplianceID field) {
    return isSetField(field);
  }

  public boolean isSetSideComplianceID() {
    return isSetField(659);
  }

  public void set(quickfix.field.SideTimeInForce value) {
    setField(value);
  }

  public quickfix.field.SideTimeInForce get(quickfix.field.SideTimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTimeInForce getSideTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.SideTimeInForce());
  }

  public boolean isSet(quickfix.field.SideTimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetSideTimeInForce() {
    return isSetField(962);
  }
}

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.field.ShortMarkingExemptIndicator value) {
    setField(value);
  }

  public quickfix.field.ShortMarkingExemptIndicator get(quickfix.field.ShortMarkingExemptIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortMarkingExemptIndicator getShortMarkingExemptIndicator() throws FieldNotFound {
    return get(new quickfix.field.ShortMarkingExemptIndicator());
  }

  public boolean isSet(quickfix.field.ShortMarkingExemptIndicator field) {
    return isSetField(field);
  }

  public boolean isSetShortMarkingExemptIndicator() {
    return isSetField(2102);
  }

  public void set(quickfix.field.OrigClOrdID value) {
    setField(value);
  }

  public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
    return get(new quickfix.field.OrigClOrdID());
  }

  public boolean isSet(quickfix.field.OrigClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetOrigClOrdID() {
    return isSetField(41);
  }

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.SecondaryClOrdID value) {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryClOrdID());
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID() {
    return isSetField(526);
  }

  public void set(quickfix.field.ClOrdLinkID value) {
    setField(value);
  }

  public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdLinkID());
  }

  public boolean isSet(quickfix.field.ClOrdLinkID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdLinkID() {
    return isSetField(583);
  }

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
  }

  public void set(quickfix.field.NoPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs() {
    return isSetField(802);
  }

public static class NoPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

  public NoPartySubIDs() {
    super(802, 523, ORDER);
  }

  public void set(quickfix.field.PartySubID value) {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PartySubID());
  }

  public boolean isSet(quickfix.field.PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPartySubID() {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartySubIDType());
  }

  public boolean isSet(quickfix.field.PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType() {
    return isSetField(803);
  }
}
}

  public void set(quickfix.fixlatest.component.SideCrossLegGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCrossLegGrp get(quickfix.fixlatest.component.SideCrossLegGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCrossLegGrp getSideCrossLegGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCrossLegGrp());
  }

  public void set(quickfix.field.NoCrossLegs value) {
    setField(value);
  }

  public quickfix.field.NoCrossLegs get(quickfix.field.NoCrossLegs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCrossLegs getNoCrossLegs() throws FieldNotFound {
    return get(new quickfix.field.NoCrossLegs());
  }

  public boolean isSet(quickfix.field.NoCrossLegs field) {
    return isSetField(field);
  }

  public boolean isSetNoCrossLegs() {
    return isSetField(1829);
  }

public static class NoCrossLegs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {654, 685, 690, 683, 1366, 670, 1817, 564, 565, 948, 587, 588, 675, 1379, 1381, 1383, 1384, 1689, 0};

  public NoCrossLegs() {
    super(1829, 654, ORDER);
  }

  public void set(quickfix.field.LegRefID value) {
    setField(value);
  }

  public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
    return get(new quickfix.field.LegRefID());
  }

  public boolean isSet(quickfix.field.LegRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegRefID() {
    return isSetField(654);
  }

  public void set(quickfix.field.LegOrderQty value) {
    setField(value);
  }

  public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
    return get(new quickfix.field.LegOrderQty());
  }

  public boolean isSet(quickfix.field.LegOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetLegOrderQty() {
    return isSetField(685);
  }

  public void set(quickfix.field.LegSwapType value) {
    setField(value);
  }

  public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
    return get(new quickfix.field.LegSwapType());
  }

  public boolean isSet(quickfix.field.LegSwapType field) {
    return isSetField(field);
  }

  public boolean isSetLegSwapType() {
    return isSetField(690);
  }

  public void set(quickfix.fixlatest.component.LegStipulations component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStipulations get(quickfix.fixlatest.component.LegStipulations component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStipulations getLegStipulationsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStipulations());
  }

  public void set(quickfix.field.NoLegStipulations value) {
    setField(value);
  }

  public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
    return get(new quickfix.field.NoLegStipulations());
  }

  public boolean isSet(quickfix.field.NoLegStipulations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStipulations() {
    return isSetField(683);
  }

public static class NoLegStipulations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {688, 689, 0};

  public NoLegStipulations() {
    super(683, 688, ORDER);
  }

  public void set(quickfix.field.LegStipulationType value) {
    setField(value);
  }

  public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationType());
  }

  public boolean isSet(quickfix.field.LegStipulationType field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationType() {
    return isSetField(688);
  }

  public void set(quickfix.field.LegStipulationValue value) {
    setField(value);
  }

  public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
    return get(new quickfix.field.LegStipulationValue());
  }

  public boolean isSet(quickfix.field.LegStipulationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStipulationValue() {
    return isSetField(689);
  }
}

  public void set(quickfix.field.LegAllocID value) {
    setField(value);
  }

  public quickfix.field.LegAllocID get(quickfix.field.LegAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocID getLegAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegAllocID());
  }

  public boolean isSet(quickfix.field.LegAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocID() {
    return isSetField(1366);
  }

  public void set(quickfix.fixlatest.component.LegPreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPreAllocGrp get(quickfix.fixlatest.component.LegPreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPreAllocGrp getLegPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPreAllocGrp());
  }

  public void set(quickfix.field.NoLegAllocs value) {
    setField(value);
  }

  public quickfix.field.NoLegAllocs get(quickfix.field.NoLegAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAllocs getNoLegAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAllocs());
  }

  public boolean isSet(quickfix.field.NoLegAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAllocs() {
    return isSetField(670);
  }

public static class NoLegAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {671, 672, 756, 673, 674, 1367, 1756, 1757, 1758, 1759, 0};

  public NoLegAllocs() {
    super(670, 671, ORDER);
  }

  public void set(quickfix.field.LegAllocAccount value) {
    setField(value);
  }

  public quickfix.field.LegAllocAccount get(quickfix.field.LegAllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAccount getLegAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAccount());
  }

  public boolean isSet(quickfix.field.LegAllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAccount() {
    return isSetField(671);
  }

  public void set(quickfix.field.LegIndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.LegIndividualAllocID get(quickfix.field.LegIndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegIndividualAllocID getLegIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.LegIndividualAllocID());
  }

  public boolean isSet(quickfix.field.LegIndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetLegIndividualAllocID() {
    return isSetField(672);
  }

  public void set(quickfix.fixlatest.component.NestedParties2 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties2 get(quickfix.fixlatest.component.NestedParties2 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties2 getNestedParties2Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties2());
  }

  public void set(quickfix.field.NoNested2PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartyIDs() {
    return isSetField(756);
  }

public static class NoNested2PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {757, 758, 759, 2381, 806, 0};

  public NoNested2PartyIDs() {
    super(756, 757, ORDER);
  }

  public void set(quickfix.field.Nested2PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyID());
  }

  public boolean isSet(quickfix.field.Nested2PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyID() {
    return isSetField(757);
  }

  public void set(quickfix.field.Nested2PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyIDSource() {
    return isSetField(758);
  }

  public void set(quickfix.field.Nested2PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRole());
  }

  public boolean isSet(quickfix.field.Nested2PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRole() {
    return isSetField(759);
  }

  public void set(quickfix.field.Nested2PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested2PartyRoleQualifier get(quickfix.field.Nested2PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartyRoleQualifier getNested2PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested2PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartyRoleQualifier() {
    return isSetField(2381);
  }

  public void set(quickfix.fixlatest.component.NstdPtys2SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp get(quickfix.fixlatest.component.NstdPtys2SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys2SubGrp getNstdPtys2SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys2SubGrp());
  }

  public void set(quickfix.field.NoNested2PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested2PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested2PartySubIDs() {
    return isSetField(806);
  }

public static class NoNested2PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {760, 807, 0};

  public NoNested2PartySubIDs() {
    super(806, 760, ORDER);
  }

  public void set(quickfix.field.Nested2PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubID());
  }

  public boolean isSet(quickfix.field.Nested2PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubID() {
    return isSetField(760);
  }

  public void set(quickfix.field.Nested2PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested2PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested2PartySubIDType() {
    return isSetField(807);
  }
}
}

  public void set(quickfix.field.LegAllocQty value) {
    setField(value);
  }

  public quickfix.field.LegAllocQty get(quickfix.field.LegAllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocQty getLegAllocQty() throws FieldNotFound {
    return get(new quickfix.field.LegAllocQty());
  }

  public boolean isSet(quickfix.field.LegAllocQty field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocQty() {
    return isSetField(673);
  }

  public void set(quickfix.field.LegAllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAllocAcctIDSource get(quickfix.field.LegAllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocAcctIDSource getLegAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.LegAllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocAcctIDSource() {
    return isSetField(674);
  }

  public void set(quickfix.field.LegAllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAllocSettlCurrency get(quickfix.field.LegAllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllocSettlCurrency getLegAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegAllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAllocSettlCurrency() {
    return isSetField(1367);
  }

  public void set(quickfix.field.LegCustodialLotID value) {
    setField(value);
  }

  public quickfix.field.LegCustodialLotID get(quickfix.field.LegCustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCustodialLotID getLegCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.LegCustodialLotID());
  }

  public boolean isSet(quickfix.field.LegCustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetLegCustodialLotID() {
    return isSetField(1756);
  }

  public void set(quickfix.field.LegVersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchaseDate get(quickfix.field.LegVersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchaseDate getLegVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.LegVersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchaseDate() {
    return isSetField(1757);
  }

  public void set(quickfix.field.LegVersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.LegVersusPurchasePrice get(quickfix.field.LegVersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVersusPurchasePrice getLegVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.LegVersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.LegVersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegVersusPurchasePrice() {
    return isSetField(1758);
  }

  public void set(quickfix.field.LegCurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.LegCurrentCostBasis get(quickfix.field.LegCurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrentCostBasis getLegCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.LegCurrentCostBasis());
  }

  public boolean isSet(quickfix.field.LegCurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrentCostBasis() {
    return isSetField(1759);
  }
}

  public void set(quickfix.field.LegClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.LegClearingAccountType get(quickfix.field.LegClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegClearingAccountType getLegClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.LegClearingAccountType());
  }

  public boolean isSet(quickfix.field.LegClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetLegClearingAccountType() {
    return isSetField(1817);
  }

  public void set(quickfix.field.LegPositionEffect value) {
    setField(value);
  }

  public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.LegPositionEffect());
  }

  public boolean isSet(quickfix.field.LegPositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetLegPositionEffect() {
    return isSetField(564);
  }

  public void set(quickfix.field.LegCoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.LegCoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetLegCoveredOrUncovered() {
    return isSetField(565);
  }

  public void set(quickfix.fixlatest.component.NestedParties3 component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties3 get(quickfix.fixlatest.component.NestedParties3 component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties3 getNestedParties3Component() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties3());
  }

  public void set(quickfix.field.NoNested3PartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartyIDs get(quickfix.field.NoNested3PartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartyIDs getNoNested3PartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartyIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartyIDs() {
    return isSetField(948);
  }

public static class NoNested3PartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {949, 950, 951, 2382, 952, 0};

  public NoNested3PartyIDs() {
    super(948, 949, ORDER);
  }

  public void set(quickfix.field.Nested3PartyID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyID get(quickfix.field.Nested3PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyID getNested3PartyID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyID());
  }

  public boolean isSet(quickfix.field.Nested3PartyID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyID() {
    return isSetField(949);
  }

  public void set(quickfix.field.Nested3PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyIDSource get(quickfix.field.Nested3PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyIDSource getNested3PartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyIDSource());
  }

  public boolean isSet(quickfix.field.Nested3PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyIDSource() {
    return isSetField(950);
  }

  public void set(quickfix.field.Nested3PartyRole value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRole get(quickfix.field.Nested3PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRole getNested3PartyRole() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRole());
  }

  public boolean isSet(quickfix.field.Nested3PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRole() {
    return isSetField(951);
  }

  public void set(quickfix.field.Nested3PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.Nested3PartyRoleQualifier get(quickfix.field.Nested3PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartyRoleQualifier getNested3PartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.Nested3PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartyRoleQualifier() {
    return isSetField(2382);
  }

  public void set(quickfix.fixlatest.component.NstdPtys3SubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp get(quickfix.fixlatest.component.NstdPtys3SubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtys3SubGrp getNstdPtys3SubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtys3SubGrp());
  }

  public void set(quickfix.field.NoNested3PartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNested3PartySubIDs get(quickfix.field.NoNested3PartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNested3PartySubIDs getNoNested3PartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNested3PartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNested3PartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNested3PartySubIDs() {
    return isSetField(952);
  }

public static class NoNested3PartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {953, 954, 0};

  public NoNested3PartySubIDs() {
    super(952, 953, ORDER);
  }

  public void set(quickfix.field.Nested3PartySubID value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubID get(quickfix.field.Nested3PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubID getNested3PartySubID() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubID());
  }

  public boolean isSet(quickfix.field.Nested3PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubID() {
    return isSetField(953);
  }

  public void set(quickfix.field.Nested3PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.Nested3PartySubIDType get(quickfix.field.Nested3PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Nested3PartySubIDType getNested3PartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.Nested3PartySubIDType());
  }

  public boolean isSet(quickfix.field.Nested3PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNested3PartySubIDType() {
    return isSetField(954);
  }
}
}

  public void set(quickfix.field.LegSettlType value) {
    setField(value);
  }

  public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
    return get(new quickfix.field.LegSettlType());
  }

  public boolean isSet(quickfix.field.LegSettlType field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlType() {
    return isSetField(587);
  }

  public void set(quickfix.field.LegSettlDate value) {
    setField(value);
  }

  public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
    return get(new quickfix.field.LegSettlDate());
  }

  public boolean isSet(quickfix.field.LegSettlDate field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlDate() {
    return isSetField(588);
  }

  public void set(quickfix.field.LegSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlCurrency() {
    return isSetField(675);
  }

  public void set(quickfix.field.LegVolatility value) {
    setField(value);
  }

  public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
    return get(new quickfix.field.LegVolatility());
  }

  public boolean isSet(quickfix.field.LegVolatility field) {
    return isSetField(field);
  }

  public boolean isSetLegVolatility() {
    return isSetField(1379);
  }

  public void set(quickfix.field.LegDividendYield value) {
    setField(value);
  }

  public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
    return get(new quickfix.field.LegDividendYield());
  }

  public boolean isSet(quickfix.field.LegDividendYield field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendYield() {
    return isSetField(1381);
  }

  public void set(quickfix.field.LegCurrencyRatio value) {
    setField(value);
  }

  public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
    return get(new quickfix.field.LegCurrencyRatio());
  }

  public boolean isSet(quickfix.field.LegCurrencyRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegCurrencyRatio() {
    return isSetField(1383);
  }

  public void set(quickfix.field.LegExecInst value) {
    setField(value);
  }

  public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
    return get(new quickfix.field.LegExecInst());
  }

  public boolean isSet(quickfix.field.LegExecInst field) {
    return isSetField(field);
  }

  public boolean isSetLegExecInst() {
    return isSetField(1384);
  }

  public void set(quickfix.field.LegShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.LegShortSaleExemptionReason get(quickfix.field.LegShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegShortSaleExemptionReason getLegShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.LegShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.LegShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetLegShortSaleExemptionReason() {
    return isSetField(1689);
  }
}

  public void set(quickfix.field.SideShortSaleExemptionReason value) {
    setField(value);
  }

  public quickfix.field.SideShortSaleExemptionReason get(quickfix.field.SideShortSaleExemptionReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideShortSaleExemptionReason getSideShortSaleExemptionReason() throws FieldNotFound {
    return get(new quickfix.field.SideShortSaleExemptionReason());
  }

  public boolean isSet(quickfix.field.SideShortSaleExemptionReason field) {
    return isSetField(field);
  }

  public boolean isSetSideShortSaleExemptionReason() {
    return isSetField(1690);
  }

  public void set(quickfix.field.TradeOriginationDate value) {
    setField(value);
  }

  public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
    return get(new quickfix.field.TradeOriginationDate());
  }

  public boolean isSet(quickfix.field.TradeOriginationDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeOriginationDate() {
    return isSetField(229);
  }

  public void set(quickfix.field.TradeDate value) {
    setField(value);
  }

  public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
    return get(new quickfix.field.TradeDate());
  }

  public boolean isSet(quickfix.field.TradeDate field) {
    return isSetField(field);
  }

  public boolean isSetTradeDate() {
    return isSetField(75);
  }

  public void set(quickfix.field.Account value) {
    setField(value);
  }

  public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Account getAccount() throws FieldNotFound {
    return get(new quickfix.field.Account());
  }

  public boolean isSet(quickfix.field.Account field) {
    return isSetField(field);
  }

  public boolean isSetAccount() {
    return isSetField(1);
  }

  public void set(quickfix.field.AcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AcctIDSource());
  }

  public boolean isSet(quickfix.field.AcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAcctIDSource() {
    return isSetField(660);
  }

  public void set(quickfix.field.AccountType value) {
    setField(value);
  }

  public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccountType getAccountType() throws FieldNotFound {
    return get(new quickfix.field.AccountType());
  }

  public boolean isSet(quickfix.field.AccountType field) {
    return isSetField(field);
  }

  public boolean isSetAccountType() {
    return isSetField(581);
  }

  public void set(quickfix.field.DayBookingInst value) {
    setField(value);
  }

  public quickfix.field.DayBookingInst get(quickfix.field.DayBookingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound {
    return get(new quickfix.field.DayBookingInst());
  }

  public boolean isSet(quickfix.field.DayBookingInst field) {
    return isSetField(field);
  }

  public boolean isSetDayBookingInst() {
    return isSetField(589);
  }

  public void set(quickfix.field.BookingUnit value) {
    setField(value);
  }

  public quickfix.field.BookingUnit get(quickfix.field.BookingUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound {
    return get(new quickfix.field.BookingUnit());
  }

  public boolean isSet(quickfix.field.BookingUnit field) {
    return isSetField(field);
  }

  public boolean isSetBookingUnit() {
    return isSetField(590);
  }

  public void set(quickfix.field.PreallocMethod value) {
    setField(value);
  }

  public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
    return get(new quickfix.field.PreallocMethod());
  }

  public boolean isSet(quickfix.field.PreallocMethod field) {
    return isSetField(field);
  }

  public boolean isSetPreallocMethod() {
    return isSetField(591);
  }

  public void set(quickfix.field.AllocID value) {
    setField(value);
  }

  public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocID getAllocID() throws FieldNotFound {
    return get(new quickfix.field.AllocID());
  }

  public boolean isSet(quickfix.field.AllocID field) {
    return isSetField(field);
  }

  public boolean isSetAllocID() {
    return isSetField(70);
  }

  public void set(quickfix.fixlatest.component.PreAllocGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PreAllocGrp get(quickfix.fixlatest.component.PreAllocGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PreAllocGrp getPreAllocGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PreAllocGrp());
  }

  public void set(quickfix.field.NoAllocs value) {
    setField(value);
  }

  public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
    return get(new quickfix.field.NoAllocs());
  }

  public boolean isSet(quickfix.field.NoAllocs field) {
    return isSetField(field);
  }

  public boolean isSetNoAllocs() {
    return isSetField(78);
  }

public static class NoAllocs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {79, 661, 736, 467, 2727, 539, 209, 80, 1752, 1753, 1754, 1755, 0};

  public NoAllocs() {
    super(78, 79, ORDER);
  }

  public void set(quickfix.field.AllocAccount value) {
    setField(value);
  }

  public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
    return get(new quickfix.field.AllocAccount());
  }

  public boolean isSet(quickfix.field.AllocAccount field) {
    return isSetField(field);
  }

  public boolean isSetAllocAccount() {
    return isSetField(79);
  }

  public void set(quickfix.field.AllocAcctIDSource value) {
    setField(value);
  }

  public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
    return get(new quickfix.field.AllocAcctIDSource());
  }

  public boolean isSet(quickfix.field.AllocAcctIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAllocAcctIDSource() {
    return isSetField(661);
  }

  public void set(quickfix.field.AllocSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.AllocSettlCurrency());
  }

  public boolean isSet(quickfix.field.AllocSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAllocSettlCurrency() {
    return isSetField(736);
  }

  public void set(quickfix.field.IndividualAllocID value) {
    setField(value);
  }

  public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
    return get(new quickfix.field.IndividualAllocID());
  }

  public boolean isSet(quickfix.field.IndividualAllocID field) {
    return isSetField(field);
  }

  public boolean isSetIndividualAllocID() {
    return isSetField(467);
  }

  public void set(quickfix.field.AllocLegRefID value) {
    setField(value);
  }

  public quickfix.field.AllocLegRefID get(quickfix.field.AllocLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocLegRefID getAllocLegRefID() throws FieldNotFound {
    return get(new quickfix.field.AllocLegRefID());
  }

  public boolean isSet(quickfix.field.AllocLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetAllocLegRefID() {
    return isSetField(2727);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}

  public void set(quickfix.field.AllocHandlInst value) {
    setField(value);
  }

  public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
    return get(new quickfix.field.AllocHandlInst());
  }

  public boolean isSet(quickfix.field.AllocHandlInst field) {
    return isSetField(field);
  }

  public boolean isSetAllocHandlInst() {
    return isSetField(209);
  }

  public void set(quickfix.field.AllocQty value) {
    setField(value);
  }

  public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
    return get(new quickfix.field.AllocQty());
  }

  public boolean isSet(quickfix.field.AllocQty field) {
    return isSetField(field);
  }

  public boolean isSetAllocQty() {
    return isSetField(80);
  }

  public void set(quickfix.field.CustodialLotID value) {
    setField(value);
  }

  public quickfix.field.CustodialLotID get(quickfix.field.CustodialLotID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustodialLotID getCustodialLotID() throws FieldNotFound {
    return get(new quickfix.field.CustodialLotID());
  }

  public boolean isSet(quickfix.field.CustodialLotID field) {
    return isSetField(field);
  }

  public boolean isSetCustodialLotID() {
    return isSetField(1752);
  }

  public void set(quickfix.field.VersusPurchaseDate value) {
    setField(value);
  }

  public quickfix.field.VersusPurchaseDate get(quickfix.field.VersusPurchaseDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchaseDate getVersusPurchaseDate() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchaseDate());
  }

  public boolean isSet(quickfix.field.VersusPurchaseDate field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchaseDate() {
    return isSetField(1753);
  }

  public void set(quickfix.field.VersusPurchasePrice value) {
    setField(value);
  }

  public quickfix.field.VersusPurchasePrice get(quickfix.field.VersusPurchasePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VersusPurchasePrice getVersusPurchasePrice() throws FieldNotFound {
    return get(new quickfix.field.VersusPurchasePrice());
  }

  public boolean isSet(quickfix.field.VersusPurchasePrice field) {
    return isSetField(field);
  }

  public boolean isSetVersusPurchasePrice() {
    return isSetField(1754);
  }

  public void set(quickfix.field.CurrentCostBasis value) {
    setField(value);
  }

  public quickfix.field.CurrentCostBasis get(quickfix.field.CurrentCostBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCostBasis getCurrentCostBasis() throws FieldNotFound {
    return get(new quickfix.field.CurrentCostBasis());
  }

  public boolean isSet(quickfix.field.CurrentCostBasis field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCostBasis() {
    return isSetField(1755);
  }
}

  public void set(quickfix.field.QtyType value) {
    setField(value);
  }

  public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QtyType getQtyType() throws FieldNotFound {
    return get(new quickfix.field.QtyType());
  }

  public boolean isSet(quickfix.field.QtyType field) {
    return isSetField(field);
  }

  public boolean isSetQtyType() {
    return isSetField(854);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
  }

  public void set(quickfix.fixlatest.component.CommissionData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionData get(quickfix.fixlatest.component.CommissionData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionData getCommissionDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionData());
  }

  public void set(quickfix.fixlatest.component.CommissionDataGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CommissionDataGrp get(quickfix.fixlatest.component.CommissionDataGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CommissionDataGrp getCommissionDataGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CommissionDataGrp());
  }

  public void set(quickfix.field.NoCommissions value) {
    setField(value);
  }

  public quickfix.field.NoCommissions get(quickfix.field.NoCommissions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCommissions getNoCommissions() throws FieldNotFound {
    return get(new quickfix.field.NoCommissions());
  }

  public boolean isSet(quickfix.field.NoCommissions field) {
    return isSetField(field);
  }

  public boolean isSetNoCommissions() {
    return isSetField(2639);
  }

public static class NoCommissions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2640, 2641, 2725, 2642, 2643, 2644, 2645, 2646, 2647, 2648, 2649, 2650, 2651, 2652, 0};

  public NoCommissions() {
    super(2639, 2640, ORDER);
  }

  public void set(quickfix.field.CommissionAmount value) {
    setField(value);
  }

  public quickfix.field.CommissionAmount get(quickfix.field.CommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmount getCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmount());
  }

  public boolean isSet(quickfix.field.CommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmount() {
    return isSetField(2640);
  }

  public void set(quickfix.field.CommissionAmountType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountType get(quickfix.field.CommissionAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountType getCommissionAmountType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountType());
  }

  public boolean isSet(quickfix.field.CommissionAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountType() {
    return isSetField(2641);
  }

  public void set(quickfix.field.CommissionAmountSubType value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountSubType get(quickfix.field.CommissionAmountSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountSubType getCommissionAmountSubType() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountSubType());
  }

  public boolean isSet(quickfix.field.CommissionAmountSubType field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountSubType() {
    return isSetField(2725);
  }

  public void set(quickfix.field.CommissionBasis value) {
    setField(value);
  }

  public quickfix.field.CommissionBasis get(quickfix.field.CommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionBasis getCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.CommissionBasis());
  }

  public boolean isSet(quickfix.field.CommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetCommissionBasis() {
    return isSetField(2642);
  }

  public void set(quickfix.field.CommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionCurrency get(quickfix.field.CommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionCurrency getCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionCurrency());
  }

  public boolean isSet(quickfix.field.CommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionCurrency() {
    return isSetField(2643);
  }

  public void set(quickfix.field.CommissionUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasure get(quickfix.field.CommissionUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasure getCommissionUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasure() {
    return isSetField(2644);
  }

  public void set(quickfix.field.CommissionUnitOfMeasureCurrency value) {
    setField(value);
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency get(quickfix.field.CommissionUnitOfMeasureCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionUnitOfMeasureCurrency getCommissionUnitOfMeasureCurrency() throws FieldNotFound {
    return get(new quickfix.field.CommissionUnitOfMeasureCurrency());
  }

  public boolean isSet(quickfix.field.CommissionUnitOfMeasureCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCommissionUnitOfMeasureCurrency() {
    return isSetField(2645);
  }

  public void set(quickfix.field.CommissionRate value) {
    setField(value);
  }

  public quickfix.field.CommissionRate get(quickfix.field.CommissionRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionRate getCommissionRate() throws FieldNotFound {
    return get(new quickfix.field.CommissionRate());
  }

  public boolean isSet(quickfix.field.CommissionRate field) {
    return isSetField(field);
  }

  public boolean isSetCommissionRate() {
    return isSetField(2646);
  }

  public void set(quickfix.field.CommissionSharedIndicator value) {
    setField(value);
  }

  public quickfix.field.CommissionSharedIndicator get(quickfix.field.CommissionSharedIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionSharedIndicator getCommissionSharedIndicator() throws FieldNotFound {
    return get(new quickfix.field.CommissionSharedIndicator());
  }

  public boolean isSet(quickfix.field.CommissionSharedIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCommissionSharedIndicator() {
    return isSetField(2647);
  }

  public void set(quickfix.field.CommissionAmountShared value) {
    setField(value);
  }

  public quickfix.field.CommissionAmountShared get(quickfix.field.CommissionAmountShared value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionAmountShared getCommissionAmountShared() throws FieldNotFound {
    return get(new quickfix.field.CommissionAmountShared());
  }

  public boolean isSet(quickfix.field.CommissionAmountShared field) {
    return isSetField(field);
  }

  public boolean isSetCommissionAmountShared() {
    return isSetField(2648);
  }

  public void set(quickfix.field.CommissionLegRefID value) {
    setField(value);
  }

  public quickfix.field.CommissionLegRefID get(quickfix.field.CommissionLegRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionLegRefID getCommissionLegRefID() throws FieldNotFound {
    return get(new quickfix.field.CommissionLegRefID());
  }

  public boolean isSet(quickfix.field.CommissionLegRefID field) {
    return isSetField(field);
  }

  public boolean isSetCommissionLegRefID() {
    return isSetField(2649);
  }

  public void set(quickfix.field.CommissionDesc value) {
    setField(value);
  }

  public quickfix.field.CommissionDesc get(quickfix.field.CommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CommissionDesc getCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.CommissionDesc());
  }

  public boolean isSet(quickfix.field.CommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetCommissionDesc() {
    return isSetField(2650);
  }

  public void set(quickfix.field.EncodedCommissionDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDescLen get(quickfix.field.EncodedCommissionDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDescLen getEncodedCommissionDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDescLen());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDescLen() {
    return isSetField(2651);
  }

  public void set(quickfix.field.EncodedCommissionDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedCommissionDesc get(quickfix.field.EncodedCommissionDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedCommissionDesc getEncodedCommissionDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedCommissionDesc());
  }

  public boolean isSet(quickfix.field.EncodedCommissionDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedCommissionDesc() {
    return isSetField(2652);
  }
}

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.OrderOrigination value) {
    setField(value);
  }

  public quickfix.field.OrderOrigination get(quickfix.field.OrderOrigination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOrigination getOrderOrigination() throws FieldNotFound {
    return get(new quickfix.field.OrderOrigination());
  }

  public boolean isSet(quickfix.field.OrderOrigination field) {
    return isSetField(field);
  }

  public boolean isSetOrderOrigination() {
    return isSetField(1724);
  }

  public void set(quickfix.field.OriginatingDeptID value) {
    setField(value);
  }

  public quickfix.field.OriginatingDeptID get(quickfix.field.OriginatingDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OriginatingDeptID getOriginatingDeptID() throws FieldNotFound {
    return get(new quickfix.field.OriginatingDeptID());
  }

  public boolean isSet(quickfix.field.OriginatingDeptID field) {
    return isSetField(field);
  }

  public boolean isSetOriginatingDeptID() {
    return isSetField(1725);
  }

  public void set(quickfix.field.ReceivingDeptID value) {
    setField(value);
  }

  public quickfix.field.ReceivingDeptID get(quickfix.field.ReceivingDeptID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReceivingDeptID getReceivingDeptID() throws FieldNotFound {
    return get(new quickfix.field.ReceivingDeptID());
  }

  public boolean isSet(quickfix.field.ReceivingDeptID field) {
    return isSetField(field);
  }

  public boolean isSetReceivingDeptID() {
    return isSetField(1726);
  }

  public void set(quickfix.field.RoutingArrangmentIndicator value) {
    setField(value);
  }

  public quickfix.field.RoutingArrangmentIndicator get(quickfix.field.RoutingArrangmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RoutingArrangmentIndicator getRoutingArrangmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.RoutingArrangmentIndicator());
  }

  public boolean isSet(quickfix.field.RoutingArrangmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetRoutingArrangmentIndicator() {
    return isSetField(2883);
  }

  public void set(quickfix.field.PreTradeAnonymity value) {
    setField(value);
  }

  public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
    return get(new quickfix.field.PreTradeAnonymity());
  }

  public boolean isSet(quickfix.field.PreTradeAnonymity field) {
    return isSetField(field);
  }

  public boolean isSetPreTradeAnonymity() {
    return isSetField(1091);
  }

  public void set(quickfix.field.CustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.CustOrderCapacity());
  }

  public boolean isSet(quickfix.field.CustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetCustOrderCapacity() {
    return isSetField(582);
  }

  public void set(quickfix.field.ForexReq value) {
    setField(value);
  }

  public quickfix.field.ForexReq get(quickfix.field.ForexReq value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ForexReq getForexReq() throws FieldNotFound {
    return get(new quickfix.field.ForexReq());
  }

  public boolean isSet(quickfix.field.ForexReq field) {
    return isSetField(field);
  }

  public boolean isSetForexReq() {
    return isSetField(121);
  }

  public void set(quickfix.field.SettlCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlCurrency());
  }

  public boolean isSet(quickfix.field.SettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlCurrency() {
    return isSetField(120);
  }

  public void set(quickfix.field.BookingType value) {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound {
    return get(new quickfix.field.BookingType());
  }

  public boolean isSet(quickfix.field.BookingType field) {
    return isSetField(field);
  }

  public boolean isSetBookingType() {
    return isSetField(775);
  }

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }

  public void set(quickfix.field.PositionEffect value) {
    setField(value);
  }

  public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
    return get(new quickfix.field.PositionEffect());
  }

  public boolean isSet(quickfix.field.PositionEffect field) {
    return isSetField(field);
  }

  public boolean isSetPositionEffect() {
    return isSetField(77);
  }

  public void set(quickfix.field.CoveredOrUncovered value) {
    setField(value);
  }

  public quickfix.field.CoveredOrUncovered get(quickfix.field.CoveredOrUncovered value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound {
    return get(new quickfix.field.CoveredOrUncovered());
  }

  public boolean isSet(quickfix.field.CoveredOrUncovered field) {
    return isSetField(field);
  }

  public boolean isSetCoveredOrUncovered() {
    return isSetField(203);
  }

  public void set(quickfix.field.CashMargin value) {
    setField(value);
  }

  public quickfix.field.CashMargin get(quickfix.field.CashMargin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashMargin getCashMargin() throws FieldNotFound {
    return get(new quickfix.field.CashMargin());
  }

  public boolean isSet(quickfix.field.CashMargin field) {
    return isSetField(field);
  }

  public boolean isSetCashMargin() {
    return isSetField(544);
  }

  public void set(quickfix.field.ClearingFeeIndicator value) {
    setField(value);
  }

  public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
    return get(new quickfix.field.ClearingFeeIndicator());
  }

  public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
    return isSetField(field);
  }

  public boolean isSetClearingFeeIndicator() {
    return isSetField(635);
  }

  public void set(quickfix.field.SolicitedFlag value) {
    setField(value);
  }

  public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
    return get(new quickfix.field.SolicitedFlag());
  }

  public boolean isSet(quickfix.field.SolicitedFlag field) {
    return isSetField(field);
  }

  public boolean isSetSolicitedFlag() {
    return isSetField(377);
  }

  public void set(quickfix.field.SideComplianceID value) {
    setField(value);
  }

  public quickfix.field.SideComplianceID get(quickfix.field.SideComplianceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideComplianceID getSideComplianceID() throws FieldNotFound {
    return get(new quickfix.field.SideComplianceID());
  }

  public boolean isSet(quickfix.field.SideComplianceID field) {
    return isSetField(field);
  }

  public boolean isSetSideComplianceID() {
    return isSetField(659);
  }

  public void set(quickfix.field.SideTimeInForce value) {
    setField(value);
  }

  public quickfix.field.SideTimeInForce get(quickfix.field.SideTimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideTimeInForce getSideTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.SideTimeInForce());
  }

  public boolean isSet(quickfix.field.SideTimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetSideTimeInForce() {
    return isSetField(962);
  }
}
