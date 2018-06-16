-- Azure Consumer inserts into it
DROP TABLE RefreshWork.dbo.tblIntegration_ServiceBusMessages
CREATE TABLE RefreshWork.dbo.tblIntegration_ServiceBusMessages (
	RecordID bigint NOT NULL IDENTITY(1,1),
	MessageID varchar(200) NOT NULL,
	SequenceNumber bigint NOT NULL,
	Message varchar(max),
	FrontOfficeSystemRecordID int,
	--Status varchar(50),
	CreatedDateTime datetime DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT PK_tblIntegration_ServiceBusMessages PRIMARY KEY (RecordID)
)
CREATE INDEX tblIntegration_ServiceBusMessages_idx1 ON RefreshWork.dbo.tblIntegration_ServiceBusMessages (MessageID,SequenceNumber,FrontOfficeSystemRecordID)

-- Data Validator inserts into it
DROP TABLE RefreshWork.dbo.tblIntegration_ValidatedMessages
CREATE TABLE RefreshWork.dbo.tblIntegration_ValidatedMessages (
	RecordId bigint NOT NULL IDENTITY(1,1),
	Client nvarchar(10),
	IntegrationKey nvarchar(50) NOT NULL,
	FrontOfficeSystemRecordID int,
	MessageId nvarchar(200) NOT NULL,
	SequenceNumber bigint NOT NULL,
	--Status nvarchar(50),
	MapName nvarchar(50),
	Message varchar(max),
	NoOfAssignments int DEFAULT ((0)),
	CreatedDateTime datetime DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT PK_tblIntegration_ValidatedMessages PRIMARY KEY (RecordId)
)
CREATE INDEX tblIntegration_ValidatedMessages_idx1 ON RefreshWork.dbo.tblIntegration_ValidatedMessages (MessageID,SequenceNumber,Client, IntegrationKey)

-- Data Mapper inserts into it
DROP TABLE RefreshWork.dbo.tblIntegration_MappedMessages
CREATE TABLE RefreshWork.dbo.tblIntegration_MappedMessages (
	RecordId bigint NOT NULL IDENTITY(1,1),
	Client nvarchar(10),
	IntegrationKey nvarchar(50) NOT NULL,
	FrontOfficeSystemRecordID int,
	MessageId nvarchar(200) NOT NULL,
	SequenceNumber bigint NOT NULL,
	--Status nvarchar(50),
	MapName nvarchar(50),
	Message varchar(max),
	NoOfAssignments int DEFAULT ((0)),
	CreatedDateTime datetime DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT PK_tblIntegration_MappedMessages PRIMARY KEY (RecordId)
)
CREATE INDEX tblIntegration_MappedMessages_idx1 ON RefreshWork.dbo.tblIntegration_MappedMessages (MessageID,SequenceNumber,Client, IntegrationKey)

