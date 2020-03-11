package com.dashan.exam.po.dto;

import java.io.Serializable;

/**
 * @ClassName: ArticleDto
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/06  下午 4:35
 */
public class ArticleDto implements Serializable {
    private static final long serialVersionUID = -1L;
    private Integer page;

    private Integer pagesize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }
}
