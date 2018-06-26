-- Azure Consumer inserts into it
DROP TABLE RefreshWork.dbo.tblIntegration_ServiceBusMessages
CREATE TABLE RefreshWork.dbo.tblIntegration_ServiceBusMessages (
	RecordID bigint NOT NULL IDENTITY(1,1),
	MessageID varchar(200) NOT NULL,
	SequenceNumber bigint NOT NULL,
	IntegrationKey varchar(50),
	Message varchar(max),
	FrontOfficeSystemRecordID int,
	Status varchar(100),
	ErrorDescription varchar(max),
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
	MapName varchar(50),
	IsMapped bit,
	MessageId nvarchar(200) NOT NULL,
	SequenceNumber bigint NOT NULL,
	Status varchar(100),
	ErrorDescription varchar(max),
	Message varchar(max),
	FrontOfficeSystemRecordID int,
	ClientRecordID int,
	ServiceBusMessagesRecordID bigint,
	CreatedDateTime datetime DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT PK_tblIntegration_ValidatedMessages PRIMARY KEY (RecordId)
)
CREATE INDEX tblIntegration_ValidatedMessages_idx1 ON RefreshWork.dbo.tblIntegration_ValidatedMessages (MessageID,SequenceNumber,Client, IntegrationKey)
CREATE INDEX tblIntegration_ValidatedMessages_idx2 ON RefreshWork.dbo.tblIntegration_ValidatedMessages (ServiceBusMessagesRecordID)
CREATE INDEX tblIntegration_ValidatedMessages_idx3 ON RefreshWork.dbo.tblIntegration_ValidatedMessages (FrontOfficeSystemRecordID,ClientRecordID,ServiceBusMessagesRecordID)


-- Data Mapper inserts into it
DROP TABLE RefreshWork.dbo.tblIntegration_MappedMessages
CREATE TABLE RefreshWork.dbo.tblIntegration_MappedMessages (
	RecordId bigint NOT NULL IDENTITY(1,1),
	Client nvarchar(10),
	IntegrationKey nvarchar(50) NOT NULL,
	MessageId nvarchar(200) NOT NULL,
	SequenceNumber bigint NOT NULL,
	Status varchar(100),
	ErrorDescription varchar(max),
	MapName varchar(50),
	Message varchar(max),
	MappedMessage varchar(max),
	NoOfAssignments int DEFAULT ((0)),
	FrontOfficeSystemRecordID int,
	ClientRecordID int,
	ServiceBusMessagesRecordID bigint,
	ValidatedMessagesRecordID bigint,
	CreatedDateTime datetime DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT PK_tblIntegration_MappedMessages PRIMARY KEY (RecordId)
)
CREATE INDEX tblIntegration_MappedMessages_idx1 ON RefreshWork.dbo.tblIntegration_MappedMessages (MessageID,SequenceNumber,Client, IntegrationKey)
CREATE INDEX tblIntegration_MappedMessages_idx2 ON RefreshWork.dbo.tblIntegration_MappedMessages (ValidatedMessagesRecordID)
CREATE INDEX tblIntegration_MappedMessages_idx3 ON RefreshWork.dbo.tblIntegration_MappedMessages (FrontOfficeSystemRecordID,ClientRecordID,ServiceBusMessagesRecordID,ValidatedMessagesRecordID)


DROP TABLE TimeCurrent.dbo.tblIntegration_Mappings
CREATE TABLE TimeCurrent.dbo.tblIntegration_Mappings(
	RecordID int NOT NULL IDENTITY(1,1),
	MapName varchar(20) NOT NULL,
	Attribute varchar(20) NOT NULL,
	Expression varchar(500) NULL,
	Version int NOT NULL,
	CreatedBy varchar(100) NULL,
	CreateDateTime datetime NULL,
	CONSTRAINT PK_tblIntegration_Mappings PRIMARY KEY (RecordId)
)
CREATE INDEX tblIntegration_Mappings_idx1 ON TimeCurrent.dbo.tblIntegration_Mappings (MapName)

DROP TABLE TimeCurrent.dbo.tblIntegration_Config
CREATE TABLE TimeCurrent.dbo.tblIntegration_Config(
	RecordID int NOT NULL IDENTITY(1,1),
	CfgKey varchar(100) NOT NULL,
	CfgValue varchar(max),
	CONSTRAINT PK_tblIntegration_Config PRIMARY KEY (RecordId)
)
CREATE UNIQUE INDEX tbltblIntegration_Config_uidx ON TimeCurrent.dbo.tblIntegration_Config (CfgKey)

INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('ASSIGNMENT_PROCESSOR_REST_URL','http://dev1app1/PeoplenetIntegration/api/Assignment');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_POOL_SIZE','1');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_QUEUE_NAME','sachin-new-test');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_SWAPPER_POOL_SIZE','1');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_SWAPPER_EXECUTE_INTERVAL','5000');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_VALIDATOR_POOL_SIZE','1');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_VALIDATOR_EXECUTE_INTERVAL','5000');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_MAPPER_POOL_SIZE','1');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_MAPPER_EXECUTE_INTERVAL','5000');

INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('CLUSTER_1','1');








