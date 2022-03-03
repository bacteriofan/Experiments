package collections;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        Cat c1 = new Cat();
//        c1.age = 45;
//        c1.name = "C1";
//
//        Cat c2 = new Cat();
//        c2.age = 20;
//        c2.name = "C2";
//
//        List list = new ArrayList();
//        list.add(c1);
//        list.add(c2);
//
//        Comparator<Cat> w = Comparator.comparing(y -> y.name);
//
//        Comparator<Cat> t = new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
//
//        Collections.sort(list);
//        Collections.sort(list, t);
//        Collections.sort(list, w);
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "a");
//        map.put(2, "A");
//
//        map.merge(1, "new", (a, b) -> a + b);
//
//        System.out.println(map);

        LinkedList<String> collect1 = Stream.of("A", "B", "C").collect(Collectors.toCollection(LinkedList::new));
        List<String> collect = Stream.of("A", "B", "C", "C").collect(Collectors.toList());
        collect.add("D");
        collect1.add("D");

        //Function.identity() is the same as s -> s
        Map<String, Integer> maap = collect1.stream().collect(Collectors.toMap(Function.identity(), String::length));
        Map<String, String> maap2 = collect.stream().collect(Collectors.toMap(s -> s, Function.identity(), (s1,s2) -> s1+s2)); //(s1,s2) -> s1+s2) resolves duplicated keys
        System.out.println(maap2);

        Map<Integer, Set<String>> collect2 = Stream.of("lions", "tiger", "bears")
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));


    }

}
