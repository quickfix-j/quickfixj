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

import quickfix.StringField;

public class SecurityType extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 167;
    public static final String BANKERS_ACCEPTANCE = "BA";
    public static final String CONVERTIBLE_BOND = "CB";
    public static final String CERTIFICATE_OF_DEPOSIT = "CD";
    public static final String COLLATERALIZE_MORTGAGE_OBLIGATION = "CMO";
    public static final String CORPORATE_BOND = "CORP";
    public static final String COMMERCIAL_PAPER = "CP";
    public static final String CORPORATE_PRIVATE_PLACEMENT = "CPP";
    public static final String COMMON_STOCK = "CS";
    public static final String FEDERAL_HOUSING_AUTHORITY = "FHA";
    public static final String FEDERAL_HOME_LOAN = "FHL";
    public static final String FEDERAL_NATIONAL_MORTGAGE_ASSOCIATION = "FN";
    public static final String FOREIGN_EXCHANGE_CONTRACT = "FOR";
    public static final String FUTURE = "FUT";
    public static final String GOVERNMENT_NATIONAL_MORTGAGE_ASSOCIATION = "GN";
    public static final String TREASURIES_PLUS_AGENCY_DEBENTURE = "GOVT";
    public static final String MUTUAL_FUND = "MF";
    public static final String MORTGAGE_INTEREST_ONLY = "MIO";
    public static final String MORTGAGE_PRINCIPAL_ONLY = "MPO";
    public static final String MORTGAGE_PRIVATE_PLACEMENT = "MPP";
    public static final String MISCELLANEOUS_PASSTHRU = "MPT";
    public static final String MUNICIPAL_BOND = "MUNI";
    public static final String NO_ISITC_SECURITY_TYPE = "NONE";
    public static final String OPTION = "OPT";
    public static final String PREFERRED_STOCK = "PS";
    public static final String REPURCHASE_AGREEMENT = "RP";
    public static final String REVERSE_REPURCHASE_AGREEMENT = "RVRP";
    public static final String STUDENT_LOAN_MARKETING_ASSOCIATION = "SL";
    public static final String TIME_DEPOSIT = "TD";
    public static final String US_TREASURY_BILL = "USTB";
    public static final String WARRANT = "WAR";
    public static final String CATS_TIGERS = "ZOO";
    
    public SecurityType() {
        super(167);
    }

    public SecurityType(String data) {
        super(167, data);
    }
}