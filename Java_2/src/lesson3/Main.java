package lesson3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
//1
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("apple", "banana", "cucumber", "cherry", "pineapple", "apple", "strawberry", "apple", "banana", "cucumber", "pineapple", "apple", "tomato", "strawberry"));
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = map.getOrDefault(list.get(i), 0);
            map.put(list.get(i), count+1);
        }

        System.out.println(map);
        System.out.println();

//2
        Phonebook phone = new Phonebook();
        phone.addSubscriber("Ivanov", "8900800000");
        phone.addSubscriber("Petrov", "2002020202");
        phone.addSubscriber("Ivanov", "8500077771" );
        phone.getSubscriber("Ivanov");
        phone.getSubscriber("Petrov");

    }
}
