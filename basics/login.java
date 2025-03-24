package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("Nagarju@gmail.com");
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();

	}

}
