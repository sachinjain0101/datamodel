/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bullhorn.orm.timecurrent.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sachin.jain
 */
@Entity
@Table(name = "tblIntegration_AssignmentProcessor")
public class TblIntegrationAssignmentProcessor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RecordId")
    private Integer recordId;
    @Size(max = 10)
    @Column(name = "Client")
    private String client;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IntegrationKey")
    private String integrationKey;
    @Size(max = 100)
    @Column(name = "MessageId")
    private String messageId;
    @Lob
    @Column(name = "FilePath")
    private String filePath;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "FileName")
    private String fileName;
    @Lob
    @Column(name = "MapName")
    private String mapName;
    @Size(max = 10)
    @Column(name = "Environment")
    private String environment;
    @Column(name = "CreatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;
    @Column(name = "ProcessedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDateTime;
    @Size(max = 50)
    @Column(name = "Status")
    private String status;
    @Column(name = "ProcessStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processStartTime;
    @Column(name = "ApiStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date apiStartTime;
    @Column(name = "NoOfAssignments")
    private Integer noOfAssignments;
    @Column(name = "WebAPIStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date webAPIStartTime;
    @Column(name = "RefreshStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date refreshStartTime;
    @Column(name = "RefreshEndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date refreshEndTime;
    @Column(name = "PostProcessStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postProcessStartTime;
    @Column(name = "PostProcessEndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postProcessEndTime;
    @Column(name = "StatusStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusStartTime;
    @Column(name = "StatusEndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusEndTime;

    @Column(name = "SourceJson")
    private String sourceJson;
    @Column(name = "TargetJson")
    private String targetJson;


    @Column(name = "SourceJsonCreationTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sourceJsonCreationTime;

    @Column(name = "TargetJsonCreationTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date targetJsonCreationTime;

    public TblIntegrationAssignmentProcessor() {
    }

    public TblIntegrationAssignmentProcessor(Integer recordId) {
        this.recordId = recordId;
    }

    public TblIntegrationAssignmentProcessor(Integer recordId, String integrationKey, String fileName) {
        this.recordId = recordId;
        this.integrationKey = integrationKey;
        this.fileName = fileName;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getProcessedDateTime() {
        return processedDateTime;
    }

    public void setProcessedDateTime(Date processedDateTime) {
        this.processedDateTime = processedDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(Date processStartTime) {
        this.processStartTime = processStartTime;
    }

    public Date getApiStartTime() {
        return apiStartTime;
    }

    public void setApiStartTime(Date apiStartTime) {
        this.apiStartTime = apiStartTime;
    }

    public Integer getNoOfAssignments() {
        return noOfAssignments;
    }

    public void setNoOfAssignments(Integer noOfAssignments) {
        this.noOfAssignments = noOfAssignments;
    }

    public Date getWebAPIStartTime() {
        return webAPIStartTime;
    }

    public void setWebAPIStartTime(Date webAPIStartTime) {
        this.webAPIStartTime = webAPIStartTime;
    }

    public Date getRefreshStartTime() {
        return refreshStartTime;
    }

    public void setRefreshStartTime(Date refreshStartTime) {
        this.refreshStartTime = refreshStartTime;
    }

    public Date getRefreshEndTime() {
        return refreshEndTime;
    }

    public void setRefreshEndTime(Date refreshEndTime) {
        this.refreshEndTime = refreshEndTime;
    }

    public Date getPostProcessStartTime() {
        return postProcessStartTime;
    }

    public void setPostProcessStartTime(Date postProcessStartTime) {
        this.postProcessStartTime = postProcessStartTime;
    }

    public Date getPostProcessEndTime() {
        return postProcessEndTime;
    }

    public void setPostProcessEndTime(Date postProcessEndTime) {
        this.postProcessEndTime = postProcessEndTime;
    }

    public Date getStatusStartTime() {
        return statusStartTime;
    }

    public void setStatusStartTime(Date statusStartTime) {
        this.statusStartTime = statusStartTime;
    }

    public Date getStatusEndTime() {
        return statusEndTime;
    }

    public void setStatusEndTime(Date statusEndTime) {
        this.statusEndTime = statusEndTime;
    }

    public String getSourceJson() {
        return sourceJson;
    }

    public void setSourceJson(String sourceJson) {
        this.sourceJson = sourceJson;
    }

    public String getTargetJson() {
        return targetJson;
    }

    public void setTargetJson(String targetJson) {
        this.targetJson = targetJson;
    }

    public Date getSourceJsonCreationTime() {
        return sourceJsonCreationTime;
    }

    public void setSourceJsonCreationTime(Date sourceJsonCreationTime) {
        this.sourceJsonCreationTime = sourceJsonCreationTime;
    }

    public Date getTargetJsonCreationTime() {
        return targetJsonCreationTime;
    }

    public void setTargetJsonCreationTime(Date targetJsonCreationTime) {
        this.targetJsonCreationTime = targetJsonCreationTime;
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
        if (!(object instanceof TblIntegrationAssignmentProcessor)) {
            return false;
        }
        TblIntegrationAssignmentProcessor other = (TblIntegrationAssignmentProcessor) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblIntegrationAssignmentProcessor[ recordId=" + recordId + " ]";
    }

}
