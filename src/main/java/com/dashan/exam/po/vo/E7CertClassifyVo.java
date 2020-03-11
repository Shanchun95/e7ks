package com.dashan.exam.po.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: E7CertClassifyVo
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/02/21  下午 9:28
 */
public class E7CertClassifyVo implements Serializable {
    private Integer id;
    private String label;
    private Integer level;
    private Integer sort;
    private String des;
    private Integer classify;
    private List<E7CertClassifyVo> children;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<E7CertClassifyVo> getChildren() {
        return children;
    }

    public void setChildren(List<E7CertClassifyVo> children) {
        this.children = children;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }
}
