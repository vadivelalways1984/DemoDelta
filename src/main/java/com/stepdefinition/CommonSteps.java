
package com.stepdefinition;

import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;

public class CommonSteps extends FunctionalLibrary {
	@Given("^The user is in delta homepage$")
	public void the_user_is_in_delta_homepage() throws Throwable {
		driver.get("https://www.delta.com/");
	}
}
