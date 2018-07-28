package com.ActiTimeF.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	
	//To get data from excel file
		public static String getData(String path,String sheet,int rn,int cn)
		{
			try 
			{
				FileInputStream fis=new FileInputStream(path);
				Workbook wb=WorkbookFactory.create(fis);
				String data = wb.getSheet(sheet).getRow(rn).getCell(cn).toString();
				System.out.println("Excel Sheet Data:  "+data);
				return data;
			}
			
			catch(Exception e)
			{
				return " ";
			}
			
		}

		//To get the row count
		public static int getRow(String path, String sheet)
		{
			try 
			{
				FileInputStream fis=new FileInputStream(path);
				new WorkbookFactory();
				Workbook wb= WorkbookFactory.create(fis);
				int rn = wb.getSheet(sheet).getLastRowNum();
				System.out.println(rn);
				
					return rn;
			}
			catch(Exception e)
			{
				return 0;
			}
		}
		
		//To get the cell count
		public static short getCellCount(String path, String sheet,int rn)
		{
			try
			{
				FileInputStream fis=new FileInputStream(path);
				Workbook wb=new WorkbookFactory().create(fis);
				Sheet sh = wb.getSheet(sheet);
				Row r = sh.getRow(rn);
				short cn = r.getLastCellNum();
				System.out.println(cn);
				return cn;
				
			}
			catch(Exception e)
			{
				return 0;
			}
		}
}
