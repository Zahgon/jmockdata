package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.MockException;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.RandomUtils;
import java.lang.reflect.Field;

/**
 * Enum对象模拟器
 */
public class EnumMocker<T extends Enum> implements Mocker<Object> {

    private Class<?> clazz;

    public EnumMocker(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
