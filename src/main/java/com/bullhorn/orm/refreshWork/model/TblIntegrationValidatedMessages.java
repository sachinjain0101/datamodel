/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bullhorn.orm.refreshWork.model;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
 * @author sachin.jain
 */
@Entity
@Table(name = "tblIntegration_ValidatedMessages")
public class TblIntegrationValidatedMessages implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Column(name = "Map")
    private String map;
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
    private long sequenceNumber;
    @Column(name = "Processed")
    private Integer processed;
    @Lob
    @Column(name = "ErrorDescription")
    private String errorDescription;
    @Column(name = "Message")
    private String message;
    @Column(name = "FrontOfficeSystemRecordID")
    private Integer frontOfficeSystemRecordID;
    @Column(name = "ClientRecordID")
    private Integer clientRecordID;
    @Column(name = "ServiceBusMessagesRecordID")
    private long serviceBusMessagesRecordID;
    @Column(name = "CreatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    public TblIntegrationValidatedMessages() {
    }

    public TblIntegrationValidatedMessages(Long recordId) {
        this.recordId = recordId;
    }

    public TblIntegrationValidatedMessages(Long recordId, String integrationKey, String messageId, long sequenceNumber) {
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

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
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

    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
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

    public long getServiceBusMessagesRecordID() {
        return serviceBusMessagesRecordID;
    }

    public void setServiceBusMessagesRecordID(long serviceBusMessagesRecordID) {
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
