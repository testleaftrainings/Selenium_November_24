package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	public static void main(String[] args) throws IOException {
		
		//step 1- set path for workbook
		XSSFWorkbook wb=new XSSFWorkbook("./excelData/CreateLead24.xlsx");
		
		//step 2- Get into Sheet
		//index value -getSheetAt(0)
		//Sheet Name -getSheet("Sheet1")
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//step 3-Get into row
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count is :"+rowCount);

		//excluding the header value -cname,fname,lname
		//include header value print the row count
		int phy = sheet.getPhysicalNumberOfRows();
		System.out.println("Include the header value :"+phy);
		
		
		//step get into col == cell
		short cellCount = sheet.getRow(1).getLastCellNum();
		System.out.println("Cell count is :"+cellCount);
		
		String scv = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(scv);
		
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
			
		}
		
		//step -6
		wb.close();
		
		
		
		
		
		
		
		

	}

}
