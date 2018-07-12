package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.gecko.driver", "C:\\dev\\tools\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		WebElement searhField = driver.findElement(By.name("q"));
		searhField.sendKeys("pluralsight");
		searhField.submit();
		
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		Thread.sleep(5000);
		imagesLink.click();
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
		imageElement.click();
		
	}

}
