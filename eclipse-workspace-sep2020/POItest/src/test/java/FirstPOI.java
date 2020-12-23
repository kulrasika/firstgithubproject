import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstPOI {
	
	public ArrayList<String> GetData(String testcase) throws IOException
	{
			
			ArrayList<String> a = new ArrayList();
			String testscenario = testcase;
			
			FileInputStream file = new FileInputStream("E://eclipse//POIData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet datasheet = null ;
			
			
					
			int countofsheets = workbook.getNumberOfSheets();
			String sheetname = null;
			int k = 0;
			int columnnumber=0;
			for(int i=0;i<countofsheets;i++)
			{
				sheetname= workbook.getSheetName(i);
			
			if(sheetname.equalsIgnoreCase("data"))
			{
			datasheet = workbook.getSheetAt(i);
			break;
			}
			}
			
			Iterator<Row> row = datasheet.iterator();
			Row searchrow = row.next();
			Iterator<Cell> cell = searchrow.cellIterator();
			
			while(cell.hasNext())
			{
				Cell value = cell.next();
			
				if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
				{columnnumber = k;
				
				}	
			k++;
			
					
			}
			
			System.out.println(columnnumber);
			
			
			
			while(!(searchrow.getCell(columnnumber).getStringCellValue()).equalsIgnoreCase(testscenario))
			{
			searchrow=row.next();
			}
			
			Iterator<Cell> searchdata = searchrow.cellIterator();
			
			while(searchdata.hasNext())
			{
				a.add(searchdata.next().getStringCellValue());
			}
			
			return a;
		}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		
		
	}

}
