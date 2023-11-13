package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot7ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDataRangeHasElThenIndex() {
        int[] data = {0, 1, 2, 3, 4, 5};
        int el = 3;
        int start = 1;
        int finish = 4;
        int expected = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDataRangeHasNotElThenMinusOne() {
        int[] data = {0, 1, 2, 3, 4, 5};
        int el = 5;
        int start = 0;
        int finish = 4;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}