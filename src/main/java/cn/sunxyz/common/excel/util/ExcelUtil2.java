package cn.sunxyz.common.excel.util;

/**
 * Created by Administrator on 2017/8/29.
 */
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Excel util, create excel sheet, cell and style.
 * @param <T> generic class.
 */
public class ExcelUtil2<T> {

    public HSSFCellStyle getCellStyle(HSSFWorkbook workbook,boolean isHeader){
        HSSFCellStyle style = workbook.createCellStyle();
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setLocked(true);
        if (isHeader) {
            style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
            style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            HSSFFont font = workbook.createFont();
            font.setColor(HSSFColor.BLACK.index);
            font.setFontHeightInPoints((short) 12);
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
            style.setFont(font);
        }
        return style;
    }


    public  void generateHeader(HSSFWorkbook workbook,HSSFSheet sheet,String[] headerColumns){
        HSSFCellStyle style = getCellStyle(workbook,true);
        Row row = sheet.createRow(0);
        row.setHeightInPoints(30);
        for(int i=0;i<headerColumns.length;i++){
            Cell cell = row.createCell(i);
            String[] column = headerColumns[i].split("_#_");
            sheet.setColumnWidth(i, Integer.valueOf(column[1]));
            cell.setCellValue(column[0]);
            cell.setCellStyle(style);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public  HSSFSheet creatAuditSheet(HSSFWorkbook workbook,String sheetName,
                                      List<T> dataset,String[] headerColumns,String[] fieldColumns) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // 第一步，创建一个webbook，对应一个Excel文件(外部创建？)

        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = workbook.createSheet(sheetName);
        sheet.protectSheet("1234");//设置Excel保护密码

//        char[] endChar = Character.toChars( 'A' + (headerColumns.length - 1) );
//        String rangeAddress = "A1:" + String.valueOf(endChar) + "1";
//        sheet.setAutoFilter(CellRangeAddress.valueOf(rangeAddress));

        generateHeader(workbook,sheet,headerColumns);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = getCellStyle(workbook,false);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        int rowNum = 0;
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
        for(T t:dataset){
            rowNum++ ;
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            Row row = sheet.createRow(rowNum);
            row.setHeightInPoints(25);
            for(int i = 0; i < fieldColumns.length; i++){
                String fieldName = fieldColumns[i] ;

                String getMethodName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
                try {
                    Class clazz = t.getClass();
                    Method getMethod;
                    getMethod = clazz.getMethod(getMethodName, new Class[]{} );
                    Object value = getMethod.invoke(t, new Object[]{});
                    String cellValue = "";
                    if (value instanceof Date){
                        Date date = (Date)value;
                        cellValue = sd.format(date);
                    }else{
                        cellValue = null != value ? value.toString() : "";
                    }
                    // 第四步，创建单元格，并设置值
                    Cell cell = row.createCell(i);
                    cell.setCellStyle(style);
                    cell.setCellValue(cellValue);

                } catch (Exception e) {

                }
            }
        }
        return sheet;
    }

}