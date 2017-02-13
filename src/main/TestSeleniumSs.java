package main;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;;

	public class TestSeleniumSs {


		public static void main (String[] args) throws InterruptedException {
							
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			
		
		   WebDriver driver=new ChromeDriver();
		   	driver.get("https://www.ss.lv/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("RU")).click();
			driver.findElement(By.linkText("Электротехника")).click();
			Thread.sleep(2000);
		    driver.findElement(By.linkText("Поиск")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ptxt")).sendKeys("Ноутбуки");
		    Thread.sleep(1500);
		   
		    	
		    Select sel2 = new Select(driver.findElement(By.name("search_region")));
			sel2.selectByValue("riga_f");
			Thread.sleep(1500);
			
			Select sel3 = new Select(driver.findElement(By.name("pr")));
			sel3.selectByValue("30");
			Thread.sleep(2000);
			
			Select sel4 = new Select(driver.findElement(By.name("sort")));
			sel4.selectByValue("0");
			Thread.sleep(1500);
			
			driver.findElement(By.name("btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Цена")).click();
			Thread.sleep(2000);
			
			Select sel5 = new Select(driver.findElement(By.xpath("//html/body/div[3]/div/table/tbody/tr/td/div[1]/table/tbody/tr/td/div[2]/span[3]/select")));
			sel5.selectByVisibleText("Продажа");
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Расширенный поиск")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.name("topt[8][min]")).sendKeys("0");
		    Thread.sleep(1500);
		   
		    driver.findElement(By.name("topt[8][max]")).sendKeys("300");
		    Thread.sleep(1500);
			
		    Select sel6 = new Select(driver.findElement(By.name("pr")));
			sel6.selectByValue("0");
			Thread.sleep(2000);
			
		    driver.findElement(By.name("btn")).click();
		    
		    driver.findElement(By.xpath("html/body/div[3]/div/table/tbody/tr/td/div[1]/table/tbody/tr/td/table[2]/tbody/tr[5]/td[1]/input")).click();
		    Thread.sleep(2000);
		    
		    ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		    driver.findElement(By.xpath("html/body/div[3]/div/table/tbody/tr/td/div[1]/table/tbody/tr/td/table[2]/tbody/tr[7]/td[1]/input")).click();
		    Thread.sleep(2000);
		    
		    ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		    driver.findElement(By.xpath("html/body/div[3]/div/table/tbody/tr/td/div[1]/table/tbody/tr/td/table[2]/tbody/tr[8]/td[1]/input")).click();
		    Thread.sleep(2000);
		    		    
		    ((JavascriptExecutor)driver).executeScript("scroll(0,2500)");
		    Thread.sleep(2500);
		    
		    
		    driver.findElement(By.linkText("Добавить выбранные в закладки")).click();
		    Thread.sleep(2000);
		    
		   	    
		    driver.findElement(By.id("alert_ok")).click();
		    Thread.sleep(1500);
		    
		    ((JavascriptExecutor)driver).executeScript("scroll(1500,0)");
		    Thread.sleep(1500);
		    
		    driver.findElement(By.linkText("Закладки")).click();
		    
		    		
			System.out.println("Test completed");
		    
		    
		    driver.quit();
			
			
	}
			
	
}	

