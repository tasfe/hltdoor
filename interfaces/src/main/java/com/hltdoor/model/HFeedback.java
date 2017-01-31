package com.hltdoor.model;

public class HFeedback {
    private Integer id;

    private Integer hFor;

    private String hType;

    private String hContent;

    private String hAuthor;

    private String hFrom;

    private String hLogo;

    private String hBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gethFor() {
        return hFor;
    }

    public void sethFor(Integer hFor) {
        this.hFor = hFor;
    }

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType == null ? null : hType.trim();
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }

    public String gethAuthor() {
        return hAuthor;
    }

    public void sethAuthor(String hAuthor) {
        this.hAuthor = hAuthor == null ? null : hAuthor.trim();
    }

    public String gethFrom() {
        return hFrom;
    }

    public void sethFrom(String hFrom) {
        this.hFrom = hFrom == null ? null : hFrom.trim();
    }

    public String gethLogo() {
        return hLogo;
    }

    public void sethLogo(String hLogo) {
        this.hLogo = hLogo == null ? null : hLogo.trim();
    }

    public String gethBy() {
        return hBy;
    }

    public void sethBy(String hBy) {
        this.hBy = hBy == null ? null : hBy.trim();
    }
}