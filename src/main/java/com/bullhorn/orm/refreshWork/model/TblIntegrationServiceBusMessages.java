/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bullhorn.orm.refreshWork.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tblIntegration_ServiceBusMessages", schema = "dbo")
public class TblIntegrationServiceBusMessages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RecordID")
    private Long recordId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "MessageID")
    private String messageID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SequenceNumber")
    private long sequenceNumber;
    @Column(name = "IntegrationKey")
    private String integrationKey;
    @Column(name = "Message")
    private String message;
    @Column(name = "FrontOfficeSystemRecordID")
    private Integer frontOfficeSystemRecordID;
    @Column(name = "Status")
    private String status;
    @Column(name = "ErrorDescription")
    private String errorDescription;

    public TblIntegrationServiceBusMessages() {
    }

    public TblIntegrationServiceBusMessages(Long recordID) {
        this.recordId = recordID;
    }

    public TblIntegrationServiceBusMessages(Long recordID, String messageID, long sequenceNumber) {
        this.recordId = recordID;
        this.messageID = messageID;
        this.sequenceNumber = sequenceNumber;
    }

    public Long getRecordID() {
        return recordId;
    }

    public void setRecordID(Long recordId) {
        this.recordId = recordId;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getIntegrationKey() {
        return integrationKey;
    }

    public void setIntegrationKey(String messageID) {
        this.integrationKey = integrationKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getFrontOfficeSystemRecordID() {
        return frontOfficeSystemRecordID;
    }

    public void setFrontOfficeSystemRecordID(Integer frontOfficeSystemRecordID) {
        this.frontOfficeSystemRecordID = frontOfficeSystemRecordID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public TblIntegrationServiceBusMessages(@NotNull @Size(min = 1, max = 200) String messageID, @NotNull long sequenceNumber, String integrationKey, String message, Integer frontOfficeSystemRecordID) {
        this.messageID = messageID;
        this.sequenceNumber = sequenceNumber;
        this.integrationKey = integrationKey;
        this.message = message;
        this.frontOfficeSystemRecordID = frontOfficeSystemRecordID;
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
        if (!(object instanceof TblIntegrationServiceBusMessages)) {
            return false;
        }
        TblIntegrationServiceBusMessages other = (TblIntegrationServiceBusMessages) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bullhorn.orm.refreshwork.model.TblIntegrationServiceBusMessages[ recordID=" + recordId + " ]";
    }

}
