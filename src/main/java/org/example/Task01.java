package org.example;
/** Пусть дан произвольный список целых чисел, удалить из него четные числа
 * (в языке уже есть что-то готовое для этого).
 */

import java.util.ArrayList;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            numbers.add(val);
        }
        System.out.println(numbers);
        int j = 0;
        while (j < numbers.size()) {
            if (numbers.get(j) % 2 == 0) {
                numbers.remove(j);
            }
            else {
                j++;
            }
        }
        System.out.println("New list " + numbers);
    }
}