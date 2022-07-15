package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test01 {
	@Test
	public void tc01() {
		Assert.assertTrue("failed",false);
		System.out.println(1);
	}
	@Test
	public void tc02() {
		System.out.println(2);
	}
	@Ignore
	@Test
	public void tc03() {
		System.out.println(3);
	}

}
