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

package quickfix.field;

import quickfix.CharField;

public class PartyIDSource extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 447;
    public static final char BIC = 'B';
    public static final char GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = 'C';
    public static final char PROPRIETARY_CUSTOM_CODE = 'D';
    public static final char ISO_COUNTRY_CODE = 'E';
    public static final char SETTLEMENT_ENTITY_LOCATION = 'F';
    public static final char MIC = 'G';
    public static final char CSD_PARTICIPANT_MEMBER_CODE = 'H';
    public static final char KOREAN_INVESTOR_ID = '1';
    public static final char TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID = '2';
    public static final char TAIWANESE_TRADING_ACCOUNT = '3';
    public static final char MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER = '4';
    public static final char CHINESE_B_SHARE = '5';
    public static final char UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER = '6';
    public static final char US_SOCIAL_SECURITY_NUMBER = '7';
    public static final char US_EMPLOYER_IDENTIFICATION_NUMBER = '8';
    public static final char AUSTRALIAN_BUSINESS_NUMBER = '9';
    public static final char AUSTRALIAN_TAX_FILE_NUMBER = 'A';
    public static final char DIRECTED_BROKER = 'I';
    
    public PartyIDSource() {
        super(447);
    }

    public PartyIDSource(char data) {
        super(447, data);
    }
}