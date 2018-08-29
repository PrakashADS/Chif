package ChifProj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;




public class TestUtil extends TestBase {
	static Workbook book;
	static Sheet sheet;
	

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	public static Object[][] testData(String sheetName) {
		FileInputStream file=null;
		
		try {
			file=new FileInputStream("C:\\Users\\prakashd\\New_Workspace_Automation\\Chif\\src\\test\\java\\Chif\\Chif\\ExcelDatas.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	sheet=book.getSheet(sheetName);
	int row=sheet.getLastRowNum();
	
	Row r1=sheet.getRow(0);
	int col=r1.getLastCellNum();
	
	Object[][]data=new Object[row][col];
	
	for(int r=1;r<=row;r++) {
		for(int c=0;c<col;c++) {
			data[r-1][c]=sheet.getRow(r).getCell(c).toString();
			System.out.println(data[r-1][c]);
		}
	}
	return data;
	
	}

	
	/*public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timeStamp;
		timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime()); 
		String currentDir = System.getProperty("user.dir");//C:\Users\acer\eclipse-workspace\Mrudu\FreeCRM
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots_Chif/" + timeStamp + ".png"));
		
		}
	
	
	
	*/

	/*public static void Screenshot() {
		Scenario scenario = null;
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshotsChif/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   
 
				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}*/
	
}
