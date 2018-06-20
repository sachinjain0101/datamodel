package com.bullhorn.orm.inmem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class TblAzureConsumer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "MessageID")
    private String messageID;
    @NotNull
    @Column(name = "SequenceNumber")
    private long sequenceNumber;
    @Column(name = "IntegrationKey")
    private String integrationKey;
    @Lob
    @Column(name = "Message", length=500000000)
    private String message;
    @Column(name = "FrontOfficeSystemRecordID")
    private Integer frontOfficeSystemRecordID;

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

    public TblAzureConsumer(@NotNull @Size(min = 1, max = 200) String messageID, @NotNull long sequenceNumber, String integrationKey, String message, Integer frontOfficeSystemRecordID) {
        this.messageID = messageID;
        this.sequenceNumber = sequenceNumber;
        this.integrationKey = integrationKey;
        this.message = message;
        this.frontOfficeSystemRecordID = frontOfficeSystemRecordID;
    }

    public TblAzureConsumer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblAzureConsumer that = (TblAzureConsumer) o;
        return sequenceNumber == that.sequenceNumber &&
                Objects.equals(messageID, that.messageID) &&
                Objects.equals(message, that.message) &&
                Objects.equals(frontOfficeSystemRecordID, that.frontOfficeSystemRecordID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(messageID, sequenceNumber, message, frontOfficeSystemRecordID);
    }

    @Override
    public String toString() {
        return "TblAzureConsumer{" +
                ", messageID='" + messageID + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", message='" + message + '\'' +
                ", frontOfficeSystemRecordID=" + frontOfficeSystemRecordID +
                '}';
    }
}
