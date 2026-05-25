package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.Mocker;
import java.lang.reflect.ParameterizedType;

/**
 * 模拟泛型
 */
public class GenericMocker implements Mocker<Object> {

    private ParameterizedType type;

    GenericMocker(ParameterizedType type) {
        this.type = type;
    }

    @Override
    public Object mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
