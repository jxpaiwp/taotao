package com.jxp.taotao.easyui;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 17:50
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class DataGridResult {
    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
