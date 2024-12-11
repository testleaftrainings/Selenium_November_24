package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
//retain the static keyword 
	//static - common reference value
	//step -4
	public static String[][] readvalue() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./excelData/CreateLead24.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short cellCount = sheet.getRow(1).getLastCellNum();
		
		//step 1 assign and declare the value
		String[][] data=new String[rowCount][cellCount];
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			//step 2 declare value to DP
				data[i-1][j]=stringCellValue;
			}	
		}
		
		//step -3
		wb.close();
		return data;
		
		
		
		
		
		
		
		

	}

}
