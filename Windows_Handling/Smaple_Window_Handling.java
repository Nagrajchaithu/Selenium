package Windows_Handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Smaple_Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=18275644592751584862&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9184931&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung mobiles");
		dr.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
           String parent=dr.getWindowHandle();
           dr.findElement(By.xpath("//span[text()='Samsung Galaxy S25 5G AI Smartphone (Silver Shadow, 12GB RAM, 256GB Storage), 50MP Camera with Galaxy AI']")).click();
           Set<String> parent1=dr.getWindowHandles();
           for(String child:parent1) {
        	   
        	   if(!child.equals(parent)) {
        		   dr.switchTo().window(child);
        	   }
        	   
           }
           dr.switchTo().window(parent);
           Thread.sleep(3000);
           Actions ac = new Actions(dr);
           ac.scrollByAmount(0, 1000).build().perform();
           
//           JavascriptExecutor jse = ((JavascriptExecutor)dr);
//			jse.executeScript("window.scrollBy(0, 1500)");
          
           
        

	}

		
						

}
