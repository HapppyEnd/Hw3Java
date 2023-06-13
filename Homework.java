package Hw3Java;

import java.util.ArrayList;
import java.util.Random;

/*
 * Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа (removeEven(ArrayList<Integer> list))
2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
3) Найти максимальное значение
4) Найти среднее значение

То есть, нужно реализовать 4 метода, каждый из которых принимает список целых
чисел, и делает свою работу.
 */

class Homework {
    public static void main(String[] args) {
        ArrayList<Integer> list = generateRandList(3);
        System.out.println(list);
        System.out.println(findMin(list));
        System.out.println(findMax(list));
        System.out.println(String.format("%.2f", average(list)));
        removeEven(list);

    }

    public static ArrayList<Integer> generateRandList(int size) {
        ArrayList<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(20));
        }
        return list;
    }

    public static void removeEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static Integer findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    static Integer findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    static Double average(ArrayList<Integer> list) {
        double average = 0.0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }
        average /= list.size();
        return average;
    }
}