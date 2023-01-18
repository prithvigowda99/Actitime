package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class is a generic to read the data
 * @author Prithvi
 *
 */
public class FileLib {


	/**
	 * this is method to read the data from the property file
	 * @param key
	 * @return data
	 * @throws IOException
	 */
	public String getProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Data./files.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}


	/**
	 * this method to read the data from Excel data sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExceldata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./Data/ExcelScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}


	/**
	 * this method to write the data to excel sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExceldData(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/ExcelScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);

		FileOutputStream fos=new FileOutputStream("./Data");
		wb.write(fos);
		wb.close();



	}

}
