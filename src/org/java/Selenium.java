package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\JavaProject\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("ameer");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("gdgdgd");
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	}

}