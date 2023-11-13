package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1 - i) {
                int temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
