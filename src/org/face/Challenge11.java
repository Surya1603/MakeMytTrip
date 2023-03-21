package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\SelChallenge1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement element = driver.findElement(By.id("autocomplete"));
		element.sendKeys("Smartwatch");
		
		driver.findElement(By.xpath("//*[@id=\'search\']/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\'product_list\']/div[2]/div[1]/a")).click();
	}

}
