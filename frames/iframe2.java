package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe2 {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//a[text()='Droppable']")).click();
		dr.switchTo().frame(dr.findElement(By.className("demo-frame")));
		Actions ac= new Actions(dr);
		ac.dragAndDrop(dr.findElement(By.xpath("//p[text()='Drag me to my target']")),dr.findElement(By.xpath("//p[text()='Drop here']"))).perform();
		dr.switchTo().defaultContent();
		

	}

}
