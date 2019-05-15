package collectionExercises;

import java.util.*;
import static java.util.stream.Collectors.*;

public class FrequencySorting {
    public int[] sorting (int[] array) {
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
