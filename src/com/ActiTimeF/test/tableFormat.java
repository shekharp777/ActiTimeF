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

public class tableFormat
	{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File file=new File("./data/input.xlsx");
		FileInputStream fil= new FileInputStream(file);
		Workbook wb = new WorkbookFactory().create(fil);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		int rn = sh.getLastRowNum();
		for (int i = 0; i <= rn; i++)
		{
			int cc=sh.getRow(i).getLastCellNum();
			for (int j = 0; j < cc; j++) 
			{
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
				
			}
			System.out.println();
		}
		
		
			
		}
	}

