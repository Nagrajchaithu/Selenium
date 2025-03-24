package Data_Driven_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Simle_Excelfile_Read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File fi= new File("./Excel_Folder/data1.xlsx");
		FileInputStream f1= new FileInputStream(fi);
		Workbook wb= WorkbookFactory.create(f1);
		Sheet shee=wb.getSheetAt(1);
		Row row=shee.getRow(0);
         Cell cell=	row.getCell(0);
         System.out.print(cell.toString()); 
		
		
	

	}

}
