package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
public String readrowsandcols(String inputfile,String sheetname,int rownumber,int cellnumber) throws IOException {
FileInputStream fi = new FileInputStream(inputfile);
XSSFWorkbook workbook = new XSSFWorkbook(fi);
Sheet sheet = workbook.getSheet(sheetname);
Row   row1 =sheet.getRow(rownumber);
Cell cell1 =row1.getCell(cellnumber);
String value = cell1.getStringCellValue();
workbook.close();
return value;
	}

}
