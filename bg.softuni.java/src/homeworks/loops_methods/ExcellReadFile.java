package Homeworks.loops_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReadFile {

	private static final String TABLEPATH = "text_files/IncomesReport.xlsx";
	
	public static void printResult(Map<String, BigDecimal> incomeReport, BigDecimal grandTotal) {
		for (Map.Entry entry : incomeReport.entrySet()) {
			System.out.printf("%s Total -> %.2f\n", entry.getKey(), entry.getValue());
		}
		System.out.printf("Grand Total -> %.2f", grandTotal);
	}
	
	public static void main(String[] args) {
		
		FileInputStream file = null;
		XSSFWorkbook wb = null;
		try {
			file = new FileInputStream(new File(TABLEPATH));
			wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();
			Map<String, BigDecimal> incomeReport = new TreeMap<>();
			String companyName = "";
			BigDecimal incomeValue = new BigDecimal(0);
			BigDecimal grandTotal = new BigDecimal(0);
			
			for (int i = 1; i < rows; i++) {
				XSSFRow row = sheet.getRow(i);
				companyName = row.getCell(0).toString();
				incomeValue = BigDecimal.valueOf(row.getCell(5).getNumericCellValue());
				grandTotal = grandTotal.add(incomeValue);
				if (incomeReport.containsKey(companyName)) {
					BigDecimal temp = incomeReport.get(companyName);
					incomeReport.put(companyName, temp.add(incomeValue));
				} else {
					incomeReport.put(companyName, incomeValue);
				}
			}
			printResult(incomeReport, grandTotal);
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(wb != null){
				try {
					wb.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
