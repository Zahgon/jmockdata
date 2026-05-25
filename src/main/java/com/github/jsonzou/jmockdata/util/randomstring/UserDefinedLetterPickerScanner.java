package com.github.jsonzou.jmockdata.util.randomstring;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

class UserDefinedLetterPickerScanner {

    @Getter
    public static class ScannedUserDefinedPicker {

        private final int cursor;

        private final String key;

        private final List<String> bounds;

        public ScannedUserDefinedPicker(final int cursorForScanning, final String key, final List<String> bounds) {
            this.cursor = cursorForScanning;
            this.key = key;
            this.bounds = bounds;
        }
    }

    public static ScannedUserDefinedPicker scan(final String[] regexCharacters, final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
