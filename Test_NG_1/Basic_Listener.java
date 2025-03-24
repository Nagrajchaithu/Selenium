package Test_NG_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Basic2_Listner.class)
public class Basic_Listener {
	@Test
	public void mm() {
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		Assert.assertTrue(false);
		
		
	}

}
