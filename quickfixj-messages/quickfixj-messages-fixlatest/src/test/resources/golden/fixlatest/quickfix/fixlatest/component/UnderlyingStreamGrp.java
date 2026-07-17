/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40540, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreams value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreams get(quickfix.field.NoUnderlyingStreams value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreams getNoUnderlyingStreams() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreams());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreams field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreams() {
    return isSetField(40540);
  }

public static class NoUnderlyingStreams extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40541, 42016, 40542, 43083, 43084, 40543, 40544, 42018, 40545, 40546, 43085, 43086, 42019, 42020, 42021, 42022, 42023, 42024, 41964, 41965, 41966, 41967, 41990, 41968, 41969, 41970, 42589, 41800, 41971, 41972, 41973, 41974, 41975, 41976, 41977, 41993, 41978, 41979, 41980, 41981, 41982, 41962, 41983, 41984, 41985, 41986, 41987, 42002, 41988, 41989, 40057, 40058, 40975, 40060, 40061, 40062, 40063, 40064, 40548, 40549, 40976, 40551, 40552, 40553, 40554, 40555, 41957, 41958, 40556, 40973, 41954, 40558, 40559, 40974, 40561, 40562, 40563, 40564, 40565, 40566, 40567, 41959, 41960, 41961, 40568, 40569, 40570, 42895, 40571, 40572, 43107, 40573, 40574, 40575, 40576, 40577, 42896, 42897, 42898, 42899, 40578, 40579, 40580, 41897, 41898, 41899, 41900, 41901, 41902, 41903, 40581, 40969, 41937, 40583, 40584, 40585, 40586, 40587, 40588, 40589, 40590, 40591, 41940, 42949, 42950, 42951, 42952, 42953, 42954, 40592, 40593, 40970, 40595, 40596, 40597, 40598, 40599, 40971, 40601, 40602, 40603, 40604, 40605, 40606, 40972, 40608, 40609, 40610, 40611, 40612, 40613, 40614, 42955, 40615, 40616, 40617, 41904, 41905, 40618, 40619, 41906, 41907, 41908, 40620, 40621, 43092, 43093, 40622, 40623, 41911, 41912, 41913, 41914, 41915, 41916, 41917, 41918, 41919, 40624, 40625, 41920, 41921, 41922, 41923, 40626, 40627, 40628, 40629, 40630, 40631, 40632, 40633, 40634, 41924, 41925, 40635, 40636, 40637, 40638, 41926, 41927, 42958, 42959, 42960, 41928, 41929, 42961, 41930, 41931, 41932, 41933, 41934, 41909, 41944, 41941, 40639, 40640, 40641, 40642, 40643, 40644, 40645, 40646, 40647, 42962, 42978, 42979, 42980, 42981, 42947, 42948, 42826, 42827, 42828, 42829, 42862, 42830, 42831, 42832, 42833, 42846, 42847, 42848, 42849, 42850, 42851, 42853, 42852, 42801, 42802, 42803, 42804, 42805, 42806, 42807, 42808, 42809, 42810, 42811, 42812, 42813, 42814, 42815, 42816, 42817, 42818, 42834, 42819, 42820, 42821, 42822, 42823, 42824, 42799, 42825, 42835, 42836, 42837, 42838, 42839, 42840, 42841, 42842, 42843, 42844, 42845, 42963, 43034, 42964, 42965, 42966, 42967, 42968, 42969, 42970, 42971, 42972, 42973, 42974, 42975, 42976, 42977, 42900, 42923, 42924, 42925, 42926, 42927, 42928, 42929, 42930, 42931, 42932, 42933, 42934, 42935, 42936, 42937, 42938, 42939, 42940, 42904, 42915, 42901, 42905, 42906, 42907, 42908, 42909, 42941, 42942, 42943, 42944, 42945, 42946, 42917, 42918, 42919, 42920, 42921, 42922, 42910, 42911, 42912, 42913, 42914, 40648, 40649, 40968, 40651, 40652, 40653, 40654, 40661, 40824, 40656, 40659, 40664, 40708, 41777, 41808, 41778, 41779, 41780, 41781, 42196, 42197, 41782, 41783, 41784, 41785, 41786, 41587, 41804, 41787, 41788, 41789, 41790, 41791, 41792, 41793, 41794, 41795, 41796, 41797, 41798, 41799, 43096, 41756, 40547, 40988, 40989, 0};

  public NoUnderlyingStreams() {
    super(40540, 40541, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamType get(quickfix.field.UnderlyingStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamType getUnderlyingStreamType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamType() {
    return isSetField(40541);
  }

  public void set(quickfix.field.UnderlyingStreamXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamXID get(quickfix.field.UnderlyingStreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamXID getUnderlyingStreamXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamXID() {
    return isSetField(42016);
  }

  public void set(quickfix.field.UnderlyingStreamDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamDesc get(quickfix.field.UnderlyingStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamDesc getUnderlyingStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamDesc() {
    return isSetField(40542);
  }

  public void set(quickfix.field.UnderlyingStreamVersion value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamVersion get(quickfix.field.UnderlyingStreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamVersion getUnderlyingStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamVersion());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamVersion() {
    return isSetField(43083);
  }

  public void set(quickfix.field.UnderlyingStreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamVersionEffectiveDate get(quickfix.field.UnderlyingStreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamVersionEffectiveDate getUnderlyingStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamVersionEffectiveDate() {
    return isSetField(43084);
  }

  public void set(quickfix.field.UnderlyingStreamPaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamPaySide get(quickfix.field.UnderlyingStreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamPaySide getUnderlyingStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamPaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamPaySide() {
    return isSetField(40543);
  }

  public void set(quickfix.field.UnderlyingStreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamReceiveSide get(quickfix.field.UnderlyingStreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamReceiveSide getUnderlyingStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamReceiveSide() {
    return isSetField(40544);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalXIDRef get(quickfix.field.UnderlyingStreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalXIDRef getUnderlyingStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalXIDRef() {
    return isSetField(42018);
  }

  public void set(quickfix.field.UnderlyingStreamNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotional get(quickfix.field.UnderlyingStreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotional getUnderlyingStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotional() {
    return isSetField(40545);
  }

  public void set(quickfix.field.UnderlyingStreamCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCurrency get(quickfix.field.UnderlyingStreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCurrency getUnderlyingStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCurrency() {
    return isSetField(40546);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalDeterminationMethod get(quickfix.field.UnderlyingStreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalDeterminationMethod getUnderlyingStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalDeterminationMethod() {
    return isSetField(43085);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalAdjustments get(quickfix.field.UnderlyingStreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalAdjustments getUnderlyingStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalAdjustments() {
    return isSetField(43086);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyPeriod get(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyPeriod getUnderlyingStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalFrequencyPeriod() {
    return isSetField(42019);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyUnit get(quickfix.field.UnderlyingStreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyUnit getUnderlyingStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalFrequencyUnit() {
    return isSetField(42020);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalCommodityFrequency get(quickfix.field.UnderlyingStreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalCommodityFrequency getUnderlyingStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalCommodityFrequency() {
    return isSetField(42021);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalUnitOfMeasure getUnderlyingStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalUnitOfMeasure() {
    return isSetField(42022);
  }

  public void set(quickfix.field.UnderlyingStreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTotalNotional get(quickfix.field.UnderlyingStreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTotalNotional getUnderlyingStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTotalNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTotalNotional() {
    return isSetField(42023);
  }

  public void set(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure getUnderlyingStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTotalNotionalUnitOfMeasure() {
    return isSetField(42024);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodity get(quickfix.fixlatest.component.UnderlyingStreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodity getUnderlyingStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommodity());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDate get(quickfix.fixlatest.component.UnderlyingStreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDate getUnderlyingStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDate get(quickfix.fixlatest.component.UnderlyingStreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDate getUnderlyingStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates get(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates getUnderlyingStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStream get(quickfix.fixlatest.component.UnderlyingPaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStream getUnderlyingPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStream());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp getUnderlyingPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentSchedules get(quickfix.field.NoUnderlyingPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentSchedules getNoUnderlyingPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentSchedules() {
    return isSetField(40664);
  }

public static class NoUnderlyingPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40665, 41881, 41882, 40666, 40667, 40668, 40669, 40670, 40671, 40672, 40673, 40674, 40675, 41883, 41884, 41885, 41886, 40676, 40677, 40678, 40679, 41887, 41888, 41889, 41890, 40680, 40681, 40682, 40683, 40684, 40685, 40704, 40686, 40687, 40688, 40689, 40966, 40691, 40692, 40693, 41891, 41892, 40694, 41878, 41893, 41894, 41895, 41896, 40695, 40696, 40697, 40698, 40967, 40700, 40701, 40702, 40703, 0};

  public NoUnderlyingPaymentSchedules() {
    super(40664, 40665, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleType get(quickfix.field.UnderlyingPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleType getUnderlyingPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleType() {
    return isSetField(40665);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXID get(quickfix.field.UnderlyingPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXID getUnderlyingPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXID() {
    return isSetField(41881);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef get(quickfix.field.UnderlyingPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef getUnderlyingPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXIDRef() {
    return isSetField(41882);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType get(quickfix.field.UnderlyingPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType getUnderlyingPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStubType() {
    return isSetField(40666);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted getUnderlyingPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStartDateUnadjusted() {
    return isSetField(40667);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted getUnderlyingPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleEndDateUnadjusted() {
    return isSetField(40668);
  }

  public void set(quickfix.field.UnderlyingPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide get(quickfix.field.UnderlyingPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide getUnderlyingPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentSchedulePaySide() {
    return isSetField(40669);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide get(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide getUnderlyingPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReceiveSide() {
    return isSetField(40670);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional get(quickfix.field.UnderlyingPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional getUnderlyingPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleNotional() {
    return isSetField(40671);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency get(quickfix.field.UnderlyingPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency getUnderlyingPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleCurrency() {
    return isSetField(40672);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRate get(quickfix.field.UnderlyingPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRate getUnderlyingPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRate() {
    return isSetField(40673);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier get(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier getUnderlyingPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateMultiplier() {
    return isSetField(40674);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread get(quickfix.field.UnderlyingPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread getUnderlyingPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpread() {
    return isSetField(40675);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency get(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency getUnderlyingPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateCurrency() {
    return isSetField(41883);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure getUnderlyingPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41884);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor get(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor getUnderlyingPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateConversionFactor() {
    return isSetField(41885);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType getUnderlyingPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadType() {
    return isSetField(41886);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType getUnderlyingPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadPositionType() {
    return isSetField(40676);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment get(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment getUnderlyingPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateTreatment() {
    return isSetField(40677);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount get(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount getUnderlyingPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedAmount() {
    return isSetField(40678);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency get(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency getUnderlyingPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedCurrency() {
    return isSetField(40679);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice getUnderlyingPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPrice() {
    return isSetField(41887);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency getUnderlyingPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41888);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure getUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41889);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure getUnderlyingPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41890);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod getUnderlyingPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40680);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit getUnderlyingPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyUnit() {
    return isSetField(40681);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue get(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue getUnderlyingPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetValue() {
    return isSetField(40682);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate get(quickfix.field.UnderlyingPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate getUnderlyingPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRate() {
    return isSetField(40683);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate get(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate getUnderlyingPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetRate() {
    return isSetField(40684);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo get(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo getUnderlyingPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRelativeTo() {
    return isSetField(40685);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp getUnderlyingPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources get(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources getNoUnderlyingPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleRateSources() {
    return isSetField(40704);
  }

public static class NoUnderlyingPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40705, 40706, 40707, 0};

  public NoUnderlyingPaymentScheduleRateSources() {
    super(40704, 40705, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted getUnderlyingPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40686);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight get(quickfix.field.UnderlyingPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight getUnderlyingPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleWeight() {
    return isSetField(40687);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo getUnderlyingPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40688);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn getUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() {
    return isSetField(40689);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp getUnderlyingPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters getNoUnderlyingPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40966);
  }

public static class NoUnderlyingPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40690, 0};

  public NoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    super(40966, 40690, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod getUnderlyingPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40691);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit getUnderlyingPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40692);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType getUnderlyingPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40693);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution get(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution getUnderlyingPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayDistribution() {
    return isSetField(41891);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount get(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount getUnderlyingPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayCount() {
    return isSetField(41892);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted getUnderlyingPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateAdjusted() {
    return isSetField(40694);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp getUnderlyingPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays get(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays getNoUnderlyingPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDays() {
    return isSetField(41878);
  }

public static class NoUnderlyingPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41879, 41880, 0};

  public NoUnderlyingPaymentScheduleFixingDays() {
    super(41878, 41879, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod getUnderlyingPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagPeriod() {
    return isSetField(41893);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit get(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit getUnderlyingPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagUnit() {
    return isSetField(41894);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41895);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41896);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime get(quickfix.field.UnderlyingPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime getUnderlyingPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTime() {
    return isSetField(40695);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter getUnderlyingPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40696);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo getUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40697);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention getUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40698);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp getUnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp());
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

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod getUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40700);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit getUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40701);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType getUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40702);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted getUnderlyingPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40703);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubGrp get(quickfix.fixlatest.component.UnderlyingPaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubGrp getUnderlyingPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubs get(quickfix.field.NoUnderlyingPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubs getNoUnderlyingPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubs() {
    return isSetField(40708);
  }

public static class NoUnderlyingPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40709, 40710, 42993, 42994, 43000, 42995, 42996, 42997, 42998, 42999, 42984, 42985, 42991, 42986, 42987, 42988, 42989, 42990, 40711, 40712, 40713, 40714, 40715, 40716, 40717, 40718, 40719, 40720, 40721, 40722, 40723, 40724, 40725, 40726, 40727, 40728, 40729, 40730, 40731, 40732, 40733, 40734, 40735, 40736, 40737, 0};

  public NoUnderlyingPaymentStubs() {
    super(40708, 40709, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubType get(quickfix.field.UnderlyingPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubType getUnderlyingPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubType() {
    return isSetField(40709);
  }

  public void set(quickfix.field.UnderlyingPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubLength get(quickfix.field.UnderlyingPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubLength getUnderlyingPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubLength() {
    return isSetField(40710);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate get(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate getUnderlyingPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate get(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate getUnderlyingPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubEndDate());
  }

  public void set(quickfix.field.UnderlyingPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubRate get(quickfix.field.UnderlyingPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubRate getUnderlyingPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubRate() {
    return isSetField(40711);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount get(quickfix.field.UnderlyingPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount getUnderlyingPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedAmount() {
    return isSetField(40712);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency get(quickfix.field.UnderlyingPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency getUnderlyingPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedCurrency() {
    return isSetField(40713);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex get(quickfix.field.UnderlyingPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex getUnderlyingPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex() {
    return isSetField(40714);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource get(quickfix.field.UnderlyingPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource getUnderlyingPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexSource() {
    return isSetField(40715);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod get(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod getUnderlyingPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurvePeriod() {
    return isSetField(40716);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit get(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit getUnderlyingPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurveUnit() {
    return isSetField(40717);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier get(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier getUnderlyingPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateMultiplier() {
    return isSetField(40718);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread get(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread getUnderlyingPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpread() {
    return isSetField(40719);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType getUnderlyingPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40720);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment get(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment getUnderlyingPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateTreatment() {
    return isSetField(40721);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate get(quickfix.field.UnderlyingPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate getUnderlyingPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRate() {
    return isSetField(40722);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide getUnderlyingPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateBuySide() {
    return isSetField(40723);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide getUnderlyingPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateSellSide() {
    return isSetField(40724);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate get(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate getUnderlyingPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRate() {
    return isSetField(40725);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide getUnderlyingPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateBuySide() {
    return isSetField(40726);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide getUnderlyingPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateSellSide() {
    return isSetField(40727);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 get(quickfix.field.UnderlyingPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 getUnderlyingPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2() {
    return isSetField(40728);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source get(quickfix.field.UnderlyingPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source getUnderlyingPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2Source() {
    return isSetField(40729);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod get(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod getUnderlyingPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurvePeriod() {
    return isSetField(40730);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit get(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit getUnderlyingPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurveUnit() {
    return isSetField(40731);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier get(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier getUnderlyingPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateMultiplier() {
    return isSetField(40732);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread get(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread getUnderlyingPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpread() {
    return isSetField(40733);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType getUnderlyingPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40734);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment get(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment getUnderlyingPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateTreatment() {
    return isSetField(40735);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate get(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate getUnderlyingPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CapRate() {
    return isSetField(40736);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate get(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate getUnderlyingPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2FloorRate() {
    return isSetField(40737);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStream get(quickfix.fixlatest.component.UnderlyingDeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStream getUnderlyingDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryStream());
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp getUnderlyingDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliverySchedules get(quickfix.field.NoUnderlyingDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliverySchedules getNoUnderlyingDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliverySchedules() {
    return isSetField(41756);
  }

public static class NoUnderlyingDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41757, 41758, 41759, 41760, 41761, 41762, 41763, 41764, 41765, 41766, 41767, 41768, 41769, 41770, 0};

  public NoUnderlyingDeliverySchedules() {
    super(41756, 41757, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleType get(quickfix.field.UnderlyingDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleType getUnderlyingDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleType() {
    return isSetField(41757);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID get(quickfix.field.UnderlyingDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID getUnderlyingDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleXID() {
    return isSetField(41758);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional get(quickfix.field.UnderlyingDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional getUnderlyingDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotional() {
    return isSetField(41759);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure getUnderlyingDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41760);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency getUnderlyingDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41761);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance get(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance getUnderlyingDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNegativeTolerance() {
    return isSetField(41762);
  }

  public void set(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance get(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance getUnderlyingDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliverySchedulePositiveTolerance() {
    return isSetField(41763);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure getUnderlyingDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41764);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType get(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType getUnderlyingDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceType() {
    return isSetField(41765);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry get(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry getUnderlyingDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlCountry() {
    return isSetField(41766);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone getUnderlyingDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeZone() {
    return isSetField(41767);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType get(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType getUnderlyingDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlFlowType() {
    return isSetField(41768);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction getUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41769);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp getUnderlyingDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays get(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays getNoUnderlyingDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlDays() {
    return isSetField(41770);
  }

public static class NoUnderlyingDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41771, 41772, 41773, 0};

  public NoUnderlyingDeliveryScheduleSettlDays() {
    super(41770, 41771, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay get(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay getUnderlyingDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlDay() {
    return isSetField(41771);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours get(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours getUnderlyingDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTotalHours() {
    return isSetField(41772);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp getUnderlyingDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes get(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes getNoUnderlyingDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlTimes() {
    return isSetField(41773);
  }

public static class NoUnderlyingDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41774, 41775, 41776, 0};

  public NoUnderlyingDeliveryScheduleSettlTimes() {
    super(41773, 41774, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart get(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart getUnderlyingDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlStart() {
    return isSetField(41774);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd get(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd getUnderlyingDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlEnd() {
    return isSetField(41775);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType getUnderlyingDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeType() {
    return isSetField(41776);
  }
}
}
}

  public void set(quickfix.field.UnderlyingStreamText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamText get(quickfix.field.UnderlyingStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamText getUnderlyingStreamText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamText());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamText() {
    return isSetField(40547);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamTextLen get(quickfix.field.EncodedUnderlyingStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamTextLen getEncodedUnderlyingStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamTextLen() {
    return isSetField(40988);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamText get(quickfix.field.EncodedUnderlyingStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamText getEncodedUnderlyingStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamText() {
    return isSetField(40989);
  }
}

  public void set(quickfix.field.UnderlyingStreamType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamType get(quickfix.field.UnderlyingStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamType getUnderlyingStreamType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamType() {
    return isSetField(40541);
  }

  public void set(quickfix.field.UnderlyingStreamXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamXID get(quickfix.field.UnderlyingStreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamXID getUnderlyingStreamXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamXID() {
    return isSetField(42016);
  }

  public void set(quickfix.field.UnderlyingStreamDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamDesc get(quickfix.field.UnderlyingStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamDesc getUnderlyingStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamDesc() {
    return isSetField(40542);
  }

  public void set(quickfix.field.UnderlyingStreamVersion value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamVersion get(quickfix.field.UnderlyingStreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamVersion getUnderlyingStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamVersion());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamVersion() {
    return isSetField(43083);
  }

  public void set(quickfix.field.UnderlyingStreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamVersionEffectiveDate get(quickfix.field.UnderlyingStreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamVersionEffectiveDate getUnderlyingStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamVersionEffectiveDate() {
    return isSetField(43084);
  }

  public void set(quickfix.field.UnderlyingStreamPaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamPaySide get(quickfix.field.UnderlyingStreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamPaySide getUnderlyingStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamPaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamPaySide() {
    return isSetField(40543);
  }

  public void set(quickfix.field.UnderlyingStreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamReceiveSide get(quickfix.field.UnderlyingStreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamReceiveSide getUnderlyingStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamReceiveSide() {
    return isSetField(40544);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalXIDRef get(quickfix.field.UnderlyingStreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalXIDRef getUnderlyingStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalXIDRef() {
    return isSetField(42018);
  }

  public void set(quickfix.field.UnderlyingStreamNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotional get(quickfix.field.UnderlyingStreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotional getUnderlyingStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotional() {
    return isSetField(40545);
  }

  public void set(quickfix.field.UnderlyingStreamCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCurrency get(quickfix.field.UnderlyingStreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCurrency getUnderlyingStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCurrency() {
    return isSetField(40546);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalDeterminationMethod get(quickfix.field.UnderlyingStreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalDeterminationMethod getUnderlyingStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalDeterminationMethod() {
    return isSetField(43085);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalAdjustments get(quickfix.field.UnderlyingStreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalAdjustments getUnderlyingStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalAdjustments() {
    return isSetField(43086);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyPeriod get(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyPeriod getUnderlyingStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalFrequencyPeriod() {
    return isSetField(42019);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyUnit get(quickfix.field.UnderlyingStreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalFrequencyUnit getUnderlyingStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalFrequencyUnit() {
    return isSetField(42020);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalCommodityFrequency get(quickfix.field.UnderlyingStreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalCommodityFrequency getUnderlyingStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalCommodityFrequency() {
    return isSetField(42021);
  }

  public void set(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamNotionalUnitOfMeasure getUnderlyingStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamNotionalUnitOfMeasure() {
    return isSetField(42022);
  }

  public void set(quickfix.field.UnderlyingStreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTotalNotional get(quickfix.field.UnderlyingStreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTotalNotional getUnderlyingStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTotalNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTotalNotional() {
    return isSetField(42023);
  }

  public void set(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure getUnderlyingStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamTotalNotionalUnitOfMeasure() {
    return isSetField(42024);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodity get(quickfix.fixlatest.component.UnderlyingStreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodity getUnderlyingStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommodity());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDate get(quickfix.fixlatest.component.UnderlyingStreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamEffectiveDate getUnderlyingStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDate get(quickfix.fixlatest.component.UnderlyingStreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamTerminationDate getUnderlyingStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates get(quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates getUnderlyingStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStream get(quickfix.fixlatest.component.UnderlyingPaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStream getUnderlyingPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStream());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp getUnderlyingPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentSchedules get(quickfix.field.NoUnderlyingPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentSchedules getNoUnderlyingPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentSchedules() {
    return isSetField(40664);
  }

public static class NoUnderlyingPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40665, 41881, 41882, 40666, 40667, 40668, 40669, 40670, 40671, 40672, 40673, 40674, 40675, 41883, 41884, 41885, 41886, 40676, 40677, 40678, 40679, 41887, 41888, 41889, 41890, 40680, 40681, 40682, 40683, 40684, 40685, 40704, 40686, 40687, 40688, 40689, 40966, 40691, 40692, 40693, 41891, 41892, 40694, 41878, 41893, 41894, 41895, 41896, 40695, 40696, 40697, 40698, 40967, 40700, 40701, 40702, 40703, 0};

  public NoUnderlyingPaymentSchedules() {
    super(40664, 40665, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleType get(quickfix.field.UnderlyingPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleType getUnderlyingPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleType() {
    return isSetField(40665);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXID get(quickfix.field.UnderlyingPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXID getUnderlyingPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXID() {
    return isSetField(41881);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef get(quickfix.field.UnderlyingPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleXIDRef getUnderlyingPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleXIDRef() {
    return isSetField(41882);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType get(quickfix.field.UnderlyingPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStubType getUnderlyingPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStubType() {
    return isSetField(40666);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted getUnderlyingPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStartDateUnadjusted() {
    return isSetField(40667);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted getUnderlyingPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleEndDateUnadjusted() {
    return isSetField(40668);
  }

  public void set(quickfix.field.UnderlyingPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide get(quickfix.field.UnderlyingPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentSchedulePaySide getUnderlyingPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentSchedulePaySide() {
    return isSetField(40669);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide get(quickfix.field.UnderlyingPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReceiveSide getUnderlyingPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReceiveSide() {
    return isSetField(40670);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional get(quickfix.field.UnderlyingPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleNotional getUnderlyingPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleNotional() {
    return isSetField(40671);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency get(quickfix.field.UnderlyingPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleCurrency getUnderlyingPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleCurrency() {
    return isSetField(40672);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRate get(quickfix.field.UnderlyingPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRate getUnderlyingPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRate() {
    return isSetField(40673);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier get(quickfix.field.UnderlyingPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateMultiplier getUnderlyingPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateMultiplier() {
    return isSetField(40674);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread get(quickfix.field.UnderlyingPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpread getUnderlyingPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpread() {
    return isSetField(40675);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency get(quickfix.field.UnderlyingPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateCurrency getUnderlyingPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateCurrency() {
    return isSetField(41883);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure getUnderlyingPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41884);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor get(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateConversionFactor getUnderlyingPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateConversionFactor() {
    return isSetField(41885);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadType getUnderlyingPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadType() {
    return isSetField(41886);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType get(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType getUnderlyingPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSpreadPositionType() {
    return isSetField(40676);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment get(quickfix.field.UnderlyingPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateTreatment getUnderlyingPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateTreatment() {
    return isSetField(40677);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount get(quickfix.field.UnderlyingPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedAmount getUnderlyingPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedAmount() {
    return isSetField(40678);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency get(quickfix.field.UnderlyingPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixedCurrency getUnderlyingPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixedCurrency() {
    return isSetField(40679);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice getUnderlyingPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPrice() {
    return isSetField(41887);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency getUnderlyingPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41888);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure getUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41889);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure get(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure getUnderlyingPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41890);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod getUnderlyingPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40680);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit get(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit getUnderlyingPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepFrequencyUnit() {
    return isSetField(40681);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue get(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetValue getUnderlyingPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetValue() {
    return isSetField(40682);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate get(quickfix.field.UnderlyingPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRate getUnderlyingPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRate() {
    return isSetField(40683);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate get(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepOffsetRate getUnderlyingPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepOffsetRate() {
    return isSetField(40684);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo get(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleStepRelativeTo getUnderlyingPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleStepRelativeTo() {
    return isSetField(40685);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp getUnderlyingPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources get(quickfix.field.NoUnderlyingPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleRateSources getNoUnderlyingPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleRateSources() {
    return isSetField(40704);
  }

public static class NoUnderlyingPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40705, 40706, 40707, 0};

  public NoUnderlyingPaymentScheduleRateSources() {
    super(40704, 40705, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource get(quickfix.field.UnderlyingPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSource getUnderlyingPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSource() {
    return isSetField(40705);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType get(quickfix.field.UnderlyingPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleRateSourceType getUnderlyingPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleRateSourceType() {
    return isSetField(40706);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage get(quickfix.field.UnderlyingPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleReferencePage getUnderlyingPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleReferencePage() {
    return isSetField(40707);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted getUnderlyingPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40686);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight get(quickfix.field.UnderlyingPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleWeight getUnderlyingPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleWeight() {
    return isSetField(40687);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo getUnderlyingPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40688);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn getUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessDayCnvtn field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessDayCnvtn() {
    return isSetField(40689);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp getUnderlyingPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters getNoUnderlyingPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40966);
  }

public static class NoUnderlyingPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40690, 0};

  public NoUnderlyingPaymentScheduleFixingDateBusinessCenters() {
    super(40966, 40690, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter getUnderlyingPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40690);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod getUnderlyingPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40691);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit getUnderlyingPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40692);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType getUnderlyingPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40693);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution get(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution getUnderlyingPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayDistribution() {
    return isSetField(41891);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount get(quickfix.field.UnderlyingPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayCount getUnderlyingPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayCount() {
    return isSetField(41892);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted getUnderlyingPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDateAdjusted() {
    return isSetField(40694);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp getUnderlyingPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays get(quickfix.field.NoUnderlyingPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentScheduleFixingDays getNoUnderlyingPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentScheduleFixingDays() {
    return isSetField(41878);
  }

public static class NoUnderlyingPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41879, 41880, 0};

  public NoUnderlyingPaymentScheduleFixingDays() {
    super(41878, 41879, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek get(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek getUnderlyingPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayOfWeek() {
    return isSetField(41879);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber get(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingDayNumber getUnderlyingPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingDayNumber() {
    return isSetField(41880);
  }
}

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod getUnderlyingPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagPeriod() {
    return isSetField(41893);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit get(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingLagUnit getUnderlyingPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingLagUnit() {
    return isSetField(41894);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41895);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit getUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41896);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime get(quickfix.field.UnderlyingPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTime getUnderlyingPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTime() {
    return isSetField(40695);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter getUnderlyingPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40696);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo getUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40697);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention getUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40698);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp getUnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentScheduleInterimExchangeDateBusinessCenterGrp());
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

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod getUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40700);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit getUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40701);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType getUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40702);
  }

  public void set(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted getUnderlyingPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40703);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubGrp get(quickfix.fixlatest.component.UnderlyingPaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubGrp getUnderlyingPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubGrp());
  }

  public void set(quickfix.field.NoUnderlyingPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStubs get(quickfix.field.NoUnderlyingPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStubs getNoUnderlyingPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStubs() {
    return isSetField(40708);
  }

public static class NoUnderlyingPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40709, 40710, 42993, 42994, 43000, 42995, 42996, 42997, 42998, 42999, 42984, 42985, 42991, 42986, 42987, 42988, 42989, 42990, 40711, 40712, 40713, 40714, 40715, 40716, 40717, 40718, 40719, 40720, 40721, 40722, 40723, 40724, 40725, 40726, 40727, 40728, 40729, 40730, 40731, 40732, 40733, 40734, 40735, 40736, 40737, 0};

  public NoUnderlyingPaymentStubs() {
    super(40708, 40709, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubType get(quickfix.field.UnderlyingPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubType getUnderlyingPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubType() {
    return isSetField(40709);
  }

  public void set(quickfix.field.UnderlyingPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubLength get(quickfix.field.UnderlyingPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubLength getUnderlyingPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubLength() {
    return isSetField(40710);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate get(quickfix.fixlatest.component.UnderlyingPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubStartDate getUnderlyingPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate get(quickfix.fixlatest.component.UnderlyingPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStubEndDate getUnderlyingPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStubEndDate());
  }

  public void set(quickfix.field.UnderlyingPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubRate get(quickfix.field.UnderlyingPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubRate getUnderlyingPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubRate() {
    return isSetField(40711);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount get(quickfix.field.UnderlyingPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedAmount getUnderlyingPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedAmount() {
    return isSetField(40712);
  }

  public void set(quickfix.field.UnderlyingPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency get(quickfix.field.UnderlyingPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubFixedCurrency getUnderlyingPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubFixedCurrency() {
    return isSetField(40713);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex get(quickfix.field.UnderlyingPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex getUnderlyingPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex() {
    return isSetField(40714);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource get(quickfix.field.UnderlyingPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexSource getUnderlyingPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexSource() {
    return isSetField(40715);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod get(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurvePeriod getUnderlyingPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurvePeriod() {
    return isSetField(40716);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit get(quickfix.field.UnderlyingPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCurveUnit getUnderlyingPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCurveUnit() {
    return isSetField(40717);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier get(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateMultiplier getUnderlyingPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateMultiplier() {
    return isSetField(40718);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread get(quickfix.field.UnderlyingPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpread getUnderlyingPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpread() {
    return isSetField(40719);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType getUnderlyingPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40720);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment get(quickfix.field.UnderlyingPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexRateTreatment getUnderlyingPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexRateTreatment() {
    return isSetField(40721);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate get(quickfix.field.UnderlyingPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRate getUnderlyingPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRate() {
    return isSetField(40722);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide getUnderlyingPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateBuySide() {
    return isSetField(40723);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide getUnderlyingPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexCapRateSellSide() {
    return isSetField(40724);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate get(quickfix.field.UnderlyingPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRate getUnderlyingPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRate() {
    return isSetField(40725);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide getUnderlyingPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateBuySide() {
    return isSetField(40726);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide get(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide getUnderlyingPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndexFloorRateSellSide() {
    return isSetField(40727);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 get(quickfix.field.UnderlyingPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2 getUnderlyingPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2() {
    return isSetField(40728);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source get(quickfix.field.UnderlyingPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2Source getUnderlyingPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2Source() {
    return isSetField(40729);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod get(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod getUnderlyingPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurvePeriod() {
    return isSetField(40730);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit get(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CurveUnit getUnderlyingPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CurveUnit() {
    return isSetField(40731);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier get(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier getUnderlyingPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateMultiplier() {
    return isSetField(40732);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread get(quickfix.field.UnderlyingPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpread getUnderlyingPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpread() {
    return isSetField(40733);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType get(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType getUnderlyingPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40734);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment get(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2RateTreatment getUnderlyingPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2RateTreatment() {
    return isSetField(40735);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate get(quickfix.field.UnderlyingPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2CapRate getUnderlyingPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2CapRate() {
    return isSetField(40736);
  }

  public void set(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate get(quickfix.field.UnderlyingPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStubIndex2FloorRate getUnderlyingPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStubIndex2FloorRate() {
    return isSetField(40737);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStream get(quickfix.fixlatest.component.UnderlyingDeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStream getUnderlyingDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryStream());
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp getUnderlyingDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliverySchedules get(quickfix.field.NoUnderlyingDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliverySchedules getNoUnderlyingDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliverySchedules() {
    return isSetField(41756);
  }

public static class NoUnderlyingDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41757, 41758, 41759, 41760, 41761, 41762, 41763, 41764, 41765, 41766, 41767, 41768, 41769, 41770, 0};

  public NoUnderlyingDeliverySchedules() {
    super(41756, 41757, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleType get(quickfix.field.UnderlyingDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleType getUnderlyingDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleType() {
    return isSetField(41757);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID get(quickfix.field.UnderlyingDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID getUnderlyingDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleXID() {
    return isSetField(41758);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional get(quickfix.field.UnderlyingDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional getUnderlyingDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotional() {
    return isSetField(41759);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure getUnderlyingDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41760);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency getUnderlyingDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41761);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance get(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance getUnderlyingDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNegativeTolerance() {
    return isSetField(41762);
  }

  public void set(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance get(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance getUnderlyingDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliverySchedulePositiveTolerance() {
    return isSetField(41763);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure getUnderlyingDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41764);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType get(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType getUnderlyingDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceType() {
    return isSetField(41765);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry get(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry getUnderlyingDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlCountry() {
    return isSetField(41766);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone getUnderlyingDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeZone() {
    return isSetField(41767);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType get(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType getUnderlyingDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlFlowType() {
    return isSetField(41768);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction getUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41769);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp getUnderlyingDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays get(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays getNoUnderlyingDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlDays() {
    return isSetField(41770);
  }

public static class NoUnderlyingDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41771, 41772, 41773, 0};

  public NoUnderlyingDeliveryScheduleSettlDays() {
    super(41770, 41771, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay get(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay getUnderlyingDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlDay() {
    return isSetField(41771);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours get(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours getUnderlyingDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTotalHours() {
    return isSetField(41772);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp getUnderlyingDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes get(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes getNoUnderlyingDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlTimes() {
    return isSetField(41773);
  }

public static class NoUnderlyingDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41774, 41775, 41776, 0};

  public NoUnderlyingDeliveryScheduleSettlTimes() {
    super(41773, 41774, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart get(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart getUnderlyingDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlStart() {
    return isSetField(41774);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd get(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd getUnderlyingDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlEnd() {
    return isSetField(41775);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType getUnderlyingDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeType() {
    return isSetField(41776);
  }
}
}
}

  public void set(quickfix.field.UnderlyingStreamText value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamText get(quickfix.field.UnderlyingStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamText getUnderlyingStreamText() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamText());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamText field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamText() {
    return isSetField(40547);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamTextLen get(quickfix.field.EncodedUnderlyingStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamTextLen getEncodedUnderlyingStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamTextLen() {
    return isSetField(40988);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamText get(quickfix.field.EncodedUnderlyingStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamText getEncodedUnderlyingStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamText());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamText() {
    return isSetField(40989);
  }
}
