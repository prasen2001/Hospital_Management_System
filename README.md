# Hospital_Management_System
This project is intended to store the databases of patient visiting the Hospital


To run the project successfully, you will need to create a mySQL Database to store and fetch the entries whenever required. Run the following queries in mySQL command line or mySQL Workbench to create the required databases.

// MySQL Queries to fire before running the project The project is created using username : "root" password : "mySQL" so make the required changes in JAVA backend.

CREATE SCHEMA hospital_database ;

use hospital_database;

CREATE TABLE hospital_database.patient ( patientID VARCHAR(10) NOT NULL, name VARCHAR(40) NOT NULL, contactNumber BIGINT NOT NULL, age VARCHAR(3) NOT NULL, gender VARCHAR(10) NOT NULL, bloodGroup VARCHAR(10) NOT NULL, address VARCHAR(100) NULL, anyMajorDisease VARCHAR(200) NULL, PRIMARY KEY (patientID) );

CREATE TABLE hospital_database.patient_report ( patientID VARCHAR(10) NOT NULL, symptom VARCHAR(200) NOT NULL, diagnosis VARCHAR(200) NOT NULL, medicines VARCHAR(200) NOT NULL, wardReq VARCHAR(5) NOT NULL, typeOfWard VARCHAR(10) NULL, PRIMARY KEY (patientID) );

Connect database your preferred IDE (Netbeans Recommended)

1) Run the Login.java file to run the project.  (Login username : admin, Login Password : admin)
2) Enter username "admin", password "admin" to login into the system.
3) Create a basic patient record and add the required information.
4) Search the patient through ID or Name and update the diagnosis information.
5) Search the full history of patient records and also print a pdf file if required.
6) Update the patient records if wrong information is entered while creating a record.
7) See the hospital information.
8) Logout.
Thank You
