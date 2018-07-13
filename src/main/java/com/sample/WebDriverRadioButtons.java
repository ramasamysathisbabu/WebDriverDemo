package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/workspaces_STS/WebDriverDemo/src/main/webapp/RadioButtonTest.html");
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(1).click();
		
		for (WebElement webElement: radioButtons){
			if (webElement.isEnabled()){
				System.out.println(webElement.getAttribute("value"));
			}
		}
	}

}
