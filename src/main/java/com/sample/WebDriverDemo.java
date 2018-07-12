package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\dev\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		WebElement searhField = driver.findElement(By.name("q"));
		searhField.sendKeys("java");
	}

}
