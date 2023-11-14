package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSor1() {
        int[] data = new int[]{9, 8, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{5, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{8, 5, 0, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 3, 5, 8};
        assertThat(result).containsExactly(expected);
    }
}