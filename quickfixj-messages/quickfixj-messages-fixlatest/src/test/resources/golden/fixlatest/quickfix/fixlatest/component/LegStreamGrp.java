/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40241, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreams value) {
    setField(value);
  }

  public quickfix.field.NoLegStreams get(quickfix.field.NoLegStreams value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreams getNoLegStreams() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreams());
  }

  public boolean isSet(quickfix.field.NoLegStreams field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreams() {
    return isSetField(40241);
  }

public static class NoLegStreams extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40242, 41700, 40243, 42583, 42584, 40244, 40245, 41702, 40246, 40247, 42585, 42586, 41703, 41704, 41705, 41706, 41707, 41708, 41648, 41649, 41650, 41651, 41674, 41652, 41653, 41654, 42588, 41452, 41655, 41656, 41657, 41658, 41659, 41660, 41661, 41677, 41662, 41663, 41664, 41665, 41666, 41646, 41667, 41668, 41669, 41670, 41671, 41686, 41672, 41673, 40249, 40250, 40942, 40252, 40253, 40254, 40255, 40256, 40257, 40258, 40943, 40260, 40261, 40262, 40263, 40264, 41641, 41642, 40265, 40940, 41638, 40267, 40268, 40941, 40270, 40271, 40272, 40273, 40274, 40275, 40276, 41643, 41644, 41645, 40279, 40280, 40281, 42399, 40282, 40283, 43108, 40284, 40285, 40286, 40287, 40288, 42400, 42401, 42402, 42403, 40289, 40290, 40291, 41549, 41550, 41551, 41552, 41553, 41554, 41555, 40292, 40930, 41589, 40294, 40295, 40296, 40297, 40298, 40299, 40300, 40301, 40302, 41592, 42453, 42454, 42455, 42456, 42457, 42458, 40303, 40304, 40931, 40306, 40307, 40308, 40309, 40310, 40932, 40312, 40313, 40314, 40315, 40316, 40317, 40933, 40319, 40320, 40321, 40322, 40323, 40324, 40325, 42459, 40326, 40327, 40328, 41556, 41557, 40329, 40330, 41558, 41559, 41560, 40331, 40332, 43088, 43089, 40333, 40334, 41563, 41564, 41565, 41566, 41567, 41568, 41569, 41570, 41571, 40335, 40336, 41572, 41573, 41574, 41575, 40337, 40338, 40339, 40340, 40341, 40342, 40343, 40344, 40345, 41576, 41577, 40346, 40347, 40348, 40349, 41578, 41579, 42462, 42463, 42464, 41580, 41581, 42465, 41582, 41583, 41584, 41585, 41586, 41561, 41596, 41593, 40350, 40351, 40352, 40353, 40354, 40355, 40356, 40357, 40358, 42466, 42482, 42483, 42484, 42485, 42451, 42452, 42337, 42338, 42339, 42340, 42366, 42341, 42342, 42343, 42344, 42357, 42358, 42359, 42360, 42361, 42362, 42364, 42363, 42312, 42313, 42314, 42315, 42316, 42317, 42318, 42319, 42320, 42321, 42322, 42323, 42324, 42325, 42326, 42327, 42328, 42329, 42345, 42330, 42331, 42332, 42333, 42334, 42335, 42310, 42336, 42346, 42347, 42348, 42349, 42350, 42351, 42352, 42353, 42354, 42355, 42356, 42467, 42534, 42468, 42469, 42470, 42471, 42472, 42473, 42474, 42475, 42476, 42477, 42478, 42479, 42480, 42481, 42404, 42427, 42428, 42429, 42430, 42431, 42432, 42433, 42434, 42435, 42436, 42437, 42438, 42439, 42440, 42441, 42442, 42443, 42444, 42408, 42419, 42405, 42409, 42410, 42411, 42412, 42413, 42445, 42446, 42447, 42448, 42449, 42450, 42421, 42422, 42423, 42424, 42425, 42426, 42414, 42415, 42416, 42417, 42418, 40359, 40360, 40929, 40362, 40363, 40364, 40365, 40087, 40228, 40367, 40902, 40374, 40418, 41429, 41460, 41430, 41431, 41432, 41433, 42194, 42195, 41434, 41435, 41436, 41437, 41438, 41219, 41456, 41439, 41440, 41441, 41442, 41443, 41444, 41445, 41446, 41447, 41448, 41449, 41450, 41451, 43095, 41408, 40248, 40978, 40979, 0};

  public NoLegStreams() {
    super(40241, 40242, ORDER);
  }

  public void set(quickfix.field.LegStreamType value) {
    setField(value);
  }

  public quickfix.field.LegStreamType get(quickfix.field.LegStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamType getLegStreamType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamType());
  }

  public boolean isSet(quickfix.field.LegStreamType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamType() {
    return isSetField(40242);
  }

  public void set(quickfix.field.LegStreamXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamXID get(quickfix.field.LegStreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamXID getLegStreamXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamXID());
  }

  public boolean isSet(quickfix.field.LegStreamXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamXID() {
    return isSetField(41700);
  }

  public void set(quickfix.field.LegStreamDesc value) {
    setField(value);
  }

  public quickfix.field.LegStreamDesc get(quickfix.field.LegStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamDesc getLegStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.LegStreamDesc());
  }

  public boolean isSet(quickfix.field.LegStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamDesc() {
    return isSetField(40243);
  }

  public void set(quickfix.field.LegStreamVersion value) {
    setField(value);
  }

  public quickfix.field.LegStreamVersion get(quickfix.field.LegStreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamVersion getLegStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.LegStreamVersion());
  }

  public boolean isSet(quickfix.field.LegStreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamVersion() {
    return isSetField(42583);
  }

  public void set(quickfix.field.LegStreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.LegStreamVersionEffectiveDate get(quickfix.field.LegStreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamVersionEffectiveDate getLegStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.LegStreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.LegStreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamVersionEffectiveDate() {
    return isSetField(42584);
  }

  public void set(quickfix.field.LegStreamPaySide value) {
    setField(value);
  }

  public quickfix.field.LegStreamPaySide get(quickfix.field.LegStreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamPaySide getLegStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.LegStreamPaySide());
  }

  public boolean isSet(quickfix.field.LegStreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamPaySide() {
    return isSetField(40244);
  }

  public void set(quickfix.field.LegStreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegStreamReceiveSide get(quickfix.field.LegStreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamReceiveSide getLegStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegStreamReceiveSide());
  }

  public boolean isSet(quickfix.field.LegStreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamReceiveSide() {
    return isSetField(40245);
  }

  public void set(quickfix.field.LegStreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalXIDRef get(quickfix.field.LegStreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalXIDRef getLegStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalXIDRef() {
    return isSetField(41702);
  }

  public void set(quickfix.field.LegStreamNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotional get(quickfix.field.LegStreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotional getLegStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotional());
  }

  public boolean isSet(quickfix.field.LegStreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotional() {
    return isSetField(40246);
  }

  public void set(quickfix.field.LegStreamCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCurrency get(quickfix.field.LegStreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCurrency getLegStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCurrency() {
    return isSetField(40247);
  }

  public void set(quickfix.field.LegStreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalDeterminationMethod get(quickfix.field.LegStreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalDeterminationMethod getLegStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalDeterminationMethod() {
    return isSetField(42585);
  }

  public void set(quickfix.field.LegStreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalAdjustments get(quickfix.field.LegStreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalAdjustments getLegStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalAdjustments() {
    return isSetField(42586);
  }

  public void set(quickfix.field.LegStreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalFrequencyPeriod get(quickfix.field.LegStreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalFrequencyPeriod getLegStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalFrequencyPeriod() {
    return isSetField(41703);
  }

  public void set(quickfix.field.LegStreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalFrequencyUnit get(quickfix.field.LegStreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalFrequencyUnit getLegStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalFrequencyUnit() {
    return isSetField(41704);
  }

  public void set(quickfix.field.LegStreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalCommodityFrequency get(quickfix.field.LegStreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalCommodityFrequency getLegStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalCommodityFrequency() {
    return isSetField(41705);
  }

  public void set(quickfix.field.LegStreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalUnitOfMeasure get(quickfix.field.LegStreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalUnitOfMeasure getLegStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalUnitOfMeasure() {
    return isSetField(41706);
  }

  public void set(quickfix.field.LegStreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamTotalNotional get(quickfix.field.LegStreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTotalNotional getLegStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTotalNotional());
  }

  public boolean isSet(quickfix.field.LegStreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTotalNotional() {
    return isSetField(41707);
  }

  public void set(quickfix.field.LegStreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamTotalNotionalUnitOfMeasure get(quickfix.field.LegStreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTotalNotionalUnitOfMeasure getLegStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTotalNotionalUnitOfMeasure() {
    return isSetField(41708);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommodity get(quickfix.fixlatest.component.LegStreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommodity getLegStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommodity());
  }

  public void set(quickfix.fixlatest.component.LegStreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDate get(quickfix.fixlatest.component.LegStreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDate getLegStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.LegStreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamTerminationDate get(quickfix.fixlatest.component.LegStreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamTerminationDate getLegStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.LegStreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDates get(quickfix.fixlatest.component.LegStreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDates getLegStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStream get(quickfix.fixlatest.component.LegPaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStream getLegPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStream());
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleGrp get(quickfix.fixlatest.component.LegPaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleGrp getLegPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleGrp());
  }

  public void set(quickfix.field.NoLegPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentSchedules get(quickfix.field.NoLegPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentSchedules getNoLegPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoLegPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentSchedules() {
    return isSetField(40374);
  }

public static class NoLegPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40375, 41533, 41534, 40376, 40377, 40378, 40379, 40380, 40381, 40382, 40383, 40384, 40385, 41535, 41536, 41537, 41538, 40386, 40387, 40388, 40389, 41539, 41540, 41541, 41542, 40390, 40391, 40392, 40393, 40394, 40395, 40414, 40396, 40397, 40398, 40399, 40927, 40401, 40402, 40403, 41543, 41544, 40404, 41530, 41545, 41546, 41547, 41548, 40405, 40406, 40407, 40408, 40928, 40410, 40411, 40412, 40413, 0};

  public NoLegPaymentSchedules() {
    super(40374, 40375, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleType get(quickfix.field.LegPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleType getLegPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleType() {
    return isSetField(40375);
  }

  public void set(quickfix.field.LegPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXID get(quickfix.field.LegPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXID getLegPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXID() {
    return isSetField(41533);
  }

  public void set(quickfix.field.LegPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXIDRef get(quickfix.field.LegPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXIDRef getLegPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXIDRef() {
    return isSetField(41534);
  }

  public void set(quickfix.field.LegPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStubType get(quickfix.field.LegPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStubType getLegPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStubType() {
    return isSetField(40376);
  }

  public void set(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted get(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted getLegPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStartDateUnadjusted() {
    return isSetField(40377);
  }

  public void set(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted get(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted getLegPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleEndDateUnadjusted() {
    return isSetField(40378);
  }

  public void set(quickfix.field.LegPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentSchedulePaySide get(quickfix.field.LegPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentSchedulePaySide getLegPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.LegPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentSchedulePaySide() {
    return isSetField(40379);
  }

  public void set(quickfix.field.LegPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReceiveSide get(quickfix.field.LegPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReceiveSide getLegPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReceiveSide() {
    return isSetField(40380);
  }

  public void set(quickfix.field.LegPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleNotional get(quickfix.field.LegPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleNotional getLegPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleNotional() {
    return isSetField(40381);
  }

  public void set(quickfix.field.LegPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleCurrency get(quickfix.field.LegPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleCurrency getLegPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleCurrency() {
    return isSetField(40382);
  }

  public void set(quickfix.field.LegPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRate get(quickfix.field.LegPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRate getLegPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRate() {
    return isSetField(40383);
  }

  public void set(quickfix.field.LegPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier get(quickfix.field.LegPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier getLegPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateMultiplier() {
    return isSetField(40384);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpread get(quickfix.field.LegPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpread getLegPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpread() {
    return isSetField(40385);
  }

  public void set(quickfix.field.LegPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateCurrency get(quickfix.field.LegPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateCurrency getLegPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateCurrency() {
    return isSetField(41535);
  }

  public void set(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure get(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure getLegPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41536);
  }

  public void set(quickfix.field.LegPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor get(quickfix.field.LegPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor getLegPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateConversionFactor() {
    return isSetField(41537);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType get(quickfix.field.LegPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType getLegPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadType() {
    return isSetField(41538);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType get(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType getLegPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadPositionType() {
    return isSetField(40386);
  }

  public void set(quickfix.field.LegPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateTreatment get(quickfix.field.LegPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateTreatment getLegPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateTreatment() {
    return isSetField(40387);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedAmount get(quickfix.field.LegPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedAmount getLegPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedAmount() {
    return isSetField(40388);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency get(quickfix.field.LegPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency getLegPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedCurrency() {
    return isSetField(40389);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice get(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice getLegPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPrice() {
    return isSetField(41539);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency getLegPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41540);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure getLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41541);
  }

  public void set(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure get(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure getLegPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41542);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod get(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod getLegPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40390);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit get(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit getLegPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyUnit() {
    return isSetField(40391);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue get(quickfix.field.LegPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue getLegPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetValue() {
    return isSetField(40392);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRate get(quickfix.field.LegPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRate getLegPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRate() {
    return isSetField(40393);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate get(quickfix.field.LegPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate getLegPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetRate() {
    return isSetField(40394);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo get(quickfix.field.LegPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo getLegPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRelativeTo() {
    return isSetField(40395);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp getLegPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleRateSources get(quickfix.field.NoLegPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleRateSources getNoLegPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleRateSources() {
    return isSetField(40414);
  }

public static class NoLegPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40415, 40416, 40417, 0};

  public NoLegPaymentScheduleRateSources() {
    super(40414, 40415, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted get(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted getLegPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40396);
  }

  public void set(quickfix.field.LegPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleWeight get(quickfix.field.LegPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleWeight getLegPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleWeight() {
    return isSetField(40397);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo get(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo getLegPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40398);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention getLegPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40399);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp getLegPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters getNoLegPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40927);
  }

public static class NoLegPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40400, 0};

  public NoLegPaymentScheduleFixingDateBusinessCenters() {
    super(40927, 40400, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod getLegPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40401);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit getLegPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40402);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType get(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType getLegPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40403);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution get(quickfix.field.LegPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution getLegPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayDistribution() {
    return isSetField(41543);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount get(quickfix.field.LegPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount getLegPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayCount() {
    return isSetField(41544);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted get(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted getLegPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateAdjusted() {
    return isSetField(40404);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp getLegPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays get(quickfix.field.NoLegPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays getNoLegPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDays() {
    return isSetField(41530);
  }

public static class NoLegPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41531, 41532, 0};

  public NoLegPaymentScheduleFixingDays() {
    super(41530, 41531, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod get(quickfix.field.LegPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod getLegPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagPeriod() {
    return isSetField(41545);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit get(quickfix.field.LegPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit getLegPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagUnit() {
    return isSetField(41546);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod getLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41547);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit getLegPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41548);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTime get(quickfix.field.LegPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTime getLegPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTime() {
    return isSetField(40405);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter getLegPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40406);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo getLegPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40407);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention getLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40408);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp getLegPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp());
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

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod getLegPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40410);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit getLegPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40411);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType getLegPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40412);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted getLegPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40413);
  }
}

  public void set(quickfix.fixlatest.component.LegPaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubGrp get(quickfix.fixlatest.component.LegPaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubGrp getLegPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubGrp());
  }

  public void set(quickfix.field.NoLegPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStubs get(quickfix.field.NoLegPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStubs getNoLegPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStubs() {
    return isSetField(40418);
  }

public static class NoLegPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40419, 40420, 42497, 42498, 42504, 42499, 42500, 42501, 42502, 42503, 42488, 42489, 42495, 42490, 42491, 42492, 42493, 42494, 40421, 40422, 40423, 40424, 40425, 40426, 40427, 40428, 40429, 40430, 40431, 40432, 40433, 40434, 40435, 40436, 40437, 40438, 40439, 40440, 40441, 40442, 40443, 40444, 40445, 40446, 40447, 0};

  public NoLegPaymentStubs() {
    super(40418, 40419, ORDER);
  }

  public void set(quickfix.field.LegPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubType get(quickfix.field.LegPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubType getLegPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubType() {
    return isSetField(40419);
  }

  public void set(quickfix.field.LegPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubLength get(quickfix.field.LegPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubLength getLegPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubLength() {
    return isSetField(40420);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate get(quickfix.fixlatest.component.LegPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate getLegPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate get(quickfix.fixlatest.component.LegPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate getLegPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubEndDate());
  }

  public void set(quickfix.field.LegPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubRate get(quickfix.field.LegPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubRate getLegPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubRate() {
    return isSetField(40421);
  }

  public void set(quickfix.field.LegPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedAmount get(quickfix.field.LegPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedAmount getLegPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedAmount() {
    return isSetField(40422);
  }

  public void set(quickfix.field.LegPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedCurrency get(quickfix.field.LegPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedCurrency getLegPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedCurrency() {
    return isSetField(40423);
  }

  public void set(quickfix.field.LegPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex get(quickfix.field.LegPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex getLegPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex() {
    return isSetField(40424);
  }

  public void set(quickfix.field.LegPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexSource get(quickfix.field.LegPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexSource getLegPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexSource() {
    return isSetField(40425);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod get(quickfix.field.LegPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod getLegPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurvePeriod() {
    return isSetField(40426);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit get(quickfix.field.LegPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit getLegPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurveUnit() {
    return isSetField(40427);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier get(quickfix.field.LegPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier getLegPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateMultiplier() {
    return isSetField(40428);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpread get(quickfix.field.LegPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpread getLegPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpread() {
    return isSetField(40429);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType get(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType getLegPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40430);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment get(quickfix.field.LegPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment getLegPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateTreatment() {
    return isSetField(40431);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRate get(quickfix.field.LegPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRate getLegPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRate() {
    return isSetField(40432);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide get(quickfix.field.LegPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide getLegPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateBuySide() {
    return isSetField(40433);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide get(quickfix.field.LegPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide getLegPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateSellSide() {
    return isSetField(40434);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRate get(quickfix.field.LegPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRate getLegPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRate() {
    return isSetField(40435);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide get(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide getLegPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateBuySide() {
    return isSetField(40436);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide get(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide getLegPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateSellSide() {
    return isSetField(40437);
  }

  public void set(quickfix.field.LegPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2 get(quickfix.field.LegPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2 getLegPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2() {
    return isSetField(40438);
  }

  public void set(quickfix.field.LegPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2Source get(quickfix.field.LegPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2Source getLegPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2Source() {
    return isSetField(40439);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod get(quickfix.field.LegPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod getLegPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurvePeriod() {
    return isSetField(40440);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit get(quickfix.field.LegPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit getLegPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurveUnit() {
    return isSetField(40441);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier get(quickfix.field.LegPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier getLegPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateMultiplier() {
    return isSetField(40442);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread get(quickfix.field.LegPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread getLegPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpread() {
    return isSetField(40443);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType get(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType getLegPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40444);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment get(quickfix.field.LegPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment getLegPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateTreatment() {
    return isSetField(40445);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CapRate get(quickfix.field.LegPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CapRate getLegPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CapRate() {
    return isSetField(40446);
  }

  public void set(quickfix.field.LegPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate get(quickfix.field.LegPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate getLegPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2FloorRate() {
    return isSetField(40447);
  }
}

  public void set(quickfix.fixlatest.component.LegDeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryStream get(quickfix.fixlatest.component.LegDeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryStream getLegDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryStream());
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleGrp get(quickfix.fixlatest.component.LegDeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleGrp getLegDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoLegDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliverySchedules get(quickfix.field.NoLegDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliverySchedules getNoLegDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoLegDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliverySchedules() {
    return isSetField(41408);
  }

public static class NoLegDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41409, 41410, 41411, 41412, 41413, 41414, 41415, 41416, 41417, 41418, 41419, 41420, 41421, 41422, 0};

  public NoLegDeliverySchedules() {
    super(41408, 41409, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleType get(quickfix.field.LegDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleType getLegDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleType() {
    return isSetField(41409);
  }

  public void set(quickfix.field.LegDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleXID get(quickfix.field.LegDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleXID getLegDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleXID() {
    return isSetField(41410);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotional get(quickfix.field.LegDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotional getLegDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotional() {
    return isSetField(41411);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure getLegDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41412);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency getLegDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41413);
  }

  public void set(quickfix.field.LegDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance get(quickfix.field.LegDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance getLegDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNegativeTolerance() {
    return isSetField(41414);
  }

  public void set(quickfix.field.LegDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance get(quickfix.field.LegDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance getLegDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliverySchedulePositiveTolerance() {
    return isSetField(41415);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure getLegDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41416);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceType get(quickfix.field.LegDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceType getLegDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceType() {
    return isSetField(41417);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry get(quickfix.field.LegDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry getLegDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlCountry() {
    return isSetField(41418);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone get(quickfix.field.LegDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone getLegDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeZone() {
    return isSetField(41419);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType get(quickfix.field.LegDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType getLegDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlFlowType() {
    return isSetField(41420);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction getLegDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41421);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp getLegDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays get(quickfix.field.NoLegDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays getNoLegDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlDays() {
    return isSetField(41422);
  }

public static class NoLegDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41423, 41424, 41425, 0};

  public NoLegDeliveryScheduleSettlDays() {
    super(41422, 41423, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlDay get(quickfix.field.LegDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlDay getLegDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlDay() {
    return isSetField(41423);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours get(quickfix.field.LegDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours getLegDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTotalHours() {
    return isSetField(41424);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp getLegDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes get(quickfix.field.NoLegDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes getNoLegDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlTimes() {
    return isSetField(41425);
  }

public static class NoLegDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41426, 41427, 41428, 0};

  public NoLegDeliveryScheduleSettlTimes() {
    super(41425, 41426, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlStart get(quickfix.field.LegDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlStart getLegDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlStart() {
    return isSetField(41426);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd get(quickfix.field.LegDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd getLegDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlEnd() {
    return isSetField(41427);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType get(quickfix.field.LegDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType getLegDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeType() {
    return isSetField(41428);
  }
}
}
}

  public void set(quickfix.field.LegStreamText value) {
    setField(value);
  }

  public quickfix.field.LegStreamText get(quickfix.field.LegStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamText getLegStreamText() throws FieldNotFound {
    return get(new quickfix.field.LegStreamText());
  }

  public boolean isSet(quickfix.field.LegStreamText field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamText() {
    return isSetField(40248);
  }

  public void set(quickfix.field.EncodedLegStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamTextLen get(quickfix.field.EncodedLegStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamTextLen getEncodedLegStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamTextLen() {
    return isSetField(40978);
  }

  public void set(quickfix.field.EncodedLegStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamText get(quickfix.field.EncodedLegStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamText getEncodedLegStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamText());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamText() {
    return isSetField(40979);
  }
}

  public void set(quickfix.field.LegStreamType value) {
    setField(value);
  }

  public quickfix.field.LegStreamType get(quickfix.field.LegStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamType getLegStreamType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamType());
  }

  public boolean isSet(quickfix.field.LegStreamType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamType() {
    return isSetField(40242);
  }

  public void set(quickfix.field.LegStreamXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamXID get(quickfix.field.LegStreamXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamXID getLegStreamXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamXID());
  }

  public boolean isSet(quickfix.field.LegStreamXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamXID() {
    return isSetField(41700);
  }

  public void set(quickfix.field.LegStreamDesc value) {
    setField(value);
  }

  public quickfix.field.LegStreamDesc get(quickfix.field.LegStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamDesc getLegStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.LegStreamDesc());
  }

  public boolean isSet(quickfix.field.LegStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamDesc() {
    return isSetField(40243);
  }

  public void set(quickfix.field.LegStreamVersion value) {
    setField(value);
  }

  public quickfix.field.LegStreamVersion get(quickfix.field.LegStreamVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamVersion getLegStreamVersion() throws FieldNotFound {
    return get(new quickfix.field.LegStreamVersion());
  }

  public boolean isSet(quickfix.field.LegStreamVersion field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamVersion() {
    return isSetField(42583);
  }

  public void set(quickfix.field.LegStreamVersionEffectiveDate value) {
    setField(value);
  }

  public quickfix.field.LegStreamVersionEffectiveDate get(quickfix.field.LegStreamVersionEffectiveDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamVersionEffectiveDate getLegStreamVersionEffectiveDate() throws FieldNotFound {
    return get(new quickfix.field.LegStreamVersionEffectiveDate());
  }

  public boolean isSet(quickfix.field.LegStreamVersionEffectiveDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamVersionEffectiveDate() {
    return isSetField(42584);
  }

  public void set(quickfix.field.LegStreamPaySide value) {
    setField(value);
  }

  public quickfix.field.LegStreamPaySide get(quickfix.field.LegStreamPaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamPaySide getLegStreamPaySide() throws FieldNotFound {
    return get(new quickfix.field.LegStreamPaySide());
  }

  public boolean isSet(quickfix.field.LegStreamPaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamPaySide() {
    return isSetField(40244);
  }

  public void set(quickfix.field.LegStreamReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegStreamReceiveSide get(quickfix.field.LegStreamReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamReceiveSide getLegStreamReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegStreamReceiveSide());
  }

  public boolean isSet(quickfix.field.LegStreamReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamReceiveSide() {
    return isSetField(40245);
  }

  public void set(quickfix.field.LegStreamNotionalXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalXIDRef get(quickfix.field.LegStreamNotionalXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalXIDRef getLegStreamNotionalXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalXIDRef() {
    return isSetField(41702);
  }

  public void set(quickfix.field.LegStreamNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotional get(quickfix.field.LegStreamNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotional getLegStreamNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotional());
  }

  public boolean isSet(quickfix.field.LegStreamNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotional() {
    return isSetField(40246);
  }

  public void set(quickfix.field.LegStreamCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCurrency get(quickfix.field.LegStreamCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCurrency getLegStreamCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCurrency() {
    return isSetField(40247);
  }

  public void set(quickfix.field.LegStreamNotionalDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalDeterminationMethod get(quickfix.field.LegStreamNotionalDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalDeterminationMethod getLegStreamNotionalDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalDeterminationMethod() {
    return isSetField(42585);
  }

  public void set(quickfix.field.LegStreamNotionalAdjustments value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalAdjustments get(quickfix.field.LegStreamNotionalAdjustments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalAdjustments getLegStreamNotionalAdjustments() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalAdjustments());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalAdjustments field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalAdjustments() {
    return isSetField(42586);
  }

  public void set(quickfix.field.LegStreamNotionalFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalFrequencyPeriod get(quickfix.field.LegStreamNotionalFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalFrequencyPeriod getLegStreamNotionalFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalFrequencyPeriod() {
    return isSetField(41703);
  }

  public void set(quickfix.field.LegStreamNotionalFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalFrequencyUnit get(quickfix.field.LegStreamNotionalFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalFrequencyUnit getLegStreamNotionalFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalFrequencyUnit() {
    return isSetField(41704);
  }

  public void set(quickfix.field.LegStreamNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalCommodityFrequency get(quickfix.field.LegStreamNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalCommodityFrequency getLegStreamNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalCommodityFrequency() {
    return isSetField(41705);
  }

  public void set(quickfix.field.LegStreamNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamNotionalUnitOfMeasure get(quickfix.field.LegStreamNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamNotionalUnitOfMeasure getLegStreamNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamNotionalUnitOfMeasure() {
    return isSetField(41706);
  }

  public void set(quickfix.field.LegStreamTotalNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamTotalNotional get(quickfix.field.LegStreamTotalNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTotalNotional getLegStreamTotalNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTotalNotional());
  }

  public boolean isSet(quickfix.field.LegStreamTotalNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTotalNotional() {
    return isSetField(41707);
  }

  public void set(quickfix.field.LegStreamTotalNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamTotalNotionalUnitOfMeasure get(quickfix.field.LegStreamTotalNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamTotalNotionalUnitOfMeasure getLegStreamTotalNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamTotalNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamTotalNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamTotalNotionalUnitOfMeasure() {
    return isSetField(41708);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommodity component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommodity get(quickfix.fixlatest.component.LegStreamCommodity component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommodity getLegStreamCommodityComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommodity());
  }

  public void set(quickfix.fixlatest.component.LegStreamEffectiveDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDate get(quickfix.fixlatest.component.LegStreamEffectiveDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamEffectiveDate getLegStreamEffectiveDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamEffectiveDate());
  }

  public void set(quickfix.fixlatest.component.LegStreamTerminationDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamTerminationDate get(quickfix.fixlatest.component.LegStreamTerminationDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamTerminationDate getLegStreamTerminationDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamTerminationDate());
  }

  public void set(quickfix.fixlatest.component.LegStreamCalculationPeriodDates component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDates get(quickfix.fixlatest.component.LegStreamCalculationPeriodDates component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCalculationPeriodDates getLegStreamCalculationPeriodDatesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCalculationPeriodDates());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStream get(quickfix.fixlatest.component.LegPaymentStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStream getLegPaymentStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStream());
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleGrp get(quickfix.fixlatest.component.LegPaymentScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleGrp getLegPaymentScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleGrp());
  }

  public void set(quickfix.field.NoLegPaymentSchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentSchedules get(quickfix.field.NoLegPaymentSchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentSchedules getNoLegPaymentSchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentSchedules());
  }

  public boolean isSet(quickfix.field.NoLegPaymentSchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentSchedules() {
    return isSetField(40374);
  }

public static class NoLegPaymentSchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40375, 41533, 41534, 40376, 40377, 40378, 40379, 40380, 40381, 40382, 40383, 40384, 40385, 41535, 41536, 41537, 41538, 40386, 40387, 40388, 40389, 41539, 41540, 41541, 41542, 40390, 40391, 40392, 40393, 40394, 40395, 40414, 40396, 40397, 40398, 40399, 40927, 40401, 40402, 40403, 41543, 41544, 40404, 41530, 41545, 41546, 41547, 41548, 40405, 40406, 40407, 40408, 40928, 40410, 40411, 40412, 40413, 0};

  public NoLegPaymentSchedules() {
    super(40374, 40375, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleType get(quickfix.field.LegPaymentScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleType getLegPaymentScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleType() {
    return isSetField(40375);
  }

  public void set(quickfix.field.LegPaymentScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXID get(quickfix.field.LegPaymentScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXID getLegPaymentScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXID());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXID() {
    return isSetField(41533);
  }

  public void set(quickfix.field.LegPaymentScheduleXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleXIDRef get(quickfix.field.LegPaymentScheduleXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleXIDRef getLegPaymentScheduleXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleXIDRef());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleXIDRef() {
    return isSetField(41534);
  }

  public void set(quickfix.field.LegPaymentScheduleStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStubType get(quickfix.field.LegPaymentScheduleStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStubType getLegPaymentScheduleStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStubType() {
    return isSetField(40376);
  }

  public void set(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted get(quickfix.field.LegPaymentScheduleStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStartDateUnadjusted getLegPaymentScheduleStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStartDateUnadjusted() {
    return isSetField(40377);
  }

  public void set(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted get(quickfix.field.LegPaymentScheduleEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleEndDateUnadjusted getLegPaymentScheduleEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleEndDateUnadjusted() {
    return isSetField(40378);
  }

  public void set(quickfix.field.LegPaymentSchedulePaySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentSchedulePaySide get(quickfix.field.LegPaymentSchedulePaySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentSchedulePaySide getLegPaymentSchedulePaySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentSchedulePaySide());
  }

  public boolean isSet(quickfix.field.LegPaymentSchedulePaySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentSchedulePaySide() {
    return isSetField(40379);
  }

  public void set(quickfix.field.LegPaymentScheduleReceiveSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReceiveSide get(quickfix.field.LegPaymentScheduleReceiveSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReceiveSide getLegPaymentScheduleReceiveSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReceiveSide());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReceiveSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReceiveSide() {
    return isSetField(40380);
  }

  public void set(quickfix.field.LegPaymentScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleNotional get(quickfix.field.LegPaymentScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleNotional getLegPaymentScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleNotional() {
    return isSetField(40381);
  }

  public void set(quickfix.field.LegPaymentScheduleCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleCurrency get(quickfix.field.LegPaymentScheduleCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleCurrency getLegPaymentScheduleCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleCurrency() {
    return isSetField(40382);
  }

  public void set(quickfix.field.LegPaymentScheduleRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRate get(quickfix.field.LegPaymentScheduleRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRate getLegPaymentScheduleRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRate() {
    return isSetField(40383);
  }

  public void set(quickfix.field.LegPaymentScheduleRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier get(quickfix.field.LegPaymentScheduleRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateMultiplier getLegPaymentScheduleRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateMultiplier() {
    return isSetField(40384);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpread get(quickfix.field.LegPaymentScheduleRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpread getLegPaymentScheduleRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpread() {
    return isSetField(40385);
  }

  public void set(quickfix.field.LegPaymentScheduleRateCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateCurrency get(quickfix.field.LegPaymentScheduleRateCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateCurrency getLegPaymentScheduleRateCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateCurrency() {
    return isSetField(41535);
  }

  public void set(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure get(quickfix.field.LegPaymentScheduleRateUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateUnitOfMeasure getLegPaymentScheduleRateUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateUnitOfMeasure() {
    return isSetField(41536);
  }

  public void set(quickfix.field.LegPaymentScheduleRateConversionFactor value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor get(quickfix.field.LegPaymentScheduleRateConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateConversionFactor getLegPaymentScheduleRateConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateConversionFactor());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateConversionFactor() {
    return isSetField(41537);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType get(quickfix.field.LegPaymentScheduleRateSpreadType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadType getLegPaymentScheduleRateSpreadType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadType() {
    return isSetField(41538);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType get(quickfix.field.LegPaymentScheduleRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSpreadPositionType getLegPaymentScheduleRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSpreadPositionType() {
    return isSetField(40386);
  }

  public void set(quickfix.field.LegPaymentScheduleRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateTreatment get(quickfix.field.LegPaymentScheduleRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateTreatment getLegPaymentScheduleRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateTreatment() {
    return isSetField(40387);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedAmount get(quickfix.field.LegPaymentScheduleFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedAmount getLegPaymentScheduleFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedAmount() {
    return isSetField(40388);
  }

  public void set(quickfix.field.LegPaymentScheduleFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency get(quickfix.field.LegPaymentScheduleFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixedCurrency getLegPaymentScheduleFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixedCurrency() {
    return isSetField(40389);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice get(quickfix.field.LegPaymentScheduleSettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPrice getLegPaymentScheduleSettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPrice() {
    return isSetField(41539);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency get(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency getLegPaymentScheduleSettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceCurrency() {
    return isSetField(41540);
  }

  public void set(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure get(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure getLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleSettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleSettlPeriodPriceUnitOfMeasure() {
    return isSetField(41541);
  }

  public void set(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure get(quickfix.field.LegPaymentScheduleStepUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepUnitOfMeasure getLegPaymentScheduleStepUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepUnitOfMeasure() {
    return isSetField(41542);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod get(quickfix.field.LegPaymentScheduleStepFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyPeriod getLegPaymentScheduleStepFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyPeriod() {
    return isSetField(40390);
  }

  public void set(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit get(quickfix.field.LegPaymentScheduleStepFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepFrequencyUnit getLegPaymentScheduleStepFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepFrequencyUnit() {
    return isSetField(40391);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetValue value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue get(quickfix.field.LegPaymentScheduleStepOffsetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetValue getLegPaymentScheduleStepOffsetValue() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetValue());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetValue() {
    return isSetField(40392);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRate get(quickfix.field.LegPaymentScheduleStepRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRate getLegPaymentScheduleStepRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRate() {
    return isSetField(40393);
  }

  public void set(quickfix.field.LegPaymentScheduleStepOffsetRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate get(quickfix.field.LegPaymentScheduleStepOffsetRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepOffsetRate getLegPaymentScheduleStepOffsetRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepOffsetRate());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepOffsetRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepOffsetRate() {
    return isSetField(40394);
  }

  public void set(quickfix.field.LegPaymentScheduleStepRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo get(quickfix.field.LegPaymentScheduleStepRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleStepRelativeTo getLegPaymentScheduleStepRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleStepRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleStepRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleStepRelativeTo() {
    return isSetField(40395);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp get(quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp getLegPaymentScheduleRateSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleRateSourceGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleRateSources value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleRateSources get(quickfix.field.NoLegPaymentScheduleRateSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleRateSources getNoLegPaymentScheduleRateSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleRateSources());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleRateSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleRateSources() {
    return isSetField(40414);
  }

public static class NoLegPaymentScheduleRateSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40415, 40416, 40417, 0};

  public NoLegPaymentScheduleRateSources() {
    super(40414, 40415, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSource get(quickfix.field.LegPaymentScheduleRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSource getLegPaymentScheduleRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSource() {
    return isSetField(40415);
  }

  public void set(quickfix.field.LegPaymentScheduleRateSourceType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleRateSourceType get(quickfix.field.LegPaymentScheduleRateSourceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleRateSourceType getLegPaymentScheduleRateSourceType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleRateSourceType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleRateSourceType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleRateSourceType() {
    return isSetField(40416);
  }

  public void set(quickfix.field.LegPaymentScheduleReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleReferencePage get(quickfix.field.LegPaymentScheduleReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleReferencePage getLegPaymentScheduleReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleReferencePage() {
    return isSetField(40417);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted get(quickfix.field.LegPaymentScheduleFixingDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateUnadjusted getLegPaymentScheduleFixingDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateUnadjusted() {
    return isSetField(40396);
  }

  public void set(quickfix.field.LegPaymentScheduleWeight value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleWeight get(quickfix.field.LegPaymentScheduleWeight value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleWeight getLegPaymentScheduleWeight() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleWeight());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleWeight field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleWeight() {
    return isSetField(40397);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo get(quickfix.field.LegPaymentScheduleFixingDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateRelativeTo getLegPaymentScheduleFixingDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateRelativeTo() {
    return isSetField(40398);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention get(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention getLegPaymentScheduleFixingDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessDayConvention() {
    return isSetField(40399);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp getLegPaymentScheduleFixingDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters get(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters getNoLegPaymentScheduleFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDateBusinessCenters() {
    return isSetField(40927);
  }

public static class NoLegPaymentScheduleFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40400, 0};

  public NoLegPaymentScheduleFixingDateBusinessCenters() {
    super(40927, 40400, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter get(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateBusinessCenter getLegPaymentScheduleFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateBusinessCenter() {
    return isSetField(40400);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod getLegPaymentScheduleFixingDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetPeriod() {
    return isSetField(40401);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetUnit getLegPaymentScheduleFixingDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetUnit() {
    return isSetField(40402);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType get(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateOffsetDayType getLegPaymentScheduleFixingDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateOffsetDayType() {
    return isSetField(40403);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayDistribution value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution get(quickfix.field.LegPaymentScheduleFixingDayDistribution value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayDistribution getLegPaymentScheduleFixingDayDistribution() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayDistribution());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayDistribution field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayDistribution() {
    return isSetField(41543);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayCount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount get(quickfix.field.LegPaymentScheduleFixingDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayCount getLegPaymentScheduleFixingDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayCount());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayCount() {
    return isSetField(41544);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted get(quickfix.field.LegPaymentScheduleFixingDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDateAdjusted getLegPaymentScheduleFixingDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDateAdjusted() {
    return isSetField(40404);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp get(quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp getLegPaymentScheduleFixingDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleFixingDayGrp());
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays get(quickfix.field.NoLegPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays getNoLegPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDays() {
    return isSetField(41530);
  }

public static class NoLegPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41531, 41532, 0};

  public NoLegPaymentScheduleFixingDays() {
    super(41530, 41531, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingLagPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod get(quickfix.field.LegPaymentScheduleFixingLagPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagPeriod getLegPaymentScheduleFixingLagPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagPeriod() {
    return isSetField(41545);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingLagUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit get(quickfix.field.LegPaymentScheduleFixingLagUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingLagUnit getLegPaymentScheduleFixingLagUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingLagUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingLagUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingLagUnit() {
    return isSetField(41546);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod getLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetPeriod() {
    return isSetField(41547);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit get(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit getLegPaymentScheduleFixingFirstObservationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingFirstObservationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingFirstObservationDateOffsetUnit() {
    return isSetField(41548);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTime value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTime get(quickfix.field.LegPaymentScheduleFixingTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTime getLegPaymentScheduleFixingTime() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTime());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTime field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTime() {
    return isSetField(40405);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter get(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter getLegPaymentScheduleFixingTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingTimeBusinessCenter() {
    return isSetField(40406);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo get(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo getLegPaymentScheduleInterimExchangePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangePaymentDateRelativeTo() {
    return isSetField(40407);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention get(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention getLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesBusinessDayConvention() {
    return isSetField(40408);
  }

  public void set(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp get(quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp getLegPaymentScheduleInterimExchangeDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentScheduleInterimExchangeDateBusinessCenterGrp());
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

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod getLegPaymentScheduleInterimExchangeDatesOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetPeriod() {
    return isSetField(40410);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit getLegPaymentScheduleInterimExchangeDatesOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetUnit() {
    return isSetField(40411);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType get(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType getLegPaymentScheduleInterimExchangeDatesOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDatesOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDatesOffsetDayType() {
    return isSetField(40412);
  }

  public void set(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted get(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted getLegPaymentScheduleInterimExchangeDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleInterimExchangeDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleInterimExchangeDateAdjusted() {
    return isSetField(40413);
  }
}

  public void set(quickfix.fixlatest.component.LegPaymentStubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubGrp get(quickfix.fixlatest.component.LegPaymentStubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubGrp getLegPaymentStubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubGrp());
  }

  public void set(quickfix.field.NoLegPaymentStubs value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStubs get(quickfix.field.NoLegPaymentStubs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStubs getNoLegPaymentStubs() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStubs());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStubs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStubs() {
    return isSetField(40418);
  }

public static class NoLegPaymentStubs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40419, 40420, 42497, 42498, 42504, 42499, 42500, 42501, 42502, 42503, 42488, 42489, 42495, 42490, 42491, 42492, 42493, 42494, 40421, 40422, 40423, 40424, 40425, 40426, 40427, 40428, 40429, 40430, 40431, 40432, 40433, 40434, 40435, 40436, 40437, 40438, 40439, 40440, 40441, 40442, 40443, 40444, 40445, 40446, 40447, 0};

  public NoLegPaymentStubs() {
    super(40418, 40419, ORDER);
  }

  public void set(quickfix.field.LegPaymentStubType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubType get(quickfix.field.LegPaymentStubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubType getLegPaymentStubType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubType() {
    return isSetField(40419);
  }

  public void set(quickfix.field.LegPaymentStubLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubLength get(quickfix.field.LegPaymentStubLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubLength getLegPaymentStubLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStubLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubLength() {
    return isSetField(40420);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubStartDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate get(quickfix.fixlatest.component.LegPaymentStubStartDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubStartDate getLegPaymentStubStartDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubStartDate());
  }

  public void set(quickfix.fixlatest.component.LegPaymentStubEndDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate get(quickfix.fixlatest.component.LegPaymentStubEndDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStubEndDate getLegPaymentStubEndDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStubEndDate());
  }

  public void set(quickfix.field.LegPaymentStubRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubRate get(quickfix.field.LegPaymentStubRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubRate getLegPaymentStubRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubRate() {
    return isSetField(40421);
  }

  public void set(quickfix.field.LegPaymentStubFixedAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedAmount get(quickfix.field.LegPaymentStubFixedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedAmount getLegPaymentStubFixedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedAmount() {
    return isSetField(40422);
  }

  public void set(quickfix.field.LegPaymentStubFixedCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubFixedCurrency get(quickfix.field.LegPaymentStubFixedCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubFixedCurrency getLegPaymentStubFixedCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubFixedCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStubFixedCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubFixedCurrency() {
    return isSetField(40423);
  }

  public void set(quickfix.field.LegPaymentStubIndex value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex get(quickfix.field.LegPaymentStubIndex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex getLegPaymentStubIndex() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex() {
    return isSetField(40424);
  }

  public void set(quickfix.field.LegPaymentStubIndexSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexSource get(quickfix.field.LegPaymentStubIndexSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexSource getLegPaymentStubIndexSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexSource());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexSource() {
    return isSetField(40425);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod get(quickfix.field.LegPaymentStubIndexCurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurvePeriod getLegPaymentStubIndexCurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurvePeriod() {
    return isSetField(40426);
  }

  public void set(quickfix.field.LegPaymentStubIndexCurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit get(quickfix.field.LegPaymentStubIndexCurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCurveUnit getLegPaymentStubIndexCurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCurveUnit() {
    return isSetField(40427);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier get(quickfix.field.LegPaymentStubIndexRateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateMultiplier getLegPaymentStubIndexRateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateMultiplier() {
    return isSetField(40428);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpread get(quickfix.field.LegPaymentStubIndexRateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpread getLegPaymentStubIndexRateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpread() {
    return isSetField(40429);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType get(quickfix.field.LegPaymentStubIndexRateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateSpreadPositionType getLegPaymentStubIndexRateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateSpreadPositionType() {
    return isSetField(40430);
  }

  public void set(quickfix.field.LegPaymentStubIndexRateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment get(quickfix.field.LegPaymentStubIndexRateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexRateTreatment getLegPaymentStubIndexRateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexRateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexRateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexRateTreatment() {
    return isSetField(40431);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRate get(quickfix.field.LegPaymentStubIndexCapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRate getLegPaymentStubIndexCapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRate() {
    return isSetField(40432);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide get(quickfix.field.LegPaymentStubIndexCapRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateBuySide getLegPaymentStubIndexCapRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateBuySide() {
    return isSetField(40433);
  }

  public void set(quickfix.field.LegPaymentStubIndexCapRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide get(quickfix.field.LegPaymentStubIndexCapRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexCapRateSellSide getLegPaymentStubIndexCapRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexCapRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexCapRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexCapRateSellSide() {
    return isSetField(40434);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRate get(quickfix.field.LegPaymentStubIndexFloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRate getLegPaymentStubIndexFloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRate() {
    return isSetField(40435);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide get(quickfix.field.LegPaymentStubIndexFloorRateBuySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateBuySide getLegPaymentStubIndexFloorRateBuySide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateBuySide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateBuySide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateBuySide() {
    return isSetField(40436);
  }

  public void set(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide get(quickfix.field.LegPaymentStubIndexFloorRateSellSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndexFloorRateSellSide getLegPaymentStubIndexFloorRateSellSide() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndexFloorRateSellSide());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndexFloorRateSellSide field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndexFloorRateSellSide() {
    return isSetField(40437);
  }

  public void set(quickfix.field.LegPaymentStubIndex2 value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2 get(quickfix.field.LegPaymentStubIndex2 value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2 getLegPaymentStubIndex2() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2 field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2() {
    return isSetField(40438);
  }

  public void set(quickfix.field.LegPaymentStubIndex2Source value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2Source get(quickfix.field.LegPaymentStubIndex2Source value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2Source getLegPaymentStubIndex2Source() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2Source());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2Source field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2Source() {
    return isSetField(40439);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurvePeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod get(quickfix.field.LegPaymentStubIndex2CurvePeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurvePeriod getLegPaymentStubIndex2CurvePeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurvePeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurvePeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurvePeriod() {
    return isSetField(40440);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CurveUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit get(quickfix.field.LegPaymentStubIndex2CurveUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CurveUnit getLegPaymentStubIndex2CurveUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CurveUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CurveUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CurveUnit() {
    return isSetField(40441);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateMultiplier value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier get(quickfix.field.LegPaymentStubIndex2RateMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateMultiplier getLegPaymentStubIndex2RateMultiplier() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateMultiplier());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateMultiplier() {
    return isSetField(40442);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpread value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread get(quickfix.field.LegPaymentStubIndex2RateSpread value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpread getLegPaymentStubIndex2RateSpread() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpread());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpread field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpread() {
    return isSetField(40443);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType get(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateSpreadPositionType getLegPaymentStubIndex2RateSpreadPositionType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateSpreadPositionType());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateSpreadPositionType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateSpreadPositionType() {
    return isSetField(40444);
  }

  public void set(quickfix.field.LegPaymentStubIndex2RateTreatment value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment get(quickfix.field.LegPaymentStubIndex2RateTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2RateTreatment getLegPaymentStubIndex2RateTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2RateTreatment());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2RateTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2RateTreatment() {
    return isSetField(40445);
  }

  public void set(quickfix.field.LegPaymentStubIndex2CapRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2CapRate get(quickfix.field.LegPaymentStubIndex2CapRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2CapRate getLegPaymentStubIndex2CapRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2CapRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2CapRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2CapRate() {
    return isSetField(40446);
  }

  public void set(quickfix.field.LegPaymentStubIndex2FloorRate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate get(quickfix.field.LegPaymentStubIndex2FloorRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStubIndex2FloorRate getLegPaymentStubIndex2FloorRate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStubIndex2FloorRate());
  }

  public boolean isSet(quickfix.field.LegPaymentStubIndex2FloorRate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStubIndex2FloorRate() {
    return isSetField(40447);
  }
}

  public void set(quickfix.fixlatest.component.LegDeliveryStream component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryStream get(quickfix.fixlatest.component.LegDeliveryStream component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryStream getLegDeliveryStreamComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryStream());
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleGrp get(quickfix.fixlatest.component.LegDeliveryScheduleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleGrp getLegDeliveryScheduleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleGrp());
  }

  public void set(quickfix.field.NoLegDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliverySchedules get(quickfix.field.NoLegDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliverySchedules getNoLegDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoLegDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliverySchedules() {
    return isSetField(41408);
  }

public static class NoLegDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41409, 41410, 41411, 41412, 41413, 41414, 41415, 41416, 41417, 41418, 41419, 41420, 41421, 41422, 0};

  public NoLegDeliverySchedules() {
    super(41408, 41409, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleType get(quickfix.field.LegDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleType getLegDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleType() {
    return isSetField(41409);
  }

  public void set(quickfix.field.LegDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleXID get(quickfix.field.LegDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleXID getLegDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleXID() {
    return isSetField(41410);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotional get(quickfix.field.LegDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotional getLegDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotional() {
    return isSetField(41411);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure getLegDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41412);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency getLegDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41413);
  }

  public void set(quickfix.field.LegDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance get(quickfix.field.LegDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance getLegDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNegativeTolerance() {
    return isSetField(41414);
  }

  public void set(quickfix.field.LegDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance get(quickfix.field.LegDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance getLegDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliverySchedulePositiveTolerance() {
    return isSetField(41415);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure getLegDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41416);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceType get(quickfix.field.LegDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceType getLegDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceType() {
    return isSetField(41417);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry get(quickfix.field.LegDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry getLegDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlCountry() {
    return isSetField(41418);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone get(quickfix.field.LegDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone getLegDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeZone() {
    return isSetField(41419);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType get(quickfix.field.LegDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType getLegDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlFlowType() {
    return isSetField(41420);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction getLegDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41421);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp getLegDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays get(quickfix.field.NoLegDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays getNoLegDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlDays() {
    return isSetField(41422);
  }

public static class NoLegDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41423, 41424, 41425, 0};

  public NoLegDeliveryScheduleSettlDays() {
    super(41422, 41423, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlDay get(quickfix.field.LegDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlDay getLegDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlDay() {
    return isSetField(41423);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours get(quickfix.field.LegDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours getLegDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTotalHours() {
    return isSetField(41424);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp getLegDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp());
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes get(quickfix.field.NoLegDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes getNoLegDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlTimes() {
    return isSetField(41425);
  }

public static class NoLegDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41426, 41427, 41428, 0};

  public NoLegDeliveryScheduleSettlTimes() {
    super(41425, 41426, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlStart get(quickfix.field.LegDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlStart getLegDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlStart() {
    return isSetField(41426);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd get(quickfix.field.LegDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd getLegDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlEnd() {
    return isSetField(41427);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType get(quickfix.field.LegDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType getLegDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeType() {
    return isSetField(41428);
  }
}
}
}

  public void set(quickfix.field.LegStreamText value) {
    setField(value);
  }

  public quickfix.field.LegStreamText get(quickfix.field.LegStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamText getLegStreamText() throws FieldNotFound {
    return get(new quickfix.field.LegStreamText());
  }

  public boolean isSet(quickfix.field.LegStreamText field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamText() {
    return isSetField(40248);
  }

  public void set(quickfix.field.EncodedLegStreamTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamTextLen get(quickfix.field.EncodedLegStreamTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamTextLen getEncodedLegStreamTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamTextLen() {
    return isSetField(40978);
  }

  public void set(quickfix.field.EncodedLegStreamText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamText get(quickfix.field.EncodedLegStreamText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamText getEncodedLegStreamText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamText());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamText() {
    return isSetField(40979);
  }
}
