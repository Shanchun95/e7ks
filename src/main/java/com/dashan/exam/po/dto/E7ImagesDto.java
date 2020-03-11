package com.dashan.exam.po.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: E7ImagesDto
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/08  下午 4:41
 */
public class E7ImagesDto implements Serializable {
    private Integer id;

    private String path;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
