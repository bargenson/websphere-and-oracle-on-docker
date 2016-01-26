package com.clevertoday.bnc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by bargenson on 2016-01-23.
 */
@Entity
@XmlRootElement
public class Visitor implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private String address;
    private String userAgent;
    private Date visitDate;

    public Visitor() {

    }

    public Visitor(String address, String userAgent, Date date) {
        this.address = address;
        this.userAgent = userAgent;
        this.visitDate = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
