package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\MyExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Mysheet"); //XSSF use ss usermodel
		CellStyle style = workbook.createCellStyle();
		Row row1 = sheet.createRow(0);
		style = workbook.createCellStyle();
		//Row row2 = sheet.createRow(1);
		Cell cellA = row1.createCell(0);
		cellA.setCellValue("Hi this cell is created from POI");
		style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellA.setCellStyle(style);
		workbook.write(fo);
		workbook.close();

	}

}
