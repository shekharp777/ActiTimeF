package com.ActiTimeF.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cellInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File file=new File("./data/input.xlsx");
		FileInputStream fil= new FileInputStream(file);
		Workbook wb = new WorkbookFactory().create(fil);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		short cell = row.getLastCellNum();
		System.out.println(cell);
	}
	
		
}
