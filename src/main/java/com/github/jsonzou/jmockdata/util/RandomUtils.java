package com.github.jsonzou.jmockdata.util;

import com.github.jsonzou.jmockdata.util.randomstring.RandomStringGenerator;
import java.math.BigDecimal;
import java.util.Random;

public final class RandomUtils {

    private final static Random RANDOM;

    private final static RandomStringGenerator REGEX_GENERATOR;

    /**
     * Init The Random & Regex Generator
     */
    static {
        RANDOM = new Random();
        REGEX_GENERATOR = new RandomStringGenerator(RANDOM, 8);
    }

    private RandomUtils() {
    }

    public static boolean nextBoolean() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int nextInt(int startInclusive, int endExclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static long nextLong(long startInclusive, long endExclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static float nextFloat(float startInclusive, float endInclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static double nextDouble(double startInclusive, double endInclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int nextSize(int startInclusive, int endInclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BigDecimal nextNumberFromRegex(String regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String nextStringFromRegex(String regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
