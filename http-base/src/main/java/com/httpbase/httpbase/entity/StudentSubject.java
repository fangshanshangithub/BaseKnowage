package com.httpbase.httpbase.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class StudentSubject implements Serializable {
    private Long id;

    private String name;

    private String subject;

    private BigDecimal moneyPrice;

    private Integer source;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BigDecimal getMoneyPrice() {
        return moneyPrice;
    }

    public void setMoneyPrice(BigDecimal moneyPrice) {
        this.moneyPrice = moneyPrice;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}