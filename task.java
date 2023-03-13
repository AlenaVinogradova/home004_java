package home004;

import java.util.Iterator;
import java.util.LinkedList;

public class task {
    public static void main(String[] args) {
        ex01();
        ex03();
    }

    public static void ex01() {
        /*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
        Постараться не обращаться к листу по индексам. */
    }

    public static void ex03() {
        /*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */
        LinkedList<Integer> ourList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ourList.add(i);
        }
        System.out.println(ourList);

        int sum = 0;
        for (int elem : ourList) {
            sum += elem;
        }
        System.out.println(sum);
        
        Iterator<Integer> collect = ourList.iterator();
        int sum2 = 0;
        while (collect.hasNext()) {
            sum2 += collect.next();
        }
        System.out.println(sum2);
    }

    
}
