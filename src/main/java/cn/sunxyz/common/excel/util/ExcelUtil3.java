package cn.sunxyz.common.excel.util;

/**
 * Created by Administrator on 2017/8/31.
 */
//java页面表格导出为Excel实现
//        导出工具类代码
        import java.io.IOException;
        import java.io.OutputStream;
        import java.io.UnsupportedEncodingException;
        import java.net.URLEncoder;
        import java.util.HashMap;
        import java.util.List;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import org.apache.poi.hssf.usermodel.HSSFCell;
        import org.apache.poi.hssf.usermodel.HSSFFont;
        import org.apache.poi.hssf.usermodel.HSSFRow;
        import org.apache.poi.hssf.usermodel.HSSFSheet;
        import org.apache.poi.hssf.usermodel.HSSFWorkbook;
        import org.apache.poi.ss.usermodel.CellStyle;
        import org.apache.poi.ss.usermodel.Workbook;
        import org.springframework.util.StringUtils;

public class ExcelUtil3 {


    public static void setFileDownloadHeader(HttpServletRequest request, HttpServletResponse response, String fileName) {
        final String userAgent = request.getHeader("USER-AGENT");
        try {
            String finalFileName = null;
            if (StringUtils.countOccurrencesOf(userAgent, "MSIE") > 0) {// IE浏览器
                // MSIE
                finalFileName = URLEncoder.encode(fileName, "UTF8");
            } else if (StringUtils.countOccurrencesOf(userAgent, "Mozilla") > 0) {// google,火狐浏览器
                // Mozilla
                finalFileName = new String(fileName.getBytes(), "ISO8859-1");
            } else {
                finalFileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
            }
            response.setHeader("Content-Disposition", "attachment; filename=\"" + finalFileName + "\"");// 这里设置一下让浏览器弹出下载提示框，而不是直接在浏览器中打开
        } catch (UnsupportedEncodingException e) {
        }
    }

    /**
     * 导出到excel
     *
     * @Title: exportExcel
     * @param list
     * @param fieldName
     * @param columnIt
     * @param sheetName
     * @param sheetSize
     * @param output
     * @return boolean
     */
    @SuppressWarnings({ "rawtypes" })
    public static boolean exportExcel(List list, String[] fieldName, Object[] columnIt, String sheetName, Integer sheetSize, OutputStream output) {
        // 产生工作薄对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        if (sheetSize >= 65536) {
            sheetSize = 65536;
        }
        double sheetNo = Math.ceil(list.size() / sheetSize);// 计算需要几个sheet
        for (int index = 0; index < sheetNo; index++) {
            // 产生工作表对象
            HSSFSheet sheet = workbook.createSheet();
            // 设置工作表的名称.
            workbook.setSheetName(index, sheetName + (index + 1));
            // 产生一行
            HSSFRow row = sheet.createRow(0);
            // 产生单元格
            HSSFCell cell;

            CellStyle cellStyle = getTitleStyle(workbook);
            // 写入各个字段的名称
            for (int i = 0; i < fieldName.length; i++) {
                // 创建第一行各个字段名称的单元格
                cell = row.createCell(i);
                // 设置单元格内容为字符串型
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                cell.setCellStyle(cellStyle);
                // 给单元格内容赋值
                cell.setCellValue(fieldName[i]);
            }

            int startNo = index * sheetSize;
            int endNo = Math.min(startNo + sheetSize, list.size());
            // 写入各条记录,每条记录对应excel表中的一行
            for (int i = startNo; i < endNo; i++) {
                row = sheet.createRow(i + 1 - startNo);
                HashMap map = (HashMap) list.get(i);
                for (int j = 0; j < columnIt.length; j++) {
                    cell = row.createCell(j);
                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                    Object value = map.get(columnIt[j]);
                    if (value != null) {
                        cell.setCellValue(map.get(columnIt[j]).toString());
                    } else
                        cell.setCellValue("");
                }
            }
        }
        try {
            workbook.write(output);
            output.flush();
            output.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 标题单元格样式
     *
     * @Title: getTitleStyle
     * @param workbook
     * @return CellStyle
     */
    public static CellStyle getTitleStyle(Workbook workbook) {
        CellStyle titleStyel = workbook.createCellStyle();
        HSSFFont font = (HSSFFont) workbook.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 设置粗体
        titleStyel.setFont(font);
        return titleStyel;
    }
}

//
//下面是如何调用上面的工具类
//
//        String[] fieldName = new String[]{"主体名称", "主体标识码","状态","失败原因"};
//        String[] columnIt = new String[]{"principalName", "code","statues","failReason"};
//        try {
//        response.setContentType("text/html; charset=utf-8");
//        response.setContentType("application/octet-stream");
//        response.addHeader("Content-Disposition", "attachment;filename=" + new String("导出数据.xls".getBytes("GB2312"), "ISO-8859-1"));
//        Export.exportExcel(result, fieldName, columnIt, "数据", result.size(), response.getOutputStream());
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//
//        注：这里的result格式为List<Map<String, Object>>
