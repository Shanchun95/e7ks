package com.dashan.exam.po;

import java.util.Date;

public class E7Cert {
    private Integer id;

    private String name;

    private Integer img;

    private Date startDate;

    private String enter;

    private String point;

    private String outline;

    private String exam;

    private String know;

    private String certGroup;

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

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter == null ? null : enter.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline == null ? null : outline.trim();
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam == null ? null : exam.trim();
    }

    public String getKnow() {
        return know;
    }

    public void setKnow(String know) {
        this.know = know == null ? null : know.trim();
    }

    public String getCertGroup() {
        return certGroup;
    }

    public void setCertGroup(String certGroup) {
        this.certGroup = certGroup == null ? null : certGroup.trim();
    }
}