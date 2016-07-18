package com.ciDemo.bdd.steps;


import com.ciDemo.App;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;


public class GreeterSteps {
	
	App app;
	
	@Before
	public void setUp()
	{
		app = new App();
	}
	
	@Then("^Then i should see (.*)$")
	public void sayHello() throws Throwable
	{
		assertEquals(App.getHelloWorld(), "Hello World");
	}
	

}
