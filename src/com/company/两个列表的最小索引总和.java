package com.company;

import java.util.HashMap;
import java.util.Map;

public class 两个列表的最小索引总和 {
    public static void main(String[] args) {
        String[] a = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] b = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        findRestaurant(a, b);
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map.put(list2[i],  i - map.get(list2[i]));
            } else {
                map.put(list2[i], i);
            }
        }
        return null;
    }
}
