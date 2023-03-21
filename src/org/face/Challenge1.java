package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Challenge1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\SelChallenge1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement l = driver.findElement(By.className("gLFyf"));
		l.sendKeys("https://www.amazon.in/");
		l.submit();
		
		driver.get("https://www.amazon.in/");
		
		WebElement m = driver.findElement(By.id("twotabsearchtextbox"));
		m.sendKeys("Iphone");
		m.submit();
		
        driver.close();
		
    
	}

}



