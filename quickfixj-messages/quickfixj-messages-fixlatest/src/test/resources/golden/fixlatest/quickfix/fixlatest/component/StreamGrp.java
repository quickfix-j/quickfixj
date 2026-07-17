/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40049, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamGrp() {
    super();
  }

  public void set(quickfix.field.NoStreams value) {
    setField(value);
  }

  public quickfix.field.NoStreams get(quickfix.field.NoStreams value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreams getNoStreams() throws FieldNotFound {
    return get(new quickfix.field.NoStreams());
  }

  public boolean isSet(quickfix.field.NoStreams field) {
    return isSetField(field);
  }

  public boolean isSetNoStreams() {
    return isSetField(40049);
  }

public static class NoStreams extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40050, 41303, 40051, 42784, 42785, 40052, 40053, 41305, 40054, 40055, 42786, 42787, 41306, 41307, 41308, 41309, 41310, 41311, 41251, 41252, 41253, 41254, 41277, 41255, 41256, 41257, 42587, 41237, 41258, 41259, 41260, 41261, 41262, 41263, 41264, 41280, 41265, 41266, 41267, 41268, 41269, 41249, 41270, 41271, 41272, 41273, 41274, 41289, 41275, 41276, 40907, 40908, 40960, 40910, 40911, 40912, 40913, 40914, 40065, 40066, 40961, 40068, 40069, 40070, 40071, 40072, 41244, 41245, 40073, 40958, 41241, 40075, 40076, 40959, 40078, 40079, 40080, 40081, 40082, 40083, 40084, 41246, 41247, 41248, 40738, 40739, 40740, 42600, 40741, 40742, 43106, 40743, 40744, 40745, 40746, 40747, 42601, 42602, 42603, 42604, 40748, 40749, 40750, 41180, 41181, 41182, 41183, 41184, 41185, 41186, 40751, 40947, 41220, 40753, 40754, 40755, 40756, 40757, 40758, 40759, 40760, 40920, 41223, 42654, 42655, 42656, 42657, 42658, 42659, 40761, 40762, 40948, 40764, 40765, 40766, 40767, 40768, 40949, 40770, 40771, 40772, 40773, 40774, 40775, 40950, 40777, 40778, 40779, 40780, 40781, 40782, 40783, 42660, 40784, 40785, 40786, 41187, 41188, 40787, 40788, 41189, 41190, 41191, 40789, 40790, 43090, 43091, 40791, 40792, 41194, 41195, 41196, 41197, 41198, 41199, 41200, 41201, 41202, 40793, 40794, 41203, 41204, 41205, 41206, 40795, 40796, 40797, 40798, 40799, 40800, 40801, 40802, 40803, 41207, 41208, 40804, 40805, 40806, 40807, 41209, 41210, 42663, 42664, 42665, 41211, 41212, 42666, 41213, 41214, 41215, 41216, 41217, 41192, 41227, 41224, 40808, 40809, 40810, 40811, 40812, 40813, 40814, 40815, 40816, 42667, 42686, 42687, 42688, 42683, 42652, 42653, 42245, 42246, 42247, 42248, 42274, 42249, 42250, 42251, 42252, 42265, 42266, 42267, 42268, 42269, 42270, 42272, 42271, 42218, 42219, 42220, 42221, 42222, 42223, 42224, 42225, 42226, 42227, 42228, 42229, 42230, 42231, 42232, 42233, 42234, 42235, 42253, 42238, 42239, 42240, 42241, 42242, 42243, 42236, 42244, 42254, 42255, 42256, 42257, 42258, 42259, 42260, 42261, 42262, 42263, 42264, 42668, 42735, 42669, 42670, 42671, 42672, 42673, 42674, 42675, 42676, 42677, 42678, 42679, 42680, 42681, 42682, 42605, 42628, 42629, 42630, 42631, 42632, 42633, 42634, 42635, 42636, 42637, 42638, 42639, 42640, 42641, 42642, 42643, 42644, 42645, 42609, 42620, 42606, 42610, 42611, 42612, 42613, 42614, 42646, 42647, 42648, 42649, 42650, 42651, 42622, 42623, 42624, 42625, 42626, 42627, 42615, 42616, 42617, 42618, 42619, 40817, 40818, 40946, 40820, 40821, 40822, 40823, 40371, 40372, 40825, 40085, 40828, 40872, 41058, 41085, 41059, 41060, 41061, 41062, 42192, 42193, 41063, 41064, 41065, 41066, 41067, 41218, 41081, 41068, 41069, 41070, 41071, 41072, 41073, 41074, 41075, 41076, 41077, 41078, 41079, 41080, 43094, 41037, 40056, 40982, 40983, 0};

  public NoStreams() {
    super(40049, 40050, ORDER);
  }

  public void set(quickfix.field.StreamType value) {
    setField(value);
  }

  public quickfix.field.StreamType get(quickfix.field.StreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamType getStreamType() throws FieldNotFound {
    return get(new quickfix.field.StreamType());
  }

  public boolean isSet(quickfix.field.StreamType field) {
    return isSetField(field);
  }

  public boolean isSetStreamType() {
    return isSetField(40050);
  }

  public void set(quickfix.field.StreamXID value) {
    setField(value);
  }

  public quickfix.field.StreamXID get(quickfix.field.StreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamXID getStreamXID() throws FieldNotFound {
    return get(new quickfix.field.StreamXID());
  }

  public boolean isSet(quickfix.field.StreamXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamXID() {
    return isSetField(41303);
  }

  public void set(quickfix.field.StreamDesc value) {
    setField(value);
  }

  public quickfix.field.StreamDesc get(quickfix.field.StreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamDesc getStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.StreamDesc());
  }

  public boolean isSet(quickfix.field.StreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetStreamDesc() {
    return isSetField(40051);
  }

  public void set(quickfix.field.StreamVersion value) {
    setField(value);
  }

  public quickfix.field.StreamVersion get(quickfix.field.StreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamVersion getStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.StreamVersion());
  }

  public boolean isSet(quickfix.field.StreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetStreamVersion() {
    return isSetField(42784);
  }

  public void set(quickfix.field.StreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.StreamVersionEffectiveDate get(quickfix.field.StreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamVersionEffectiveDate getStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.StreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.StreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetStreamVersionEffectiveDate() {
    return isSetField(42785);
  }

  public void set(quickfix.field.StreamPaySide value) {
    setField(value);
  }

  public quickfix.field.StreamPaySide get(quickfix.field.StreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamPaySide getStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.StreamPaySide());
  }

  public boolean isSet(quickfix.field.StreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetStreamPaySide() {
    return isSetField(40052);
  }

  public void set(quickfix.field.StreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.StreamReceiveSide get(quickfix.field.StreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamReceiveSide getStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.StreamReceiveSide());
  }

  public boolean isSet(quickfix.field.StreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetStreamReceiveSide() {
    return isSetField(40053);
  }

  public void set(quickfix.field.StreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalXIDRef get(quickfix.field.StreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalXIDRef getStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.StreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalXIDRef() {
    return isSetField(41305);
  }

  public void set(quickfix.field.StreamNotional value) {
    setField(value);
  }

  public quickfix.field.StreamNotional get(quickfix.field.StreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotional getStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamNotional());
  }

  public boolean isSet(quickfix.field.StreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotional() {
    return isSetField(40054);
  }

  public void set(quickfix.field.StreamCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCurrency get(quickfix.field.StreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCurrency getStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCurrency());
  }

  public boolean isSet(quickfix.field.StreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCurrency() {
    return isSetField(40055);
  }

  public void set(quickfix.field.StreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalDeterminationMethod get(quickfix.field.StreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalDeterminationMethod getStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.StreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalDeterminationMethod() {
    return isSetField(42786);
  }

  public void set(quickfix.field.StreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalAdjustments get(quickfix.field.StreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalAdjustments getStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.StreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalAdjustments() {
    return isSetField(42787);
  }

  public void set(quickfix.field.StreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalFrequencyPeriod get(quickfix.field.StreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalFrequencyPeriod getStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalFrequencyPeriod() {
    return isSetField(41306);
  }

  public void set(quickfix.field.StreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalFrequencyUnit get(quickfix.field.StreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalFrequencyUnit getStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalFrequencyUnit() {
    return isSetField(41307);
  }

  public void set(quickfix.field.StreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalCommodityFrequency get(quickfix.field.StreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalCommodityFrequency getStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.StreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalCommodityFrequency() {
    return isSetField(41308);
  }

  public void set(quickfix.field.StreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalUnitOfMeasure get(quickfix.field.StreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalUnitOfMeasure getStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalUnitOfMeasure() {
    return isSetField(41309);
  }

  public void set(quickfix.field.StreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.StreamTotalNotional get(quickfix.field.StreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTotalNotional getStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamTotalNotional());
  }

  public boolean isSet(quickfix.field.StreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamTotalNotional() {
    return isSetField(41310);
  }

  public void set(quickfix.field.StreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamTotalNotionalUnitOfMeasure get(quickfix.field.StreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTotalNotionalUnitOfMeasure getStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamTotalNotionalUnitOfMeasure() {
    return isSetField(41311);
  }

  public void set(quickfix.fixlatest.component.StreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommodity get(quickfix.fixlatest.component.StreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommodity getStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommodity());
  }

  public void set(quickfix.fixlatest.component.StreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamEffectiveDate get(quickfix.fixlatest.component.StreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamEffectiveDate getStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.StreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamTerminationDate get(quickfix.fixlatest.component.StreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamTerminationDate getStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.StreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDates get(quickfix.fixlatest.component.StreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDates getStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.PaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStream get(quickfix.fixlatest.component.PaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStream getPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStream());
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleGrp get(quickfix.fixlatest.component.PaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleGrp getPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleGrp());
  }

  public void set(quickfix.field.NoPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSchedules get(quickfix.field.NoPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSchedules getNoPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSchedules() {
    return isSetField(40828);
  }

public static class NoPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40829, 41164, 41165, 40830, 40831, 40832, 40833, 40834, 40835, 40836, 40837, 40838, 40839, 41166, 41167, 41168, 41169, 40840, 40841, 40842, 40843, 41170, 41171, 41172, 41173, 40844, 40845, 40846, 40847, 40848, 40849, 40868, 40850, 40851, 40852, 40853, 40977, 40855, 40856, 40857, 41174, 41175, 40858, 41161, 41176, 41177, 41178, 41179, 40859, 40860, 40861, 40862, 40945, 40864, 40865, 40866, 40867, 0};

  public NoPaymentSchedules() {
    super(40828, 40829, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleType get(quickfix.field.PaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleType getPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleType() {
    return isSetField(40829);
  }

  public void set(quickfix.field.PaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXID get(quickfix.field.PaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXID getPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXID() {
    return isSetField(41164);
  }

  public void set(quickfix.field.PaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXIDRef get(quickfix.field.PaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXIDRef getPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXIDRef() {
    return isSetField(41165);
  }

  public void set(quickfix.field.PaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStubType get(quickfix.field.PaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStubType getPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStubType() {
    return isSetField(40830);
  }

  public void set(quickfix.field.PaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted get(quickfix.field.PaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted getPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStartDateUnadjusted() {
    return isSetField(40831);
  }

  public void set(quickfix.field.PaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted get(quickfix.field.PaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted getPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleEndDateUnadjusted() {
    return isSetField(40832);
  }

  public void set(quickfix.field.PaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentSchedulePaySide get(quickfix.field.PaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSchedulePaySide getPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.PaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSchedulePaySide() {
    return isSetField(40833);
  }

  public void set(quickfix.field.PaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReceiveSide get(quickfix.field.PaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReceiveSide getPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReceiveSide() {
    return isSetField(40834);
  }

  public void set(quickfix.field.PaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleNotional get(quickfix.field.PaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleNotional getPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.PaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleNotional() {
    return isSetField(40835);
  }

  public void set(quickfix.field.PaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleCurrency get(quickfix.field.PaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleCurrency getPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleCurrency() {
    return isSetField(40836);
  }

  public void set(quickfix.field.PaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRate get(quickfix.field.PaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRate getPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRate() {
    return isSetField(40837);
  }

  public void set(quickfix.field.PaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateMultiplier get(quickfix.field.PaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateMultiplier getPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateMultiplier() {
    return isSetField(40838);
  }

  public void set(quickfix.field.PaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpread get(quickfix.field.PaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpread getPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpread() {
    return isSetField(40839);
  }

  public void set(quickfix.field.PaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateCurrency get(quickfix.field.PaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateCurrency getPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateCurrency() {
    return isSetField(41166);
  }

  public void set(quickfix.field.PaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure get(quickfix.field.PaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure getPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41167);
  }

  public void set(quickfix.field.PaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateConversionFactor get(quickfix.field.PaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateConversionFactor getPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateConversionFactor() {
    return isSetField(41168);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadType get(quickfix.field.PaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadType getPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadType() {
    return isSetField(41169);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType get(quickfix.field.PaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType getPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadPositionType() {
    return isSetField(40840);
  }

  public void set(quickfix.field.PaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateTreatment get(quickfix.field.PaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateTreatment getPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateTreatment() {
    return isSetField(40841);
  }

  public void set(quickfix.field.PaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedAmount get(quickfix.field.PaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedAmount getPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedAmount() {
    return isSetField(40842);
  }

  public void set(quickfix.field.PaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedCurrency get(quickfix.field.PaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedCurrency getPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedCurrency() {
    return isSetField(40843);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice get(quickfix.field.PaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice getPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPrice() {
    return isSetField(41170);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency getPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41171);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure getPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41172);
  }

  public void set(quickfix.field.PaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure get(quickfix.field.PaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure getPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41173);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod get(quickfix.field.PaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod getPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40844);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit get(quickfix.field.PaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit getPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyUnit() {
    return isSetField(40845);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetValue get(quickfix.field.PaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetValue getPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetValue() {
    return isSetField(40846);
  }

  public void set(quickfix.field.PaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRate get(quickfix.field.PaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRate getPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRate() {
    return isSetField(40847);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetRate get(quickfix.field.PaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetRate getPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetRate() {
    return isSetField(40848);
  }

  public void set(quickfix.field.PaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRelativeTo get(quickfix.field.PaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRelativeTo getPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRelativeTo() {
    return isSetField(40849);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp getPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleRateSources get(quickfix.field.NoPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleRateSources getNoPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleRateSources() {
    return isSetField(40868);
  }

public static class NoPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40869, 40870, 40871, 0};

  public NoPaymentScheduleRateSources() {
    super(40868, 40869, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted get(quickfix.field.PaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted getPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40850);
  }

  public void set(quickfix.field.PaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleWeight get(quickfix.field.PaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleWeight getPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.PaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleWeight() {
    return isSetField(40851);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo get(quickfix.field.PaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo getPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40852);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention getPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40853);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp getPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters getNoPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40977);
  }

public static class NoPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40854, 0};

  public NoPaymentScheduleFixingDateBusinessCenters() {
    super(40977, 40854, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod getPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40855);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit get(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit getPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40856);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType get(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType getPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40857);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution get(quickfix.field.PaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution getPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayDistribution() {
    return isSetField(41174);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayCount get(quickfix.field.PaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayCount getPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayCount() {
    return isSetField(41175);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted get(quickfix.field.PaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted getPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateAdjusted() {
    return isSetField(40858);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp getPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDays get(quickfix.field.NoPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDays getNoPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDays() {
    return isSetField(41161);
  }

public static class NoPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41162, 41163, 0};

  public NoPaymentScheduleFixingDays() {
    super(41161, 41162, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod get(quickfix.field.PaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod getPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagPeriod() {
    return isSetField(41176);
  }

  public void set(quickfix.field.PaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagUnit get(quickfix.field.PaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagUnit getPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagUnit() {
    return isSetField(41177);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod getPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41178);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit getPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41179);
  }

  public void set(quickfix.field.PaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTime get(quickfix.field.PaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTime getPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTime() {
    return isSetField(40859);
  }

  public void set(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter get(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter getPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40860);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo getPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40861);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention getPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40862);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp getPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters getNoPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40945);
  }

public static class NoPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40863, 0};

  public NoPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40945, 40863, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod getPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40864);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit getPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40865);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType getPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40866);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted getPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40867);
  }
}

  public void set(quickfix.fixlatest.component.PaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubGrp get(quickfix.fixlatest.component.PaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubGrp getPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubGrp());
  }

  public void set(quickfix.field.NoPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubs get(quickfix.field.NoPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubs getNoPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubs() {
    return isSetField(40872);
  }

public static class NoPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40873, 40874, 42698, 42699, 42705, 42700, 42701, 42702, 42703, 42704, 42689, 42690, 42696, 42691, 42692, 42693, 42694, 42695, 40875, 40876, 40877, 40878, 40879, 40880, 40881, 40882, 40883, 40884, 40885, 40886, 40887, 40888, 40889, 40890, 40891, 40892, 40893, 40894, 40895, 40896, 40897, 40898, 40899, 40900, 40901, 0};

  public NoPaymentStubs() {
    super(40872, 40873, ORDER);
  }

  public void set(quickfix.field.PaymentStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubType get(quickfix.field.PaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubType getPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubType());
  }

  public boolean isSet(quickfix.field.PaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubType() {
    return isSetField(40873);
  }

  public void set(quickfix.field.PaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStubLength get(quickfix.field.PaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubLength getPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubLength());
  }

  public boolean isSet(quickfix.field.PaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubLength() {
    return isSetField(40874);
  }

  public void set(quickfix.fixlatest.component.PaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubStartDate get(quickfix.fixlatest.component.PaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubStartDate getPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.PaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubEndDate get(quickfix.fixlatest.component.PaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubEndDate getPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubEndDate());
  }

  public void set(quickfix.field.PaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubRate get(quickfix.field.PaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubRate getPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubRate());
  }

  public boolean isSet(quickfix.field.PaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubRate() {
    return isSetField(40875);
  }

  public void set(quickfix.field.PaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedAmount get(quickfix.field.PaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedAmount getPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedAmount() {
    return isSetField(40876);
  }

  public void set(quickfix.field.PaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedCurrency get(quickfix.field.PaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedCurrency getPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedCurrency() {
    return isSetField(40877);
  }

  public void set(quickfix.field.PaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex get(quickfix.field.PaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex getPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex() {
    return isSetField(40878);
  }

  public void set(quickfix.field.PaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexSource get(quickfix.field.PaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexSource getPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexSource() {
    return isSetField(40879);
  }

  public void set(quickfix.field.PaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurvePeriod get(quickfix.field.PaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurvePeriod getPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurvePeriod() {
    return isSetField(40880);
  }

  public void set(quickfix.field.PaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurveUnit get(quickfix.field.PaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurveUnit getPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurveUnit() {
    return isSetField(40881);
  }

  public void set(quickfix.field.PaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateMultiplier get(quickfix.field.PaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateMultiplier getPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateMultiplier() {
    return isSetField(40882);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpread get(quickfix.field.PaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpread getPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpread() {
    return isSetField(40883);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType get(quickfix.field.PaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType getPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40884);
  }

  public void set(quickfix.field.PaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateTreatment get(quickfix.field.PaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateTreatment getPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateTreatment() {
    return isSetField(40885);
  }

  public void set(quickfix.field.PaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRate get(quickfix.field.PaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRate getPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRate() {
    return isSetField(40886);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide get(quickfix.field.PaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide getPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateBuySide() {
    return isSetField(40887);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide get(quickfix.field.PaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide getPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateSellSide() {
    return isSetField(40888);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRate get(quickfix.field.PaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRate getPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRate() {
    return isSetField(40889);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide get(quickfix.field.PaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide getPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateBuySide() {
    return isSetField(40890);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide get(quickfix.field.PaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide getPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateSellSide() {
    return isSetField(40891);
  }

  public void set(quickfix.field.PaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2 get(quickfix.field.PaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2 getPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2() {
    return isSetField(40892);
  }

  public void set(quickfix.field.PaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2Source get(quickfix.field.PaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2Source getPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2Source() {
    return isSetField(40893);
  }

  public void set(quickfix.field.PaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod get(quickfix.field.PaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod getPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurvePeriod() {
    return isSetField(40894);
  }

  public void set(quickfix.field.PaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurveUnit get(quickfix.field.PaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurveUnit getPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurveUnit() {
    return isSetField(40895);
  }

  public void set(quickfix.field.PaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier get(quickfix.field.PaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier getPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateMultiplier() {
    return isSetField(40896);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpread get(quickfix.field.PaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpread getPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpread() {
    return isSetField(40897);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType get(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType getPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40898);
  }

  public void set(quickfix.field.PaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateTreatment get(quickfix.field.PaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateTreatment getPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateTreatment() {
    return isSetField(40899);
  }

  public void set(quickfix.field.PaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CapRate get(quickfix.field.PaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CapRate getPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CapRate() {
    return isSetField(40900);
  }

  public void set(quickfix.field.PaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2FloorRate get(quickfix.field.PaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2FloorRate getPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2FloorRate() {
    return isSetField(40901);
  }
}

  public void set(quickfix.fixlatest.component.DeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryStream get(quickfix.fixlatest.component.DeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryStream getDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryStream());
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleGrp get(quickfix.fixlatest.component.DeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleGrp getDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoDeliverySchedules get(quickfix.field.NoDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliverySchedules getNoDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliverySchedules() {
    return isSetField(41037);
  }

public static class NoDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41038, 41039, 41040, 41041, 41042, 41043, 41044, 41045, 41046, 41047, 41048, 41049, 41050, 41051, 0};

  public NoDeliverySchedules() {
    super(41037, 41038, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleType get(quickfix.field.DeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleType getDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleType() {
    return isSetField(41038);
  }

  public void set(quickfix.field.DeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleXID get(quickfix.field.DeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleXID getDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleXID() {
    return isSetField(41039);
  }

  public void set(quickfix.field.DeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotional get(quickfix.field.DeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotional getDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotional() {
    return isSetField(41040);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure getDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41041);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency get(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency getDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41042);
  }

  public void set(quickfix.field.DeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance get(quickfix.field.DeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance getDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNegativeTolerance() {
    return isSetField(41043);
  }

  public void set(quickfix.field.DeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliverySchedulePositiveTolerance get(quickfix.field.DeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliverySchedulePositiveTolerance getDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliverySchedulePositiveTolerance() {
    return isSetField(41044);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure getDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41045);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceType get(quickfix.field.DeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceType getDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceType() {
    return isSetField(41046);
  }

  public void set(quickfix.field.DeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlCountry get(quickfix.field.DeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlCountry getDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlCountry() {
    return isSetField(41047);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone get(quickfix.field.DeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone getDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeZone() {
    return isSetField(41048);
  }

  public void set(quickfix.field.DeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlFlowType get(quickfix.field.DeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlFlowType getDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlFlowType() {
    return isSetField(41049);
  }

  public void set(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction getDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41050);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp getDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlDays get(quickfix.field.NoDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlDays getNoDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlDays() {
    return isSetField(41051);
  }

public static class NoDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41052, 41053, 41054, 0};

  public NoDeliveryScheduleSettlDays() {
    super(41051, 41052, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlDay get(quickfix.field.DeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlDay getDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlDay() {
    return isSetField(41052);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours get(quickfix.field.DeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours getDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTotalHours() {
    return isSetField(41053);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp getDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes get(quickfix.field.NoDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes getNoDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlTimes() {
    return isSetField(41054);
  }

public static class NoDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41055, 41056, 41057, 0};

  public NoDeliveryScheduleSettlTimes() {
    super(41054, 41055, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlStart get(quickfix.field.DeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlStart getDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlStart() {
    return isSetField(41055);
  }

  public void set(quickfix.field.DeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlEnd get(quickfix.field.DeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlEnd getDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlEnd() {
    return isSetField(41056);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeType get(quickfix.field.DeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeType getDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeType() {
    return isSetField(41057);
  }
}
}
}

  public void set(quickfix.field.StreamText value) {
    setField(value);
  }

  public quickfix.field.StreamText get(quickfix.field.StreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamText getStreamText() throws FieldNotFound {
    return get(new quickfix.field.StreamText());
  }

  public boolean isSet(quickfix.field.StreamText field) {
    return isSetField(field);
  }

  public boolean isSetStreamText() {
    return isSetField(40056);
  }

  public void set(quickfix.field.EncodedStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamTextLen get(quickfix.field.EncodedStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamTextLen getEncodedStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamTextLen() {
    return isSetField(40982);
  }

  public void set(quickfix.field.EncodedStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamText get(quickfix.field.EncodedStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamText getEncodedStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamText());
  }

  public boolean isSet(quickfix.field.EncodedStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamText() {
    return isSetField(40983);
  }
}

  public void set(quickfix.field.StreamType value) {
    setField(value);
  }

  public quickfix.field.StreamType get(quickfix.field.StreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamType getStreamType() throws FieldNotFound {
    return get(new quickfix.field.StreamType());
  }

  public boolean isSet(quickfix.field.StreamType field) {
    return isSetField(field);
  }

  public boolean isSetStreamType() {
    return isSetField(40050);
  }

  public void set(quickfix.field.StreamXID value) {
    setField(value);
  }

  public quickfix.field.StreamXID get(quickfix.field.StreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamXID getStreamXID() throws FieldNotFound {
    return get(new quickfix.field.StreamXID());
  }

  public boolean isSet(quickfix.field.StreamXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamXID() {
    return isSetField(41303);
  }

  public void set(quickfix.field.StreamDesc value) {
    setField(value);
  }

  public quickfix.field.StreamDesc get(quickfix.field.StreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamDesc getStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.StreamDesc());
  }

  public boolean isSet(quickfix.field.StreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetStreamDesc() {
    return isSetField(40051);
  }

  public void set(quickfix.field.StreamVersion value) {
    setField(value);
  }

  public quickfix.field.StreamVersion get(quickfix.field.StreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamVersion getStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.StreamVersion());
  }

  public boolean isSet(quickfix.field.StreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetStreamVersion() {
    return isSetField(42784);
  }

  public void set(quickfix.field.StreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.StreamVersionEffectiveDate get(quickfix.field.StreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamVersionEffectiveDate getStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.StreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.StreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetStreamVersionEffectiveDate() {
    return isSetField(42785);
  }

  public void set(quickfix.field.StreamPaySide value) {
    setField(value);
  }

  public quickfix.field.StreamPaySide get(quickfix.field.StreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamPaySide getStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.StreamPaySide());
  }

  public boolean isSet(quickfix.field.StreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetStreamPaySide() {
    return isSetField(40052);
  }

  public void set(quickfix.field.StreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.StreamReceiveSide get(quickfix.field.StreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamReceiveSide getStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.StreamReceiveSide());
  }

  public boolean isSet(quickfix.field.StreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetStreamReceiveSide() {
    return isSetField(40053);
  }

  public void set(quickfix.field.StreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalXIDRef get(quickfix.field.StreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalXIDRef getStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.StreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalXIDRef() {
    return isSetField(41305);
  }

  public void set(quickfix.field.StreamNotional value) {
    setField(value);
  }

  public quickfix.field.StreamNotional get(quickfix.field.StreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotional getStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamNotional());
  }

  public boolean isSet(quickfix.field.StreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotional() {
    return isSetField(40054);
  }

  public void set(quickfix.field.StreamCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCurrency get(quickfix.field.StreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCurrency getStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCurrency());
  }

  public boolean isSet(quickfix.field.StreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCurrency() {
    return isSetField(40055);
  }

  public void set(quickfix.field.StreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalDeterminationMethod get(quickfix.field.StreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalDeterminationMethod getStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.StreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalDeterminationMethod() {
    return isSetField(42786);
  }

  public void set(quickfix.field.StreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalAdjustments get(quickfix.field.StreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalAdjustments getStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.StreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalAdjustments() {
    return isSetField(42787);
  }

  public void set(quickfix.field.StreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalFrequencyPeriod get(quickfix.field.StreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalFrequencyPeriod getStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalFrequencyPeriod() {
    return isSetField(41306);
  }

  public void set(quickfix.field.StreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalFrequencyUnit get(quickfix.field.StreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalFrequencyUnit getStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalFrequencyUnit() {
    return isSetField(41307);
  }

  public void set(quickfix.field.StreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalCommodityFrequency get(quickfix.field.StreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalCommodityFrequency getStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.StreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalCommodityFrequency() {
    return isSetField(41308);
  }

  public void set(quickfix.field.StreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamNotionalUnitOfMeasure get(quickfix.field.StreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamNotionalUnitOfMeasure getStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamNotionalUnitOfMeasure() {
    return isSetField(41309);
  }

  public void set(quickfix.field.StreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.StreamTotalNotional get(quickfix.field.StreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTotalNotional getStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamTotalNotional());
  }

  public boolean isSet(quickfix.field.StreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamTotalNotional() {
    return isSetField(41310);
  }

  public void set(quickfix.field.StreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamTotalNotionalUnitOfMeasure get(quickfix.field.StreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamTotalNotionalUnitOfMeasure getStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamTotalNotionalUnitOfMeasure() {
    return isSetField(41311);
  }

  public void set(quickfix.fixlatest.component.StreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommodity get(quickfix.fixlatest.component.StreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommodity getStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommodity());
  }

  public void set(quickfix.fixlatest.component.StreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamEffectiveDate get(quickfix.fixlatest.component.StreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamEffectiveDate getStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.StreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamTerminationDate get(quickfix.fixlatest.component.StreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamTerminationDate getStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.StreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDates get(quickfix.fixlatest.component.StreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCalculationPeriodDates getStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.PaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStream get(quickfix.fixlatest.component.PaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStream getPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStream());
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleGrp get(quickfix.fixlatest.component.PaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleGrp getPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleGrp());
  }

  public void set(quickfix.field.NoPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoPaymentSchedules get(quickfix.field.NoPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentSchedules getNoPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentSchedules() {
    return isSetField(40828);
  }

public static class NoPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40829, 41164, 41165, 40830, 40831, 40832, 40833, 40834, 40835, 40836, 40837, 40838, 40839, 41166, 41167, 41168, 41169, 40840, 40841, 40842, 40843, 41170, 41171, 41172, 41173, 40844, 40845, 40846, 40847, 40848, 40849, 40868, 40850, 40851, 40852, 40853, 40977, 40855, 40856, 40857, 41174, 41175, 40858, 41161, 41176, 41177, 41178, 41179, 40859, 40860, 40861, 40862, 40945, 40864, 40865, 40866, 40867, 0};

  public NoPaymentSchedules() {
    super(40828, 40829, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleType get(quickfix.field.PaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleType getPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleType() {
    return isSetField(40829);
  }

  public void set(quickfix.field.PaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXID get(quickfix.field.PaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXID getPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXID() {
    return isSetField(41164);
  }

  public void set(quickfix.field.PaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleXIDRef get(quickfix.field.PaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleXIDRef getPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.PaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleXIDRef() {
    return isSetField(41165);
  }

  public void set(quickfix.field.PaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStubType get(quickfix.field.PaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStubType getPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStubType() {
    return isSetField(40830);
  }

  public void set(quickfix.field.PaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted get(quickfix.field.PaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStartDateUnadjusted getPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStartDateUnadjusted() {
    return isSetField(40831);
  }

  public void set(quickfix.field.PaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted get(quickfix.field.PaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleEndDateUnadjusted getPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleEndDateUnadjusted() {
    return isSetField(40832);
  }

  public void set(quickfix.field.PaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.PaymentSchedulePaySide get(quickfix.field.PaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentSchedulePaySide getPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.PaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentSchedulePaySide() {
    return isSetField(40833);
  }

  public void set(quickfix.field.PaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReceiveSide get(quickfix.field.PaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReceiveSide getPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReceiveSide() {
    return isSetField(40834);
  }

  public void set(quickfix.field.PaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleNotional get(quickfix.field.PaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleNotional getPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.PaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleNotional() {
    return isSetField(40835);
  }

  public void set(quickfix.field.PaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleCurrency get(quickfix.field.PaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleCurrency getPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleCurrency() {
    return isSetField(40836);
  }

  public void set(quickfix.field.PaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRate get(quickfix.field.PaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRate getPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRate() {
    return isSetField(40837);
  }

  public void set(quickfix.field.PaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateMultiplier get(quickfix.field.PaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateMultiplier getPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateMultiplier() {
    return isSetField(40838);
  }

  public void set(quickfix.field.PaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpread get(quickfix.field.PaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpread getPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpread() {
    return isSetField(40839);
  }

  public void set(quickfix.field.PaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateCurrency get(quickfix.field.PaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateCurrency getPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateCurrency() {
    return isSetField(41166);
  }

  public void set(quickfix.field.PaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure get(quickfix.field.PaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateUnitOfMeasure getPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41167);
  }

  public void set(quickfix.field.PaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateConversionFactor get(quickfix.field.PaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateConversionFactor getPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateConversionFactor() {
    return isSetField(41168);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadType get(quickfix.field.PaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadType getPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadType() {
    return isSetField(41169);
  }

  public void set(quickfix.field.PaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType get(quickfix.field.PaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSpreadPositionType getPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSpreadPositionType() {
    return isSetField(40840);
  }

  public void set(quickfix.field.PaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateTreatment get(quickfix.field.PaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateTreatment getPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateTreatment() {
    return isSetField(40841);
  }

  public void set(quickfix.field.PaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedAmount get(quickfix.field.PaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedAmount getPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedAmount() {
    return isSetField(40842);
  }

  public void set(quickfix.field.PaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixedCurrency get(quickfix.field.PaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixedCurrency getPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixedCurrency() {
    return isSetField(40843);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice get(quickfix.field.PaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPrice getPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPrice() {
    return isSetField(41170);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceCurrency getPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41171);
  }

  public void set(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure getPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41172);
  }

  public void set(quickfix.field.PaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure get(quickfix.field.PaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepUnitOfMeasure getPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41173);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod get(quickfix.field.PaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyPeriod getPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40844);
  }

  public void set(quickfix.field.PaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit get(quickfix.field.PaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepFrequencyUnit getPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepFrequencyUnit() {
    return isSetField(40845);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetValue get(quickfix.field.PaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetValue getPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetValue() {
    return isSetField(40846);
  }

  public void set(quickfix.field.PaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRate get(quickfix.field.PaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRate getPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRate() {
    return isSetField(40847);
  }

  public void set(quickfix.field.PaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepOffsetRate get(quickfix.field.PaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepOffsetRate getPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepOffsetRate() {
    return isSetField(40848);
  }

  public void set(quickfix.field.PaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleStepRelativeTo get(quickfix.field.PaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleStepRelativeTo getPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleStepRelativeTo() {
    return isSetField(40849);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.PaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleRateSourceGrp getPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleRateSources get(quickfix.field.NoPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleRateSources getNoPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleRateSources() {
    return isSetField(40868);
  }

public static class NoPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40869, 40870, 40871, 0};

  public NoPaymentScheduleRateSources() {
    super(40868, 40869, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSource get(quickfix.field.PaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSource getPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSource() {
    return isSetField(40869);
  }

  public void set(quickfix.field.PaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleRateSourceType get(quickfix.field.PaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleRateSourceType getPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleRateSourceType() {
    return isSetField(40870);
  }

  public void set(quickfix.field.PaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleReferencePage get(quickfix.field.PaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleReferencePage getPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleReferencePage() {
    return isSetField(40871);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted get(quickfix.field.PaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateUnadjusted getPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40850);
  }

  public void set(quickfix.field.PaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleWeight get(quickfix.field.PaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleWeight getPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.PaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleWeight() {
    return isSetField(40851);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo get(quickfix.field.PaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateRelativeTo getPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40852);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessDayConvention getPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40853);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp getPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDateBusinessCenters getNoPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40977);
  }

public static class NoPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40854, 0};

  public NoPaymentScheduleFixingDateBusinessCenters() {
    super(40977, 40854, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter get(quickfix.field.PaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateBusinessCenter getPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40854);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetPeriod getPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40855);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit get(quickfix.field.PaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetUnit getPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40856);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType get(quickfix.field.PaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateOffsetDayType getPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40857);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution get(quickfix.field.PaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayDistribution getPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayDistribution() {
    return isSetField(41174);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayCount get(quickfix.field.PaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayCount getPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayCount() {
    return isSetField(41175);
  }

  public void set(quickfix.field.PaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted get(quickfix.field.PaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDateAdjusted getPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDateAdjusted() {
    return isSetField(40858);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.PaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleFixingDayGrp getPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleFixingDays get(quickfix.field.NoPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleFixingDays getNoPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleFixingDays() {
    return isSetField(41161);
  }

public static class NoPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41162, 41163, 0};

  public NoPaymentScheduleFixingDays() {
    super(41161, 41162, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek get(quickfix.field.PaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayOfWeek getPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayOfWeek() {
    return isSetField(41162);
  }

  public void set(quickfix.field.PaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingDayNumber get(quickfix.field.PaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingDayNumber getPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingDayNumber() {
    return isSetField(41163);
  }
}

  public void set(quickfix.field.PaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod get(quickfix.field.PaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagPeriod getPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagPeriod() {
    return isSetField(41176);
  }

  public void set(quickfix.field.PaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingLagUnit get(quickfix.field.PaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingLagUnit getPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingLagUnit() {
    return isSetField(41177);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod getPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41178);
  }

  public void set(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit getPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41179);
  }

  public void set(quickfix.field.PaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTime get(quickfix.field.PaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTime getPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTime() {
    return isSetField(40859);
  }

  public void set(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter get(quickfix.field.PaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleFixingTimeBusinessCenter getPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40860);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo getPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40861);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention getPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40862);
  }

  public void set(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp getPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentScheduleInterimExchangeDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters get(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters getNoPaymentScheduleInterimExchangeDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoPaymentScheduleInterimExchangeDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentScheduleInterimExchangeDateBusinessCenters() {
    return isSetField(40945);
  }

public static class NoPaymentScheduleInterimExchangeDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40863, 0};

  public NoPaymentScheduleInterimExchangeDateBusinessCenters() {
    super(40945, 40863, ORDER);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter get(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter getPaymentScheduleInterimExchangeDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesBusinessCenter() {
    return isSetField(40863);
  }
}

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod getPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40864);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit getPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40865);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType getPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40866);
  }

  public void set(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentScheduleInterimExchangeDateAdjusted getPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.PaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.PaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40867);
  }
}

  public void set(quickfix.fixlatest.component.PaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubGrp get(quickfix.fixlatest.component.PaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubGrp getPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubGrp());
  }

  public void set(quickfix.field.NoPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStubs get(quickfix.field.NoPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStubs getNoPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStubs() {
    return isSetField(40872);
  }

public static class NoPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40873, 40874, 42698, 42699, 42705, 42700, 42701, 42702, 42703, 42704, 42689, 42690, 42696, 42691, 42692, 42693, 42694, 42695, 40875, 40876, 40877, 40878, 40879, 40880, 40881, 40882, 40883, 40884, 40885, 40886, 40887, 40888, 40889, 40890, 40891, 40892, 40893, 40894, 40895, 40896, 40897, 40898, 40899, 40900, 40901, 0};

  public NoPaymentStubs() {
    super(40872, 40873, ORDER);
  }

  public void set(quickfix.field.PaymentStubType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubType get(quickfix.field.PaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubType getPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubType());
  }

  public boolean isSet(quickfix.field.PaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubType() {
    return isSetField(40873);
  }

  public void set(quickfix.field.PaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStubLength get(quickfix.field.PaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubLength getPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubLength());
  }

  public boolean isSet(quickfix.field.PaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubLength() {
    return isSetField(40874);
  }

  public void set(quickfix.fixlatest.component.PaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubStartDate get(quickfix.fixlatest.component.PaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubStartDate getPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.PaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStubEndDate get(quickfix.fixlatest.component.PaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStubEndDate getPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStubEndDate());
  }

  public void set(quickfix.field.PaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubRate get(quickfix.field.PaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubRate getPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubRate());
  }

  public boolean isSet(quickfix.field.PaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubRate() {
    return isSetField(40875);
  }

  public void set(quickfix.field.PaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedAmount get(quickfix.field.PaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedAmount getPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedAmount() {
    return isSetField(40876);
  }

  public void set(quickfix.field.PaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStubFixedCurrency get(quickfix.field.PaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubFixedCurrency getPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubFixedCurrency() {
    return isSetField(40877);
  }

  public void set(quickfix.field.PaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex get(quickfix.field.PaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex getPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex() {
    return isSetField(40878);
  }

  public void set(quickfix.field.PaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexSource get(quickfix.field.PaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexSource getPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexSource() {
    return isSetField(40879);
  }

  public void set(quickfix.field.PaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurvePeriod get(quickfix.field.PaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurvePeriod getPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurvePeriod() {
    return isSetField(40880);
  }

  public void set(quickfix.field.PaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCurveUnit get(quickfix.field.PaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCurveUnit getPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCurveUnit() {
    return isSetField(40881);
  }

  public void set(quickfix.field.PaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateMultiplier get(quickfix.field.PaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateMultiplier getPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateMultiplier() {
    return isSetField(40882);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpread get(quickfix.field.PaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpread getPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpread() {
    return isSetField(40883);
  }

  public void set(quickfix.field.PaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType get(quickfix.field.PaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateSpreadPositionType getPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40884);
  }

  public void set(quickfix.field.PaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexRateTreatment get(quickfix.field.PaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexRateTreatment getPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexRateTreatment() {
    return isSetField(40885);
  }

  public void set(quickfix.field.PaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRate get(quickfix.field.PaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRate getPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRate() {
    return isSetField(40886);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide get(quickfix.field.PaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateBuySide getPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateBuySide() {
    return isSetField(40887);
  }

  public void set(quickfix.field.PaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide get(quickfix.field.PaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexCapRateSellSide getPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexCapRateSellSide() {
    return isSetField(40888);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRate get(quickfix.field.PaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRate getPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRate() {
    return isSetField(40889);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide get(quickfix.field.PaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateBuySide getPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateBuySide() {
    return isSetField(40890);
  }

  public void set(quickfix.field.PaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide get(quickfix.field.PaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndexFloorRateSellSide getPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.PaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndexFloorRateSellSide() {
    return isSetField(40891);
  }

  public void set(quickfix.field.PaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2 get(quickfix.field.PaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2 getPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2() {
    return isSetField(40892);
  }

  public void set(quickfix.field.PaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2Source get(quickfix.field.PaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2Source getPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2Source() {
    return isSetField(40893);
  }

  public void set(quickfix.field.PaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod get(quickfix.field.PaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurvePeriod getPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurvePeriod() {
    return isSetField(40894);
  }

  public void set(quickfix.field.PaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CurveUnit get(quickfix.field.PaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CurveUnit getPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CurveUnit() {
    return isSetField(40895);
  }

  public void set(quickfix.field.PaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier get(quickfix.field.PaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateMultiplier getPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateMultiplier() {
    return isSetField(40896);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpread get(quickfix.field.PaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpread getPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpread() {
    return isSetField(40897);
  }

  public void set(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType get(quickfix.field.PaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateSpreadPositionType getPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40898);
  }

  public void set(quickfix.field.PaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2RateTreatment get(quickfix.field.PaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2RateTreatment getPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2RateTreatment() {
    return isSetField(40899);
  }

  public void set(quickfix.field.PaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2CapRate get(quickfix.field.PaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2CapRate getPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2CapRate() {
    return isSetField(40900);
  }

  public void set(quickfix.field.PaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.PaymentStubIndex2FloorRate get(quickfix.field.PaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStubIndex2FloorRate getPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.PaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.PaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStubIndex2FloorRate() {
    return isSetField(40901);
  }
}

  public void set(quickfix.fixlatest.component.DeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryStream get(quickfix.fixlatest.component.DeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryStream getDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryStream());
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleGrp get(quickfix.fixlatest.component.DeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleGrp getDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoDeliverySchedules get(quickfix.field.NoDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliverySchedules getNoDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliverySchedules() {
    return isSetField(41037);
  }

public static class NoDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41038, 41039, 41040, 41041, 41042, 41043, 41044, 41045, 41046, 41047, 41048, 41049, 41050, 41051, 0};

  public NoDeliverySchedules() {
    super(41037, 41038, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleType get(quickfix.field.DeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleType getDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleType() {
    return isSetField(41038);
  }

  public void set(quickfix.field.DeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleXID get(quickfix.field.DeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleXID getDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleXID() {
    return isSetField(41039);
  }

  public void set(quickfix.field.DeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotional get(quickfix.field.DeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotional getDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotional() {
    return isSetField(41040);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure getDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41041);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency get(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency getDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41042);
  }

  public void set(quickfix.field.DeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance get(quickfix.field.DeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance getDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNegativeTolerance() {
    return isSetField(41043);
  }

  public void set(quickfix.field.DeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliverySchedulePositiveTolerance get(quickfix.field.DeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliverySchedulePositiveTolerance getDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliverySchedulePositiveTolerance() {
    return isSetField(41044);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure getDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41045);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceType get(quickfix.field.DeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceType getDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceType() {
    return isSetField(41046);
  }

  public void set(quickfix.field.DeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlCountry get(quickfix.field.DeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlCountry getDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlCountry() {
    return isSetField(41047);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone get(quickfix.field.DeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone getDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeZone() {
    return isSetField(41048);
  }

  public void set(quickfix.field.DeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlFlowType get(quickfix.field.DeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlFlowType getDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlFlowType() {
    return isSetField(41049);
  }

  public void set(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction getDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41050);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp getDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlDays get(quickfix.field.NoDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlDays getNoDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlDays() {
    return isSetField(41051);
  }

public static class NoDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41052, 41053, 41054, 0};

  public NoDeliveryScheduleSettlDays() {
    super(41051, 41052, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlDay get(quickfix.field.DeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlDay getDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlDay() {
    return isSetField(41052);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours get(quickfix.field.DeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours getDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTotalHours() {
    return isSetField(41053);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp getDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes get(quickfix.field.NoDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes getNoDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlTimes() {
    return isSetField(41054);
  }

public static class NoDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41055, 41056, 41057, 0};

  public NoDeliveryScheduleSettlTimes() {
    super(41054, 41055, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlStart get(quickfix.field.DeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlStart getDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlStart() {
    return isSetField(41055);
  }

  public void set(quickfix.field.DeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlEnd get(quickfix.field.DeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlEnd getDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlEnd() {
    return isSetField(41056);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeType get(quickfix.field.DeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeType getDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeType() {
    return isSetField(41057);
  }
}
}
}

  public void set(quickfix.field.StreamText value) {
    setField(value);
  }

  public quickfix.field.StreamText get(quickfix.field.StreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamText getStreamText() throws FieldNotFound {
    return get(new quickfix.field.StreamText());
  }

  public boolean isSet(quickfix.field.StreamText field) {
    return isSetField(field);
  }

  public boolean isSetStreamText() {
    return isSetField(40056);
  }

  public void set(quickfix.field.EncodedStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamTextLen get(quickfix.field.EncodedStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamTextLen getEncodedStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamTextLen() {
    return isSetField(40982);
  }

  public void set(quickfix.field.EncodedStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamText get(quickfix.field.EncodedStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamText getEncodedStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamText());
  }

  public boolean isSet(quickfix.field.EncodedStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamText() {
    return isSetField(40983);
  }
}
