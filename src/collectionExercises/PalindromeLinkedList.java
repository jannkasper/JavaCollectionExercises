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
        while (linkedList.size() != 0) {
            if(linkedList.size() == 1) return true;
            if (linkedList.pollFirst() != linkedList.pollLast()) return false;
        }
        return true;
    }

    public boolean recursionMethod(Iterator front, Iterator back){
        if (!front.hasNext() && !back.hasNext()) return true;

        if (front.next() == back.next()) return recursionMethod(front,back);

        return false;
    }

}
