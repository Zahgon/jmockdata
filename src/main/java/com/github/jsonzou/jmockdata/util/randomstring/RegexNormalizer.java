package com.github.jsonzou.jmockdata.util.randomstring;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexNormalizer {

    // for repetition quantifier, e.g. {1,4}
    private static final Pattern REPETITION_QUANTIFIER_RE = Pattern.compile("([^\\\\])\\{([0-9]+),([0-9]+)?\\}");

    private static final Pattern ASTERISK_QUANTIFIER_RE = Pattern.compile("([^\\\\])\\*");

    private static final Pattern PLUS_QUANTIFIER_RE = Pattern.compile("([^\\\\])\\+");

    private static final Pattern QUESTION_QUANTIFIER_RE = Pattern.compile("([^\\\\])\\?");

    private final int numOfUpperLimit;

    private final Random random;

    public RegexNormalizer(int numOfUpperLimit, Random random) {
        this.numOfUpperLimit = numOfUpperLimit;
        this.random = random;
    }

    public String normalizeQuantifiers(final String regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getRandomNumAsString(final int start, final int end) {
        int bound = end - start;
        if (bound < 0) {
            throw new RuntimeException("Detected invalid quantifier: " + "{" + start + "," + end + "}");
        }
        return Integer.toString(random.nextInt(bound + 1) + start, 10);
    }
}
