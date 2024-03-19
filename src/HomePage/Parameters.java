package HomePage;

import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.almosafer.com/en";


	String ExpectedEnglishLanage = "en";
	String ExpectedArabicLanagage = "ar"; 
	String ExpectedCurrency = "SAR";
	String ExpectedNumber = "+966554400000";

	Assertion myAssert = new Assertion();
	
	Random rand = new Random(); 
	
	String [] websites= {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
	int randomWebsite = rand.nextInt(websites.length); 

}
