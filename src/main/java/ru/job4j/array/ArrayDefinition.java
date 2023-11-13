package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен " + ages);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен " + surnames);
        float[] prices = new float[40];
        System.out.println("Размер массива равен " + prices);

        String[] names = new String[4];
        names[0] = "Ваня";
        names[1] = "Петя";
        names[2] = "Вася";
        names[3] = "Маша";
    }
}
