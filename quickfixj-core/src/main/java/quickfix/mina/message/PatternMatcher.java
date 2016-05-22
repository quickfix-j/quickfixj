package quickfix.mina.message;

import org.apache.mina.core.buffer.IoBuffer;
import org.quickfixj.CharsetSupport;

import java.io.UnsupportedEncodingException;

/**
 * Finds a byte pattern within a buffer.
 * <p>
 * Matching is performed on bytes rather than characters, but we
 * consider them interchangeable with ASCII characters for simplicity.
 * <p>
 * The question mark character ('?') is treated as a one-byte wildcard.
 * Lowercase letters are considered optional (and matched case-insensitively).
 * Uppercase letters and all other values are matched as literals.
 * <p>
 * This class is immutable and thus can be used concurrently from multiple threads.
 */
class PatternMatcher {

    private final byte[] pattern;
    private final int minLength;

    /**
     * Constructs a PatternMatcher which matches the given pattern.
     *
     * @param pattern a pattern (see {@link PatternMatcher} for details)
     */
    PatternMatcher(String pattern) {
        this.pattern = getBytes(pattern);
        this.minLength = calculateMinLength();
    }

    /**
     * Returns the minimum number of bytes that the pattern can match.
     * If the pattern has no optional characters, this is simply the
     * pattern length.
     *
     * @return the minimum number of bytes that the pattern can match
     */
    public int getMinLength() {
        return minLength;
    }

    private static byte[] getBytes(String s) {
        try {
            return s.getBytes(CharsetSupport.getDefaultCharset());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Calculates the minimum number of bytes that the pattern can match.
     *
     * @return the minimum number of bytes that the pattern can match
     */
    private int calculateMinLength() {
        int len = 0;
        for (byte b : pattern) {
            if (b < 'a' || b > 'z') { // if not optional character (lowercase)
                len++;
            }
        }
        return len;
    }

    /**
     * Searches for the given pattern within a buffer,
     * starting at the given buffer offset.
     *
     * @param buffer the buffer to search within
     * @param offset the buffer offset to start searching at
     * @return a long value whose lower 32 bits contain the index of the
     * found pattern, and upper 32 bits contain the found pattern length;
     * if the pattern is not found at all, returns -1L
     */
    public long find(IoBuffer buffer, int offset) {
        int length;
        byte first = pattern[0];
        for (int limit = buffer.limit() - minLength + 1; offset < limit; offset++) {
            if (buffer.get(offset) == first && (length = match(buffer, offset)) > 0) {
                return (long)length << 32 | offset;
            }
        }
        return -1L;
    }

    /**
     * Checks if the buffer contents at the given offset matches the pattern.
     *
     * @param buffer the buffer to check
     * @param offset the buffer offset at which to check
     * @return the length of the matched pattern, or -1 if there is no match
     */
    public int match(IoBuffer buffer, int offset) {
        if (offset + minLength > buffer.limit()) {
            return -1;
        }
        final int startOffset = offset;
        int patternOffset = 0;
        for (int bufferLimit = buffer.limit(); patternOffset < pattern.length
                && offset < bufferLimit; patternOffset++, offset++) {
            byte b = pattern[patternOffset];
            // check exact character match or wildcard match
            if (buffer.get(offset) == b || b == '?')
                continue;
            // check optional character match
            if (b >= 'a' && b <= 'z') { // lowercase is optional
                // at this point we know it's not an exact match, so we only need to check the
                // uppercase character. If there's a match we go on as usual, and if not we
                // ignore the optional character by rewinding the buffer offset
                if (b - 'a' + 'A' != buffer.get(offset)) // no uppercase match
                    offset--;
                continue;
            }
            return -1; // no match
        }
        if (patternOffset != pattern.length) {
            // when minPatternLength(pattern) != pattern.length we might run out of buffer before we run out of pattern
            return -1;
        }
        return offset - startOffset;
    }
}
