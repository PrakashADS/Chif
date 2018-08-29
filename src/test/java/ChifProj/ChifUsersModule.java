package ChifProj;

import PageObjectModel.PageObjectModel_Chif;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ChifUsersModule extends TestBase{
	
	
    public List<HashMap<String,String>> datamap;
    public List<HashMap<String,String>> datamap2;
    public List<HashMap<String,String>> datamap3;
    PageObjectModel_Chif pom_Chif;
    
    public ChifUsersModule()
    {
     	datamap = DataHelper.data(System.getProperty("user.dir")+"\\src\\test\\java\\ChifProj\\Chif.xlsx","Login");
     	datamap2 = DataHelper.data(System.getProperty("user.dir")+"\\src\\test\\java\\ChifProj\\Chif.xlsx","Registration");
     	datamap3 = DataHelper.data(System.getProperty("user.dir")+"\\src\\test\\java\\ChifProj\\Chif.xlsx","Case");
    }
    @Given("^I open chif url$")
    public void Chif_url() throws Throwable {
    	initialization();
    	log.info("url opened");
    }
   @When("^I login with excel row \"(.*?)\" dataset$")
    public void Chif_login(String arg1) throws Throwable {
    	pom_Chif=new PageObjectModel_Chif(driver);
    	pom_Chif.Login(arg1);
    	log.info("Login success");
   }
    	
     @Then("^I signup the user with excel row \"(.*?)\" dataset$")
   public void Signup(String arg2) throws InterruptedException
   {   pom_Chif=new PageObjectModel_Chif(driver);
   	   pom_Chif.UserSignup(arg2);
   	   pom_Chif.SecurityQuestions(arg2);
   	   log.info("Signup success");
   }
     
   @Given("^Create New Case with excel row \"(.*?)\" dataset$")
   public void Create_Case(String arg3) throws InterruptedException, AWTException
   {
	   pom_Chif=new PageObjectModel_Chif(driver);
   	   pom_Chif.Create_NewCase(arg3);
   }
   
   @Then("^Logout the Application$")
   public void Logout() throws InterruptedException
   {
	   pom_Chif=new PageObjectModel_Chif(driver);
	   pom_Chif.Logout_App();
	 
   }
   @After
	/*public void Screenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + obj.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) obj)
						.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
				
			} catch (WebDriverException wde) {
				System.err.println(wde.getMessage());
			} catch (ClassCastException cce) {
				cce.printStackTrace();
			}*/
	public void Screenshot(Scenario scenario) throws IOException, InterruptedException {   
	if (scenario.isFailed()) {
	 String timeStamp;
	 String ClassName=getClass().getName();
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime()); 
	 FileUtils.copyFile(scrFile, new File("C:\\Users\\prakashd\\New_Workspace_Automation\\Chif\\Screenshots_Chif\\"+ClassName+"_"+timeStamp+".png"));
	
	 }
   }	
}
