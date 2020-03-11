package com.dashan.exam.po.vo;

import com.dashan.exam.po.dto.E7CertDto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: E7CertClassifyListVo
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/06  上午 10:02
 */
public class CertClassifyVo implements Serializable {
    private Integer id;

    private String name;

    private String img;

    private Date startDate;

    private String enter;

    private String point;

    private String outline;

    private String exam;

    private String know;

    private String certGroup;

    private Integer hot;

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    private  List<CertClassifyVo> children;

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
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
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
        this.enter = enter;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getKnow() {
        return know;
    }

    public void setKnow(String know) {
        this.know = know;
    }

    public String getCertGroup() {
        return certGroup;
    }

    public void setCertGroup(String certGroup) {
        this.certGroup = certGroup;
    }

    public List<CertClassifyVo> getChildren() {
        return children;
    }

    public void setChildren(List<CertClassifyVo> children) {
        this.children = children;
    }
}
