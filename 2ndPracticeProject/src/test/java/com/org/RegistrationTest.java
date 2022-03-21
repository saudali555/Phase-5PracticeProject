package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver=null;
	
    @Test(groups = "Chrome")
    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Oneplus 8t\\\\\\\\Saud documents\\\\\\\\MPHASIS\\\\\\\\jar files\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "Chrome", dependsOnMethods = {"launchChrome"})
    public void login() {
        
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("Sona@gmail.com");
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("sona@123");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).submit();
//        driver.close();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test(groups = "Chrome", dependsOnMethods = {"login"})
    public void register() {
    	  driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1En5li > a")).click();
//    	  driver.findElement(By.className("_14Me7y")).click();
    	  driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div.IiD88i._351hSN > input")).sendKeys("1111111111");
    	  driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button > span")).submit();
    	  try {
              Thread.sleep(1000);
          } catch (Exception e) {
              e.printStackTrace();
          }
    }
    
    @Test(groups = "Chrome", dependsOnMethods = {"register"})
    public void search() {
    	driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
    	driver.findElement(By.name("q")).sendKeys("mi 11");
    	driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button > svg")).click();
    	
    }
    
    @Test(groups = "Chrome", dependsOnMethods = {"search"})
    public void addToCart() {
    	driver.get("https://www.flipkart.com/xiaomi-11i-5g-camo-green-128-gb/p/itm5e173fdb5d441?pid=MOBG9QXPP5QRZZ3P&lid=LSTMOBG9QXPP5QRZZ3PRQPSHC&marketplace=FLIPKART&q=mi+11&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=29ca7b8e-874c-4046-a608-cf9146691b39.MOBG9QXPP5QRZZ3P.SEARCH&ppt=hp&ppn=homepage&ssid=c62jungmxs0000001647871420927&qH=c70318b5153e76af");
    	driver.findElement(By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(1) > button")).click();
    }

}

