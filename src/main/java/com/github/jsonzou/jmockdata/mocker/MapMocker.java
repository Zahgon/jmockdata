package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.RandomUtils;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * 模拟Map
 */
public class MapMocker implements Mocker<Object> {

    private Type[] types;

    MapMocker(Type[] types) {
        this.types = types;
    }

    @Override
    public Object mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
