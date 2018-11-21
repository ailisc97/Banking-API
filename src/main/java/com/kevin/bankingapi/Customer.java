/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.bankingapi;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author King Carmo
 */
@Entity
@Table
@XmlRootElement
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custID;
    private String name;
    private String address;
    private int security;

    /**
     * @return the id
     */
    public int getCustID() {
        return custID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the securityCode
     */
    public int getSecurity() {
        return security;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(int custID) {
        this.custID = custID;
    }

    /**
     * @param Name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param Security the Security to set
     */
    public void setSecurity(int security) {
        this.security = security;
    }

}
