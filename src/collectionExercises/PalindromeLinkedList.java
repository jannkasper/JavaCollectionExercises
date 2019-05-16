package collectionExercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class PalindromeLinkedList {
    public boolean palindromeList (Integer[] array) {
        if(array == null) return  false;

        boolean check;
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(array));

        check = pollMethod(list);

        check = recursionMethod(list.iterator(), list.descendingIterator());

        return check;
    }

    public boolean pollMethod(LinkedList linkedList){
        // Compare and Delete first and last element till none/one element
        while (linkedList.size() != 0) {
            if(linkedList.size() == 1) return true;
            if (linkedList.pollFirst() != linkedList.pollLast()) return false;
        }
        return true;
    }

    public boolean recursionMethod(Iterator front, Iterator back){
        // Recursion have crossed whole IteratorList
        if (!front.hasNext() && !back.hasNext()) return true;
        // Check next iterators if current have equal value
        if (front.next() == back.next()) return recursionMethod(front,back);

        return false;
    }

}
