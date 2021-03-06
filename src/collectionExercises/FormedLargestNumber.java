package collectionExercises;

//        [Explanation]
//        Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.
//        The result is going to be very large, hence return the result in the form of a string.

//        input: 3 30 34 5 9    output: 9534330
//        input: 54 546 548 60  output: 6054854654

import java.util.*;
import java.util.stream.Collectors;

public class FormedLargestNumber {
    public String largestNumber (int[] array){
        if(array == null || array.length == 0) return  null;

        int maxDigits = Integer.toString(Arrays.stream(array).max().getAsInt()).length();
        List<String> strings = Arrays.asList(Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new));

        // Compare Strings by digits (starting from last char digit)
        // Find the biggest digit in the front. [example for 60 and 543: have to compare 6 with 5]
        for (int i =maxDigits-1; i >= 0; i--) {
            final int charPosition = i;
            Collections.sort( strings, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    // if digit not exist return opposite number
                    return (o1.length() > charPosition && o2.length() > charPosition )
                            ? Character.compare(o2.charAt(charPosition), o1.charAt(charPosition))
                            : (o1.length() <= charPosition) ? 1 : -1;
//
                }
            });
        }

        return String.join("", strings);
    }
}
