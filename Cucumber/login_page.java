package Cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class login_page {
	WebDriver dr;
	
	@Given("open the browser")
	public void openbrowser() {
		dr=new ChromeDriver();
		
		
	}
	@Then("enter url")
	public void entrurl() {
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@And("click on loggin button")
	public void logginbutton() {
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		
	}
	@Then("Enter username")
	public void username() {
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
	}
	@And("enter password")
	public void password() {
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	}
	@Then("click on submit button")
	public void submit() {
		dr.findElement(By.xpath("//span[text()='Submit']")).click(); 
		
	}
	@Then("close the window")
	public void close() {
		dr.close();
	}
	@Given("open the browserr")
	public void openbrowser1() {
		dr=new ChromeDriver();
		
		
	}
	@Then("enter urll")
	public void entrurl1() {
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@And("click on loggin buttonn")
	public void logginbutton1() {
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		
	}
	@Then("Enter usernamee")
	public void username1() {
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
	}
	@And("enter invalid passwordd")
	public void inv() {
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	}
	@Then("click on submit buttonn")
	public void sub () {
		dr.findElement(By.xpath("//span[text()='Submit']")).click();
	}
	@Then("close the windoww")
	public void close1() {
		dr.close();
	
	}
}
