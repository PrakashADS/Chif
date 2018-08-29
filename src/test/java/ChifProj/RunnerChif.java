package ChifProj;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.picocontainer.classname.ClassName;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "C:\\Users\\prakashd\\New_Workspace_Automation\\Chif\\src\\test\\java\\ChifProj\\chif.feature",
//glue = {"ChifProj.ChifUsersModule"},
//dryRun = true,
//monochrome=true,
plugin = {
		
		"pretty",
		"html:target/cucumber-html-report/ScreenshotChif",
			
	    "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Chif1.html",

		"json:cucumber.json" },
		
tags = {
		
	   "~@Logout"
	
       })

    public class RunnerChif
    {
	@AfterClass
	public static void writeExtentReport() throws IOException  {
		    Reporter.loadXMLConfig(new File(
				"C:\\Users\\prakashd\\New_Workspace_Automation\\Chif\\src\\test\\java\\config\\test.xml"));
		    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 7" + " , "+ "64 Bit");
		    Reporter.setSystemInfo("Selenium", "2.53.1");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_111");
		    
	}  
}
