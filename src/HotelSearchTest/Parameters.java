package HotelSearchTest;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Parameters {

	WebDriver driver = new ChromeDriver(); 
	
	String URL = "https://www.almosafer.com/en"; 
	
	String [] ArabicCities = {"دبي","جدة"}; 
	String [] EnglishCiities = {"dubai","jeddah","riyadh"};
	Random rand = new Random(); 

	int RandomArabicCity =rand.nextInt(ArabicCities.length); 
			int RandomEnglishCity= rand.nextInt(EnglishCiities.length); 
			

	int vistorNumber = rand.nextInt(2); 
	Assertion myAssert = new Assertion();

	
}
