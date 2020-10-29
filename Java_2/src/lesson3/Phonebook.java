package lesson3;


import java.util.*;

public class Phonebook {


    Map<String, Set<String>> maps = new LinkedHashMap<>();

    public void addSubscriber(String name, String number) {
        if(maps.containsKey(name)) {
            Set<String> numbers = maps.get(name);
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }else{
            maps.put(name, new HashSet<>(Arrays.asList(number)));

        }
    }

    public void getSubscriber(String name) {
        System.out.println(name + " " + maps.get(name));
    }

}
