TRUNCATE TABLE TimeCurrent.dbo.tblIntegration_Config;

INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('PNET_ASSIGNMENT_PROCESSOR_REST_URL','http://qa2-app2/PeoplenetIntegration/api/Assignment');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_QUEUE_NAME','sachin-test-1');

INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_EXECUTE_INTERVAL','1000');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_SWAPPER_EXECUTE_INTERVAL','1000');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_VALIDATOR_EXECUTE_INTERVAL','1000');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_MAPPER_EXECUTE_INTERVAL','10000');

INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_THREADPOOL_SCHEDULER_TERMINATION_TIME_INSECONDS','180');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_SWAPPER_THREADPOOL_SCHEDULER_TERMINATION_TIME_INSECONDS','180');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_VALIDATOR_THREADPOOL_SCHEDULER_TERMINATION_TIME_INSECONDS','180');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('DATA_MAPPER_THREADPOOL_SCHEDULER_TERMINATION_TIME_INSECONDS','180');

INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_CLUSTER_1','');
INSERT INTO TimeCurrent.dbo.tblIntegration_Config (CfgKey,CfgValue) Values ('AZURE_CONSUMER_CLUSTER_2','');
