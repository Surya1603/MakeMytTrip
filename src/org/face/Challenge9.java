package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\SelChallenge1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.className("gLFyf"));
		element.sendKeys("Inmakes learning hub");
		element.submit();
		
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3")).click();
		
		driver.quit();
	}

}
