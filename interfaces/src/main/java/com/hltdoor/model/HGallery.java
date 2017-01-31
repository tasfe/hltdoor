package com.hltdoor.model;

public class HGallery {
    private Integer id;

    private String hTitle;

    private String hSubTitle;

    private Integer hTypeId;

    private String hCoverImg;

    private String hVr;

    private String hBuilding;

    private String hHouseType;

    private String hHouseSize;

    private String hHouseStyle;

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

    public String gethSubTitle() {
        return hSubTitle;
    }

    public void sethSubTitle(String hSubTitle) {
        this.hSubTitle = hSubTitle == null ? null : hSubTitle.trim();
    }

    public Integer gethTypeId() {
        return hTypeId;
    }

    public void sethTypeId(Integer hTypeId) {
        this.hTypeId = hTypeId;
    }

    public String gethCoverImg() {
        return hCoverImg;
    }

    public void sethCoverImg(String hCoverImg) {
        this.hCoverImg = hCoverImg == null ? null : hCoverImg.trim();
    }

    public String gethVr() {
        return hVr;
    }

    public void sethVr(String hVr) {
        this.hVr = hVr == null ? null : hVr.trim();
    }

    public String gethBuilding() {
        return hBuilding;
    }

    public void sethBuilding(String hBuilding) {
        this.hBuilding = hBuilding == null ? null : hBuilding.trim();
    }

    public String gethHouseType() {
        return hHouseType;
    }

    public void sethHouseType(String hHouseType) {
        this.hHouseType = hHouseType == null ? null : hHouseType.trim();
    }

    public String gethHouseSize() {
        return hHouseSize;
    }

    public void sethHouseSize(String hHouseSize) {
        this.hHouseSize = hHouseSize == null ? null : hHouseSize.trim();
    }

    public String gethHouseStyle() {
        return hHouseStyle;
    }

    public void sethHouseStyle(String hHouseStyle) {
        this.hHouseStyle = hHouseStyle == null ? null : hHouseStyle.trim();
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }
}