package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.Mocker;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

public class ClassMocker implements Mocker<Object> {

    private Class clazz;

    private Type[] genericTypes;

    ClassMocker(Class clazz, Type[] genericTypes) {
        this.clazz = clazz;
        this.genericTypes = genericTypes;
    }

    @Override
    public Object mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
