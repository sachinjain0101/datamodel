/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bullhorn.orm.timecurrent.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "tblIntegration_ClientStatus", schema = "dbo")
public class TblIntegrationClientStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RecordId")
    private Integer recordId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Code")
    private String code;
    @Size(max = 500)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RecordStatus")
    private boolean recordStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusRecordId")
    private Collection<TblIntegrationClient> tblIntegrationClientCollection;

    public TblIntegrationClientStatus() {
    }

    public TblIntegrationClientStatus(Integer recordId) {
        this.recordId = recordId;
    }

    public TblIntegrationClientStatus(Integer recordId, String code, boolean recordStatus) {
        this.recordId = recordId;
        this.code = code;
        this.recordStatus = recordStatus;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(boolean recordStatus) {
        this.recordStatus = recordStatus;
    }

    @XmlTransient
    public Collection<TblIntegrationClient> getTblIntegrationClientCollection() {
        return tblIntegrationClientCollection;
    }

    public void setTblIntegrationClientCollection(Collection<TblIntegrationClient> tblIntegrationClientCollection) {
        this.tblIntegrationClientCollection = tblIntegrationClientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordId != null ? recordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIntegrationClientStatus)) {
            return false;
        }
        TblIntegrationClientStatus other = (TblIntegrationClientStatus) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblIntegrationClientStatus[ recordId=" + recordId + " ]";
    }

}
