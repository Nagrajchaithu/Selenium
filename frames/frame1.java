package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame1 {

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.get("https://jqueryui.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//a[text()='Selectable']")).click();
		dr.switchTo().frame(dr.findElement(By.className("demo-frame")));
		Actions as = new Actions(dr);
		as.dragAndDrop(dr.findElement(By.xpath("//li[text()='Item 1']")), dr.findElement(By.xpath("//li[text()='Item 2']"))).perform();
          dr.switchTo().defaultContent();
	}

}
