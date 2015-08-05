package cn.grape.lion.page;

import cn.grape.lion.domain.User;

import java.util.List;

/**
 * Created by solis on 2015/8/4.
 */
public class UserPage {
    private int total;
    private List<User> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<User> getRows() {
        return rows;
    }

    public void setRows(List<User> rows) {
        this.rows = rows;
    }
}
