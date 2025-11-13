package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Reporter;

import io.cucumber.java.en.*;

public class gmail {
	@Given("I am on login page")
	public void i_am_on_login_page() {
		Reporter.log("I am on login page", true);

	}

	@When("I provide details and click on login button")
	public void i_provide_details_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) {
		Reporter.log("I provide details and click on login button", true);
		
		System.out.println("-------List-------------------");
		List<List<String>> testListData=dataTable.asLists();
		List<String> user1 = testListData.get(1);
		String username1 = user1.get(0);
		String password1 = user1.get(1);
		String msg1=user1.get(2);
		Reporter.log(username1,true);
		Reporter.log(password1, true);
		Reporter.log(msg1, true);
		
		System.out.println("-------Map-------------------");
		List<Map<String, String>> testMapData = dataTable.asMaps();
		String username2 = testMapData.get(1).get("userName");
		String password2 = testMapData.get(1).get("password");
		String msg2 = testMapData.get(1).get("msg");
		Reporter.log(username2, true);
		Reporter.log(password2, true);
		Reporter.log(msg2, true);
		System.out.println("-------------------------------");
	}

	@Then("I should navigate to inbox")
	public void i_should_navigate_to_inbox() {
		Reporter.log("I should navigate to inbox", true);
	}

}
