package org.example;

import java.util.ArrayList;
import java.util.List;

/** Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 *
 */
public class Task03 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("333");
        arrayList.add("world");
        arrayList.add("777");
        arrayList.add("555a");
        System.out.println(arrayList);

        int n = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            try {
                n = Integer.parseInt(arrayList.get(i));
                arrayList.remove(i);
            } catch (NumberFormatException e) {

                }

        }
        System.out.println(arrayList);
    }
}
