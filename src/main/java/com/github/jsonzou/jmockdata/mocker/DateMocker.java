package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockException;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.DateTool;
import com.github.jsonzou.jmockdata.util.RandomUtils;
import java.text.ParseException;
import java.util.Date;

/**
 * Date对象模拟器
 */
public class DateMocker implements Mocker<Date> {

    @Override
    public Date mock(DataConfig mockConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
