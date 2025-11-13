package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarBikeHealthInsurance {
	
	@When("I click on CarInsurance button")
	public void i_click_on_car_insurance_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I click on CarInsurance button");
	}

	@When("I provide valid RTO number and click on view quotes button")
	public void i_provide_valid_rto_number_and_click_on_view_quotes_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I provide valid RTO number and click on view quotes button");
	}

	@When("I provide valid details and click on view quotes button")
	public void i_provide_valid_details_and_click_on_view_quotes_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I provide valid details and click on view quotes button");
	}

	@Then("I should get the paln details")
	public void i_should_get_the_paln_details() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I should get the paln details");
	}

	@When("I click on bikeInsurance button")
	public void i_click_on_bike_insurance_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I click on bikeInsurance button");
	}

}
