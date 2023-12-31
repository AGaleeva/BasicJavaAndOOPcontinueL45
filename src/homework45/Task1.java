package homework45;

import java.util.*;

public class Task1 {
    /*
    Дан List<Integer> и число. Найти в листе возможные пары значений, которые составляют это число.
    */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 8, 0, 4, -3, 2, 5, 9, 1, 15, 13, 7, 25));
        System.out.println(findPairComprisingNum(list, 10));
    }
/*
    public static List<Integer> findPairComprisingNum(List<Integer> list, int n) {
        List<Integer> pairList = new ArrayList<>();
        if (list == null) return pairList;
        for (int i = 0, j = n; i < n / 2; i++, j = n - i) {
            if (list.contains(i) && list.contains(j)) {
                pairList.add(i);
                pairList.add(j);
            }
        }
        return pairList;
    }*/

    public static List<Integer> findPairComprisingNum(List<Integer> list, int n) {
        List<Integer> pairList = new ArrayList<>();
        if (list == null) return pairList;
        Collections.sort(list, (i1, i2) -> Integer.compare(i1, i2));
        System.out.println(list);
        for (int i = list.get(0), j = n; i < n / 2; i++, j = n - i) {
            if (list.contains(i) && list.contains(j)) {
                pairList.add(i);
                pairList.add(j);
            }
        }
        return pairList;
    }
}
