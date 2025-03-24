package Waits_Concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
			WebDriver dr= new ChromeDriver();
			dr.get("https://demo.cyclos.org/ui/dashboard");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			dr.findElement(By.xpath("//div[text()=' Login ']")).click();
			dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
			
			
			
			WebDriverWait wait =new WebDriverWait(dr,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='passwordaa']")));
			dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
			dr.findElement(By.xpath("//span[text()='Submit']")).click();
			
			
			
			
			
			

			
	}

}
