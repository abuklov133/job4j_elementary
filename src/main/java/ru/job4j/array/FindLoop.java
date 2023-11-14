package ru.job4j.array;

import java.util.Arrays;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = {9, 2, 1, 5, 7, 0};
        int min = MinDiapason.findMin(data, 0, data.length - 1);
        int indexMin = indexInRange(data, min, 0, data.length - 1);
        System.out.println("Min number in data " + min);
        System.out.println("Index of min number " + indexMin);
        SwitchArray.swap(data, indexMin, 3);
        indexMin = indexInRange(data, min, 0, data.length - 1);
        System.out.println("New index of min number " + indexMin);

        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length -1);
            indexMin = indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, indexMin, i);

        }
        System.out.println(Arrays.toString(data));
    }
}
