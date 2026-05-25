package com.github.jsonzou.jmockdata;

/**
 * @Author: jsonzou
 * @Date: 2018/10/29 13:24
 * @Description:
 */
public class DataConfig {

    private MockConfig config;

    private byte[] byteRange = { 0, 127 };

    private boolean[] booleanSeed = { true, false };

    private short[] shortRange = { 0, 1000 };

    private int[] intRange = { 0, 10000 };

    private float[] floatRange = { 0.0f, 10000.00f };

    private double[] doubleRange = { 0.0, 10000.00 };

    private int decimalScale = 2;

    private long[] longRange = { 0L, 10000L };

    private String[] dateRange = { "1970-01-01", "2100-12-31" };

    private int[] timeRange = { 0, 24, 0, 60, 0, 60 };

    private int[] sizeRange = { 1, 10 };

    private char[] charSeed = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

    private String[] stringSeed = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    private String numberRegex = null;

    private String stringRegex = null;

    public DataConfig(MockConfig config) {
        this.config = config;
    }

    /**
     * 配置转路器 - 设置全局配置
     * @return MockConfig
     */
    public MockConfig globalConfig() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 配置转路器 - 切换设置全局字段模拟配置
     * @return DataConfig
     */
    public DataConfig subConfig(String... fieldNames) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 配置转路器 - 设置局部配置
     * @return DataConfig
     */
    public DataConfig subConfig(Class<?> clazz, String... fieldName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig byteRange(byte min, byte max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig booleanSeed(boolean... booleanSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig shortRange(short min, short max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig intRange(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig floatRange(float min, float max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig doubleRange(double min, double max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig decimalScale(int scale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig longRange(long min, long max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig dateRange(String min, String max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig timeRange(int minHour, int maxHour, int minMinute, int maxMinute, int minSecond, int maxSecond) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig sizeRange(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig stringSeed(String... stringSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig charSeed(char... charSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Deprecated
    public DataConfig numberXeger(String numberRegex) {
        return numberRegex(numberRegex);
    }

    @Deprecated
    public DataConfig stringXeger(String stringRegex) {
        return stringRegex(stringRegex);
    }

    public DataConfig numberRegex(String numberRegex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DataConfig stringRegex(String stringRegex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] byteRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean[] booleanSeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public short[] shortRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int[] intRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float[] floatRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double[] doubleRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int decimalScale() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long[] longRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String[] dateRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int[] timeRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int[] sizeRange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String[] stringSeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public char[] charSeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String numberRegex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String stringRegex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
