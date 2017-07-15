package com.yong.excel.row;

import com.yong.excel.reflect.FieldReflection;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lichking on 2017. 7. 15..
 */
@EqualsAndHashCode
public class ExcelRow extends AbstractExcelRow {
    public ExcelRow(String... cellDatas){
        this(Arrays.asList(cellDatas));
    }

    public ExcelRow(List<String> cellDatas){
        this.cellDatas = new ArrayList<>(cellDatas);
    }

    public static ExcelRow ofRelection(Object source) {
        FieldReflection fieldReflection = new FieldReflection();

        return new ExcelRow(fieldReflection.fieldToList(source));
    }
}
