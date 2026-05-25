package com.github.jsonzou.jmockdata.util.randomstring;

import lombok.Getter;
import java.util.*;

class RandomLetterPicker {

    private final List<String> letters;

    private final int size;

    private final Random random;

    @Getter
    public static class Builder {

        private List<String> letters;

        private Random random;

        public Builder() {
            letters = new ArrayList<>();
            random = null;
        }

        public <E extends Enum<E> & Letter> Builder addAllByEnum(Class<E> enumClass) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder addAll(List<String> list) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder add(String letter) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder remove(String remove) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder setRandom(Random random) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public RandomLetterPicker build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private RandomLetterPicker(Builder b) {
        letters = Collections.unmodifiableList(b.getLetters());
        if (b.getRandom() == null) {
            random = new Random();
        } else {
            random = b.getRandom();
        }
        size = letters.size();
    }

    public String pickRandomLetter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static RandomLetterPicker constructByCharacterRange(final List<String> bounds) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
