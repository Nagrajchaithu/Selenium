package Drop_Down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down1 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.shadi.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("//a[text()='Join Now']")).click();
		WebElement wb =dr.findElement(By.xpath("//select[@id='dob_m']"));
		Select sc= new Select(wb);
		sc.selectByIndex(4);
		WebElement wa =dr.findElement(By.xpath("//select[@id='dob_d']"));
		Select sb = new Select(wa);
		sb.selectByValue("03");
		 WebElement wc =dr.findElement(By.xpath("//select[@id='dob_y']"));
		 Select ss = new Select(wc);
		 ss.selectByContainsVisibleText("2005");
		
		

  }

}
