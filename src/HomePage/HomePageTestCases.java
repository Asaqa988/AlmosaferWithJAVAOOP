package HomePage;

import java.awt.Container;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v120.debugger.Debugger.ContinueToLocationTargetCallFrames;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTestCases extends Parameters {

	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();
		driver.get(URL);

		WebElement popMSG = driver.findElement(By.cssSelector(".sc-iBmynh.izXFRL"));

		if (popMSG.isDisplayed()) {
			WebElement SarBUTTON = driver
					.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
			SarBUTTON.click();
		}

	}

	@Test()

	public void CheckTheDefaultLanguageIsEnglish() {
		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");

		myAssert.assertEquals(ActualLanguage, ExpectedLanguage);

	}

	@Test()
	public void CheckTheDefaultCurrency() {
		String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText(); 
		
		myAssert.assertEquals(ActualCurrency, ExpectedCurrency,"wllah this is currency check"); 

	}
	
	@Test()
	public void CheckTheContactNumber() {
		String ActualNumber = driver.findElement(By.tagName("strong")).getText(); 
		
		myAssert.assertEquals(ActualNumber,ExpectedNumber ,"wllah this is contact number check"); 

	}

}
