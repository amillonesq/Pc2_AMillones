/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.restful;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author background05
 */
@Entity
@Table(name = "students")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findByIdBooster", query = "SELECT s FROM Students s WHERE s.idBooster = :idBooster"),
    @NamedQuery(name = "Students.findByBirthDate", query = "SELECT s FROM Students s WHERE s.birthDate = :birthDate"),
    @NamedQuery(name = "Students.findByFirstname", query = "SELECT s FROM Students s WHERE s.firstname = :firstname"),
    @NamedQuery(name = "Students.findByLastname", query = "SELECT s FROM Students s WHERE s.lastname = :lastname"),
    @NamedQuery(name = "Students.findByTelephone", query = "SELECT s FROM Students s WHERE s.telephone = :telephone"),
    @NamedQuery(name = "Students.findByEmail", query = "SELECT s FROM Students s WHERE s.email = :email"),
    @NamedQuery(name = "Students.findByCreated", query = "SELECT s FROM Students s WHERE s.created = :created")})
public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idBooster")
    private Integer idBooster;
    @Column(name = "birthDate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Size(max = 30)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 30)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 15)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Students() {
    }

    public Students(Integer idBooster) {
        this.idBooster = idBooster;
    }

    public Students(Integer idBooster, Date created) {
        this.idBooster = idBooster;
        this.created = created;
    }

    public Integer getIdBooster() {
        return idBooster;
    }

    public void setIdBooster(Integer idBooster) {
        this.idBooster = idBooster;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBooster != null ? idBooster.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.idBooster == null && other.idBooster != null) || (this.idBooster != null && !this.idBooster.equals(other.idBooster))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.restful.Students[ idBooster=" + idBooster + " ]";
    }
    
}
