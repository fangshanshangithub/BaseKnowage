package com.httpbase.httpbase.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Table_A implements Serializable {
    @SerializedName("ta.id")
    private Long id;

    @SerializedName("ta.aname")
    private String aname;

    @SerializedName("ta.aage")
    private Integer aage;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getAage() {
        return aage;
    }

    public void setAage(Integer aage) {
        this.aage = aage;
    }
}