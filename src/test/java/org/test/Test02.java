package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test02 {
	@Test
	public void tcA() {
		Assert.assertTrue("failed",false);
		System.out.println("A");
	}
	@Test
	public void tcB() {
		System.out.println("B");
	}
	@Ignore
	@Test
	public void tcC() {
		System.out.println("C");
	}

}
