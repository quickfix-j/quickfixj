
package quickfix.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlementInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "T";
	

	public SettlementInstructions() {
		
		super(new int[] {777, 791, 160, 792, 58, 354, 355, 11, 60, 778,  0 });
		
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public SettlementInstructions(quickfix.field.SettlInstMsgID settlInstMsgID, quickfix.field.SettlInstMode settlInstMode, quickfix.field.TransactTime transactTime) {
		this();
		setField(settlInstMsgID);
		setField(settlInstMode);
		setField(transactTime);
	}
	
	public void set(quickfix.field.SettlInstMsgID value) {
		setField(value);
	}

	public quickfix.field.SettlInstMsgID get(quickfix.field.SettlInstMsgID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstMsgID getSettlInstMsgID() throws FieldNotFound {
		return get(new quickfix.field.SettlInstMsgID());
	}

	public boolean isSet(quickfix.field.SettlInstMsgID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMsgID() {
		return isSetField(777);
	}

	public void set(quickfix.field.SettlInstReqID value) {
		setField(value);
	}

	public quickfix.field.SettlInstReqID get(quickfix.field.SettlInstReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstReqID getSettlInstReqID() throws FieldNotFound {
		return get(new quickfix.field.SettlInstReqID());
	}

	public boolean isSet(quickfix.field.SettlInstReqID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstReqID() {
		return isSetField(791);
	}

	public void set(quickfix.field.SettlInstMode value) {
		setField(value);
	}

	public quickfix.field.SettlInstMode get(quickfix.field.SettlInstMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstMode getSettlInstMode() throws FieldNotFound {
		return get(new quickfix.field.SettlInstMode());
	}

	public boolean isSet(quickfix.field.SettlInstMode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMode() {
		return isSetField(160);
	}

	public void set(quickfix.field.SettlInstReqRejCode value) {
		setField(value);
	}

	public quickfix.field.SettlInstReqRejCode get(quickfix.field.SettlInstReqRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstReqRejCode getSettlInstReqRejCode() throws FieldNotFound {
		return get(new quickfix.field.SettlInstReqRejCode());
	}

	public boolean isSet(quickfix.field.SettlInstReqRejCode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstReqRejCode() {
		return isSetField(792);
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

	public void set(quickfix.field.TransactTime value) {
		setField(value);
	}

	public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.field.TransactTime());
	}

	public boolean isSet(quickfix.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.field.NoSettlInst value) {
		setField(value);
	}

	public quickfix.field.NoSettlInst get(quickfix.field.NoSettlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlInst getNoSettlInst() throws FieldNotFound {
		return get(new quickfix.field.NoSettlInst());
	}

	public boolean isSet(quickfix.field.NoSettlInst field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlInst() {
		return isSetField(778);
	}

	public static class NoSettlInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {162, 163, 214, 453, 54, 460, 167, 461, 168, 126, 779, 172, 169, 170, 171, 85, 492, 476, 488, 489, 503, 490, 491, 504, 505, 0};

		public NoSettlInst() {
			super(778, 162, ORDER);
		}
		
	public void set(quickfix.field.SettlInstID value) {
		setField(value);
	}

	public quickfix.field.SettlInstID get(quickfix.field.SettlInstID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstID getSettlInstID() throws FieldNotFound {
		return get(new quickfix.field.SettlInstID());
	}

	public boolean isSet(quickfix.field.SettlInstID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstID() {
		return isSetField(162);
	}

	public void set(quickfix.field.SettlInstTransType value) {
		setField(value);
	}

	public quickfix.field.SettlInstTransType get(quickfix.field.SettlInstTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstTransType getSettlInstTransType() throws FieldNotFound {
		return get(new quickfix.field.SettlInstTransType());
	}

	public boolean isSet(quickfix.field.SettlInstTransType field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstTransType() {
		return isSetField(163);
	}

	public void set(quickfix.field.SettlInstRefID value) {
		setField(value);
	}

	public quickfix.field.SettlInstRefID get(quickfix.field.SettlInstRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstRefID getSettlInstRefID() throws FieldNotFound {
		return get(new quickfix.field.SettlInstRefID());
	}

	public boolean isSet(quickfix.field.SettlInstRefID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstRefID() {
		return isSetField(214);
	}

	public void set(quickfix.fix44.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix44.component.Parties get(quickfix.fix44.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix44.component.Parties());
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

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

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

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

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

	public void set(quickfix.field.Product value) {
		setField(value);
	}

	public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Product getProduct() throws FieldNotFound {
		return get(new quickfix.field.Product());
	}

	public boolean isSet(quickfix.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.CFICode value) {
		setField(value);
	}

	public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.field.CFICode());
	}

	public boolean isSet(quickfix.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(quickfix.field.EffectiveTime value) {
		setField(value);
	}

	public quickfix.field.EffectiveTime get(quickfix.field.EffectiveTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
		return get(new quickfix.field.EffectiveTime());
	}

	public boolean isSet(quickfix.field.EffectiveTime field) {
		return isSetField(field);
	}

	public boolean isSetEffectiveTime() {
		return isSetField(168);
	}

	public void set(quickfix.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.field.ExpireTime());
	}

	public boolean isSet(quickfix.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.field.LastUpdateTime value) {
		setField(value);
	}

	public quickfix.field.LastUpdateTime get(quickfix.field.LastUpdateTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastUpdateTime getLastUpdateTime() throws FieldNotFound {
		return get(new quickfix.field.LastUpdateTime());
	}

	public boolean isSet(quickfix.field.LastUpdateTime field) {
		return isSetField(field);
	}

	public boolean isSetLastUpdateTime() {
		return isSetField(779);
	}

	public void set(quickfix.fix44.component.SettlInstructionsData component) {
		setComponent(component);
	}

	public quickfix.fix44.component.SettlInstructionsData get(quickfix.fix44.component.SettlInstructionsData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.SettlInstructionsData getSettlInstructionsData() throws FieldNotFound {
		return get(new quickfix.fix44.component.SettlInstructionsData());
	}

	public void set(quickfix.field.SettlDeliveryType value) {
		setField(value);
	}

	public quickfix.field.SettlDeliveryType get(quickfix.field.SettlDeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDeliveryType getSettlDeliveryType() throws FieldNotFound {
		return get(new quickfix.field.SettlDeliveryType());
	}

	public boolean isSet(quickfix.field.SettlDeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetSettlDeliveryType() {
		return isSetField(172);
	}

	public void set(quickfix.field.StandInstDbType value) {
		setField(value);
	}

	public quickfix.field.StandInstDbType get(quickfix.field.StandInstDbType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StandInstDbType getStandInstDbType() throws FieldNotFound {
		return get(new quickfix.field.StandInstDbType());
	}

	public boolean isSet(quickfix.field.StandInstDbType field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbType() {
		return isSetField(169);
	}

	public void set(quickfix.field.StandInstDbName value) {
		setField(value);
	}

	public quickfix.field.StandInstDbName get(quickfix.field.StandInstDbName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StandInstDbName getStandInstDbName() throws FieldNotFound {
		return get(new quickfix.field.StandInstDbName());
	}

	public boolean isSet(quickfix.field.StandInstDbName field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbName() {
		return isSetField(170);
	}

	public void set(quickfix.field.StandInstDbID value) {
		setField(value);
	}

	public quickfix.field.StandInstDbID get(quickfix.field.StandInstDbID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StandInstDbID getStandInstDbID() throws FieldNotFound {
		return get(new quickfix.field.StandInstDbID());
	}

	public boolean isSet(quickfix.field.StandInstDbID field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbID() {
		return isSetField(171);
	}

	public void set(quickfix.field.NoDlvyInst value) {
		setField(value);
	}

	public quickfix.field.NoDlvyInst get(quickfix.field.NoDlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
		return get(new quickfix.field.NoDlvyInst());
	}

	public boolean isSet(quickfix.field.NoDlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetNoDlvyInst() {
		return isSetField(85);
	}

	public static class NoDlvyInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {165, 787, 781, 0};

		public NoDlvyInst() {
			super(85, 165, ORDER);
		}
		
	public void set(quickfix.field.SettlInstSource value) {
		setField(value);
	}

	public quickfix.field.SettlInstSource get(quickfix.field.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new quickfix.field.SettlInstSource());
	}

	public boolean isSet(quickfix.field.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
	}

	public void set(quickfix.field.DlvyInstType value) {
		setField(value);
	}

	public quickfix.field.DlvyInstType get(quickfix.field.DlvyInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DlvyInstType getDlvyInstType() throws FieldNotFound {
		return get(new quickfix.field.DlvyInstType());
	}

	public boolean isSet(quickfix.field.DlvyInstType field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInstType() {
		return isSetField(787);
	}

	public void set(quickfix.fix44.component.SettlParties component) {
		setComponent(component);
	}

	public quickfix.fix44.component.SettlParties get(quickfix.fix44.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix44.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new quickfix.fix44.component.SettlParties());
	}

	public void set(quickfix.field.NoSettlPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoSettlPartyIDs get(quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoSettlPartyIDs());
	}

	public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {782, 783, 784, 801, 0};

		public NoSettlPartyIDs() {
			super(781, 782, ORDER);
		}
		
	public void set(quickfix.field.SettlPartyID value) {
		setField(value);
	}

	public quickfix.field.SettlPartyID get(quickfix.field.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyID());
	}

	public boolean isSet(quickfix.field.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(quickfix.field.SettlPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.SettlPartyIDSource get(quickfix.field.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyIDSource());
	}

	public boolean isSet(quickfix.field.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(quickfix.field.SettlPartyRole value) {
		setField(value);
	}

	public quickfix.field.SettlPartyRole get(quickfix.field.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyRole());
	}

	public boolean isSet(quickfix.field.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(quickfix.field.NoSettlPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoSettlPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {785, 786, 0};

		public NoSettlPartySubIDs() {
			super(801, 785, ORDER);
		}
		
	public void set(quickfix.field.SettlPartySubID value) {
		setField(value);
	}

	public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new quickfix.field.SettlPartySubID());
	}

	public boolean isSet(quickfix.field.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(quickfix.field.SettlPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.SettlPartySubIDType());
	}

	public boolean isSet(quickfix.field.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

	}

	public void set(quickfix.field.PaymentMethod value) {
		setField(value);
	}

	public quickfix.field.PaymentMethod get(quickfix.field.PaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentMethod getPaymentMethod() throws FieldNotFound {
		return get(new quickfix.field.PaymentMethod());
	}

	public boolean isSet(quickfix.field.PaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetPaymentMethod() {
		return isSetField(492);
	}

	public void set(quickfix.field.PaymentRef value) {
		setField(value);
	}

	public quickfix.field.PaymentRef get(quickfix.field.PaymentRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentRef getPaymentRef() throws FieldNotFound {
		return get(new quickfix.field.PaymentRef());
	}

	public boolean isSet(quickfix.field.PaymentRef field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRef() {
		return isSetField(476);
	}

	public void set(quickfix.field.CardHolderName value) {
		setField(value);
	}

	public quickfix.field.CardHolderName get(quickfix.field.CardHolderName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardHolderName getCardHolderName() throws FieldNotFound {
		return get(new quickfix.field.CardHolderName());
	}

	public boolean isSet(quickfix.field.CardHolderName field) {
		return isSetField(field);
	}

	public boolean isSetCardHolderName() {
		return isSetField(488);
	}

	public void set(quickfix.field.CardNumber value) {
		setField(value);
	}

	public quickfix.field.CardNumber get(quickfix.field.CardNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardNumber getCardNumber() throws FieldNotFound {
		return get(new quickfix.field.CardNumber());
	}

	public boolean isSet(quickfix.field.CardNumber field) {
		return isSetField(field);
	}

	public boolean isSetCardNumber() {
		return isSetField(489);
	}

	public void set(quickfix.field.CardStartDate value) {
		setField(value);
	}

	public quickfix.field.CardStartDate get(quickfix.field.CardStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardStartDate getCardStartDate() throws FieldNotFound {
		return get(new quickfix.field.CardStartDate());
	}

	public boolean isSet(quickfix.field.CardStartDate field) {
		return isSetField(field);
	}

	public boolean isSetCardStartDate() {
		return isSetField(503);
	}

	public void set(quickfix.field.CardExpDate value) {
		setField(value);
	}

	public quickfix.field.CardExpDate get(quickfix.field.CardExpDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardExpDate getCardExpDate() throws FieldNotFound {
		return get(new quickfix.field.CardExpDate());
	}

	public boolean isSet(quickfix.field.CardExpDate field) {
		return isSetField(field);
	}

	public boolean isSetCardExpDate() {
		return isSetField(490);
	}

	public void set(quickfix.field.CardIssNum value) {
		setField(value);
	}

	public quickfix.field.CardIssNum get(quickfix.field.CardIssNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardIssNum getCardIssNum() throws FieldNotFound {
		return get(new quickfix.field.CardIssNum());
	}

	public boolean isSet(quickfix.field.CardIssNum field) {
		return isSetField(field);
	}

	public boolean isSetCardIssNum() {
		return isSetField(491);
	}

	public void set(quickfix.field.PaymentDate value) {
		setField(value);
	}

	public quickfix.field.PaymentDate get(quickfix.field.PaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentDate getPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.PaymentDate());
	}

	public boolean isSet(quickfix.field.PaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetPaymentDate() {
		return isSetField(504);
	}

	public void set(quickfix.field.PaymentRemitterID value) {
		setField(value);
	}

	public quickfix.field.PaymentRemitterID get(quickfix.field.PaymentRemitterID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentRemitterID getPaymentRemitterID() throws FieldNotFound {
		return get(new quickfix.field.PaymentRemitterID());
	}

	public boolean isSet(quickfix.field.PaymentRemitterID field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRemitterID() {
		return isSetField(505);
	}

	}

}
