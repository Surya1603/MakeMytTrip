package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\SelChallenge1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement l = driver.findElement(By.className("gLFyf"));
		l.sendKeys("https://accounts.google.com/");
		
		driver.get("https://accounts.google.com/");
		
		WebElement a = driver.findElement(By.id("identifierId"));
        a.sendKeys("surya160398@gmail.com");
        
        
        driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/div[3]")).click();
        
        
	}

}
