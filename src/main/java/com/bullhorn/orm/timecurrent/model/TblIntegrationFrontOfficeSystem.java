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
@Table(name = "tblIntegration_FrontOfficeSystem", schema = "dbo")
public class TblIntegrationFrontOfficeSystem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RecordId")
    private Integer recordId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Name")
    private String name;
    @Size(max = 1000)
    @Column(name = "Description")
    private String description;
    @Size(max = 100)
    @Column(name = "VersionNumber")
    private String versionNumber;
    @Lob
    @Column(name = "AzureEndPoint")
    private String azureEndPoint;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RecordStatus")
    private boolean recordStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "frontOfficeSystemRecordId")
    private Collection<TblIntegrationClient> tblIntegrationClientCollection;

    public TblIntegrationFrontOfficeSystem() {
    }

    public TblIntegrationFrontOfficeSystem(Integer recordId) {
        this.recordId = recordId;
    }

    public TblIntegrationFrontOfficeSystem(Integer recordId, String name, boolean recordStatus) {
        this.recordId = recordId;
        this.name = name;
        this.recordStatus = recordStatus;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getAzureEndPoint() {
        return azureEndPoint;
    }

    public void setAzureEndPoint(String azureEndPoint) {
        this.azureEndPoint = azureEndPoint;
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
        if (!(object instanceof TblIntegrationFrontOfficeSystem)) {
            return false;
        }
        TblIntegrationFrontOfficeSystem other = (TblIntegrationFrontOfficeSystem) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblIntegrationFrontOfficeSystem[ recordId=" + recordId + " ]";
    }

}
