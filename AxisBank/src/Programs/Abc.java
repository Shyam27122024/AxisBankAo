package Programs;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Abc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	    FileInputStream file = new  FileInputStream("C:\\Users\\narwade.ramchandra\\OneDrive - Newgen\\Desktop\\Automation\\TestData..xlsx");
	    String Url = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
         System.out.println(Url);
    
         

	}

}
