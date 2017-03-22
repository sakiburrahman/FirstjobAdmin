package utility;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.RowIdLifetime;
import java.util.ArrayList;


import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

    public class ExcelUtils {

        		private static XSSFSheet ExcelWSheet;

        		private static XSSFWorkbook ExcelWBook;

        		private static XSSFCell Cell;

        		private static XSSFRow Row;

    		//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

    		public static void setExcelFile(String Path,String SheetName) throws Exception {

       			try {

           			// Open the Excel file

					FileInputStream ExcelFile = new FileInputStream(Path);

					// Access the required test data sheet

					ExcelWBook = new XSSFWorkbook(ExcelFile);

					ExcelWSheet = ExcelWBook.getSheet(SheetName);

					} catch (Exception e){

						throw (e);

					}

			}

    		//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    		public static String getCellData(int RowNum, int ColumnNum) throws IOException
    		{
    			InputStream ExcelFileToRead = new FileInputStream(Constant.Path_TestData+Constant.File_TestData);
    			XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
    			XSSFSheet ExcelWSheet = null;
    			 
    			XSSFWorkbook ExcelWBook;

    			XSSFCell Cell;

    			XSSFRow Row;
    			XSSFSheet sheet=wb.getSheetAt(0);
    			XSSFRow row; 
    			XSSFCell cell;
    			//cell = ExcelWSheet.getRow(RowNum).getCell(ColumnNum);
    			
    				 
    	  			cell = sheet.getRow(RowNum).getCell(ColumnNum);

    	  			//String CellData = cell.getStringCellValue();
    	  			if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
    				{
    	  				
    					System.out.print(cell.getStringCellValue()+" ");
    					return cell.getStringCellValue();
    				}
    				else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
    				{	
    					System.out.print(cell.getNumericCellValue()+" ");
    					return NumberToTextConverter.toText(cell.getNumericCellValue());
    					
    				}
    				/*else if(cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN)
    				{	
    					System.out.print(cell.getBooleanCellValue()+" ");
    					return NumberToTextConverter.toText(value)(cell.getBooleanCellValue());
    					
    				}*/
    				else
    				{
    					//U Can Handel Boolean, Formula, Errors
    				}
    	  			return "";
    	  			}
    		

    		//This method is to write in the Excel cell, Row num and Col num are the parameters

    		public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

       			try{

          			Row  = ExcelWSheet.getRow(RowNum);

					Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

					if (Cell == null) {

						Cell = Row.createCell(ColNum);

						Cell.setCellValue(Result);

						} else {

							Cell.setCellValue(Result);

						}

          // Constant variables Test Data path and Test Data file name

          				FileOutputStream fileOut = new FileOutputStream(Constant.Path_Test_Output + Constant.File_Test_Output);

          				ExcelWBook.write(fileOut);

          				fileOut.flush();

 						fileOut.close();

						}catch(Exception e){

							throw (e);

					}

				}

	}