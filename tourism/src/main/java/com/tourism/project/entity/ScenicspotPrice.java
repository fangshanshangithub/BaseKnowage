package com.tourism.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ScenicspotPrice implements Serializable {
    private Long id;

    private String scenicspotName;

    private BigDecimal price;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScenicspotName() {
        return scenicspotName;
    }

    public void setScenicspotName(String scenicspotName) {
        this.scenicspotName = scenicspotName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}