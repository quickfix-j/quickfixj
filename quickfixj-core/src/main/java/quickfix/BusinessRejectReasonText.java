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

package quickfix;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import quickfix.field.BusinessRejectReason;

/**
 * Description strings for business reject reasons.
 *
 * @see BusinessRejectReason
 */
public class BusinessRejectReasonText extends BusinessRejectReason {

    private static final HashMap<Integer, String> rejectReasonText = new HashMap<>();

    static {
        // the BusinessRejectReason field values change from version to version,
        // so for cross-version compatibility we convert the constant names to
        // text reflectively on startup instead of hard-coding them
        for (Field field : BusinessRejectReason.class.getDeclaredFields()) {
            int mod = field.getModifiers();
            if (field.getType() == int.class && Modifier.isPublic(mod)
                    && Modifier.isStatic(mod) && Modifier.isFinal(mod)) {
                try {
                    rejectReasonText.put(field.getInt(null), toText(field.getName()));
                } catch (IllegalAccessException ignore) {
                    // shouldn't happen
                }
            }
        }
    }

    /**
     * Converts a constant name to text, by replacing underscores
     * with spaces and converting it to title-case.
     *
     * @param constName the constant name
     * @return the converted text
     */
    static String toText(String constName) {
        StringBuilder sb = new StringBuilder(constName.toLowerCase());
        boolean upper = true; // first character is upper
        for (int i = 0; i < sb.length(); i++) {
            if (upper) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                upper = false;
            }
            if (sb.charAt(i) == '_') {
                sb.setCharAt(i, ' ');
                upper = true; // character after space is upper
            }
        }
        return sb.toString();
    }

    /**
     * Get the description string for a specified business reject reason.
     *
     * @param rejectReason the reason
     * @return the description or null if there isn't a description for that reason
     */
    public static String getMessage(int rejectReason) {
        return rejectReasonText.get(rejectReason);
    }

}
