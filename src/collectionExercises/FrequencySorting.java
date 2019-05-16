package collectionExercises;

//        [Explanation]
//        Given an array A[] of integers, sort the array according to frequency of elements.
//        That is elements that have higher frequency come first. If frequencies of two elements are same,
//        then smaller number comes first.

//        input: 5 5 4 6 4    output: 4 4 5 5 6
//        input: 9 9 9 2 5  output: 9 9 9 2 5

import java.util.*;
import static java.util.stream.Collectors.*;

public class FrequencySorting {
    public int[] sorting (int[] array) {
        if (array == null) return  null;

        Map<Integer, Integer> map = new TreeMap();
        for (int element : array){
            if (map.containsKey(element)){
                map.put(element,map.get(element)+1);
            } else {
                map.put(element,1);
            }
        }
        Map<Integer, Integer> sorted = map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
//            System.out.println("Number " + entry.getKey() + " frequency: " + entry.getValue());
            for (int i = 0; i<entry.getValue(); i++) {
                array[count++] = entry.getKey();
            }
        }


        return array;
    }
}
