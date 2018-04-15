package com.bysj.bean;

public class Bgoods {
    private Integer id;

    private String gname;

    private Long gprice;

    private String gcategory;

    private Integer gumber;

    private String gpicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Long getGprice() {
        return gprice;
    }

    public void setGprice(Long gprice) {
        this.gprice = gprice;
    }

    public String getGcategory() {
        return gcategory;
    }

    public void setGcategory(String gcategory) {
        this.gcategory = gcategory == null ? null : gcategory.trim();
    }

    public Integer getGumber() {
        return gumber;
    }

    public void setGumber(Integer gumber) {
        this.gumber = gumber;
    }

    public String getGpicture() {
        return gpicture;
    }

    public void setGpicture(String gpicture) {
        this.gpicture = gpicture == null ? null : gpicture.trim();
    }
}