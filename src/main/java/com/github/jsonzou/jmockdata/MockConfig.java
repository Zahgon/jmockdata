package com.github.jsonzou.jmockdata;

import com.github.jsonzou.jmockdata.annotation.MockIgnore;
import com.github.jsonzou.jmockdata.mocker.*;
import com.github.jsonzou.jmockdata.util.FieldMatchingResolver;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * 模拟数据配置类
 */
public class MockConfig {

    private static final ByteMocker BYTE_MOCKER = new ByteMocker();

    private static final BooleanMocker BOOLEAN_MOCKER = new BooleanMocker();

    private static final CharacterMocker CHARACTER_MOCKER = new CharacterMocker();

    private static final ShortMocker SHORT_MOCKER = new ShortMocker();

    private static final IntegerMocker INTEGER_MOCKER = new IntegerMocker();

    private static final LongMocker LONG_MOCKER = new LongMocker();

    private static final FloatMocker FLOAT_MOCKER = new FloatMocker();

    private static final DoubleMocker DOUBLE_MOCKER = new DoubleMocker();

    private static final BigIntegerMocker BIG_INTEGER_MOCKER = new BigIntegerMocker();

    private static final BigDecimalMocker BIG_DECIMAL_MOCKER = new BigDecimalMocker();

    private static final StringMocker STRING_MOCKER = new StringMocker();

    private static final DateMocker DATE_MOCKER = new DateMocker();

    private static final LocalDateTimeMocker LOCAL_DATE_TIME_MOCKER = new LocalDateTimeMocker();

    private static final LocalDateMocker LOCAL_DATE_MOCKER = new LocalDateMocker();

    private static final LocalTimeMocker LOCAL_TIME_MOCKER = new LocalTimeMocker();

    private static final TimestampMocker TIMESTAMP_MOCKER = new TimestampMocker();

    private boolean enabledCircle = false;

    private boolean enabledStatic = false;

    private boolean enabledPublic = true;

    private boolean enabledProtected = true;

    private boolean enabledPrivate = true;

    /**
     * Bean缓存
     */
    private Map<String, Object> beanCache = new HashMap<>(16);

    /**
     * TypeVariable缓存
     */
    private Map<String, Type> typeVariableCache = new HashMap<>(8);

    /**
     * enum缓存
     */
    private Map<String, Enum[]> enumCache = new HashMap<>(4);

    /**
     * 模拟器配置
     */
    private Map<Class<?>, Mocker> mockerContext = new HashMap<>(32);

    private Map<Class<?>, BeanMockerInterceptor> beanMockerInterceptors = new HashMap<>(4);

    /**
     * 数据模拟范围全局配置
     */
    private DataConfig GLOBAL_DATA_CONFIG = new DataConfig(this);

    /**
     * 数据模拟范围局部特定配置
     * [key] = ClassName[_Field]
     * [value] = DataConfig
     */
    private Map<String, DataConfig> partDataConfig = new HashMap<>(16);

    /**
     * 排除模拟对象
     */
    private Map<Class<?>, List<String>> excludeConfig = new HashMap<>(4);

    public MockConfig() {
        registerMocker(BYTE_MOCKER, byte.class, Byte.class);
        registerMocker(BOOLEAN_MOCKER, boolean.class, Boolean.class);
        registerMocker(CHARACTER_MOCKER, char.class, Character.class);
        registerMocker(SHORT_MOCKER, short.class, Short.class);
        registerMocker(INTEGER_MOCKER, Integer.class, int.class);
        registerMocker(LONG_MOCKER, long.class, Long.class);
        registerMocker(FLOAT_MOCKER, float.class, Float.class);
        registerMocker(DOUBLE_MOCKER, double.class, Double.class);
        registerMocker(BIG_INTEGER_MOCKER, BigInteger.class);
        registerMocker(BIG_DECIMAL_MOCKER, BigDecimal.class);
        registerMocker(STRING_MOCKER, String.class);
        registerMocker(DATE_MOCKER, Date.class);
        registerMocker(LOCAL_DATE_TIME_MOCKER, LocalDateTime.class);
        registerMocker(LOCAL_DATE_MOCKER, LocalDate.class);
        registerMocker(LOCAL_TIME_MOCKER, LocalTime.class);
        registerMocker(TIMESTAMP_MOCKER, Timestamp.class);
    }

    /**
     * 提供实例化工厂
     * @return MockConfig
     */
    public static MockConfig newInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void cacheBean(String name, Object bean) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getcacheBean(String beanClassName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void cacheEnum(String name, Enum[] enums) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Enum[] getcacheEnum(String enumClassName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig init(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnabledCircle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig setEnabledCircle(boolean enabledCircle) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig setEnabledStatic(boolean enabledStatic) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnabledStatic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig setEnabledPublic(boolean enabledPublic) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnabledPublic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig setEnabledProtected(boolean enabledProtected) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnabledProtected() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig setEnabledPrivate(boolean enabledPrivate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnabledPrivate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Type getVariableType(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 注册数据模拟器
     * @param mocker
     * @param clazzs
     * @param <T>
     */
    public <T> void registerMocker(Mocker mocker, Class<T>... clazzs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 注册BeanMocker拦截器，改变模拟行为
     * @param bi
     * @return
     */
    public <T> MockConfig registerBeanMockerInterceptor(Class<T> clazz, BeanMockerInterceptor bi) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 注册全局BeanMocker拦截器，只能有一个，改变模拟行为
     * @param bi
     * @param <T>
     * @return
     */
    public <T> MockConfig registerBeanMockerInterceptor(BeanMockerInterceptor bi) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> BeanMockerInterceptor getBeanMockerInterceptor(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> Mocker<T> getMocker(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 配置转路器 - 切换设置全局配置
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
     * 配置转路器 - 切换设置局部Class字段模拟配置
     * @return DataConfig
     */
    public <T> DataConfig subConfig(Class<T> clazz, String... fieldNames) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 获取指定配置，如果没有则返回全局配置
     * @param clazz
     * @return DataConfig
     */
    public <T> DataConfig getDataConfig(Class<T> clazz, String fieldName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 获取全局配置
     * @return DataConfig
     */
    public DataConfig globalDataConfig() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 模拟数据排除某各类的某几个字段
     */
    public <T> MockConfig excludes(Class<T> clazz, String... fieldName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 模拟数据全局排除某些字段名
     * @param fieldNames
     * @return MockConfig
     */
    public MockConfig excludes(String... fieldNames) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 判断是否排除模拟某个类
     */
    public <T> boolean isConfigExcludeMock(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 判断是否排除模拟某个类的属性
     */
    public <T> boolean isConfigExcludeMock(Class<T> clazz, String fieldName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ********************************
     * 设置全局配置
     * ********************************
     */
    public MockConfig byteRange(byte min, byte max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig booleanSeed(boolean... booleanSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig shortRange(short min, short max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig intRange(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig floatRange(float min, float max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig doubleRange(double min, double max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig decimalScale(int scale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig longRange(long min, long max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig dateRange(String min, String max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig timeRange(int minHour, int maxHour, int minMinute, int maxMinute, int minSecond, int maxSecond) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig sizeRange(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig stringSeed(String... stringSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MockConfig charSeed(char... charSeed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 根据正则表达是模拟数字类型，
     * 全局慎用，小数、整数、短整数等都会使用此表达式生成，有可能会超范围，
     * 建议通过转路器指定特定的字段或类型使用此功能
     * @param numberRegex
     * @return MockConfig
     */
    @Deprecated
    public MockConfig numberXeger(String numberRegex) {
        GLOBAL_DATA_CONFIG.numberXeger(numberRegex);
        return this;
    }

    public MockConfig numberRegex(String numberRegex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 根据正则表达是模拟字符串类型，
     * @param stringRegex
     * @return MockConfig
     */
    @Deprecated
    public MockConfig stringXeger(String stringRegex) {
        GLOBAL_DATA_CONFIG.stringXeger(stringRegex);
        return this;
    }

    public MockConfig stringRegex(String stringRegex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * ********************************
     * 获取全局配置
     * ********************************
     */
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
