/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author STEINACOZ-PC
 */
@Entity
@Table(name = "beers")
@NamedQueries({
    @NamedQuery(name = "Beers.findAll", query = "SELECT b FROM Beers b"),
    @NamedQuery(name = "Beers.findById", query = "SELECT b FROM Beers b WHERE b.id = :id"),
    @NamedQuery(name = "Beers.findByBeername", query = "SELECT b FROM Beers b WHERE b.beername = :beername"),
    @NamedQuery(name = "Beers.findByPrice", query = "SELECT b FROM Beers b WHERE b.price = :price")})
public class Beers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Size(max = 50)
    @Column(name = "beername")
    private String beername;
    @Size(max = 255)
    @Column(name = "price")
    private String price;

    public Beers() {
    }

    public Beers(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getBeername() {
        return beername;
    }

    public void setBeername(String beername) {
        this.beername = beername;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beers)) {
            return false;
        }
        Beers other = (Beers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Beers[ id=" + id + " ]";
    }
    
}
