package com.test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.Test;

public class TestJunitAddErrorFailure extends TestResult {
    //add the error
    public synchronized void addError(Test test, Throwable throwable) {
        super.addError((junit.framework.Test) test, throwable);
    }

    //add the failure
    public synchronized void addFailure(Test test, AssertionFailedError assertionFailedError) {
        super.addFailure((junit.framework.Test) test, assertionFailedError);
    }

    @Test
    public void testAdd() {
        //add any test
    }

    // Marks that the test run should stop.
    public synchronized void stop() {
        //stop the test here
    }
}
