package KeyBoard_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_Keyboard_Action {

	public static void main(String[] args) {
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String ss=dr.getTitle();
		System.out.println(ss);
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nagaraju");
		Actions ac= new Actions(dr);
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.TAB).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		

	}

}
