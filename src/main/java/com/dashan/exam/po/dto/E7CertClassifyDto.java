package com.dashan.exam.po.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: E7CertClassifyDto
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/02/13  下午 11:10
 */
public class E7CertClassifyDto implements Serializable {
        private Integer id;

        private String name;

        private Integer parentId;

        private Integer hot;

        private List<E7CertClassifyDto> classifyList;

        private List<E7CertEntryDto> entryList;

    public List<E7CertClassifyDto> getClassifyList() {
        return classifyList;
    }

    public void setClassifyList(List<E7CertClassifyDto> classifyList) {
        this.classifyList = classifyList;
    }

    public List<E7CertEntryDto> getEntryList() {
        return entryList;
    }

    public void setEntryList(List<E7CertEntryDto> entryList) {
        this.entryList = entryList;
    }

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getHot() {
            return hot;
        }

        public void setHot(Integer hot) {
            this.hot = hot;
        }
}
