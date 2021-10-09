package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

public class Table {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\1611r\\eclipse-workspace\\New\\testdata\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		int d = sheet.getPhysicalNumberOfRows();
		
		for (int j = 0; j <d ; j++) {
			Row row = sheet.getRow(j);
			int m = row.getPhysicalNumberOfCells();
			for (int i = 0; i < m; i++) {
				Cell cell = row.getCell(i);
				int l = cell.getCellType();
				if (l==1) {
					String n = cell.getStringCellValue();
					System.out.print(n+"\t"+"\t"+"\t");
				}
				 else if (DateUtil.isCellDateFormatted(cell)) {
					Date a = cell.getDateCellValue();
					SimpleDateFormat re = new SimpleDateFormat("dd/mm/yyyy");
					String a1 = re.format(a);
					System.out.print(a1+"\t"+"\t"+"\t");
				}
				 else {
					double b = cell.getNumericCellValue();
					System.out.println(b+"\t");
				}
				
			}
		}
		
	}

}
