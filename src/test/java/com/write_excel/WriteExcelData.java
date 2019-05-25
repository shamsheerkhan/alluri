package com.write_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.genericmethods.GenericMethods;

public class WriteExcelData extends GenericMethods{
	
	public static File f;
	public static XSSFWorkbook workbook;
	public  static XSSFSheet sheet;
	public static FileOutputStream fos;
	//**************************************************************//
	/*
	 * Method Name := create_excel_file()
	 * 
	 * Input Parameter := Test-Data_Path
	 * 
	 * OutPut Parameter :=  
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
public static   void create_excel_file(String email_id, String password){
	System.out.println("Creating Excel File");
	String path=System.getProperty("user.dir")+"\\TestData\\ResultData.xlsx";
	f=new File(path);
	book=new XSSFWorkbook();
	
	try{sheet=book.createSheet("login credentials");
	sheet.createRow(0).createCell(0).setCellValue("Email_Id");
	sheet.createRow(0).createCell(1).setCellValue("Password");
	for(int i=1;i<=16;i++) {
		for(int j=0;j<2;j++) {
			if(j==0)
			sheet.createRow(i).createCell(j).setCellValue(email_id);
			if(j==1)
				sheet.createRow(i).createCell(j).setCellValue(password);	
		}
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
	try {
		fos=new FileOutputStream(f);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	try {
		book.write(fos);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		fos.flush();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	try {
		fos.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	
	
				
		
		
}

//**************************************************************************************************//

}
