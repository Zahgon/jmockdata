package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.RandomUtils;
import java.time.LocalTime;

/**
 * LocalTime对象模拟器
 */
public class LocalTimeMocker implements Mocker<LocalTime> {

    @Override
    public LocalTime mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
