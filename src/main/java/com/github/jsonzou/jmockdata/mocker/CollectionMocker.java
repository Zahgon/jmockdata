package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.RandomUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * 模拟Collection
 */
public class CollectionMocker implements Mocker<Object> {

    private Class clazz;

    private Type genericType;

    CollectionMocker(Class clazz, Type genericType) {
        this.clazz = clazz;
        this.genericType = genericType;
    }

    @Override
    public Object mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
