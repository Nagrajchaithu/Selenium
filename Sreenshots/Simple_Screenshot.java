package Sreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Simple_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.shadi.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		TakesScreenshot as = (TakesScreenshot)dr;
		         File fi= as.getScreenshotAs(OutputType.FILE);
		      
		          Files.copy(fi, new File("C:\\Users\\Administrator\\Desktop\\img1.png"));
		         // FileUtils.copyFile(fi,new File("C:\\Users\\Administrator\\Desktop\\img1.png"));
		
		
		
	

	}

}
