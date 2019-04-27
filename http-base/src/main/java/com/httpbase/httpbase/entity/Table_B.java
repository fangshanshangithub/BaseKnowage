package com.httpbase.httpbase.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Table_B implements Serializable {
    @SerializedName("tb.id")
    private Long id;

    @SerializedName("tb.bname")
    private String bname;

    @SerializedName("tb.bage")
    private Integer bage;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getBage() {
        return bage;
    }

    public void setBage(Integer bage) {
        this.bage = bage;
    }
}