package org.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Test01.class,Test02.class})
public class Runner {
	@Test
	public void results() {
		Result r = JUnitCore.runClasses(Test01.class,Test02.class);
		int runCount = r.getRunCount();
		System.out.println("RunCount-"+runCount);
		int ignoreCount = r.getIgnoreCount();
		System.out.println("IgnoreCount-"+ignoreCount);
		long runTime = r.getRunTime();
		System.out.println("Runtime-"+runTime);
		int failureCount = r.getFailureCount();
		System.out.println("FailureCount-"+failureCount);
		List<Failure> failures = r.getFailures();
		System.out.println("failures-"+failures);
		//Enhanced For loop
		for (Failure failure : failures) {
			System.out.println("Loop Failure-"+failure);
		}

	}
	
	

}
