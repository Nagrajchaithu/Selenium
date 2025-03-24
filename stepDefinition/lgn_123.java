package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import application_Hooks.demo1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class lgn_123 {
	WebDriver dr;


@Given("username as demo")
public void username_as_demo() throws InterruptedException {
	Thread.sleep(5000);
	dr=demo1.getDriver();
	//System.out.println("dr -> "+dr);
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
 
}

@Given("password as {int}")
public void password_as(Integer int1) {
	dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
   
}

@Then("submit")
public void submit() {
	dr.findElement(By.xpath("//span[text()='Submit']")).click();
   
}

@Then("click payuser")
public void click_payuser() throws InterruptedException {
	Thread.sleep(4000);
	dr.findElement(By.xpath("//div[text()=' Pay user ']")).click();
    
}
@And("click payment to system")
public void mm() {
	dr.findElement(By.xpath("//div[text()='Payment to system']")).click();
	
	
}

@And("click  QR scanner")
public void ss() {
	dr.findElement(By.xpath("//div[text()='Receive QR-code']")).click();
}

@And("click receive payment")
public void dd() {
	dr.findElement(By.xpath("//div[text()='Receive payment']")).click();
}

@And("click shcedule payment")
public void aa() {
	dr.findElement(By.xpath("//div[text()='Scheduled payments']")).click();
}
@And("click on payment request")
public void bb() throws InterruptedException {
	Thread.sleep(5000);
	dr.findElement(By.xpath("//div[text()='Payment requests']")).click();
}
@And("click on external payment")
public void ff() {
	dr.findElement(By.xpath("//div[text()='External payments']")).click();
	
}
@And ("click on ticket")
public void gg() {
	dr.findElement(By.xpath("//div[text()='Tickets']")).click();
}



	
	

}
