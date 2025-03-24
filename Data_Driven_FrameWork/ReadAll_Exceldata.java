package Data_Driven_FrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAll_Exceldata {

	public static void main(String[] args) throws Throwable{
		File fi= new File("./Excel_Folder/data1.xlsx");
		FileInputStream f1= new FileInputStream(fi);
	
		Workbook wb= WorkbookFactory.create(f1);
         Sheet shee= wb.getSheetAt(0);
         for(int i=0;i<shee.getLastRowNum();i++) {
        	    Row row =shee.getRow(i);
        	    
        	    for(int j=0;j<row.getLastCellNum();j++) {
        	    	
        	    	Cell cell=row.getCell(j);
        	    	System.out.print(cell+" ");
        	    	
        	    }
        	    System.out.println();
        	    
        	 
         }
         
	
	
		
		

	}

}
