package cn.sunxyz.common.excel.core;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 
* excel 常用功能
* @author 神盾局
* @date 2016年8月9日 下午2:19:05
*
 */
public class ExcelTool {
	
	//当前行数
	private static int num = 0;
	
	private static HSSFWorkbook wb;
	
	private static HSSFCell cell;
	
	private static HSSFRow row;
	
	
	public static HSSFWorkbook createWorkbook(){
		wb = new HSSFWorkbook();
		return wb;
	}

	public static HSSFCellStyle getCellStyle(HSSFWorkbook workbook){
		// 生成一个样式
		HSSFCellStyle style = workbook.createCellStyle();
		// 设置这些样式
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中

		// 背景色
//		style.setFillForegroundColor(HSSFColor.YELLOW.index);
//		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//		style.setFillBackgroundColor(HSSFColor.YELLOW.index);

		// 设置边框
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		// 自动换行
		style.setWrapText(true);
		// 生成一个字体
		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontName("宋体");
		// 把字体 应用到当前样式
		style.setFont(font);
		//style设置好后，为cell设置样式
//		cell.setCellStyle(style);//cell为已有的单元格
		return style;
	}
	
	/**
	 * 
	* 创建一个sheet
	* @param sheetname
	* @return  HSSFSheet 返回类型  
	* @throws
	 */
	public static HSSFSheet createSheet(HSSFWorkbook wb,int ii, String sheetname){
		// 创建excel工作簿
		HSSFSheet sheet = wb.createSheet();
		wb.setSheetName(ii, sheetname);
		//设置Excel保护密码
//		sheet.protectSheet("1234");
//		sheet.setColumnWidth(ii, 20 * 256);
		sheet.setDefaultColumnWidth(20);
		sheet.setDefaultRowHeightInPoints(20);
//		sheet.autoSizeColumn(ii, true);
		getCellStyle(wb);
		return sheet;
	}
	
	/**
	 * 
	* 创建一行
	* @param sheet
	* @return  HSSFRow 返回类型  
	* @throws
	 */
	public static HSSFRow createRow(HSSFWorkbook wb,HSSFSheet sheet){
		row = sheet.createRow(num);
		row.setRowStyle(getCellStyle(wb));
		num++;
		return row;
	}
	
	/**
	 * 
	* 创建一格
	* @param row
	* @param col
	* @return  HSSFCell 返回类型  
	* @throws
	 */
	public static HSSFCell createCell(HSSFRow row, int col){
		cell = row.createCell(col);// 创建cell
		cell.setCellStyle(getCellStyle(wb));
		return cell;
	}
	
	/**
	 * 获取合并单元格的值
	 * 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 */
	public static String getMergedRegionValue(Sheet sheet, int row, int column) {
		int sheetMergeCount = sheet.getNumMergedRegions();

		for (int i = 0; i < sheetMergeCount; i++) {
			CellRangeAddress ca = sheet.getMergedRegion(i);
			int firstColumn = ca.getFirstColumn();
			int lastColumn = ca.getLastColumn();
			int firstRow = ca.getFirstRow();
			int lastRow = ca.getLastRow();

			if (row >= firstRow && row <= lastRow) {
				if (column >= firstColumn && column <= lastColumn) {
					Row fRow = sheet.getRow(firstRow);
					Cell fCell = fRow.getCell(firstColumn);

					return getCellValue(fCell);
				}
			}
		}
		return null;
	}

	/**
	 * 判断指定的单元格是否是合并单元格
	 * 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 */
	public static boolean isMergedRegion(Sheet sheet, int row, int column) {
		int sheetMergeCount = sheet.getNumMergedRegions();

		for (int i = 0; i < sheetMergeCount; i++) {
			CellRangeAddress ca = sheet.getMergedRegion(i);
			int firstColumn = ca.getFirstColumn();
			int lastColumn = ca.getLastColumn();
			int firstRow = ca.getFirstRow();
			int lastRow = ca.getLastRow();

			if (row >= firstRow && row <= lastRow) {
				if (column >= firstColumn && column <= lastColumn) {

					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 获取单元格的值
	 * 
	 * @param cell
	 * @return
	 */
	public static String getCellValue(Cell cell) {
		if (cell == null)
			return "";
		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();

		} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(cell.getBooleanCellValue());

		} else if (cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
			return cell.getCellFormula();

		} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			return String.valueOf(cell.getNumericCellValue());
		}

		return "";
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		ExcelTool.num = num;
	}

	public static HSSFWorkbook getWb() {
		return wb;
	}

	public static void setWb(HSSFWorkbook wb) {
		ExcelTool.wb = wb;
	}

	public static HSSFCell getCell() {
		return cell;
	}

	public static void setCell(HSSFCell cell) {
		ExcelTool.cell = cell;
	}

	public static HSSFRow getRow() {
		return row;
	}

	public static void setRow(HSSFRow row) {
		ExcelTool.row = row;
	}

	
	
}
