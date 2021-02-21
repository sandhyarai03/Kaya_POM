package stepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.Kayak.Pages.KayakHomePage;
import com.Utils.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class KayakStepDefTest extends TestBase {
	
	public KayakHomePage kayakHomePage;
	Logger log = Logger.getLogger(getClass().getSimpleName());

	
	@Given("^user is on Kayak Application$")
	public void user_is_on_Kayak_Application() throws Throwable {
		kayakHomePage = new KayakHomePage(driver);
	}
	
	@When("^user clicks on Flight button$")
	public void user_clicks_on_Flight_button() throws Throwable {
		kayakHomePage.clickFlightLink();
		String actualKayakTitle = oBroUti.PageTitle();
		Assert.assertEquals(actualKayakTitle, System.getProperty("expectedKayakTitle"), "Kayak Page Titles are not matching");
		log.info("Kayak Page Titles is correct");
	
}
	
	
	@When("^user enter the \"([^\"]*)\" also selects the nearAll airport$")
		public void user_enter_the_also_selects_the_nearAll_airport(String originCityAirport) throws Throwable {
		kayakHomePage.enterOriginCity(originCityAirport);
}
	
	
	@When("^user enters the\"([^\"]*)\" and selects the nearAll airport$")
		public void user_enters_the_and_selects_the_nearAll_airport(String destinationCityAirport) throws Throwable {
		kayakHomePage.enterDestinationCity(destinationCityAirport);
}



	@When("^user selects the startDate and endDate$")
	public void user_selects_the_startDate_and_endDate() throws Throwable {
  	kayakHomePage.selectDeparture_ArrivalDate();
	}

	@When("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		kayakHomePage.searchBtn();
		kayakHomePage.closePopUpOnResultPage();
}

	@When("^user unselects the two Stop Option$")
		public void user_unselects_the_two_Stop_Option() throws Throwable {
		kayakHomePage.unselectTwoStop();
	}

	@Then("^user should be able to see the search result based on \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_see_the_search_result_based_on_and(String originCityCode, String destinationCityCode) throws Throwable {
		kayakHomePage.verifySearchResult(originCityCode, destinationCityCode );
}
}
