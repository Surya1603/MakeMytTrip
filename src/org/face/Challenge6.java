package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Challenge6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\SelChallenge1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		driver.findElement(By.id("from_station")).sendKeys("Chennai");
		driver.findElement(By.id("to_station")).sendKeys("Madurai");
		
		WebElement element = driver.findElement(By.id("trainClass"));
		Select s = new Select(element);
		s.selectByValue("SL");
		driver.findElement(By.xpath("//*[@id=\'datePickerWrapper\']/table[1]/tbody/tr[6]/td[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\'trainFormButton\']")).click();
	
		
		driver.quit();
	}

}
