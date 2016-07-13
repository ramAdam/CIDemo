package com.ciDemo;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void testHelloWorld() {
			Assert.assertEquals(App.getHelloWorld(), "Hello World");
	}

}
