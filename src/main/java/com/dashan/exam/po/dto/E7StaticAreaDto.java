package com.dashan.exam.po.dto;

import java.io.Serializable;

/**
 * @ClassName: E7StaticAreaDto
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/11  下午 4:22
 */
public class E7StaticAreaDto implements Serializable {
    private Integer id;

    private String name;

    private Integer type;

    private Integer parentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
