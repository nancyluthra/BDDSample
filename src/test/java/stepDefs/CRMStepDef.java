package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
//	@Before
//	public void setup()
//	{
//		System.out.println("Before each Scenario....");
//	}
//	
//	@After
//	public void teardown()
//	{
//		System.out.println("After each Scenario....");
//	}
//	@BeforeStep
//	public void setupStep()
//	{
//		System.out.println("Before each Step....");
//	}
//	
//	@AfterStep
//	public void teardownStep()
//	{
//		System.out.println("After each Step....");
//	}
	
//	@Before("@RegressionTest")
//	public void setupDB()
//	{
//		System.out.println("DB for RegressionTest");
//	}
//	@Before("@SmokeTest")
//	public void setupDBRemote()
//	{
//		System.out.println("DB for SmokeTest");
//	}
//	@Before(order=2)
//	public void setupDB()
//	{
//		System.out.println("Before each set1....");
//	}
//	
//	@Before(order=1)
//	public void initBrowser()
//	{
//		System.out.println("Init browser....");
//	}
	
	@Before(value="@RegressionTest",order=2)
	public void setupDB()
	{
		System.out.println("Before each set1....");
	}
	
	@Before(value="@RegressionTest",order=1)
	public void initBrowser()
	{
		System.out.println("Init browser....");
	}
	@Before(value="@SmokeTest",order=2)
	public void setupDBSmoke()
	{
		System.out.println("Before each set1....");
		System.out.println("Before each set2....");
	}
	
	@Before(value="@SmokeTest",order=1)
	public void initBrowserSmoke()
	{
		System.out.println("Init browser Smoke....");
	}
	
	@Given("User must login")
	public void user_must_login() {
	    System.out.println("user_must_login");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("user_create_a_new_contact");
	}
	
	@When("User view a contact")
	public void user_view_a_contact() {
		System.out.println("user_view_a_contact");
	}
	
	@When("User edit contact details")
	public void user_edit_contact_details() {
		System.out.println("User edit contact details");
	}


	@When("User create a new deal")
	public void user_create_a_new_deal() {
		System.out.println("user_create_a_new_deal");
	}
	
	@When("User view deal details")
	public void user_view_deal_details() {
		System.out.println("user_view_deal_details");
	}
	
	@When("User Logout from App")
	public void user_logout_from_app() {
		System.out.println("user_logout_from_app");
	}
	
	@When("User create a new Task")
	public void user_create_a_new_task() {
		System.out.println("user_create_a_new_task");
	}
	
	@When("User view a Task")
	public void user_view_a_task() {
		System.out.println("user_view_a_tas");
	}
	

	@When("User edit Task details")
	public void user_edit_task_details() {
		System.out.println("user_edit_task_details");
	}
}
