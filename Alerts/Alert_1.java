package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		
		
//if we want just accept or reject the alerts
		dr.switchTo().alert().accept();
		dr.switchTo().alert().dismiss();
		
		
		
//if we want to just accept or reject the alert in second way
		 Alert al=dr.switchTo().alert();
		 al.accept();
		 
		 
//if want to send to the field to the alerts
		 
		 Alert aa= dr.switchTo().alert();
		 aa.sendKeys("welcome to java");
		 aa.accept();
		 
		 
//if we want get the data from the alerts which has contains
		Alert mm= dr.switchTo().alert();
		System.out.println(mm.getText());
		

	}

}
