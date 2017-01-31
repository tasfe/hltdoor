package com.hltdoor.model;

import java.util.Date;

public class HNews {
    private Integer id;

    private String hTitle;

    private String hAuthor;

    private Date hTime;

    private String hImg;

    private String hAbstract;

    private Integer hType;

    private String hContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gethTitle() {
        return hTitle;
    }

    public void sethTitle(String hTitle) {
        this.hTitle = hTitle == null ? null : hTitle.trim();
    }

    public String gethAuthor() {
        return hAuthor;
    }

    public void sethAuthor(String hAuthor) {
        this.hAuthor = hAuthor == null ? null : hAuthor.trim();
    }

    public Date gethTime() {
        return hTime;
    }

    public void sethTime(Date hTime) {
        this.hTime = hTime;
    }

    public String gethImg() {
        return hImg;
    }

    public void sethImg(String hImg) {
        this.hImg = hImg == null ? null : hImg.trim();
    }

    public String gethAbstract() {
        return hAbstract;
    }

    public void sethAbstract(String hAbstract) {
        this.hAbstract = hAbstract == null ? null : hAbstract.trim();
    }

    public Integer gethType() {
        return hType;
    }

    public void sethType(Integer hType) {
        this.hType = hType;
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }
}