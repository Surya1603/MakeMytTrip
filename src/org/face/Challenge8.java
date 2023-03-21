package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Challenge8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\SelChallenge1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com");
	    driver.quit();
	   WebElement element = driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]/div[3]/div/ul/li[1]/a"));
	   String text = element.getText();
	   System.out.println(text);
	    
	}

}
