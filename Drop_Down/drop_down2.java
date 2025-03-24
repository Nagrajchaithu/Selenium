package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop_down2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.shadi.com/");
		dr.manage().window().maximize();
	//	dr.findElement(By.xpath("//a[text()='Join Now']")).click();
		//dr.findElement(By.xpath("//option[text()='Feb']")).click();
		//Thread.sleep(5000);
		
		//dr.findElement(By.xpath("//option[text()='04']")).click();
		//Thread.sleep(5000);
		//dr.findElement(By.xpath("//option[text()='2006']")).click();
		
		

	}

}
