package ChifProj;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChifProj {
	
public static WebDriver driver;

@FindBy(xpath="//*[@id='Username']")
public WebElement UserName;

@FindBy(xpath="//*[@id='Password']")
public WebElement Password;

@FindBy(xpath="//*[@id='btnLogin']")
public WebElement LoginBtn;

@FindBy(xpath="//*[@id='btnCreateNewCase']")
public WebElement btnCreateNewCase;

@FindBy(xpath="//span[@class='ng-binding' and contains(text(),'Domestic Violence')]")
public WebElement Domestic_Violence;

@FindBy(xpath="//*[@id='btns1608']")
public WebElement NextBtn;

@FindBy(xpath="//*[@id='btns1609']")
public WebElement ContinueBtn;

@FindBy(xpath="//*[@id='btns1615']")
public WebElement Next3;

@FindBy(xpath="//*[@id='inp1599']")
public WebElement CaseNumber;

@FindBy(xpath="//*[@id='inp1606']")
public WebElement Page;

@FindBy(xpath="//*[@id='sel1604']")
public WebElement Division_judge;

@FindBy(xpath="//*[@id='inp1605']")
public WebElement Book;

@FindBy(xpath="//*[@id='dt1607']")
public WebElement Final_Judgment_entered_on;

@FindBy(xpath="//*[@id='btns1610']")
public WebElement Next1;

@FindBy(xpath="//*[@id='1596']")
public WebElement ReasonToTerminate;

@FindBy(xpath="//*[@id='btns1616']")
public WebElement Next2;

@FindBy(xpath="//*[@id='inp1612']")
public WebElement Name_of_individual;

@FindBy(xpath="//*[@id='inp1614']")
public WebElement Language;

@FindBy(xpath="//*[@id='btns1617']")
public WebElement Continue1;

@FindBy(xpath="//*[@id='inp1619']")
public WebElement Petitioner_Firstname;

@FindBy(xpath="//*[@id='inp1621']")
public WebElement Petitioner_Middlename;

@FindBy(xpath="//*[@id='inp1622']")
public WebElement Petitioner_Lastname;

@FindBy(xpath="//*[@id='btns1625']")
public WebElement Next4;

@FindBy(xpath="//*[@id='chk1631']")
public WebElement Check_ConfidentialAddress;

@FindBy(xpath="//*[@id='btns1636']")
public WebElement Next5;

@FindBy(xpath="//*[@id='inp1640']")
public WebElement PetitionerAddress1;

@FindBy(xpath="//*[@id='inp1641']")
public WebElement PetitionerAddress2;

@FindBy(xpath="//*[@id='inp1642']")
public WebElement PetitionerCity;

@FindBy(xpath="//*[@id='inp1645']")
public WebElement PetitionerCounty;

@FindBy(xpath="//*[@id='sel1647']")
public WebElement PetitionerState;

@FindBy(xpath="//*[@id='inp1649']")
public WebElement PetitionerZip;

@FindBy(xpath="//*[@id='btnSaveExit']")
public WebElement SaveExit;

@FindBy(xpath="//*[@id='btns1594']")
public WebElement Save;

@FindBy(xpath="//*[@id='btnYes']")
public WebElement Ok;

public ChifProj(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://chif.sgssys.info");
	ChifProj ch=new ChifProj(driver);
	Thread.sleep(1000);
	ch.UserName.sendKeys("sachin95");
	ch.Password.sendKeys("Sachin12345");
	ch.LoginBtn.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='tabCaseSearch']")).click();
	Thread.sleep(2000);
	ch.btnCreateNewCase.click();
	Thread.sleep(1000);
	ch.ScrollDown600();
	Thread.sleep(1500);
	ch.Domestic_Violence.click();
	Thread.sleep(1500);
    List<WebElement>li1=driver.findElements(By.xpath("//*[@class='ng-binding']"));
    Thread.sleep(1000);
    li1.get(0).click();
    Thread.sleep(5000);
    ch.NextBtn.click();
    
    int YesNo=2;
    switch(YesNo)
    {
    case 1:
    	Thread.sleep(1000);
    	List<WebElement>li2=driver.findElements(By.xpath("//*[@id='rdb1597']"));
        Thread.sleep(1000);
        li2.get(0).click();
        Thread.sleep(1000);
        ch.ContinueBtn.click();
        break;
    case 2:
    	Thread.sleep(1000);
    	List<WebElement>li3=driver.findElements(By.xpath("//*[@id='rdb1597']"));
        Thread.sleep(1000);
        li3.get(1).click();
        Thread.sleep(1000);
        ch.ContinueBtn.click();
        Thread.sleep(2000);
        ch.Name_of_individual.sendKeys("James");
        ch.Language.sendKeys("Kannada");
        Thread.sleep(1000);
        ch.Next3.click();
        break;
    }
        Thread.sleep(1000);
	 // ch.CaseNumber.sendKeys(generateCaseNum(18));
        ch.CaseNumber.sendKeys("33-3333-GB-666666-NNNN");
	    Thread.sleep(1000);
	    ch.Page.sendKeys("10");
	    ch.Division_judge.sendKeys("CV-D");
	    ch.Book.sendKeys("2");
	    ch.Final_Judgment_entered_on.sendKeys("08/14/2018");
	    Thread.sleep(1000);
	    ch.Next1.click();
        Thread.sleep(2000);
        ch.ReasonToTerminate.sendKeys("Transfer of Community Property");
	    Thread.sleep(1000);
	    ch.Next2.click();
	    Thread.sleep(1000);
	    List<WebElement> PetRes=driver.findElements(By.xpath("//*[@id='rdb1613']"));
	    int PR=2;
	    switch(PR)
	    {
	    case 1:
	    	 Thread.sleep(1000);
	    	 PetRes.get(0).click();
	    	 Thread.sleep(1000);
	    	 ch.Continue1.click();
	    	 Thread.sleep(1000);
	    	 ch.Petitioner_Firstname.sendKeys("Mary");
	    	 ch.Petitioner_Middlename.sendKeys("DSouza");
	    	 ch.Petitioner_Lastname.sendKeys("Sequeira");
	  	     Thread.sleep(1000);
	  	     ch.Next4.click();
	         Thread.sleep(1000);
	    	 break;
	    case 2:
	    	 Thread.sleep(1000);
	    	 PetRes.get(1).click();
	    	 Thread.sleep(1000);
	    	 ch.Continue1.click();
	    	 Thread.sleep(1000);
	    	 ch.Petitioner_Firstname.sendKeys("Mary");
	    	 ch.Petitioner_Middlename.sendKeys("DSouza");
	    	 ch.Petitioner_Lastname.sendKeys("Sequeira");
	  	     Thread.sleep(1000);
	  	     ch.Next4.click();
	         Thread.sleep(1000);
	         ch.Check_ConfidentialAddress.click();
	  	     Thread.sleep(1000);
	  	     ch.Next5.click();
	    	 break;
	    }
	    Thread.sleep(1000);
	    ch.PetitionerAddress1.sendKeys("55,zig Apartment");
	    ch.PetitionerAddress2.sendKeys("Hills road");
	    ch.PetitionerCity.sendKeys("Las Vegas");
	    ch.PetitionerCounty.sendKeys("Los Angeles");
	    Select states=new Select(ch.PetitionerState);
	    states.selectByVisibleText("CALIFORNIA");
	    ch.PetitionerZip.sendKeys("90002");
	    ch.SaveExit.click();
	    ch.Save.click();
	    Thread.sleep(2000);
	    ch.Ok.click();
	    
}
public void ScrollDown600()
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,600)", "");
}
public static String generateCaseNum(int length) {
	   
    String allowedChars = "abcdefghijklmnopqrstuvwxyz";
    String allowedNumbers="1234567890";
    String CaseNum = "";
    String temp = RandomStringUtils.random(length, allowedChars);
    String temp2=RandomStringUtils.random(length, allowedNumbers);
       CaseNum = temp2.substring(0, temp2.length() - 16) +"-"+ temp2.substring(0,temp.length()-14)+"-"+
    		     temp.substring(0, temp2.length() - 16)+"-"+ temp2.substring(0,temp.length()-12)+"-"+
    		     temp.substring(0,temp.length()-14);
    return CaseNum;
    
}
}
