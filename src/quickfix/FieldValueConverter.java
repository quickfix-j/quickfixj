/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FieldValueConverter {

    public static class BooleanConverter {
        public static String convert(boolean b) {
            return b ? "Y" : "N";
        }

        public static boolean convert(String value) throws FieldConvertError {
            if ("Y".equals(value)) {
                return true;
            } else if ("N".equals(value)) {
                return false;
            } else {
                throw new FieldConvertError("invalid boolean value: " + value);
            }
        }
    }

    public static class IntConverter {
        public static String convert(int i) {
            // TODO This can be optimized!
            return Long.toString(i);
        }

        public static int convert(String value) throws FieldConvertError {
            try {
                for (int i = 0; i < value.length(); i++) {
                    if (!Character.isDigit(value.charAt(i))) {
                        throw new NumberFormatException();
                    }
                }
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                throw new FieldConvertError("invalid integral value: " + value);
            }
        }
    }

    public static class DoubleConverter {
        private static final Pattern doublePattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        public static String convert(double d) {
            // TODO This can be optimized!
            return Double.toString(d);
        }

        public static double convert(String value) throws FieldConvertError {
            try {
                Matcher matcher = doublePattern.matcher(value);
                if (!matcher.matches()) {
                    throw new NumberFormatException();
                }
                return Double.parseDouble(value);
            } catch (NumberFormatException e) {
                throw new FieldConvertError("invalid double value: " + value);
            }
        }
    }

    public static class CharConverter {
        public static String convert(char c) {
            return Character.toString(c);
        }

        public static char convert(String value) throws FieldConvertError {
            if (value.length() != 1) {
                throw new FieldConvertError("invalid character value: " + value);
            }
            return value.charAt(0);
        }
    }

    public static class UtcTimestampConverter {
        // SimpleDateFormats are not thread safe. A thread local is being
        // used to maintain high concurrency among multiple session threads
        private static class UtcTimestampFormats {
            public SimpleDateFormat utcTimestampFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
            public SimpleDateFormat utcTimestampFormatMillis = new SimpleDateFormat(
                    "yyyyMMdd-HH:mm:ss.SSS");

            public UtcTimestampFormats() {
                utcTimestampFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                utcTimestampFormatMillis.setTimeZone(TimeZone.getTimeZone("UTC"));
            }
        }

        private static ThreadLocal utcTimestampFormats = new ThreadLocal();

        public static String convert(Date d, boolean includeMilliseconds) {
            return getFormatter(includeMilliseconds).format(d);
        }

        private static DateFormat getFormatter(boolean includeMillis) {
            UtcTimestampFormats formats = (UtcTimestampFormats) utcTimestampFormats.get();
            if (formats == null) {
                formats = new UtcTimestampFormats();
                utcTimestampFormats.set(formats);
            }
            return includeMillis ? formats.utcTimestampFormatMillis : formats.utcTimestampFormat;
        }

        public static Date convert(String value) throws FieldConvertError {
            Date d = null;
            try {
                d = getFormatter(true).parse(value);
            } catch (ParseException e) {
                try {
                    d = getFormatter(false).parse(value);
                } catch (ParseException e1) {
                    throw new FieldConvertError("invalid UTC timestamp value: " + value);
                }
            }
            return d;
        }

    }

    public static class UtcTimeOnlyConverter {
        // SimpleDateFormats are not thread safe. A thread local is being
        // used to maintain high concurrency among multiple session threads
        private static class UtcTimeFormats {
            public SimpleDateFormat utcTimeFormat = new SimpleDateFormat("HH:mm:ss");
            public SimpleDateFormat utcTimeFormatMillis = new SimpleDateFormat("HH:mm:ss.SSS");

            public UtcTimeFormats() {
                utcTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                utcTimeFormatMillis.setTimeZone(TimeZone.getTimeZone("UTC"));
            }
        }

        private static ThreadLocal utcTimeFormats = new ThreadLocal();

        public static String convert(Date d, boolean includeMilliseconds) {
            return getFormatter(includeMilliseconds).format(d);
        }

        private static DateFormat getFormatter(boolean includeMillis) {
            UtcTimeFormats formats = (UtcTimeFormats) utcTimeFormats.get();
            if (formats == null) {
                formats = new UtcTimeFormats();
                utcTimeFormats.set(formats);
            }
            return includeMillis ? formats.utcTimeFormatMillis : formats.utcTimeFormat;
        }

        public static Date convert(String value) throws FieldConvertError {
            Date d = null;
            try {
                d = getFormatter(true).parse(value);
            } catch (ParseException e) {
                try {
                    d = getFormatter(false).parse(value);
                } catch (ParseException e1) {
                    throw new FieldConvertError("invalid UTC time value: " + value);
                }
            }
            return d;
        }

    }

    public static class UtcDateOnlyConverter {
        // SimpleDateFormats are not thread safe. A thread local is being
        // used to maintain high concurrency among multiple session threads
        private static ThreadLocal utcDateFormat = new ThreadLocal();

        public static String convert(Date d, boolean includeMilliseconds) {
            return getFormatter().format(d);
        }

        private static DateFormat getFormatter() {
            SimpleDateFormat format = (SimpleDateFormat) utcDateFormat.get();
            if (format == null) {
                format = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
                format.setTimeZone(TimeZone.getTimeZone("UTC"));
                utcDateFormat.set(format);
            }
            return format;
        }

        public static Date convert(String value) throws FieldConvertError {
            Date d = null;
            try {
                d = getFormatter().parse(value);
            } catch (ParseException e) {
                throw new FieldConvertError("invalid UTC date value: " + value);
            }
            return d;
        }
    }
}