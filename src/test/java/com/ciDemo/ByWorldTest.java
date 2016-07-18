package com.ciDemo;

import org.junit.Test;
import org.junit.Assert;

public class ByWorldTest {

	@Test
	public void testGetByeWorld() {
		Assert.assertEquals(App.getByeWorld(), "Good Bye World");
	}

}
