
INSERT INTO CLIENTS(CLIENT_ID,F_NAME,L_NAME,EMAIL,NUMBER, COMP_NAME)
VALUES('1', 'James', 'O Connel', 'JOConnel@gmail.com','0832347444', 'Apex Consulting');

INSERT INTO CLIENTS(CLIENT_ID,F_NAME,L_NAME,EMAIL,NUMBER, COMP_NAME)
VALUES('2', 'Brian', 'Anderson', 'BAnderson@yahoo.com','0851212789', 'Ajax');

INSERT INTO PROJECT(PROJECT_ID,CLIENT_ID,PROJECT_TITLE,PROJECT_DESCRIP,PROJECT_OBJ)
VALUES('1','1','Omega','Artificial Intelligence to aid customers with everyday tasks. Intelligent listen and response program.','Create an AI that we can port to multiple products to help customers with everyday tasks');

INSERT INTO PROJECT(PROJECT_ID,CLIENT_ID,PROJECT_TITLE,PROJECT_DESCRIP,PROJECT_OBJ)
VALUES('2','2','Rengar','A new graphics card for computers that is highly advanced, more advanced than any current cards, built with afforadble materials allowing for a cheaper retail price','Create a revolutionary graphics card at an affordable price');


INSERT INTO REQUIREMENTS(CLIENT_ID,PROJECT_NAME,SERVICES,BUDGET,CLIENT_REQ)
VALUES(1,'Lima','Online Sevices', '100k-200k','Create an Website');
