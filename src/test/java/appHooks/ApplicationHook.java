package appHooks;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.Kayak.Pages.KayakHomePage;
import com.Utils.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ApplicationHook extends TestBase{
	
	public KayakHomePage kayakHomePage;
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	
	@Before(order = 0)
	public void settingUpEnvironment() throws Exception  {
		TriggerDependencies();
		
	}

	@Before(order = 1)
	public void launchBrowser() throws Exception {
		sClassNameForScreenShot = getClass().getSimpleName();
		driver.get(oCons.getKayakURL());
		
		Thread.sleep(3000);
	}

	@After(order = 1)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 0)
	public void tearDown() throws Exception {
		
		ShuttingDownAllDependencies() ;
		}
	}

