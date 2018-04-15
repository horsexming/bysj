package com.bysj.bean;

public class Business {
    private Integer id;

    private String bname;

    private String bpasswor;

    private String bphone;

    private String bemail;

    private String baddress;

    private String bsex;

    private Integer bgoods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBpasswor() {
        return bpasswor;
    }

    public void setBpasswor(String bpasswor) {
        this.bpasswor = bpasswor == null ? null : bpasswor.trim();
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone == null ? null : bphone.trim();
    }

    public String getBemail() {
        return bemail;
    }

    public void setBemail(String bemail) {
        this.bemail = bemail == null ? null : bemail.trim();
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public String getBsex() {
        return bsex;
    }

    public void setBsex(String bsex) {
        this.bsex = bsex == null ? null : bsex.trim();
    }

    public Integer getBgoods() {
        return bgoods;
    }

    public void setBgoods(Integer bgoods) {
        this.bgoods = bgoods;
    }
}