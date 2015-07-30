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

import sun.misc.DoubleConsts;

import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A replacement for Double.parseDouble(String) that takes CharSequence instead of string
 * as argument.
 * This is code from jdk 7, a little bit optimized to avoid some allocations.
 */
public final class CharSequenceReader {

    private CharSequenceReader() {
    }

    private static final long   signMask = 0x8000000000000000L;
    private static final long   expMask  = 0x7ff0000000000000L;
    private static final long   highbyte = 0xff00000000000000L;
    private static final long   lowbytes = ~highbyte;
    private static final long   fractMask= ~(signMask|expMask);

    private static final int    intDecimalDigits = 9;
    private static final int    maxDecimalDigits = 15;
    private static final int    bigDecimalExponent = 324;
    private static final int    maxDecimalExponent = 308;
    private static final int    minDecimalExponent = -324;
    private static final int    expShift = 52;
    private static final int    expBias  = 1023;
    private static final long   fractHOB = ( 1L<<expShift ); // assumed High-Order bit
    private static final int    maxIntValBy10 = Integer.MAX_VALUE / 10;
    private static final double small10pow[] = {
            1.0e0,
            1.0e1, 1.0e2, 1.0e3, 1.0e4, 1.0e5,
            1.0e6, 1.0e7, 1.0e8, 1.0e9, 1.0e10,
            1.0e11, 1.0e12, 1.0e13, 1.0e14, 1.0e15,
            1.0e16, 1.0e17, 1.0e18, 1.0e19, 1.0e20,
            1.0e21, 1.0e22
    };
    private static final double tiny10pow[] = {1e-16, 1e-32, 1e-64, 1e-128, 1e-256 };
    private static final double big10pow[] = {1e16, 1e32, 1e64, 1e128, 1e256 };

    private static final int small5pow[] = {
            1,
            5,
            5*5,
            5*5*5,
            5*5*5*5,
            5*5*5*5*5,
            5*5*5*5*5*5,
            5*5*5*5*5*5*5,
            5*5*5*5*5*5*5*5,
            5*5*5*5*5*5*5*5*5,
            5*5*5*5*5*5*5*5*5*5,
            5*5*5*5*5*5*5*5*5*5*5,
            5*5*5*5*5*5*5*5*5*5*5*5,
            5*5*5*5*5*5*5*5*5*5*5*5*5
    };

    private static final long long5pow[] = {
            1L,
            5L,
            5L*5,
            5L*5*5,
            5L*5*5*5,
            5L*5*5*5*5,
            5L*5*5*5*5*5,
            5L*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5,
            5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5
    };

    private static final int maxSmallTen = small10pow.length-1;

    private static final char infinity[] = { 'I', 'n', 'f', 'i', 'n', 'i', 't', 'y' };
    private static final char notANumber[] = { 'N', 'a', 'N' };
    private static final char zero[] = { '0', '0', '0', '0', '0', '0', '0', '0' };

    protected static final class ReaderBuffer {
        private char digits[] = new char[32];
        private final CSRBigInt bigD0 = new CSRBigInt(new int[4], 1);
        private final CSRBigInt bigD = new CSRBigInt(new int[4], 1);
        private final CSRBigInt bigB = new CSRBigInt(new int[2], 1);
        private final CSRBigInt bigBt = new CSRBigInt(new int[2], 1);
        private char[] getDigits(int length) {
            if(length > digits.length) {
                int mod32 = length % 32;
                digits = new char[length + (0 != mod32 ? 32 - mod32 : 0)];
            }
            return digits;
        }
    }

    private static final ThreadLocal<ReaderBuffer> readerBuffers = new ThreadLocal<ReaderBuffer>() {
        @Override
        protected ReaderBuffer initialValue() {
            return new ReaderBuffer();
        }
    };


    /**
     * Returns a new {@code double} initialized to the value
     * represented by the specified {@code CharSequence}, as performed
     * by the {@code valueOf} method of class
     * {@code Double}.
     *
     * @param  in   the string to be parsed.
     * @return the {@code double} value represented by the string
     *         argument.
     * @throws NullPointerException  if the string is null
     * @throws NumberFormatException if the string does not contain
     *         a parsable {@code double}.
     * @see    java.lang.Double#valueOf(String)
     */
    public static double valueOf(CharSequence in) throws NumberFormatException {
        parseNumber:
        try{
            boolean isNegative = false;
            boolean signSeen   = false;
            int length = in.length();
            if(length == 0)
                throw new NumberFormatException("empty String");
            int i = 0;
            char c = in.charAt(i);
            switch(c) {
                case '-':
                    isNegative = true;
                    //FALLTHROUGH
                case '+':
                    signSeen = true;
                    c = in.charAt(++i);
            }
            // Check for NaN and Infinity strings
            if(c == 'N' || c == 'I') { // possible NaN or infinity
                return possibleNaNOrInfinity(in, i, length, c, isNegative);
            } else if(c == '0')  { // check for hexadecimal floating-point number
                if(length > i+1 ) {
                    char ch = in.charAt(i+1);
                    if (ch == 'x' || ch == 'X') // possible hex string
                        parseHexSequence(in);
                }
            }  // look for and process decimal floating-point string
            ReaderBuffer readerBuffer = readerBuffers.get();
            char[] digits = readerBuffer.getDigits(length);
            int nDigits = 0;
            boolean decSeen = false;
            int decPt = 0;
            int nLeadZero = 0;
            int nTrailZero= 0;
            while(i < length) {
                c = in.charAt(i);
                if(c >= '1' && c <= '9') {
                    while(nTrailZero > 0) {
                        digits[nDigits++] = '0';
                        nTrailZero -= 1;
                    }
                    digits[nDigits++] = c;
                } else if(c == '0') {
                    if(nDigits > 0)
                        nTrailZero += 1;
                    else
                        nLeadZero += 1;
                } else if(c =='.') {
                    if(decSeen) // already saw one ., this is the 2nd.
                        throw new NumberFormatException("multiple points");
                    decPt = i;
                    if(signSeen)
                        decPt -= 1;
                    decSeen = true;
                } else
                    break;
                i++;
            }
            if(nDigits == 0) {
                digits = zero;
                nDigits = 1;
                if(nLeadZero == 0)
                    break parseNumber; // go throw exception
            }
            int decExp;
            if(decSeen)
                decExp = decPt - nLeadZero;
            else
                decExp = nDigits+nTrailZero;
            if((i < length) && (((c = in.charAt(i))=='e') || (c == 'E'))) {
                int expSign = 1;
                int expVal  = 0;
                boolean expOverflow = false;
                switch(in.charAt(++i)) {
                    case '-':
                        expSign = -1;
                        //FALLTHROUGH
                    case '+':
                        i++;
                }
                int expAt = i;
                while(i < length) {
                    if(expVal >= maxIntValBy10)
                        expOverflow = true;
                    c = in.charAt(i++);
                    if(c == '0' || c >= '1' && c <= '9') {
                        expVal = expVal * 10 + ((int) c - (int) '0');
                    } else {
                        i--;           // back up.
                        break; // stop parsing exponent.
                    }
                }
                int expLimit = bigDecimalExponent + nDigits + nTrailZero;
                if(expOverflow || (expVal > expLimit))
                    decExp = expSign * expLimit;
                else
                    decExp = decExp + expSign*expVal;
                if(i == expAt)
                    break parseNumber; // certainly bad
            }
            if(i < length &&
                    ((i != length - 1) ||
                            ((c = in.charAt(i)) != 'f' &&
                                    c != 'F' &&
                                    c != 'd' &&
                                    c != 'D'))) {
                break parseNumber; // go throw exception
            }
            return doubleValue(readerBuffer, digits, nDigits, decExp, isNegative);
        } catch (StringIndexOutOfBoundsException e){
        }
        throw new NumberFormatException("For input string: \"" + in + "\"");
    }

    private static double possibleNaNOrInfinity(CharSequence in, int i, int length, char c, boolean isNegative) {
        boolean potentialNaN = false;
        char targetChars[];  // char array of "NaN" or "Infinity"
        if(c == 'N') {
            targetChars = notANumber;
            potentialNaN = true;
        } else
            targetChars = infinity;
        // compare Input string to "NaN" or "Infinity"
        int j = 0;
        while(i < length && j < targetChars.length) {
            if(in.charAt(i) == targetChars[j]) {
                i++; j++;
            } else // something is amiss, throw exception
                break;
        }
        if((j == targetChars.length) && (i == length)) // return NaN or infinity
            return (potentialNaN ? Double.NaN // NaN has no sign
                    : isNegative? Double.NEGATIVE_INFINITY: Double.POSITIVE_INFINITY);
        throw new NumberFormatException("For input string: \"" + in + "\"");
    }

    private static double doubleValue(ReaderBuffer readerBuffer, char digits[], int nDigits, int decExponent, boolean isNegative) {
        // First, check for NaN and Infinity values
        if(digits == infinity || digits == notANumber) {
            if(digits == notANumber)
                return Double.NaN;
            else
                return isNegative ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        int     kDigits = Math.min(nDigits, maxDecimalDigits+1);
        long    lValue;
        double  dValue;
        double  rValue;
        int iValue = (int)digits[0]-(int)'0';
        int iDigits = Math.min(kDigits, intDecimalDigits);
        for(int i = 1; i < iDigits; i++)
            iValue = iValue*10 + (int)digits[i]-(int)'0';
        lValue = (long)iValue;
        for(int i = iDigits; i < kDigits; i++)
            lValue = lValue*10L + (long)((int)digits[i]-(int)'0');
        dValue = (double)lValue;
        int exp = decExponent-kDigits;
        if(nDigits <= maxDecimalDigits) {
            if(exp == 0 || dValue == 0.0)
                return isNegative ? -dValue : dValue; // small floating integer
            else if(exp >= 0) {
                if(exp <= maxSmallTen) {
                    rValue = dValue * small10pow[exp];
                    return isNegative ? -rValue : rValue;
                }
                int slop = maxDecimalDigits - kDigits;
                if(exp <= maxSmallTen+slop){
                    dValue *= small10pow[slop];
                    rValue = dValue * small10pow[exp-slop];
                    return isNegative ? -rValue : rValue;
                }
            } else {
                if(exp >= -maxSmallTen){
                    rValue = dValue / small10pow[-exp];
                    return isNegative ? -rValue : rValue;
                }
            }
        }
        if(exp > 0) {
            if (decExponent > maxDecimalExponent+1)
                return isNegative ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            if((exp&15) != 0)
                dValue *= small10pow[exp&15];
            if((exp>>=4) != 0) {
                int j;
                for(j = 0; exp > 1; j++, exp>>=1){
                    if((exp&1)!=0)
                        dValue *= big10pow[j];
                }
                double t = dValue * big10pow[j];
                if(Double.isInfinite(t)) {
                    t = dValue / 2.0;
                    t *= big10pow[j];
                    if(Double.isInfinite(t))
                        return isNegative ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    t = Double.MAX_VALUE;
                }
                dValue = t;
            }
        } else if(exp < 0) {
            exp = -exp;
            if(decExponent < minDecimalExponent-1)
                return isNegative ? -0.0 : 0.0;
            if((exp&15) != 0)
                dValue /= small10pow[exp&15];
            if((exp>>=4) != 0) {
                int j;
                for(j = 0; exp > 1; j++, exp>>=1) {
                    if((exp&1)!=0)
                        dValue *= tiny10pow[j];
                }
                double t = dValue * tiny10pow[j];
                if(t == 0.0) {
                    t = dValue * 2.0;
                    t *= tiny10pow[j];
                    if(t == 0.0)
                        return isNegative ? -0.0 : 0.0;
                    t = Double.MIN_VALUE;
                }
                dValue = t;
            }
        }

        CSRBigInt bigD0 = readerBuffer.bigD0.set(lValue, digits, nDigits, kDigits);
        exp  = decExponent - nDigits;
        return correctionLoop(readerBuffer, bigD0, dValue, exp, isNegative);
    }

    private static double correctionLoop(ReaderBuffer readerBuffer, CSRBigInt bigD0, double dValue, int exp, boolean isNegative) {
        for(;;) {
            long lbits = Double.doubleToRawLongBits(dValue);
            if(((lbits & DoubleConsts.EXP_BIT_MASK) == DoubleConsts.EXP_BIT_MASK) &&
                    (lbits & DoubleConsts.SIGNIF_BIT_MASK) != 0L)
                lbits = 0x7ff8000000000000L;
            lbits = lbits & ~signMask;
            int bigIntExp = (int)(lbits >>> expShift);
            lbits &= fractMask;
            if(bigIntExp > 0) {
                lbits |= fractHOB;
            } else {
                bigIntExp++;
                while((lbits & fractHOB) == 0L) {
                    lbits <<= 1;
                    bigIntExp--;
                }
            }
            bigIntExp -= expBias;
            int bigIntNBits = countBits(lbits);
            int lowOrderZeros = expShift+1-bigIntNBits;
            lbits >>>= lowOrderZeros;
            bigIntExp = bigIntExp+1-bigIntNBits;

            CSRBigInt bigB = readerBuffer.bigB.set(lbits);
            int B2, B5; // powers of 2, 5 in bigB
            int D2, D5; // powers of 2, 5 in bigD
            if(exp >= 0) {
                B2 = B5 = 0;
                D2 = D5 = exp;
            } else {
                B2 = B5 = -exp;
                D2 = D5 = 0;
            }
            if(bigIntExp >= 0) {
                B2 += bigIntExp;
            } else {
                D2 -= bigIntExp;
            }
            int common;
            if(bigIntExp+bigIntNBits <= -expBias+1)
                common = bigIntExp+ expBias + expShift;
            else
                common = expShift + 2 - bigIntNBits;
            int Ulp2 = B2;   // powers of 2 in halfUlp.
            B2 += common;
            D2 += common;
            common = Math.min(B2, Math.min(D2, Ulp2 ));
            B2 -= common;
            D2 -= common;
            Ulp2 -= common;
            bigB = multPow52(bigB, readerBuffer.bigBt, bigB, B5, B2);
            CSRBigInt bigD = readerBuffer.bigD.reset(false);
            bigD = multPow52(bigD, null, bigD0, D5, D2);
            CSRBigInt diff;
            int cmpResult = bigB.cmp(bigD);
            boolean overvalue;
            if(cmpResult > 0) {
                overvalue = true;
                diff = bigB.sub(bigD);
                if((bigIntNBits == 1) && (bigIntExp > -expBias)) {
                    Ulp2 -= 1;
                    if(Ulp2 < 0) {
                        Ulp2 = 0;
                        diff.lshiftMe(1);
                    }
                }
            } else if(cmpResult < 0) {
                overvalue = false;
                diff = bigD.sub(bigB);
            } else
                break;
            if((cmpResult = diff.cmp(constructPow52(B5, Ulp2))) < 0) {
                break;
            } else if(cmpResult == 0) {
                dValue += 0.5*ulp(dValue, overvalue);
                break;
            } else {
                dValue += ulp(dValue, overvalue);
                if(dValue == 0.0 || dValue == Double.POSITIVE_INFINITY)
                    break;
            }
        }
        return isNegative ? -dValue : dValue;
    }

    private static double ulp(double dval, boolean subtracting){
        long lbits = Double.doubleToLongBits(dval) & ~signMask;
        int binexp = (int)(lbits >>> expShift);
        double ulpval;
        if(subtracting && (binexp >= expShift) && ((lbits&fractMask) == 0L))
            binexp -= 1;
        if(binexp > expShift)
            ulpval = Double.longBitsToDouble(((long)(binexp-expShift))<<expShift);
        else if (binexp == 0)
            ulpval = Double.MIN_VALUE;
        else
            ulpval = Double.longBitsToDouble(1L<<(binexp-1));
        if(subtracting)
            ulpval = - ulpval;
        return ulpval;
    }

    private static CSRBigInt multPow52(CSRBigInt output, CSRBigInt output2, CSRBigInt v, int p5, int p2) {
        if(p5 != 0) {
            if(p5 < small5pow.length)
                output = v.mult(output, small5pow[p5]);
            else
                output = v.mult(output != v ? output : output2.reset(true), big5pow(p5));
        } else
            output.copy(v);
        if(p2 != 0)
            output.lshiftMe(p2);
        return output;
    }

    private static CSRBigInt constructPow52(int p5, int p2) {
        CSRBigInt v = new CSRBigInt(big5pow(p5));
        if(p2 != 0) {
            v.lshiftMe(p2);
        }
        return v;
    }

    private static int countBits(long v) {
        if(v == 0L) return 0;
        while((v & highbyte) == 0L)
            v <<= 8;
        while(v > 0L)
            v <<= 1;
        int n = 0;
        while((v & lowbytes) != 0L) {
            v <<= 8;
            n += 8;
        }
        while(v != 0L) {
            v <<= 1;
            n += 1;
        }
        return n;
    }

    private static final AtomicReference<CSRBigInt[]> b5pRef = new AtomicReference<CSRBigInt[]>(new CSRBigInt[64]);

    private static CSRBigInt big5pow(int p) {
        CSRBigInt b5p[] = b5pRef.get();
        while(b5p.length <= p) {
            CSRBigInt t[] = new CSRBigInt[p+1];
            System.arraycopy(b5p, 0, t, 0, b5p.length);
            b5pRef.compareAndSet(b5p, t);
            b5p = b5pRef.get();
        }
        if(b5p[p] != null)
            return b5p[p];
        CSRBigInt value;
        if (p < small5pow.length)
            value = new CSRBigInt(small5pow[p]);
        else if (p < long5pow.length)
            value = new CSRBigInt(long5pow[p]);
        else
            value = longBig5pow(b5p, p);
        return b5p[p] = value;
    }

    private static CSRBigInt longBig5pow(CSRBigInt b5p[], int p) {
        int q = p >> 1;
        CSRBigInt bigq = b5p[q];
        if(bigq == null)
            bigq = big5pow(q);
        CSRBigInt value;
        int r = p - q;
        if(r < small5pow.length) {
            value = bigq.mult(small5pow[r]);
        } else {
            CSRBigInt bigr = b5p[r];
            if (bigr == null)
                bigr = big5pow(r);
            value = bigq.mult(bigr);
        }
        return value;
    }

    private static final class CSRBigInt {
        int nWords; // number of words used
        int data[]; // value: data[0] is least significant

        private CSRBigInt(int v) {
            nWords = 1;
            data = new int[1];
            data[0] = v;
        }

        private CSRBigInt(long v) {
            data = new int[2];
            data[0] = (int)v;
            data[1] = (int)(v>>>32);
            nWords = (data[1]==0) ? 1 : 2;
        }

        private CSRBigInt(CSRBigInt other) {
            data = new int[nWords = other.nWords];
            for(int i = nWords; i-- != 0;)
                data[i] = other.data[i];
        }

        private CSRBigInt(int[] d, int n) {
            data = d;
            nWords = n;
        }

        private int[] getData(int length) {
            if(data.length < length)
                data = new int[length];
            return data;
        }

        private CSRBigInt setNWords(int nWords) {
            this.nWords = nWords;
            return this;
        }

        private void copy(CSRBigInt from) {
            nWords = from.nWords;
            if(data.length < nWords)
                data = new int[nWords];
            for(int i = nWords; i-- != 0;)
                data[i] = from.data[i];
        }

        private CSRBigInt set(long v) {
            data[0] = (int)v;
            data[1] = (int)(v>>>32);
            nWords = (data[1]==0) ? 1 : 2;
            return this;
        }

        private CSRBigInt reset(boolean clear) {
            if(clear)
                for(int i = data.length; i-- != 0;)
                    data[i] = 0;
            nWords = 1;
            return this;
        }

        private CSRBigInt set(long seed, char digit[], int nd, int nd0) {
            int n = (nd+8)/9;
            if(n < 2)
                n = 2;
            if(data.length < n+1) // add 1 space for multaddMe possible overflow
                data = new int[n+1];
            data[0] = (int)seed;
            data[1] = (int)(seed>>>32);
            nWords = (data[1]==0) ? 1 : 2;
            int limit = nd-5;
            int v;
            while(nd0 < limit) {
                int ilim = nd0+5;
                v = (int)digit[nd0++]-(int)'0';
                while(nd0 < ilim)
                    v = 10*v + (int)digit[nd0++]-(int)'0';
                multaddMe(100000, v);
            }
            int factor = 1;
            v = 0;
            while(nd0 < nd) {
                v = 10*v + (int)digit[nd0++]-(int)'0';
                factor *= 10;
            }
            if(factor != 1)
                multaddMe(factor, v);
            return this;
        }

        private void lshiftMe(int c)throws IllegalArgumentException {
            if(c > 0) {
                int wordcount = c >> 5;
                int bitcount = c & 0x1f;
                int s[] = data;
                if(nWords + wordcount + 1 > data.length)
                    data = new int[nWords + wordcount + 1];
                int target = nWords + wordcount;
                if(bitcount == 0) {
                    for(int i = nWords; i-- != 0; )
                        data[wordcount + i] = s[i];
                    target = wordcount - 1;
                } else {
                    int anticount = 32 - bitcount;
                    int src = nWords - 1;
                    data[target--] = s[src] >>> anticount;
                    while(src >= 1) {
                        data[target--] = (s[src] << bitcount) | (s[--src] >>> anticount);
                    }
                    data[target--] = s[src] << bitcount;
                }
                while(target >= 0)
                    data[target--] = 0;
                nWords += wordcount + 1;
                while(nWords > 1 && data[nWords - 1] == 0)
                    nWords--;
            } else if(c != 0)
                throw new IllegalArgumentException("negative shift count");
        }

        private CSRBigInt mult(int iv) {
            final long v = iv;
            int r[] = new int[(v*((long)data[nWords-1]&0xffffffffL) > 0xfffffffL ) ? nWords+1 : nWords];
            long p = 0L;
            for(int i=0; i < nWords; i++) {
                p += v * ((long)data[i]&0xffffffffL);
                r[i] = (int)p;
                p >>>= 32;
            }
            if(p == 0L) {
                return new CSRBigInt(r, nWords);
            } else {
                r[nWords] = (int)p;
                return new CSRBigInt(r, nWords+1);
            }
        }

        private CSRBigInt mult(CSRBigInt output, int iv) {
            final long v = iv;
            int r[] = output.getData((v *((long)data[nWords-1]&0xffffffffL) > 0xfffffffL) ? nWords+1 : nWords);
            long p = 0L;
            for(int i = 0; i < nWords; i++) {
                p += v * ((long)data[i]&0xffffffffL);
                r[i] = (int)p;
                p >>>= 32;
            }
            if(p == 0L) {
                return output.setNWords(nWords);
            } else {
                r[nWords] = (int)p;
                return output.setNWords(nWords+1);
            }
        }

        private void multaddMe(int iv, int addend) {
            final long v = iv;
            long p = v *((long)data[0]&0xffffffffL) + ((long)addend&0xffffffffL);
            data[0] = (int)p;
            p >>>= 32;
            for(int i=1; i < nWords; i++) {
                p += v * ((long)data[i]&0xffffffffL);
                data[i] = (int)p;
                p >>>= 32;
            }
            if(p != 0L) {
                data[nWords] = (int)p; // will fail noisily if illegal!
                nWords++;
            }
        }

        private CSRBigInt mult(CSRBigInt other){
            int r[] = new int[nWords + other.nWords];
            int i;
            for(i = 0; i < this.nWords; i++) {
                long v = (long)this.data[i] & 0xffffffffL; // UNSIGNED CONVERSION
                long p = 0L;
                int j;
                for(j = 0; j < other.nWords; j++) {
                    p += ((long)r[i+j]&0xffffffffL) + v*((long)other.data[j]&0xffffffffL); // UNSIGNED CONVERSIONS ALL 'ROUND.
                    r[i+j] = (int)p;
                    p >>>= 32;
                }
                r[i+j] = (int)p;
            }
            for(i = r.length-1; i > 0; i--)
                if(r[i] != 0)
                    break;
            return new CSRBigInt(r, i+1);
        }

        private CSRBigInt mult(CSRBigInt output, CSRBigInt other) {
            int rLength = nWords + other.nWords;
            int r[] = output.getData(rLength);
            int i;
            for(i = 0; i < this.nWords; i++) {
                long v = (long)this.data[i] & 0xffffffffL; // UNSIGNED CONVERSION
                long p = 0L;
                int j;
                for(j = 0; j < other.nWords; j++) {
                    p += ((long)r[i+j]&0xffffffffL) + v*((long)other.data[j]&0xffffffffL); // UNSIGNED CONVERSIONS ALL 'ROUND.
                    r[i+j] = (int)p;
                    p >>>= 32;
                }
                r[i+j] = (int)p;
            }
            for(i = rLength-1; i > 0; i--)
                if(r[i] != 0)
                    break;
            return output.setNWords(i+1);
        }

        private CSRBigInt sub(CSRBigInt other){
            long c = 0L;
            int m = other.nWords;
            int nzeros = 0;
            for(int i = 0; i < nWords; i++) {
                c += (long)data[i] & 0xffffffffL;
                if (i < m)
                    c -= (long)other.data[i] & 0xffffffffL;
                if((data[i] = (int) c) == 0)
                    nzeros++;
                else
                    nzeros = 0;
                c >>= 32; // signed shift
            }
            nWords -= nzeros;
            return this;
        }

        private int cmp(CSRBigInt other) {
            int i = this.nWords-1;
            if(this.nWords > other.nWords) {
                int j = other.nWords-1;
                for(; i > j; i--)
                    if(this.data[i] != 0 ) return 1;
            } else if(this.nWords < other.nWords) {
                int j = i;
                for(i = other.nWords-1; i > j ; i--)
                    if(other.data[i] != 0) return -1;
            }
            for(; i > 0; i--)
                if(this.data[i] != other.data[i])
                    break;
            int a = this.data[i];
            i = other.data[i];
            return a < 0 ? (i < 0 ? a - i : 1) : i < 0 ? -1 : a - i;
        }
    }

    private static final Pattern hexFloatPattern = Pattern.compile("([-+])?0[xX](((\\p{XDigit}+)\\.?)|((\\p{XDigit}*)\\.(\\p{XDigit}+)))[pP]([-+])?(\\p{Digit}+)[fFdD]?");

    private static double parseHexSequence(CharSequence in) {
        Matcher m = hexFloatPattern.matcher(in);
        boolean validInput = m.matches();
        if(!validInput) {
            throw new NumberFormatException("For input value: \"" + in + "\"");
        } else {
            String group1 = m.group(1);
            double sign = ((group1 == null) || group1.equals("+"))? 1.0 : -1.0;
            String significandString;
            int exponentAdjust;
            int signifLength;
            {
                int leftDigits;
                int rightDigits = 0;
                String group4;
                if((group4 = m.group(4)) != null) {
                    significandString = stripLeadingZeros(group4);
                    leftDigits = significandString.length();
                } else {
                    String group6 = stripLeadingZeros(m.group(6));
                    leftDigits = group6.length();
                    String group7 = m.group(7);
                    rightDigits = group7.length();
                    significandString = group6 + group7;
                }
                significandString = stripLeadingZeros(significandString);
                signifLength  = significandString.length();
                if(leftDigits >= 1)
                    exponentAdjust = 4*(leftDigits - 1);
                else
                    exponentAdjust = -4*(rightDigits - signifLength + 1);
                if(signifLength == 0) // Only zeros in input
                    return sign * 0.0;
            }
            String group8 = m.group(8);
            boolean positiveExponent = group8 == null || group8.equals("+");
            long unsignedRawExponent;
            try {
                unsignedRawExponent = Integer.parseInt(m.group(9));
            }
            catch (NumberFormatException e) {
                return sign * (positiveExponent ? Double.POSITIVE_INFINITY : 0.0);
            }
            long rawExponent = (positiveExponent ? 1L : -1L) * unsignedRawExponent;
            long exponent = rawExponent + exponentAdjust ;
            boolean round = false;
            boolean sticky = false;
            int nextShift;
            long significand=0L;
            long leadingDigit = getHexDigit(significandString, 0);
            if(leadingDigit == 1) {
                significand |= leadingDigit << 52;
                nextShift = 52 - 4;
            } else if(leadingDigit <= 3) {
                significand |= leadingDigit << 51;
                nextShift = 52 - 5;
                exponent += 1;
            }
            else if(leadingDigit <= 7) {
                significand |= leadingDigit << 50;
                nextShift = 52 - 6;
                exponent += 2;
            }
            else if(leadingDigit <= 15) {
                significand |= leadingDigit << 49;
                nextShift = 52 - 7;
                exponent += 3;
            } else {
                throw new AssertionError("Result from digit conversion too large!");
            }
            int i;
            for(i = 1; i < signifLength && nextShift >= 0; i++) {
                long currentDigit = getHexDigit(significandString, i);
                significand |= (currentDigit << nextShift);
                nextShift-=4;
            }
            if(i < signifLength) {
                long currentDigit = getHexDigit(significandString, i);
                switch(nextShift) {
                    case -1:
                        significand |= ((currentDigit & 0xEL) >> 1);
                        round = (currentDigit & 0x1L)  != 0L;
                        break;
                    case -2:
                        significand |= ((currentDigit & 0xCL) >> 2);
                        round = (currentDigit &0x2L)  != 0L;
                        sticky = (currentDigit & 0x1L) != 0;
                        break;
                    case -3:
                        significand |= ((currentDigit & 0x8L)>>3);
                        round = (currentDigit &0x4L)  != 0L;
                        sticky = (currentDigit & 0x3L) != 0;
                        break;
                    case -4:
                        round = ((currentDigit & 0x8L) != 0);
                        sticky = (currentDigit & 0x7L) != 0;
                        break;
                    default:
                        throw new AssertionError("Unexpected shift distance remainder.");
                }
                i++;
                while(i < signifLength && !sticky) {
                    currentDigit =  getHexDigit(significandString,i);
                    sticky = currentDigit != 0;
                    i++;
                }
            }
            if(exponent > DoubleConsts.MAX_EXPONENT) {
                return sign * Double.POSITIVE_INFINITY;
            } else {
                if(exponent <= DoubleConsts.MAX_EXPONENT &&
                        exponent >= DoubleConsts.MIN_EXPONENT) {
                    significand = (( (exponent +
                            (long)DoubleConsts.EXP_BIAS) <<
                            (DoubleConsts.SIGNIFICAND_WIDTH-1))
                            & DoubleConsts.EXP_BIT_MASK) |
                            (DoubleConsts.SIGNIF_BIT_MASK & significand);

                }  else  {
                    if (exponent < (DoubleConsts.MIN_SUB_EXPONENT -1 )) {
                        return sign * 0.0;
                    } else { //  -1075 <= exponent <= MIN_EXPONENT -1 = -1023
                        sticky = sticky || round;
                        int bitsDiscarded = 53 -
                                ((int)exponent - DoubleConsts.MIN_SUB_EXPONENT + 1);
                        round = (significand & (1L << (bitsDiscarded -1))) != 0L;
                        if (bitsDiscarded > 1) {
                            long mask = ~((~0L) << (bitsDiscarded -1));
                            sticky = sticky || ((significand & mask) != 0L ) ;
                        }
                        significand = significand >> bitsDiscarded;
                        significand = DoubleConsts.SIGNIF_BIT_MASK & significand;
                    }
                }
                boolean leastZero  = ((significand & 1L) == 0L);
                if((leastZero  && round && sticky) || ((!leastZero) && round ))
                    significand++;
                return Math.copySign(Double.longBitsToDouble(significand), sign);
            }
        }
    }

    private static String stripLeadingZeros(String s) {
        return s.replaceFirst("^0+", "");
    }

    private static int getHexDigit(String s, int position) {
        int value = Character.digit(s.charAt(position), 16);
        if(value <= -1 || value >= 16)
            throw new AssertionError("Unexpected failure of digit conversion of " + s.charAt(position));
        return value;
    }
}
