package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Surya\\\\\\\\eclipse-workspace\\\\\\\\SelChallenge1\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/a")).click();
		driver.findElement(By.id("first-name")).sendKeys("Vishnu");
		driver.findElement(By.id("last-name")).sendKeys("Priya");
		driver.findElement(By.id("email")).sendKeys("vishnu0379@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9874568541");
		WebElement element = driver.findElement(By.id("country"));
		Select s = new Select(element);
		s.selectByValue("4");
		driver.findElement(By.id("city")).sendKeys("Covai");
		driver.findElement(By.id("message")).sendKeys("usefull for biggners");
		driver.findElement(By.id("code")).sendKeys("28Ik");
		
		driver.findElement(By.xpath("//*[@id=\'enroll-form\']/button")).submit();
		
	}

}
