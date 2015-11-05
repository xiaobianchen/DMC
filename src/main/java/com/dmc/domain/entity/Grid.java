package com.dmc.domain.entity;

import java.util.List;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/10/21
 *
 * This class is the response for the easyUI Grid
 */
public class Grid {
    private int total;
    private List<?> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
