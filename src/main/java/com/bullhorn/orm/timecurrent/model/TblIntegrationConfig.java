package com.bullhorn.orm.timecurrent.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tblIntegration_Config", schema = "dbo")
public class TblIntegrationConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RecordID")
    private Integer recordID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CfgKey")
    private String cfgKey;
    @Column(name = "CfgValue")
    private String cfgValue;

    public TblIntegrationConfig() {
    }

    public TblIntegrationConfig(Integer recordID) {
        this.recordID = recordID;
    }

    public TblIntegrationConfig(Integer recordID, String cfgKey) {
        this.recordID = recordID;
        this.cfgKey = cfgKey;
    }

    public Integer getRecordID() {
        return recordID;
    }

    public void setRecordID(Integer recordID) {
        this.recordID = recordID;
    }

    public String getCfgKey() {
        return cfgKey;
    }

    public void setCfgKey(String cfgKey) {
        this.cfgKey = cfgKey;
    }

    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordID != null ? recordID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIntegrationConfig)) {
            return false;
        }
        TblIntegrationConfig other = (TblIntegrationConfig) object;
        if ((this.recordID == null && other.recordID != null) || (this.recordID != null && !this.recordID.equals(other.recordID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bullhorn.orm.timecurrent.model.TblIntegrationConfig[ recordID=" + recordID + " ]";
    }

}
