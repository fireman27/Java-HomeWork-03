package org.example;
/** Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
 * из этого списка.
 *
 */

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Task02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            numbers.add(val);
        }
        System.out.println(numbers);
        int max = max(numbers);
        int min = min(numbers);
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);
        int sum = 0;
        for (int item : numbers) {
            if (item > maxNumber) {
                maxNumber = item;
            }
            if (item < minNumber) {
                minNumber = item;
            }
            sum += item;
        }
        float average = (float) sum / numbers.size();
        System.out.println("Max" + "\t->\t" + maxNumber);
        System.out.println("Min" + "\t->\t" + minNumber);
        System.out.println("Arithmetic mean" + "\t->\t" + average);

    }
}
