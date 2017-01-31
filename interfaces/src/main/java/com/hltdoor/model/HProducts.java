package com.hltdoor.model;

public class HProducts {
    private Integer id;

    private String hCoverImg;

    private String hTitle;

    private String hGuige;

    private String hPrice;

    private Integer hType;

    private Integer hStyle;

    private String hContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gethCoverImg() {
        return hCoverImg;
    }

    public void sethCoverImg(String hCoverImg) {
        this.hCoverImg = hCoverImg == null ? null : hCoverImg.trim();
    }

    public String gethTitle() {
        return hTitle;
    }

    public void sethTitle(String hTitle) {
        this.hTitle = hTitle == null ? null : hTitle.trim();
    }

    public String gethGuige() {
        return hGuige;
    }

    public void sethGuige(String hGuige) {
        this.hGuige = hGuige == null ? null : hGuige.trim();
    }

    public String gethPrice() {
        return hPrice;
    }

    public void sethPrice(String hPrice) {
        this.hPrice = hPrice == null ? null : hPrice.trim();
    }

    public Integer gethType() {
        return hType;
    }

    public void sethType(Integer hType) {
        this.hType = hType;
    }

    public Integer gethStyle() {
        return hStyle;
    }

    public void sethStyle(Integer hStyle) {
        this.hStyle = hStyle;
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }
}