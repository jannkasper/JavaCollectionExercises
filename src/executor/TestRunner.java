package executor;

import collectionExercises.FormedLargestNumber;
import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testing.FormedLargestNumberTest;
import testing.FrequencySortingTest;
import testing.PalindromeLinkedListTest;

public class TestRunner {
    public void frequencySortingRun () {
        Result result = JUnitCore.runClasses(FrequencySortingTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    public void formedLargestNumber () {
        Result result = JUnitCore.runClasses(FormedLargestNumberTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    public void palindromeLinkedListRun () {
        Result result = JUnitCore.runClasses(PalindromeLinkedListTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
