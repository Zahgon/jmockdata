package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.Mocker;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

/**
 * Timestamp对象模拟器
 */
public class TimestampMocker implements Mocker<Timestamp> {

    private DateMocker dateMocker = new DateMocker();

    @Override
    public Timestamp mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
