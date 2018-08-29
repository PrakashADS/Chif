package ChifProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testt {
	static WebDriver driver;
static int linkCount=0;

public static void main(String[] args) {

//set GeckoDriver path for FireFox browser
	System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver.exe");
	driver=new ChromeDriver();

//Create Browser object


//Open URL
driver.get("http://www.floridahousing.org/");

//Get links in for each loop

for(WebElement links : driver.findElements(By.tagName("a")))
{
System.out.println(links.getText());
linkCount++;
}

//Print Link Count

System.out.println("Total Links on Page : "+linkCount);
System.out.println( driver.getCurrentUrl());

}

}