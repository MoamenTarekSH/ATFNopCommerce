package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	static FileInputStream fis ;

	public FileInputStream getFileInputStream() throws FileNotFoundException
	{
		String filePath =System.getProperty("user.dir")+"/src/test/java/DataDriven/UserData.xlsx";
		File fileSrc = new File(filePath);
		try {
			fis = new FileInputStream(fileSrc);
		} catch (FileNotFoundException e) 
		{
			System.out.println("Error Occured===>"+e.getMessage());
			System.exit(0);
		}
		return fis ;
	}


	public Object [][] getExcelData() throws IOException 
	{
		fis = getFileInputStream();
		XSSFWorkbook wb ;
		wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int TotalNumOfRows = (sheet.getLastRowNum()+1);
		int TotalNumOfCols = 4 ;
		String[] [] arrayExcelData = new String[TotalNumOfRows][TotalNumOfCols];
		for (int r = 0; r < TotalNumOfRows; r++) 
		{
			for (int c = 0; c < TotalNumOfCols; c++) 
			{
				XSSFRow row = sheet.getRow(r);
				arrayExcelData[r][c]=row.getCell(c).toString();
			}
		}
		wb.close();
		return arrayExcelData;		


	}


}
