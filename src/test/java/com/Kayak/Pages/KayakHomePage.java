package com.Kayak.Pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utils.TestBase;

public class KayakHomePage extends TestBase {
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	//constructor
	public KayakHomePage(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//Locators From City
	
	@FindBy(xpath = "//a[.='Flights']")
	WebElement flightLink;
	
	@FindBy(xpath = "//div[contains(@id ,'-origin-airport-display') and @data-placeholder='From?']")
	WebElement txtOriginCity;
	
	@FindBy(xpath = "//input[contains(@aria-activedescendant,'-origin-airport-nearby') and @aria-label='Flight origin input']")
	WebElement txtInnerOriginCity;
	
	@FindBy(xpath ="//div[contains(text(),'San Francisco, CA')]")
	WebElement originCityDropDown;
	
	@FindBy(xpath ="//div[contains(@id, '-origin-airport-display-multi-container')]//div[@data-value='SFO']")
	WebElement selectedTextOriginCity;
	
	@FindBy(xpath ="//li[contains(@id,'-origin-airport-nearby')]")
	WebElement nearAllOriginTab;
	
	//@FindBy(xpath ="//h2[@class='title dark']")
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/h2[1]")
	WebElement kayakPageHeaderText;
	
	//Locators To City
	
	@FindBy(xpath ="//div[contains(@id ,'-destination-airport-display') and @data-placeholder='To?']")
	WebElement txtDestinationCity;
	
	@FindBy(xpath ="//input[contains(@id,'-destination-airport') and @placeholder='To?']")
	WebElement txtInnerDestinationCity;
	
	@FindBy(xpath ="//div[contains(text(),'Hyderabad, India')]")
	WebElement destinationCityDropDown;
	
	@FindBy(xpath ="//div[contains(@id, '-destination-airport-display-multi-container')]//div[@data-value='HYD']")
	WebElement selectedTextDestinationCity;
	
	@FindBy(xpath ="//li[contains(@id,'-destination-airport-nearby')]")
	WebElement nearAllDestinationTab;
	
	//Locatots Calander
	
	@FindBy(xpath ="//div[contains(@id,'-dateRangeInput-display-start') and @aria-label='Departure date input']")
	WebElement departureDateCalanderIcon;
	
	@FindBy(xpath ="//div[contains(@id,'stl-jam-cal-nextMonth') and @aria-label='Next month']")
	WebElement nextMonthArrow;
	
	//String month = "March";
	//String Date = "20";
	@FindBy(xpath ="//div[@id='stl-jam-cal-monthsGrid']//div[@aria-label='March 12']/div[.='12']")
	WebElement pickDepartureDate;
	
	@FindBy(xpath ="//div[@id='stl-jam-cal-monthsGrid']//div[@aria-label='April 20']/div[.='20']")
	WebElement pickArrivalDate;
	
	//Locator Search btn 
	
	@FindBy(xpath ="//button[contains(@id,'-submit') and @title='Search flights']/parent::div[contains(@id,'-button-wrapper')]")
	WebElement btnSearch;
	
	//Locator pop-up
	
	@FindBy(css ="div.flightsDriveBy .Button-No-Standard-Style")
	WebElement popUp;
	
	//Locators 2+ Stop options
	
	@FindBy(css ="li[data-name='2'] .icon")
	WebElement twoStopChkBox;
	
	//Locators flight search result
	
	@FindBy(xpath ="//div[@class='bottom']//div[@title='San Francisco']/following-sibling::div[contains(@title,'Hyderabad')]")
	WebElement searchResultDestination;
	
	@FindBy(xpath ="//div[@class='bottom']//div[contains(@id,'-info-leg-0-origin-airport')and @title='San Francisco']")
	WebElement searchResultOrigin;
	
	//page actions
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void enterOriginCity(String originCity) throws Exception {
		//OriginAirport
		oBroUti.waitForElementVisible(driver, txtOriginCity, 10);
		oBroUti.ufClearFieldByBackSpaceKey(txtOriginCity);
		log.info("Origin airport field is cleared");
		
		oBroUti.waitForElementVisible(driver, txtInnerOriginCity, 10);
		oBroUti.ufSendKeys(txtInnerOriginCity, originCity);
		log.info("Origin airport field is clicked and value is sent");
		
		oBroUti.waitForElementVisible(driver, originCityDropDown, 10);
		oBroUti.ufClick(originCityDropDown);
		log.info("Origin airport dropdown is selected");
		
		
		//Selecting nearAll Origin field
		oBroUti.waitForElementVisible(driver, selectedTextOriginCity, 10);
		oBroUti.ufClick(selectedTextOriginCity);
		log.info("Origin airport text is clicked");
		
		oBroUti.waitForElementVisible(driver, nearAllOriginTab, 10);
		oBroUti.ufClick(nearAllOriginTab);
		log.info("Origin airport nearbyAll options are selected");
		
		//oBroUti.waitForElementVisible(driver, kayakPageHeaderText, 10);
		//oBroUti.ufClick(kayakPageHeaderText);
		
	}
		public void enterDestinationCity(String destinationCity) throws Exception {
		//DestinationAirpoty
		oBroUti.waitForElementVisible(driver, txtDestinationCity, 10);
		oBroUti.ufClearFieldByBackSpaceKey(txtDestinationCity);
		log.info("Destination airport field is cleared");
		
		oBroUti.waitForElementVisible(driver, txtInnerDestinationCity, 10);
		oBroUti.ufSendKeys(txtInnerDestinationCity, destinationCity);
		log.info("Destination airport field is clicked and value is sent");
		
		oBroUti.waitForElementVisible(driver, destinationCityDropDown, 10);
		oBroUti.ufClick(destinationCityDropDown);
		log.info("Destination airport dropdon is selected");
		
		oBroUti.waitForElementVisible(driver, selectedTextDestinationCity, 6);
		oBroUti.ufClick(selectedTextDestinationCity);
		log.info("Destination airport text is clicked");
		
		oBroUti.waitForElementVisible(driver, nearAllDestinationTab, 10);
		oBroUti.ufClick(nearAllDestinationTab);
		log.info("Destination airport nearbyAll options are selected");
		
		
		oBroUti.waitForElementVisible(driver, kayakPageHeaderText, 10);
		oBroUti.ufClick(kayakPageHeaderText);
		log.info("Kayak Header text is clicked");
	}
	
	public void selectNearByOrigin() throws Exception {
		
		//Origin Airport NearAll
		oBroUti.waitForElementVisible(driver, selectedTextOriginCity, 10);
		oBroUti.ufClick(selectedTextOriginCity);
		
		oBroUti.waitForElementVisible(driver, nearAllOriginTab, 10);
		oBroUti.ufClick(nearAllOriginTab);
		
		//oBroUti.waitForElementVisible(driver, kayakPageHeaderText, 10);
		//oBroUti.ufClick(kayakPageHeaderText);
		
	}
		public void selectNearByDestination() throws Exception {
		//Destination Airport NearAll
		
		oBroUti.waitForElementVisible(driver, selectedTextDestinationCity, 6);
		oBroUti.ufClick(selectedTextDestinationCity);
		
		oBroUti.waitForElementVisible(driver, nearAllDestinationTab, 10);
		oBroUti.ufClick(nearAllDestinationTab);
		
		
		oBroUti.waitForElementVisible(driver, kayakPageHeaderText, 10);
		oBroUti.ufClick(kayakPageHeaderText);
		
	}
		public void selectDeparture_ArrivalDate() throws Exception{
			
			oBroUti.waitForElementVisible(driver, departureDateCalanderIcon, 10);
			oBroUti.ufClick(departureDateCalanderIcon);
			log.info("Departure calander is clicked");
			
			oBroUti.waitForElementVisible(driver, nextMonthArrow, 10);
			oBroUti.ufClick(nextMonthArrow);
			log.info("Calander next arrow is clicked");
			
			oBroUti.waitForElementVisible(driver, pickDepartureDate, 10);
			oBroUti.ufClick(pickDepartureDate);
			log.info("departure date is picked");
			
			oBroUti.waitForElementVisible(driver, pickArrivalDate, 10);
			oBroUti.ufClick(pickArrivalDate);
			log.info("arrival date is picked");
		}
		public void searchBtn() throws Exception {
			oBroUti.waitForElementVisible(driver, btnSearch, 10);
			oBroUti.ufClick(btnSearch);
			log.info("search button is clicked");
		}
		
		public void closePopUpOnResultPage() throws Exception {
			oBroUti.waitForElementVisible(driver, popUp, 10);
			oBroUti.ufClick(popUp);
			log.info("popup on result page is clicked");
		}
		
		public void unselectTwoStop() throws Exception {
			oBroUti.waitForElementVisible(driver, twoStopChkBox, 10);
			oBroUti.ufClick(twoStopChkBox);
			log.info("2+ Stop is unchecked");
		}
		
		public  void verifySearchResult(String oriCityCode, String desCityCode) throws Exception {
			
			oBroUti.waitForElementVisible(driver, searchResultOrigin, 10);
			oBroUti.waitForElementVisible(driver, searchResultDestination, 10);
			
			Assert.assertEquals(searchResultOrigin.getText(), oriCityCode, "Origin city is not matching");
			Assert.assertEquals(searchResultDestination.getText(), desCityCode, "Destination city is not matching");
			
			
			log.info("origin and departure cities are matching on result page");
			/*if (searchResultDestination.getText().equalsIgnoreCase("HYD") && searchResultOrigin.getText().equalsIgnoreCase("SF") ) {
				
				System.out.println("origin and destination cities are matching");
			}else {
				System.out.println("origin and destination cities are not matching");
			}
			*/
		}
		
	
	public void clickFlightLink() throws Exception {
		oBroUti.waitForElementVisible(driver, flightLink, 5);
		oBroUti.ufClick(flightLink);
	}
	
	
	
	
}
