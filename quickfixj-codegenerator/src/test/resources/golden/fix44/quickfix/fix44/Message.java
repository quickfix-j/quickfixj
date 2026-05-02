/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/
package quickfix.fix44;

import quickfix.FieldNotFound;
  
import quickfix.field.*;

import quickfix.Group;

public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

    @Override
    protected Header newHeader() {
        return new Header(this);
    }

    @Override
    public Header getHeader() {
        return (Message.Header)header;
    }

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(quickfix.field.BeginString value) {
		setField(value);
	}

	public quickfix.field.BeginString get(quickfix.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.field.BeginString());
	}

	public boolean isSet(quickfix.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.field.BodyLength value) {
		setField(value);
	}

	public quickfix.field.BodyLength get(quickfix.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.field.BodyLength());
	}

	public boolean isSet(quickfix.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.field.MsgType value) {
		setField(value);
	}

	public quickfix.field.MsgType get(quickfix.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.field.MsgType());
	}

	public boolean isSet(quickfix.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.field.SenderCompID get(quickfix.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.field.SenderCompID());
	}

	public boolean isSet(quickfix.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.field.TargetCompID value) {
		setField(value);
	}

	public quickfix.field.TargetCompID get(quickfix.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new quickfix.field.TargetCompID());
	}

	public boolean isSet(quickfix.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(quickfix.field.OnBehalfOfCompID value) {
		setField(value);
	}

	public quickfix.field.OnBehalfOfCompID get(quickfix.field.OnBehalfOfCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OnBehalfOfCompID getOnBehalfOfCompID() throws FieldNotFound {
		return get(new quickfix.field.OnBehalfOfCompID());
	}

	public boolean isSet(quickfix.field.OnBehalfOfCompID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfCompID() {
		return isSetField(115);
	}

	public void set(quickfix.field.DeliverToCompID value) {
		setField(value);
	}

	public quickfix.field.DeliverToCompID get(quickfix.field.DeliverToCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliverToCompID getDeliverToCompID() throws FieldNotFound {
		return get(new quickfix.field.DeliverToCompID());
	}

	public boolean isSet(quickfix.field.DeliverToCompID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToCompID() {
		return isSetField(128);
	}

	public void set(quickfix.field.SecureDataLen value) {
		setField(value);
	}

	public quickfix.field.SecureDataLen get(quickfix.field.SecureDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecureDataLen getSecureDataLen() throws FieldNotFound {
		return get(new quickfix.field.SecureDataLen());
	}

	public boolean isSet(quickfix.field.SecureDataLen field) {
		return isSetField(field);
	}

	public boolean isSetSecureDataLen() {
		return isSetField(90);
	}

	public void set(quickfix.field.SecureData value) {
		setField(value);
	}

	public quickfix.field.SecureData get(quickfix.field.SecureData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecureData getSecureData() throws FieldNotFound {
		return get(new quickfix.field.SecureData());
	}

	public boolean isSet(quickfix.field.SecureData field) {
		return isSetField(field);
	}

	public boolean isSetSecureData() {
		return isSetField(91);
	}

	public void set(quickfix.field.MsgSeqNum value) {
		setField(value);
	}

	public quickfix.field.MsgSeqNum get(quickfix.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.field.MsgSeqNum());
	}

	public boolean isSet(quickfix.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(quickfix.field.SenderSubID value) {
		setField(value);
	}

	public quickfix.field.SenderSubID get(quickfix.field.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new quickfix.field.SenderSubID());
	}

	public boolean isSet(quickfix.field.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(quickfix.field.SenderLocationID value) {
		setField(value);
	}

	public quickfix.field.SenderLocationID get(quickfix.field.SenderLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SenderLocationID getSenderLocationID() throws FieldNotFound {
		return get(new quickfix.field.SenderLocationID());
	}

	public boolean isSet(quickfix.field.SenderLocationID field) {
		return isSetField(field);
	}

	public boolean isSetSenderLocationID() {
		return isSetField(142);
	}

	public void set(quickfix.field.TargetSubID value) {
		setField(value);
	}

	public quickfix.field.TargetSubID get(quickfix.field.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new quickfix.field.TargetSubID());
	}

	public boolean isSet(quickfix.field.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(quickfix.field.TargetLocationID value) {
		setField(value);
	}

	public quickfix.field.TargetLocationID get(quickfix.field.TargetLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetLocationID getTargetLocationID() throws FieldNotFound {
		return get(new quickfix.field.TargetLocationID());
	}

	public boolean isSet(quickfix.field.TargetLocationID field) {
		return isSetField(field);
	}

	public boolean isSetTargetLocationID() {
		return isSetField(143);
	}

	public void set(quickfix.field.OnBehalfOfSubID value) {
		setField(value);
	}

	public quickfix.field.OnBehalfOfSubID get(quickfix.field.OnBehalfOfSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OnBehalfOfSubID getOnBehalfOfSubID() throws FieldNotFound {
		return get(new quickfix.field.OnBehalfOfSubID());
	}

	public boolean isSet(quickfix.field.OnBehalfOfSubID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSubID() {
		return isSetField(116);
	}

	public void set(quickfix.field.OnBehalfOfLocationID value) {
		setField(value);
	}

	public quickfix.field.OnBehalfOfLocationID get(quickfix.field.OnBehalfOfLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OnBehalfOfLocationID getOnBehalfOfLocationID() throws FieldNotFound {
		return get(new quickfix.field.OnBehalfOfLocationID());
	}

	public boolean isSet(quickfix.field.OnBehalfOfLocationID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfLocationID() {
		return isSetField(144);
	}

	public void set(quickfix.field.DeliverToSubID value) {
		setField(value);
	}

	public quickfix.field.DeliverToSubID get(quickfix.field.DeliverToSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliverToSubID getDeliverToSubID() throws FieldNotFound {
		return get(new quickfix.field.DeliverToSubID());
	}

	public boolean isSet(quickfix.field.DeliverToSubID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToSubID() {
		return isSetField(129);
	}

	public void set(quickfix.field.DeliverToLocationID value) {
		setField(value);
	}

	public quickfix.field.DeliverToLocationID get(quickfix.field.DeliverToLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliverToLocationID getDeliverToLocationID() throws FieldNotFound {
		return get(new quickfix.field.DeliverToLocationID());
	}

	public boolean isSet(quickfix.field.DeliverToLocationID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToLocationID() {
		return isSetField(145);
	}

	public void set(quickfix.field.PossDupFlag value) {
		setField(value);
	}

	public quickfix.field.PossDupFlag get(quickfix.field.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new quickfix.field.PossDupFlag());
	}

	public boolean isSet(quickfix.field.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(quickfix.field.PossResend value) {
		setField(value);
	}

	public quickfix.field.PossResend get(quickfix.field.PossResend value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PossResend getPossResend() throws FieldNotFound {
		return get(new quickfix.field.PossResend());
	}

	public boolean isSet(quickfix.field.PossResend field) {
		return isSetField(field);
	}

	public boolean isSetPossResend() {
		return isSetField(97);
	}

	public void set(quickfix.field.SendingTime value) {
		setField(value);
	}

	public quickfix.field.SendingTime get(quickfix.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.field.SendingTime());
	}

	public boolean isSet(quickfix.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(quickfix.field.OrigSendingTime value) {
		setField(value);
	}

	public quickfix.field.OrigSendingTime get(quickfix.field.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new quickfix.field.OrigSendingTime());
	}

	public boolean isSet(quickfix.field.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	public void set(quickfix.field.XmlDataLen value) {
		setField(value);
	}

	public quickfix.field.XmlDataLen get(quickfix.field.XmlDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.XmlDataLen getXmlDataLen() throws FieldNotFound {
		return get(new quickfix.field.XmlDataLen());
	}

	public boolean isSet(quickfix.field.XmlDataLen field) {
		return isSetField(field);
	}

	public boolean isSetXmlDataLen() {
		return isSetField(212);
	}

	public void set(quickfix.field.XmlData value) {
		setField(value);
	}

	public quickfix.field.XmlData get(quickfix.field.XmlData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.XmlData getXmlData() throws FieldNotFound {
		return get(new quickfix.field.XmlData());
	}

	public boolean isSet(quickfix.field.XmlData field) {
		return isSetField(field);
	}

	public boolean isSetXmlData() {
		return isSetField(213);
	}

	public void set(quickfix.field.MessageEncoding value) {
		setField(value);
	}

	public quickfix.field.MessageEncoding get(quickfix.field.MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MessageEncoding getMessageEncoding() throws FieldNotFound {
		return get(new quickfix.field.MessageEncoding());
	}

	public boolean isSet(quickfix.field.MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(347);
	}

	public void set(quickfix.field.LastMsgSeqNumProcessed value) {
		setField(value);
	}

	public quickfix.field.LastMsgSeqNumProcessed get(quickfix.field.LastMsgSeqNumProcessed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastMsgSeqNumProcessed getLastMsgSeqNumProcessed() throws FieldNotFound {
		return get(new quickfix.field.LastMsgSeqNumProcessed());
	}

	public boolean isSet(quickfix.field.LastMsgSeqNumProcessed field) {
		return isSetField(field);
	}

	public boolean isSetLastMsgSeqNumProcessed() {
		return isSetField(369);
	}

	public void set(quickfix.field.NoHops value) {
		setField(value);
	}

	public quickfix.field.NoHops get(quickfix.field.NoHops value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoHops getNoHops() throws FieldNotFound {
		return get(new quickfix.field.NoHops());
	}

	public boolean isSet(quickfix.field.NoHops field) {
		return isSetField(field);
	}

	public boolean isSetNoHops() {
		return isSetField(627);
	}

	public static class NoHops extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {628, 629, 630, 0};

		public NoHops() {
			super(627, 628, ORDER);
		}
		
	public void set(quickfix.field.HopCompID value) {
		setField(value);
	}

	public quickfix.field.HopCompID get(quickfix.field.HopCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HopCompID getHopCompID() throws FieldNotFound {
		return get(new quickfix.field.HopCompID());
	}

	public boolean isSet(quickfix.field.HopCompID field) {
		return isSetField(field);
	}

	public boolean isSetHopCompID() {
		return isSetField(628);
	}

	public void set(quickfix.field.HopSendingTime value) {
		setField(value);
	}

	public quickfix.field.HopSendingTime get(quickfix.field.HopSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HopSendingTime getHopSendingTime() throws FieldNotFound {
		return get(new quickfix.field.HopSendingTime());
	}

	public boolean isSet(quickfix.field.HopSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetHopSendingTime() {
		return isSetField(629);
	}

	public void set(quickfix.field.HopRefID value) {
		setField(value);
	}

	public quickfix.field.HopRefID get(quickfix.field.HopRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HopRefID getHopRefID() throws FieldNotFound {
		return get(new quickfix.field.HopRefID());
	}

	public boolean isSet(quickfix.field.HopRefID field) {
		return isSetField(field);
	}

	public boolean isSetHopRefID() {
		return isSetField(630);
	}

	}

	}
	
	
	public void set(quickfix.field.SignatureLength value) {
		setField(value);
	}

	public quickfix.field.SignatureLength get(quickfix.field.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new quickfix.field.SignatureLength());
	}

	public boolean isSet(quickfix.field.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(quickfix.field.Signature value) {
		setField(value);
	}

	public quickfix.field.Signature get(quickfix.field.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Signature getSignature() throws FieldNotFound {
		return get(new quickfix.field.Signature());
	}

	public boolean isSet(quickfix.field.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(quickfix.field.CheckSum value) {
		setField(value);
	}

	public quickfix.field.CheckSum get(quickfix.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.field.CheckSum());
	}

	public boolean isSet(quickfix.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
