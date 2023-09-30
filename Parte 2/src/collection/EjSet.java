package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjSet {
    public static void main(String[] args) {
        // HashSet, TreeSet(Ordenado), LinkedHashSet
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(5);
        integers.add(1);

        System.out.println(integers);

        integers.addAll(Set.of(5,1,2,3,8,10,7));

        integers.forEach(integer -> System.out.println(integer));
    }
}
