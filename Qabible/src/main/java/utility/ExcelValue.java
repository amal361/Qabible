package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelValue {
	XSSFSheet sh;

	public ExcelValue() throws IOException {
		FileInputStream I = new FileInputStream("C:\\Users\\amal\\Desktop\\Book1.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(I);
		sh = w.getSheet("Sheet1");
	}

	public String readData(int i, int j) {
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int cellType = c.getCellType();
		switch (cellType) {
		case Cell.CELL_TYPE_NUMERIC: {
			double a = c.getNumericCellValue();
			return String.valueOf(a);
		}
		case Cell.CELL_TYPE_STRING: {
			return c.getStringCellValue();
		}
		}

		return null;
	}

	public int rowsize() {
		int noofrows = sh.getLastRowNum() + 1;
		return noofrows;
}
}