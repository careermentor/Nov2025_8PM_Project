package firstPkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandling 
{

	public static void readexcel() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\TestData\\abc.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet2");
		
		int nr = sh1.getPhysicalNumberOfRows();  //4
		
		for(int i=0; i<nr; i++)  //i=0, 0<4, i=1, 1<4
		{
			XSSFRow row = sh1.getRow(i);   //i=0, i=1
			
			int nc = row.getPhysicalNumberOfCells();  //i=0, nc=2, i=1, nc=3
			
			for(int j=0; j<nc; j++)  //j=0, 0<2, j=1, 1<3
			{
				XSSFCell col = row.getCell(j);  //j=0. j=1, j=2, j=3
				
				if(col.getCellType() == CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "    ");
				}
				
				else if(col.getCellType() == CellType.NUMERIC)
				{
					System.out.print(col.getNumericCellValue() + "    ");
				}
				
				else if(col.getCellType() == CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "    ");
				}
				
				else
				{
					System.out.print(col.getDateCellValue() + "    ");
				}
			}
			
			System.out.println();
		}
		
		/*
		XSSFRow row1 = sh1.getRow(0);  //first row
		
		XSSFCell col1 = row1.getCell(0);  //first column
		System.out.print(col1.getStringCellValue() + "    ");
		
		XSSFCell col2 = row1.getCell(1);  //second column
		System.out.print(col2.getStringCellValue() + "    ");
		
		System.out.println();
		
		XSSFRow row2 = sh1.getRow(1);  //second row
		
		XSSFCell col21 = row2.getCell(0);  //first column
		System.out.print(col21.getStringCellValue() + "    ");
		
		XSSFCell col22 = row2.getCell(1);  //second column
		System.out.print(col22.getStringCellValue() + "    ");
		
		XSSFCell col23 = row2.getCell(2);  //third column
		System.out.print(col23.getStringCellValue() + "    ");
		*/
	}
	
	
	public static void main(String[] args) throws Exception {
		
		readexcel();
		
	}
	
}
