package com.ciDemo.bdd.steps;


import com.ciDemo.App;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class GreeterSteps {
	
	App app;
	
	@Before
	public void setUp()
	{
		app = new App();
	}
	
	@Given("^I have a greeter$")
	public void i_have_a_greeter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertNotNull(app);
	}

	
	@Then("^i should see \"(.*?)\"$")
	public void i_should_see_Hello_World(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(App.getHelloWorld(), arg1);
	    
	}

	

}
