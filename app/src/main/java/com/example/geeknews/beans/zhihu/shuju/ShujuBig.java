package com.example.geeknews.beans.zhihu.shuju;

/**
 * Created by 马明祥 on 2019/1/3.
 */

public class ShujuBig {
    private String title;
    private boolean isShow;

    public ShujuBig(String title, boolean isShow) {
        this.title = title;
        this.isShow = isShow;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    @Override
    public String toString() {
        return "ShujuBig{" +
                "title='" + title + '\'' +
                ", isShow=" + isShow +
                '}';
    }
}
