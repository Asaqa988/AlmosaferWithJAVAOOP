package HomePage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.almosafer.com/en";

	String ExpectedLanguage = "en";
	String ExpectedCurrency = "SAR";
	String ExpectedNumber = "+966554400000";

	Assertion myAssert = new Assertion();
}
