package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String getExcelSheetData(String sheet, int row, int column) throws EncryptedDocumentException, IOException 
	{
		String path = "C:\\Users\\Dell\\Desktop\\Excel2.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		sheet = WorkbookFactory.create(file).getSheet("Sheet2")
				.getRow(row).getCell(column).getStringCellValue();
		
		return sheet;

	
	}

	public static void getScreenShot(WebDriver driver, int testID) throws IOException 
	{
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh mm ss");
			Date date = new Date();
			String CurrentDate = sdf.format(date);
			System.out.println(CurrentDate);
		    File Dest = new File("D:\\Software Testing\\Test" + CurrentDate +".jpg");
		    FileHandler.copy(src, Dest);
	}


}
