package com.ActiTimeF.test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.ActiTimeF.generic.ExcelData;


public class ExcelData1
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 0);
		
		
		ExcelData.getData("./data/input.xlsx", "Sheet1",1,1);
						
		
		ExcelData.getData("./data/input.xlsx", "Sheet1", 0,0);
		
	}
}
