package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        int size = data.length;
        for (int i = 0; i < size; i++) {
            int min = MinDiapason.findMin(data, i, size - 1);
            int index = FindLoop.indexInRange(data, min, i, size - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}



