package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] newArray = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                newArray = new int[2];
                newArray[0] = i;
                newArray[1] = j;
                break;
            }
            i++;
            if (i == j - 1) {
                j--;
                i = 0;
            }
        }
        return newArray;
    }
}
