package com.hltdoor.model;

public class HProductsType {
    private Integer id;

    private String tpyeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTpyeName() {
        return tpyeName;
    }

    public void setTpyeName(String tpyeName) {
        this.tpyeName = tpyeName == null ? null : tpyeName.trim();
    }
}