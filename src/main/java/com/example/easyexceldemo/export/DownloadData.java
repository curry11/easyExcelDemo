package com.example.easyexceldemo.export;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: dingwenlong
 * @Title: DownloadData
 * @ProjectName: easyExcelDemo
 * @Description:
 * @date: 2022/2/17 11:12
 */
@Data
public class DownloadData {
    @ExcelProperty("字符串标题")
    private String string;
    @ExcelProperty("日期标题")
    private Date date;
    @ExcelProperty("数字标题")
    private Double doubleData;
}
