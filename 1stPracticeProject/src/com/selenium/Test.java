package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Test {
	

	public void register() {

		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Oneplus 8t\\\\\\\\Saud documents\\\\\\\\MPHASIS\\\\\\\\jar files\\\\\\\\Selenium\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content")).sendKeys("sayed.ali@gmail.com");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content")).sendKeys("sayed@ali");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content")).sendKeys("sayed@ali");

		Select country = new Select(driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content")));
		country.selectByVisibleText("India");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content")).sendKeys("Sayed");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content")).sendKeys("Ali");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content")).sendKeys("Java_FullStack_developer");

		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content")).sendKeys("xyz");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content")).sendKeys("Cyber city Maggarpatta,Pune");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content")).sendKeys("Pune");
		Select state = new Select(driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content")));
		state.selectByVisibleText("Maharashtra");
		driver.findElement(By.name("sView1:r1:0:postalCode")).sendKeys("411028");

		WebElement button = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		button.click();
	}
	
	
	public void login() {

		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Oneplus 8t\\\\\\\\Saud documents\\\\\\\\MPHASIS\\\\\\\\jar files\\\\\\\\Selenium\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.oracle.com/mysso/signon.jsp%3Frequest_id%3D007");
		
		driver.findElement(By.cssSelector("#sso_username")).sendKeys("sayed.ali@gmail.com");
		driver.findElement(By.cssSelector("#ssopassword")).sendKeys("sayed@ali");
		
		WebElement button = driver.findElement(By.cssSelector("#signin_button"));
		button.click();
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.register();
		obj.login();
		
	}
}