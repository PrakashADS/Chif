package PageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ChifProj.ChifUsersModule;
import ChifProj.DataHelper;

public class PageObjectModel_Chif {
	WebDriver driver;
	 public List<HashMap<String,String>> datamap;
	 public List<HashMap<String,String>> datamap2;
	 public List<HashMap<String,String>> datamap3;
	public PageObjectModel_Chif(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		datamap = DataHelper.data(System.getProperty("user.dir")+"\\src\\test\\java\\ChifProj\\Chif.xlsx","Login");
		datamap2 = DataHelper.data(System.getProperty("user.dir")+"\\src\\test\\java\\ChifProj\\Chif.xlsx","Registration");
		datamap3 = DataHelper.data(System.getProperty("user.dir")+"\\src\\test\\java\\ChifProj\\Chif.xlsx","Case");
	}
	
	@FindBy(xpath="//*[@id='Username']")
	public WebElement UserName;
	
	@FindBy(xpath="//*[@id='Password']")
	public WebElement Password;
	
	@FindBy(xpath="//*[@id='btnLogin']")
	public WebElement LoginBtn;
	
	@FindBy(xpath="//*[contains(text(),'new user sign up')]")
	public WebElement SignUpBtn;
			
	@FindBy(xpath="//*[@id='FirstName']")
	public WebElement FirstName;
	
	@FindBy(xpath="//*[@id='MiddleName']")
	public WebElement MiddleName;
	
	@FindBy(xpath="//*[@id='LastName']")
	public WebElement LastName;
	
	@FindBy(xpath="//*[@id='EmailId']")
	public WebElement EmailId;
	
	@FindBy(xpath="//*[@id='Phone']")
	public WebElement Phone;
	
	@FindBy(xpath="//*[@id='UserName']")
	public WebElement UserName1;
	
	@FindBy(xpath="//*[@id='Password']")
	public WebElement Password1;
	
	@FindBy(xpath="//*[@id='ConformPassword']")
	public WebElement ConfirmPasswd;
	
	@FindBy(xpath="//*[@id='SignUpForm']/div/div[3]/div/div/input[3]")
	public WebElement BackToLogin;
	
	@FindBy(xpath="//*[@id='signup']")
	public WebElement Next;
	
	@FindBy(xpath="//*[@id='Reset']")
	public WebElement Reset;
	
	@FindBy(xpath="//*[@id='SecurityQuestion1']")
	public WebElement SecurityQuestion1;
	
	@FindBy(xpath="//*[@id='SecurityAnswer1']")
	public WebElement SecurityAnswer1;
	
	@FindBy(xpath="//*[@id='SecurityQuestion2']")
	public WebElement SecurityQuestion2;
	
	@FindBy(xpath="//*[@id='SecurityAnswer2']")
	public WebElement SecurityAnswer2;
	
	@FindBy(xpath="//*[@id='SecurityQuestion3']")
	public WebElement SecurityQuestion3;
	
	@FindBy(xpath="//*[@id='SecurityAnswer3']")
	public WebElement SecurityAnswer3;
	
	@FindBy(xpath="//*[@ng-click='Previous()']")
	public WebElement Previous;
	
	@FindBy(xpath="//*[@id='Save']")
	public WebElement Submit;
	
	@FindBy(xpath="//*[@href='/']")
	public WebElement BackToHome;
	
	@FindBy(xpath="//*[@id='tabCaseSearch']")
	public WebElement FileNewCase;
	
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
	
	@FindBy(xpath="//*[@id='btns1651']")
	public WebElement Continue3;
	
	@FindBy(xpath="//*[@id='inp1655']")
	public WebElement Home_PhoneNum;
	
	@FindBy(xpath="//*[@id='inp1657']")
	public WebElement Home_WorkPhoneNum;
	
	@FindBy(xpath="//*[@id='inp1656']")
	public WebElement CellPhonenum;
	
	@FindBy(xpath="//*[@id='inp1659']")
	public WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id='btns1661']")
	public WebElement Continue4;
	
	@FindBy(xpath="//*[@id='dt1669']")
	public WebElement Dob;
	
	@FindBy(xpath="//*[@id='sel1676']")
	public WebElement Race;
	
	@FindBy(xpath="//*[@id='btns1738']")
	public WebElement Next6;
	
	@FindBy(xpath="//*[@id='1681']")
	public WebElement DescribeDocs;
	
	@FindBy(xpath="//*[@id='btns1682']")
	public WebElement Continue5;
	
	@FindBy(xpath="//*[@id='inp1623']")
	public WebElement RespondentFirstName;
	
	@FindBy(xpath="//*[@id='inp1624']")
	public WebElement RespondentMiddleName;
	
	@FindBy(xpath="//*[@id='inp1626']")
	public WebElement RespondentLastName;
	
	@FindBy(xpath="//*[@id='btns1627']")
	public WebElement Next8;
	
	@FindBy(xpath="//*[@id='inp1630']")
	public WebElement RespondentAlias;
	
	@FindBy(xpath="	//*[@id='inp1632']")
	public WebElement RespondentTattooScar;

	@FindBy(xpath="//*[@id='btns1633']")
	public WebElement Next9;
	
	@FindBy(xpath="//*[@id='inp1635']")
	public WebElement Respondent_Place_Birth;
	
	@FindBy(xpath="//*[@id='dt1638']")
	public WebElement Respondent_DOB;
	
	@FindBy(xpath="//*[@id='inp1639']")
	public WebElement Respondent_Age;
	
	@FindBy(xpath="//*[@id='sel1643']")
	public WebElement Respondent_Gender;
	
	@FindBy(xpath="//*[@id='inp1644']")
	public WebElement Respondent_HairColor;
	
	@FindBy(xpath="//*[@id='inp1646']")
	public WebElement Respondent_EyeColor;
	
	@FindBy(xpath="//*[@id='btns1648']")
	public WebElement Next10;
	
	@FindBy(xpath="//*[@id='inp1653']")
	public WebElement Respondent_Height;
	
	@FindBy(xpath="//*[@id='inp1654']")
	public WebElement Respondent_Weight;
	
	@FindBy(xpath="//*[@id='sel1658']")
	public WebElement Respondent_Race;
	
	@FindBy(xpath="//*[@id='inp1660']")
	public WebElement Respondent_SkinTone;
	
	@FindBy(xpath="//*[@id='btns1662']")
	public WebElement Continue6;
	
	@FindBy(xpath="//*[@id='inp1665']")
	public WebElement Respondent_Address1;
	
	@FindBy(xpath="//*[@id='inp1666']")
	public WebElement Respondent_Address2;
	
	@FindBy(xpath="//*[@id='inp1668']")
	public WebElement Respondent_City;
	
	@FindBy(xpath="//*[@id='inp1670']")
	public WebElement Respondent_County;
	
	@FindBy(xpath="//*[@id='sel1671']")
	public WebElement Respondent_State;
	
	@FindBy(xpath="//*[@id='inp1672']")
	public WebElement Respondent_ZipCode;
	
	@FindBy(xpath="//*[@id='inp1673']")
	public WebElement Respondent_Telephone_Num;
	
	@FindBy(xpath="//*[@id='inp1674']")
	public WebElement Respondent_CellularNum;
	
	@FindBy(xpath="//*[@id='inp1675']")
	public WebElement Respondent_EmailAddress;
	
	@FindBy(xpath="//*[@id='btns1679']")
	public WebElement Next11;
	
	@FindBy(xpath="//*[@id='inp1689']")
	public WebElement Respondent_BusinessName;
	
	@FindBy(xpath="//*[@id='inp1690']")
	public WebElement Respondent_WorkAddress1;
	
	@FindBy(xpath="//*[@id='inp1691']")
	public WebElement Respondent_WorkAddress2;
	
	@FindBy(xpath="//*[@id='inp1692']")
	public WebElement Respondent_WorkCity;
	
	@FindBy(xpath="//*[@id='inp1693']")
	public WebElement Respondent_WorkCounty;
	
	@FindBy(xpath="//*[@id='sel1695']")
	public WebElement Respondent_WorkState;
	
	@FindBy(xpath="//*[@id='inp1696']")
	public WebElement Respondent_WorkZip;
	
	@FindBy(xpath="//*[@id='inp1697']")
	public WebElement Respondent_WorkTelephone;
	
	@FindBy(xpath="//*[@id='inp1698']")
	public WebElement Respondent_WorkDaysHrs;
	
	@FindBy(xpath="//*[@id='btns1740']")
	public WebElement Next12;
	
	@FindBy(xpath="//*[@id='inp1701']")
	public WebElement Respondent_AltAddress1;
	
	@FindBy(xpath="//*[@id='inp1702']")
	public WebElement Respondent_AltAddress2;
	
	@FindBy(xpath="//*[@id='inp1705']")
	public WebElement Respondent_AltCity;
	
	@FindBy(xpath="//*[@id='sel1706']")
	public WebElement Respondent_AltState;
	
	@FindBy(xpath="//*[@id='inp1707']")
	public WebElement Respondent_AltZip;
	
	@FindBy(xpath="//*[@id='inp1708']")
	public WebElement Respondent_AltTelNumber;
	
	@FindBy(xpath="//*[@id='btns1709']")
	public WebElement Next13;
	
	@FindBy(xpath="//*[@id='inp1712']")
	public WebElement VehicleYear;
	
	@FindBy(xpath="//*[@id='inp1713']")
	public WebElement VehicleMake;
	
	@FindBy(xpath="//*[@id='inp1714']")
	public WebElement VehicleModel;
	
	@FindBy(xpath="//*[@id='inp1716']")
	public WebElement VehicleColor;
	
	@FindBy(xpath="//*[@id='inp1717']")
	public WebElement VehicleTagNum;
	
	@FindBy(xpath="//*[@id='btns1719']")
	public WebElement Next14;
	
	@FindBy(xpath="//*[@id='btns1724']")
	public WebElement Next15;
	
	@FindBy(xpath="//*[@id='inp1728']")
	public WebElement TypesOfWeapon;
	
	@FindBy(xpath="//*[@id='btns1729']")
	public WebElement Next16;
	
	@FindBy(xpath="//*[@id='sel1694']")
	public WebElement RespondentinJail;
	
	@FindBy(xpath="//*[@id='sel1700']")
	public WebElement AnyWarranty;
	
	@FindBy(xpath="//*[@id='inp1703']")
	public WebElement WarrantName;
	
	@FindBy(xpath="//*[@id='btns1704']")
	public WebElement Continue7;
	
	@FindBy(xpath="//*[@id='btns1687']")
	public WebElement Continue8;
	
	@FindBy(xpath="//*[@id='1684']")
	public WebElement Comments;
	
	@FindBy(xpath="//*[@id='btns1685']")
	public WebElement Continue9;
	
	@FindBy(xpath="//*[@id='btns1715']")
	public WebElement Continue10;
	
	@FindBy(xpath="//*[@id='dt1602']")
	public WebElement SentOn;
	
	@FindBy(xpath="//*[@id='btns1603']")
	public WebElement Next17;
	
	@FindBy(xpath="//*[@id='btns1594']")
	public WebElement Save;
	
	@FindBy(xpath="//*[@id='btns1595']")
	public WebElement Finish;
	
	@FindBy(xpath="//*[@id='inp1720']")
	public WebElement Case_Name;
	
	@FindBy(xpath="//*[@id='inp1721']")
	public WebElement Petitioner_Name;
	
	@FindBy(xpath="//*[@id='inp1723']")
	public WebElement Respondent_Name;
	
	@FindBy(xpath="//*[@id='inp1725']")
	public WebElement CaseNum;
	
	@FindBy(xpath="//*[@id='sel1727']")
	public WebElement Division;
	
	@FindBy(xpath="//*[@id='chk1733']")
	public WebElement Custody; 
	
	@FindBy(xpath="//*[@id='chk1734']")
	public WebElement Dissolution_Marriage;
	
	@FindBy(xpath="//*[@id='chk1735']")
	public WebElement Child_Support;
	
	@FindBy(xpath="	//*[@id='chk1736']")
	public WebElement Juvenile_Deliquency;
	
	@FindBy(xpath="//*[@id='btns1730']")
	public WebElement Continue11;
	
	@FindBy(xpath="//*[@id='chk1737']")
	public WebElement Termination_ParentalRights;

	@FindBy(xpath="//*[@id='chk1739']")
	public WebElement DomesticViolence;
	
	@FindBy(xpath="//*[@id='btns1741']")
	public WebElement Next18;
	
	@FindBy(xpath="//*[@id='btns1751']")
	public WebElement Continue12; 
	
	@FindBy(xpath="//*[@id='inp1749']")
	public WebElement OtherTypofProceeding; 
	
	@FindBy(xpath="//*[@id='sel1754']")
	public WebElement CasePendingState; 
	
	@FindBy(xpath="//*[@id='inp1756']")
	public WebElement CourtName;
	
	@FindBy(xpath="//*[@id='inp1759']")
	public WebElement LastCourtName;
	
	@FindBy(xpath="//*[@id='btnYes']")
	public WebElement OKBtn;
	
	@FindBy(xpath="//*[@id='dt1761']")
	public WebElement JudgementDate;
	
	@FindBy(xpath="//*[@id='1777']")
	public WebElement StmtToRelation;
	
	@FindBy(xpath="//*[@id='btns1788']")
	public WebElement Continue14;
	
	@FindBy(xpath="//*[@id='btns1796']")
	public WebElement Continue13;

	@FindBy(xpath="//*[@id='inp1790']")
	public WebElement RequestCoordination ;
	
	@FindBy(xpath=" //*[@id='btns1791']")
	public WebElement Continue15 ;
	
	@FindBy(xpath="//*[@id='btns1791']")
	public WebElement Continue16;
	
	@FindBy(xpath="//*[@class='fa fa-sign-out']")
	public WebElement Logout;
	
	public void Login(String arg1) throws InterruptedException
	{
		String ActualTitle="Duval County Courthouse";
		int index = Integer.parseInt(arg1)-1;
	    //    System.out.println("Printing current data set...");
	      
	        for(HashMap h1:datamap)
	        {
	             System.out.println(h1.keySet());
	             System.out.println(h1.values());
	        }
	        Thread.sleep(1000);
	        Assert.assertEquals(driver.getTitle(), ActualTitle);
	     //   Assert.assertEquals(driver.getTitle(), "Duval County Courthousee");
	      
	      //  Assert.assertEquals(driver.getTitle(), "Duval County Courthousee", "Title doesn't match");
	        
	        /*****   Login to the Application    *****/
	        Thread.sleep(1000);
	        UserName.clear();
	        Thread.sleep(1000);
	        UserName.sendKeys(datamap.get(index).get("uname"));
	        Thread.sleep(1000);
	        Password.clear();
	        Thread.sleep(1000);
	        Password.sendKeys(datamap.get(index).get("passwd"));
	        Thread.sleep(1000);
	        LoginBtn.click();
	        
	}


public PageObjectModel_Chif UserSignup(String arg2) throws InterruptedException
{

    //    System.out.println("Printing current data set...");
	 int index1 = Integer.parseInt(arg2)-1;
        for(HashMap h2:datamap2)
        {
          //   System.out.println(h2.keySet());
         //    System.out.println(h2.values());
        }
    /*****   Signup to the Application    *****/
    Thread.sleep(2000);
    SignUpBtn.click();
	Thread.sleep(1000);
	Next.click();
	Thread.sleep(1000);
	FirstName.clear();
	FirstName.sendKeys(datamap2.get(index1).get("fname"));
	MiddleName.clear();
	MiddleName.clear();	
	MiddleName.sendKeys(datamap2.get(index1).get("mname"));
	LastName.clear();
	LastName.sendKeys(datamap2.get(index1).get("lname"));
	EmailId.clear();
	EmailId.sendKeys(datamap2.get(index1).get("email"));
	Phone.clear();
	Phone.sendKeys(datamap2.get(index1).get("phone"));
	UserName1.clear();
	UserName1.sendKeys(datamap2.get(index1).get("uname"));
	Password1.clear();
	Password1.sendKeys(datamap2.get(index1).get("passwd"));
	ConfirmPasswd.clear();
	ConfirmPasswd.sendKeys(datamap2.get(index1).get("ConPasswd"));
	
	int option=1;
	switch(option)
	{
	case 1:
		Thread.sleep(1000);
		Next.click();
		Thread.sleep(1000);
		
		boolean UserName_Exist=driver.findElement(By.xpath("//*[@id='SignUpForm']/div/div[2]/div[2]/span[2]")).isDisplayed();
		if(UserName_Exist==true)
		   {
			Random rd1 = new Random();
			int randomInt1=0;
			for (int idx = 111; idx <= 999; ++idx) {
			randomInt1 = rd1.nextInt(1000);		
			}
			Thread.sleep(1000);
			UserName1.sendKeys(""+randomInt1);
			Thread.sleep(1000);
		}
		boolean EmaidId_Exist=driver.findElement(By.xpath("//*[@id='SignUpForm']/div/div[1]/div[4]/span[3]")).isDisplayed();
		if(EmaidId_Exist==true)
		   {
			Random rd2 = new Random();
			int randomInt2=0;
			for (int idx = 111; idx <= 999; ++idx) {
			randomInt2 = rd2.nextInt(1000);		
			}
			Thread.sleep(1000);
			EmailId.clear();
			EmailId.sendKeys(""+randomInt2+datamap2.get(index1).get("email"));
			Thread.sleep(1000);
			Next.click();
			System.out.println(UserName1.getAttribute("value"));
			System.out.println(ConfirmPasswd.getAttribute("value"));
			 ChifUsersModule cum=new ChifUsersModule();
			  cum.log.info("UserName:"+UserName1.getAttribute("value"));
			  cum.log.info("Password:"+ConfirmPasswd.getAttribute("value"));
			Thread.sleep(1000);
			Next.click();
		}
		
		break;
	case 2:
		Thread.sleep(1000);
		Reset.click();
		break;
	case 3:
		Thread.sleep(1000);
		BackToLogin.click();
		break;
	}	
	return new PageObjectModel_Chif(driver);
	
}
public PageObjectModel_Chif SecurityQuestions(String arg2) throws InterruptedException  {
	
	int index1 = Integer.parseInt(arg2)-1;
    for(HashMap h2:datamap2)
    {
       //  System.out.println(h2.keySet());
       //  System.out.println(h2.values());
    }
        Thread.sleep(1500);
        Submit.click();
		Thread.sleep(1500);
		Select ques1 = new Select(SecurityQuestion1);
		ques1.selectByVisibleText(datamap2.get(index1).get("SecurityQues1"));
		Thread.sleep(1000);
		SecurityAnswer1.sendKeys(datamap2.get(index1).get("Answer1"));
		
		Thread.sleep(1500);
		Select ques2 = new Select(SecurityQuestion2);
		ques2.selectByVisibleText(datamap2.get(index1).get("SecurityQues2"));
		Thread.sleep(1000);
		SecurityAnswer2.sendKeys(datamap2.get(index1).get("Answer2"));
		
		Thread.sleep(1500);
		Select ques3 = new Select(SecurityQuestion3);
		ques3.selectByVisibleText(datamap2.get(index1).get("SecurityQues3"));
		Thread.sleep(1000);
		SecurityAnswer3.sendKeys(datamap2.get(index1).get("Answer3"));
	
		int option=2;
		switch(option)
		{
		case 1:
			Thread.sleep(1500);
			Previous.click();
			break;
		case 2:
			Thread.sleep(1500);
			Submit.click();
			break;
		case 3:
			Thread.sleep(1500);
			Reset.click();
			break;
		case 4:
			Thread.sleep(1500);
			BackToHome.click();
			break;
		}
	return new PageObjectModel_Chif(driver);
}

public PageObjectModel_Chif Create_NewCase(String arg3) throws InterruptedException, AWTException {
	
	int index3=Integer.parseInt(arg3)-1;
	for(HashMap h3:datamap3)
	 {
	         System.out.println(h3.keySet());
	         System.out.println(h3.values());
	    }
	String UserName="Sachin Ramesh Tendulkar";
	Assert.assertEquals(Username(), UserName);
	Thread.sleep(4000);
	FileNewCase.click();
	Thread.sleep(2000);
	btnCreateNewCase.click();
	Thread.sleep(1000);
	ScrollDown600();
	Thread.sleep(1500);
	Domestic_Violence.click();
	Thread.sleep(1500);
    List<WebElement>li1=driver.findElements(By.xpath("//*[@class='ng-binding']"));
    Thread.sleep(1000);
    li1.get(0).click();
    Thread.sleep(5000);
    NextBtn.click();
    
    int YesNo=2;
    switch(YesNo)
    {
    case 1:/****   Do you read and understand English - Yes   ****/
    	Thread.sleep(1000);
    	List<WebElement>li2=driver.findElements(By.xpath("//*[@id='rdb1597']"));
        Thread.sleep(1000);
        li2.get(0).click();
        Thread.sleep(1000);
        ContinueBtn.click();
        break;
    case 2:/****   Do you read and understand English - No   ****/
    	Thread.sleep(1000);
    	List<WebElement>li3=driver.findElements(By.xpath("//*[@id='rdb1597']"));
        Thread.sleep(1000);
        li3.get(1).click();
        Thread.sleep(1000);
        ContinueBtn.click();
        Thread.sleep(2000);
        Name_of_individual.sendKeys(datamap3.get(index3).get("Name_of_individual"));
        Language.sendKeys(datamap3.get(index3).get("Language"));
        Thread.sleep(1000);
        Next3.click();
        break;
    }
        Thread.sleep(1000);
	 //  CaseNumber.sendKeys(generateCaseNum(18));
	    CaseNumber.sendKeys(datamap3.get(index3).get("CaseNumber"));
	    Thread.sleep(1000);
	    Page.sendKeys(datamap3.get(index3).get("Page"));
	    Division_judge.sendKeys(datamap3.get(index3).get("Division"));
	    Book.sendKeys(datamap3.get(index3).get("Book"));
	    Final_Judgment_entered_on.sendKeys(datamap3.get(index3).get("Final_Judgment_entered_on"));
	    Thread.sleep(1000);
	    Next1.click();
        Thread.sleep(2000);
        ReasonToTerminate.sendKeys(datamap3.get(index3).get("ReasonToTerminate"));
	    Thread.sleep(1000);
	    Next2.click();
	    Thread.sleep(1000);
	    List<WebElement> PetRes=driver.findElements(By.xpath("//*[@id='rdb1613']"));
	    int PR=2;
	    switch(PR)
	    {
	    case 1:/**** Are you the Petitioner or the Respondent? - Respondent  ****/
	    	 Thread.sleep(1000);
	    	 PetRes.get(0).click();
	    	 Thread.sleep(1000);
	    	 Continue1.click();
	    	 Thread.sleep(1000);
	  	     Petitioner_Firstname.sendKeys(datamap3.get(index3).get("Petitioner_Firstname"));
	  	     Petitioner_Middlename.sendKeys(datamap3.get(index3).get("Petitioner_Middlename"));
	  	     Petitioner_Lastname.sendKeys(datamap3.get(index3).get("Petitioner_Lastname"));
	  	     Thread.sleep(1000);
	  	     Next4.click();
	         Thread.sleep(1000);
	  	 //  Check_ConfidentialAddress.click();
	    	 break;
	    case 2:/**** Are you the Petitioner or the Respondent? - Petitioner  ****/
	    	 Thread.sleep(1000);
	    	 PetRes.get(1).click();
	    	 Thread.sleep(1000);
	    	 Continue1.click();
	    	 Thread.sleep(1000);
	  	     Petitioner_Firstname.sendKeys(datamap3.get(index3).get("Petitioner_Firstname"));
	  	     Petitioner_Middlename.sendKeys(datamap3.get(index3).get("Petitioner_Middlename"));
	  	     Petitioner_Lastname.sendKeys(datamap3.get(index3).get("Petitioner_Lastname"));
	  	     Thread.sleep(1000);
	  	     Next4.click();
	         Thread.sleep(1000);
	  	     Check_ConfidentialAddress.click();
	  	     Thread.sleep(1000);
		     Next5.click();
	    	 break;
	    }
	    Thread.sleep(1000);
	    PetitionerAddress1.sendKeys(datamap3.get(index3).get("PetitionerAddress1"));
	    PetitionerAddress2.sendKeys(datamap3.get(index3).get("PetitionerAddress2"));
	    PetitionerCity.sendKeys(datamap3.get(index3).get("PetitionerCity"));
	    PetitionerCounty.sendKeys(datamap3.get(index3).get("PetitionerCounty"));
	    Select states=new Select(PetitionerState);
	    states.selectByVisibleText(datamap3.get(index3).get("PetitionerState"));
	    PetitionerZip.sendKeys(datamap3.get(index3).get("PetitionerZip"));
	    Thread.sleep(1000);
	    Continue3.click();
	    Thread.sleep(1000);
	    Home_PhoneNum.sendKeys(datamap3.get(index3).get("PhoneNum"));
	    Home_WorkPhoneNum.sendKeys(datamap3.get(index3).get("WorkPhoneNum"));
	    CellPhonenum.sendKeys(datamap3.get(index3).get("CellPhonenum"));
	    EmailAddress.sendKeys(datamap3.get(index3).get("EmailAddress"));
	    Thread.sleep(500);
	    Continue4.click();
	    Thread.sleep(1000);
	    List<WebElement> gender=driver.findElements(By.xpath("//*[@id='rdb1667']"));
	    
	    String GenderMale=driver.findElement(By.xpath("//*[contains(text(),'Male')]")).getText();
	    String GenderFemale=driver.findElement(By.xpath("//*[contains(text(),'Female')]")).getText();
	    if(datamap3.get(index3).get("Gender").matches(GenderMale))
	    {
	    	Thread.sleep(1000);
	    	gender.get(0).click();
	    }
	    else if(datamap3.get(index3).get("Gender").matches(GenderFemale))
	    {
	    	Thread.sleep(1000);
	    	gender.get(1).click();
	    }
	   Thread.sleep(1000);
	   Dob.sendKeys(datamap3.get(index3).get("Dob"));
	   Thread.sleep(1500);
	   Select race=new Select(Race);
	   race.selectByVisibleText(datamap3.get(index3).get("Race"));
	   Thread.sleep(1000);
	   Next6.click();
	   Thread.sleep(1000);
	   List<WebElement> AddDocs =driver.findElements(By.xpath("//*[@id='rdb1678']"));
	   int x=1;
	   switch(x)
	   {
	   case 1:/**** Additional documents? - Yes ****/
		      Thread.sleep(1000);
		      AddDocs.get(0).click();
		      break;
	   case 2:/**** Additional documents? - No ****/
		      Thread.sleep(1000);
		      AddDocs.get(1).click();
		      break;      
	   }
	   Thread.sleep(500);
	   DescribeDocs.sendKeys(datamap3.get(index3).get("DescribeDocs"));
	   Thread.sleep(500);
	   Continue5.click();
	   Thread.sleep(1000);
	   RespondentFirstName.sendKeys(datamap3.get(index3).get("RespondentFname"));
	   RespondentMiddleName.sendKeys(datamap3.get(index3).get("RespondentMname"));
	   RespondentLastName.sendKeys(datamap3.get(index3).get("RespondentLname"));
	   Thread.sleep(500);
	   Next8.click();
	   Thread.sleep(500);
	   RespondentAlias.sendKeys(datamap3.get(index3).get("RespondentAlias"));
	   RespondentTattooScar.sendKeys(datamap3.get(index3).get("RespondentTattooScar"));
	   Next9.click();
	   Respondent_Place_Birth.sendKeys(datamap3.get(index3).get("Respondent_Place_Birth"));
	   Thread.sleep(1000);
	   Robot rb=new Robot();
	   rb.keyPress(KeyEvent.VK_TAB);
	   Thread.sleep(1000);
	   Respondent_DOB.sendKeys(datamap3.get(index3).get("RespondentDOB"));
	   Respondent_Age.sendKeys(datamap3.get(index3).get("RespondentAge"));
   
	    String RespGenderMale=driver.findElement(By.xpath("//*[@id='sel1643']/option[2]")).getText();
	    String RespGenderFemale=driver.findElement(By.xpath("//*[@id='sel1643']/option[3]")).getText();
	    
	    if(datamap3.get(index3).get("RespondentGender").matches(RespGenderMale))
	    {
	    	Thread.sleep(1000);
	    	Select respGender=new Select(driver.findElement(By.xpath("//*[@id='sel1643']")));
	    	respGender.selectByVisibleText(RespGenderMale); 
	    }	
	    else{
	    	Select respGender=new Select(driver.findElement(By.xpath("//*[@id='sel1643']")));
	    	respGender.selectByVisibleText(RespGenderFemale); 
	    }
	    	
	    Respondent_HairColor.sendKeys(datamap3.get(index3).get("RespondentHairColor"));
	    Respondent_EyeColor.sendKeys(datamap3.get(index3).get("RespondentEyeColor"));
	    Thread.sleep(500);
	    Next10.click();
	    Thread.sleep(1000);
	    Respondent_Height.sendKeys(datamap3.get(index3).get("RespondentHeight"));
	    Respondent_Weight.sendKeys(datamap3.get(index3).get("RespondentWeight"));
	    Thread.sleep(500);
	    Select resp_Race= new Select(Respondent_Race);
	    resp_Race.selectByVisibleText(datamap3.get(index3).get("RespondentRace"));
	    Respondent_SkinTone.sendKeys(datamap3.get(index3).get("RespondentSkinTone"));
	    Thread.sleep(500);
	    Continue6.click();
	    Thread.sleep(500);
	    Respondent_Address1.sendKeys(datamap3.get(index3).get("RespondentAddress1"));
	    Respondent_Address2.sendKeys(datamap3.get(index3).get("RespondentAddress2"));
	    Respondent_City.sendKeys(datamap3.get(index3).get("RespondentCity"));
	    Respondent_County.sendKeys(datamap3.get(index3).get("RespondentCounty"));
	    Thread.sleep(500);
	    Select RespStates=new Select(Respondent_State);
	    RespStates.selectByVisibleText(datamap3.get(index3).get("RespondentState"));
	    Respondent_ZipCode.sendKeys(datamap3.get(index3).get("RespondentZipCode"));
	    Respondent_Telephone_Num.sendKeys(datamap3.get(index3).get("RespondentTelephoneNum"));
	    Respondent_CellularNum.sendKeys(datamap3.get(index3).get("RespondentCellularNum"));
	    Respondent_EmailAddress.sendKeys(datamap3.get(index3).get("RespondentEmailAddress"));
	    Thread.sleep(500);
	    ScrollDown600();
	    Thread.sleep(500);
	    Next11.click();
	    Thread.sleep(500);
	    Respondent_BusinessName.sendKeys(datamap3.get(index3).get("RespondentBusinessName"));
	    Respondent_WorkAddress1.sendKeys(datamap3.get(index3).get("RespondentWorkAddress1"));
	    Respondent_WorkAddress2.sendKeys(datamap3.get(index3).get("RespondentWorkAddress2"));
	    Respondent_WorkCity.sendKeys(datamap3.get(index3).get("RespondentWorkCity"));
	    Respondent_WorkCounty.sendKeys(datamap3.get(index3).get("RespondentWorkCounty"));
	    Thread.sleep(500);
	    Select wrkState = new Select(Respondent_WorkState);
	    wrkState.selectByVisibleText(datamap3.get(index3).get("RespondentWorkState"));
	    Respondent_WorkZip.sendKeys(datamap3.get(index3).get("RespondentWorkZip"));
	    Respondent_WorkTelephone.sendKeys(datamap3.get(index3).get("RespondentWorkTelephone"));
	    Respondent_WorkDaysHrs.sendKeys(datamap3.get(index3).get("RespondentWorkDaysHrs"));
	    Thread.sleep(500);
	    Next12.click();
	    Thread.sleep(500);
	    Respondent_AltAddress1.sendKeys(datamap3.get(index3).get("RespondentAltAddress1"));
	    Respondent_AltAddress2.sendKeys(datamap3.get(index3).get("RespondentAltAddress2"));
	    Respondent_AltCity.sendKeys(datamap3.get(index3).get("RespondentAltCity"));
	    Thread.sleep(500);
	    Select AltState=new Select(Respondent_AltState);
	    AltState.selectByVisibleText(datamap3.get(index3).get("RespondentAltState"));
	    Respondent_AltZip.sendKeys(datamap3.get(index3).get("RespondentAltZip"));
	    Respondent_AltTelNumber.sendKeys(datamap3.get(index3).get("Respondent_AltTelNumber"));
	    Thread.sleep(500);
	    Next13.click();
	    Thread.sleep(500);
	    VehicleYear.sendKeys(datamap3.get(index3).get("VehicleYear"));
	    VehicleMake.sendKeys(datamap3.get(index3).get("VehicleMake"));
	    VehicleModel.sendKeys(datamap3.get(index3).get("VehicleModel"));
	    VehicleColor.sendKeys(datamap3.get(index3).get("VehicleColor"));
	    VehicleTagNum.sendKeys(datamap3.get(index3).get("VehicleTagNum"));
	    Thread.sleep(500);
	    Next14.click();
	    Thread.sleep(500);
	    List<WebElement> weapons=driver.findElements(By.xpath("//*[@id='rdb1722']"));
	    int z=1;
	    switch(z)
	    {
	    case 1:/**** Does the respondent own or carry any weapons: -  Yes ****/
	    	Thread.sleep(500);
	    	weapons.get(0).click();
	    	Thread.sleep(500);
	    	Next15.click();
	    	Thread.sleep(500);
	    	TypesOfWeapon.sendKeys(datamap3.get(index3).get("Weapon"));
	    	Thread.sleep(500);
	    	Next16.click();
	    	break;
	    case 21:/**** Does the respondent own or carry any weapons: - No ****/
	    	Thread.sleep(500);
	    	weapons.get(1).click();
	    	Thread.sleep(500);
	    	Next15.click();
	    	break;
	    case 3:/**** Does the respondent own or carry any weapons: - Unknown ****/
	    	Thread.sleep(500);
	    	weapons.get(2).click();
	    	Thread.sleep(500);
	    	Next15.click();
	    	break;	
	    }
	    Thread.sleep(500);
	    Select InJail=new Select(RespondentinJail);
	    InJail.selectByVisibleText("Yes");
	    Thread.sleep(500);
	    Select warr=new Select(AnyWarranty);
	    warr.selectByVisibleText("Yes");
	    WarrantName.sendKeys(datamap3.get(index3).get("WarrantName"));
	    Continue7.click();
	    Thread.sleep(500);
	    List<WebElement> MentalHealth=driver.findElements(By.xpath("//*[@id='rdb1686']"));
	    int M=1;
	    switch(M)
	    {
	    case 1:/**** Does the Respondent have any mental health issues? - Yes ****/
	    	Thread.sleep(500);
	    	MentalHealth.get(0).click();
	    	break;
	    case 2:/**** Does the Respondent have any mental health issues? - No ****/
	    	Thread.sleep(500);
	    	MentalHealth.get(1).click();
	    	break;
	    case 3:/**** Does the Respondent have any mental health issues? - Unknown ****/
	    	Thread.sleep(500);
	    	MentalHealth.get(2).click();
	    	break;
	    }
	    Thread.sleep(200);
	    Continue8.click();
	    Comments.sendKeys(datamap3.get(index3).get("Comments"));
	    Continue9.click();
	    Thread.sleep(500);
	    List<WebElement> RelatedCases=driver.findElements(By.xpath("//*[@id='rdb1711']"));
	    int a=1;
	    switch(a)
	    {
	    case 1:/**** Are there any related cases? - Yes ****/ 
	    	 
	    	  RelatedCases(arg3);/**** information for the related case 1 ****/
	    	  
	    	  CheckAll();/****  Type of Proceeding: Check all that apply. ****/
	    
	    	  CheckAll2(arg3);/**** Type of Proceeding: Check all that apply. (cont)  ****/
	    	 
	    	  CaseStates(arg3);/**** State where case was decided or is pending ****/
	    	
	    	  List<WebElement> RelCase1=driver.findElements(By.xpath("//*[@type='Radio']"));
	    	  Thread.sleep(500);
	    	  RelCase1.get(1).click();
	    	  Thread.sleep(500);
	    	  driver.findElement(By.xpath("//*[@btn-type='Continue']")).click();
		      List<WebElement> RelCase=driver.findElements(By.xpath("//*[@type='Radio']"));
		   int k=2;
		   switch(k)
		   {
		     case 1:/**** Related Case - I do not request coordination ****/ 
			      Thread.sleep(500);
			      RelCase.get(0).click();
			      Thread.sleep(500);
			      driver.findElement(By.xpath("//*[@btn-type='Continue']")).click();
			      break;
			      
		     case 2:/**** Related Case - I do request coordination ****/ 
			      Thread.sleep(500);
			      RelCase.get(1).click();
			      Thread.sleep(500);
			      Continue13.click();
			      Thread.sleep(500);
			      RequestCoordination.sendKeys(datamap3.get(index3).get("RequestCoordination"));
			      Thread.sleep(500);
			      Continue16.click();
			      break;
		   }
		   Thread.sleep(500);
		   boolean Mail_Checked=driver.findElement(By.xpath("//*[@id='chk1601']")).isSelected();
	    	  if(Mail_Checked==true)
	    	  {
	    		  System.out.println("Already Selected");
	    	  }
	    	  else{
	    		  driver.findElement(By.xpath("//*[@id='chk1601']")).click();
	    	  }
	    	  Thread.sleep(200);
	    	  SentOn.sendKeys(datamap3.get(index3).get("MailSentOn"));
	    	  Thread.sleep(500);
	    	  Next17.click();
	    	  Thread.sleep(500);
	    	  int b=1;
	    	  switch(b)
	    	  {
	    	  case 1:/*** Save button ***/
	    		  Thread.sleep(1000);
	    		  Save.click();
	    		  Thread.sleep(20000);
	    		  break;
	    	  case 2:/*** Finish button ***/
	    		  Thread.sleep(1000);
	    		  Finish.click();
	    		  Thread.sleep(20000);
	    		  break;  
	    	  }
	    	  break;
	    case 2:/**** Are there any related cases? - No ****/ 
	    	  Thread.sleep(500);
	    	  RelatedCases.get(1).click();
	    	  Thread.sleep(500);
	    	  Continue10.click();
	    	  boolean Mail_Checked1=driver.findElement(By.xpath("//*[@id='chk1601']")).isSelected();
	    	  if(Mail_Checked1==true)
	    	  {
	    		  System.out.println("Already Selected");
	    	  }
	    	  else{
	    		  driver.findElement(By.xpath("//*[@id='chk1601']")).click();
	    	  }
	    	  Thread.sleep(200);
	    	  SentOn.sendKeys(datamap3.get(index3).get("MailSentOn"));
	    	  Thread.sleep(500);
	    	  Next17.click();
	    	  Thread.sleep(500);
	    	  int c=1;
	    	  switch(c)
	    	  {
	    	  case 1:/*** Save button ***/
	    		  Thread.sleep(500);
	    		  Save.click();
	    		  Thread.sleep(2000);
	    		  OKBtn.click();
	    		  break;
	    	  case 2:/*** Finish button ***/
	    		  Thread.sleep(500);
	    		  Finish.click();
	    		  Thread.sleep(2000);
	    		  OKBtn.click();
	    		  break;  
	    	  }
	    	  break;                                           	  
	    }
	    
	return new PageObjectModel_Chif(driver);    
}
public void RelatedCases(String arg3) throws InterruptedException
{
	 int index3 = Integer.parseInt(arg3)-1;
     for(HashMap h4:datamap3)
     {
       //   System.out.println(h4.keySet());
      //    System.out.println(h4.values());
     }
      List<WebElement> RelatedCases=driver.findElements(By.xpath("//*[@id='rdb1711']"));
      Thread.sleep(500);
	  RelatedCases.get(0).click();
	  Thread.sleep(500);
	  Continue10.click();
	  Thread.sleep(500);
	  Case_Name.sendKeys(datamap3.get(index3).get("CaseName"));
	  Petitioner_Name.sendKeys(datamap3.get(index3).get("PetitionerName"));
	  Respondent_Name.sendKeys(datamap3.get(index3).get("RespondentName"));
	  CaseNum.sendKeys(datamap3.get(index3).get("CaseNum"));
	  Thread.sleep(500);
	  Select Division1=new Select(Division);
	  Division1.selectByVisibleText(datamap3.get(index3).get("Divisions"));
	  Thread.sleep(500);
	  Continue11.click();
}
public void CheckAll() throws InterruptedException
{
	  Thread.sleep(500);
	  List<WebElement> TypeofProceeding=driver.findElements(By.xpath("//*[@type='checkbox']"));
	 for(int i=0;i<TypeofProceeding.size();i++)                                   
	  {
		  Thread.sleep(100);
		  TypeofProceeding.get(i).click();    
	  }
}
public void CheckAll2(String arg3) throws InterruptedException
{
	int index3 = Integer.parseInt(arg3)-1;
    for(HashMap h4:datamap3)
    {
      //   System.out.println(h4.keySet());
     //    System.out.println(h4.values());
    }
	 Thread.sleep(1000);
	  Next18.click();
	  Thread.sleep(500);
	  List<WebElement> TypeofProceeding1=driver.findElements(By.xpath("//*[@type='checkbox']"));
   	 for(int i=0;i<TypeofProceeding1.size();i++)                                   
   	  {
   		  Thread.sleep(100);
   		  TypeofProceeding1.get(i).click();    
   	  }
     Thread.sleep(500);
     OtherTypofProceeding.sendKeys(datamap3.get(index3).get("OtherTypeProceeding"));
     Thread.sleep(500);
     Continue12.click();
}
public void CaseStates(String arg5) throws InterruptedException
{
	int index3 = Integer.parseInt(arg5)-1;
    for(HashMap h4:datamap3)
    {
      //   System.out.println(h4.keySet());
     //    System.out.println(h4.values());
    }
    Thread.sleep(500);
    Select pendingState=new Select(CasePendingState);
    pendingState.selectByVisibleText(datamap3.get(index3).get("CasePendingState"));
    Thread.sleep(500);
    CourtName.sendKeys(datamap3.get(index3).get("CourtName"));
    LastCourtName.sendKeys(datamap3.get(index3).get("LastCourtName"));
    JudgementDate.sendKeys(datamap3.get(index3).get("JudgementDate"));
    Thread.sleep(500);
    ScrollDown200();
    Thread.sleep(500);
    List<WebElement> pendingCase=driver.findElements(By.xpath("//*[@type='checkbox']"));
  	 for(int i=0;i<pendingCase.size();i++)
  		
  	  {
  		  Thread.sleep(200);
  	//	  boolean isSelected=driver.findElement(By.xpath("//*[@type='checkbox']")).isSelected();
  		  boolean isSelected1=pendingCase.get(i).isSelected();
  		  if(isSelected1==true)
  		  {
  			  System.out.println("Already selectedddddddd");
  		  }
  		  else{
  			  pendingCase.get(i).click(); 
  		  }
  		     
  	  }
    Thread.sleep(500);
    StmtToRelation.sendKeys(datamap3.get(index3).get("StmtToRelation"));
    Thread.sleep(500);
    ScrollDown200();
    Thread.sleep(500);
    Continue14.click();
  //  List<WebElement> RelatedCases=driver.findElements(By.xpath("//*[@type='Radio']"));
    Thread.sleep(500);
	//RelatedCases.get(1).click();
	 
}
public void Logout_App() throws InterruptedException
{
	Thread.sleep(2000);
	Logout.click();
	
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
public void ScrollDown600()
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,600)", "");
}
public void ScrollDown200()
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,200)", "");
}
public void ScrollDown400()
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)", "");
}
public String getTitle()
{
	return driver.getTitle();
}
public String Username(){
	return driver.findElement(By.xpath("//*[@id='UserName']")).getText();
}
}

 


