package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.Mocker;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

@SuppressWarnings("unchecked")
public class BaseMocker<T> implements Mocker<T> {

    private Type type;

    private Type[] genericTypes;

    public BaseMocker(Type type, Type... genericTypes) {
        this.type = type;
        this.genericTypes = genericTypes;
    }

    @Override
    public T mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
