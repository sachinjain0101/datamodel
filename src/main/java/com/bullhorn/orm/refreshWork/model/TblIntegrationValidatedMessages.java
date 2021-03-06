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
import java.util.Date;

@Entity
@Table(name = "tblIntegration_ValidatedMessages")
public class TblIntegrationValidatedMessages implements Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RecordId")
    private Long recordId;
    @Size(max = 10)
    @Column(name = "Client")
    private String client;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IntegrationKey")
    private String integrationKey;
    @Size(max = 50)
    @Column(name = "MapName")
    private String mapName;
    @Column(name = "IsMapped")
    private Boolean isMapped;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "MessageId")
    private String messageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SequenceNumber")
    private Long sequenceNumber;
    @Column(name = "Status")
    private String status;
    @Column(name = "ErrorDescription")
    private String errorDescription;
    @Column(name = "Message")
    private String message;
    @Column(name = "FrontOfficeSystemRecordID")
    private Integer frontOfficeSystemRecordID;
    @Column(name = "ClientRecordID")
    private Integer clientRecordID;
    @Column(name = "ServiceBusMessagesRecordID")
    private Long serviceBusMessagesRecordID;
    @Column(name = "CreatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    public TblIntegrationValidatedMessages() {
    }

    public TblIntegrationValidatedMessages(Long recordId) {
        this.recordId = recordId;
    }

    public TblIntegrationValidatedMessages(Long recordId, String integrationKey, String messageId, Long sequenceNumber) {
        this.recordId = recordId;
        this.integrationKey = integrationKey;
        this.messageId = messageId;
        this.sequenceNumber = sequenceNumber;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getIntegrationKey() {
        return integrationKey;
    }

    public void setIntegrationKey(String integrationKey) {
        this.integrationKey = integrationKey;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public Boolean getIsMapped() {
        return isMapped;
    }

    public void setIsMapped(Boolean isMapped) {
        this.isMapped = isMapped;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    public Integer getClientRecordID() {
        return clientRecordID;
    }

    public void setClientRecordID(Integer clientRecordID) {
        this.clientRecordID = clientRecordID;
    }

    public Long getServiceBusMessagesRecordID() {
        return serviceBusMessagesRecordID;
    }

    public void setServiceBusMessagesRecordID(Long serviceBusMessagesRecordID) {
        this.serviceBusMessagesRecordID = serviceBusMessagesRecordID;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
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
        if (!(object instanceof TblIntegrationValidatedMessages)) {
            return false;
        }
        TblIntegrationValidatedMessages other = (TblIntegrationValidatedMessages) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bullhorn.orm.refreshwork.model.TblIntegrationValidatedMessages[ recordId=" + recordId + " ]";
    }

}
