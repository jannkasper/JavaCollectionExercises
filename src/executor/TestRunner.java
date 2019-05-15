package executor;

import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testing.FrequencySortingTest;

public class TestRunner {
    public void frequencySortingRun () {
        Result result = JUnitCore.runClasses(FrequencySortingTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
