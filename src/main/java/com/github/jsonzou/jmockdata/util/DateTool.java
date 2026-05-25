package com.github.jsonzou.jmockdata.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @Author: jsonzou
 * @Date: 2018/11/1 21:22
 * @Description:
 */
public class DateTool {

    public enum DatePattern {

        yyyy_MM_dd(Pattern.compile("\\d{4}-\\d{2}-\\d{2}"), "yyyy-MM-dd"),
        yyyy_MM_dd__HH$mm$ss(Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"), "yyyy-MM-dd HH:mm:ss"),
        yyyylMMldd(Pattern.compile("\\d{4}/\\d{2}/\\d{2}"), "yyyy/MM/dd"),
        yyyylMMlddHH__$mm$ss(Pattern.compile("\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}"), "yyyy/MM/dd HH:mm:ss"),
        yyyyMMdd(Pattern.compile("\\d{8}"), "yyyyMMdd"),
        yyyyMMddHHmmss(Pattern.compile("\\d{14}"), "yyyyMMddHHmmss");

        private Pattern regx;

        private String format;

        DatePattern(Pattern regx, String format) {
            this.regx = regx;
            this.format = format;
        }

        public Pattern getRegx() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setRegx(Pattern regx) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getFormat() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void setFormat(String format) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * 日期字符串+日期字符串日期格式 转换为日期对象
     * @param dateStr
     * @param format
     * @return Date
     * @throws ParseException
     */
    public static Date getString2Date(String dateStr, String format) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 日期字符串自动转换为日期对象
     * @param dateStr
     * @return Date
     * @throws ParseException
     */
    public static Date getString2DateAuto(String dateStr) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 自动适配日期字符串的日期格式描述符
     * @param dateStr
     * @return String
     */
    public static String getDateFormat(String dateStr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
