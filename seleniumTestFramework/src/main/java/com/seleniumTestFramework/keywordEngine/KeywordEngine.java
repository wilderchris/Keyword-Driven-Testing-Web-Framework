package com.seleniumTestFramework.keywordEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import com.seleniumTestFramework.Base.Base;

public class KeywordEngine {

	public WebDriver driver;
	public Properties prop;
	public Base base;
	public static Workbook book;
	public static Sheet sheet;

	public final String SCENERIO_SHEET_PATH = "./src/main/resources/scenerios.xlsx";

	public void startExecution(String sheetName) {

		String locatorName = null;
		String locatorValue = null;

		FileInputStream file = null;
		try {
			file = new FileInputStream(SCENERIO_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		int k = 0;
		for (int i = 0; i < sheet.getLastRowNum(); i++) {

			String locatorColValue = sheet.getRow(i + 1).getCell(k + 1).toString().trim();

			if (!locatorColValue.equalsIgnoreCase("NA")) {

				locatorName = locatorColValue.split("=")[0].trim();
				locatorValue = locatorColValue.split("=")[1].trim();
			}

			String action = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
			String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();

			switch (action) {
			case "open browser":
						
				base = new Base();
				prop = base.init_properties();
					if(value.isEmpty() || value.equals("NA")) {
						driver = base.init_driver((prop.getProperty("browser")));
					}else {
						driver = base.init_driver(value);
					}
				
				break;
			case "enter url":
				if(value.isEmpty() || value.equals("NA")) {
					driver.get(prop.getProperty("url"));
				}else {
					driver.get(value);
				}
				break;
			case "quit":
				driver.quit();
				break;
			case "click":

				break;
			default:
				break;
			}

		}

	}

}
