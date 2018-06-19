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
@Table(name = "tblIntegration_MappedMessages")
public class TblIntegrationMappedMessages implements Serializable {

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
    @Column(name = "ErrorDescription")
    private String errorDescription;
    @Size(max = 50)
    @Column(name = "MapName")
    private String mapName;
    @Column(name = "Message")
    private String message;
    @Column(name = "MappedMessage")
    private String mappedMessage;
    @Column(name = "NoOfAssignments")
    private Integer noOfAssignments;
    @Column(name = "FrontOfficeSystemRecordID")
    private Integer frontOfficeSystemRecordID;
    @Column(name = "ClientRecordID")
    private Integer clientRecordID;
    @Column(name = "ServiceBusMessagesRecordID")
    private BigInteger serviceBusMessagesRecordID;
    @Column(name = "ValidatedMessagesRecordID")
    private BigInteger validatedMessagesRecordID;
    @Column(name = "CreatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    public TblIntegrationMappedMessages() {
    }

    public TblIntegrationMappedMessages(Long recordId) {
        this.recordId = recordId;
    }

    public TblIntegrationMappedMessages(Long recordId, String integrationKey, String messageId, long sequenceNumber) {
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

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMappedMessage() {
        return mappedMessage;
    }

    public void setMappedMessage(String mappedMessage) {
        this.mappedMessage = mappedMessage;
    }

    public Integer getNoOfAssignments() {
        return noOfAssignments;
    }

    public void setNoOfAssignments(Integer noOfAssignments) {
        this.noOfAssignments = noOfAssignments;
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

    public BigInteger getServiceBusMessagesRecordID() {
        return serviceBusMessagesRecordID;
    }

    public void setServiceBusMessagesRecordID(BigInteger serviceBusMessagesRecordID) {
        this.serviceBusMessagesRecordID = serviceBusMessagesRecordID;
    }

    public BigInteger getValidatedMessagesRecordID() {
        return validatedMessagesRecordID;
    }

    public void setValidatedMessagesRecordID(BigInteger validatedMessagesRecordID) {
        this.validatedMessagesRecordID = validatedMessagesRecordID;
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
        if (!(object instanceof TblIntegrationMappedMessages)) {
            return false;
        }
        TblIntegrationMappedMessages other = (TblIntegrationMappedMessages) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bullhorn.orm.refreshwork.model.TblIntegrationMappedMessages[ recordId=" + recordId + " ]";
    }

}
