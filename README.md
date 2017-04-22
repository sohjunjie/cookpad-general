# Cookpad - Programming Assignment: General

- [Overview of Q1 Restful API](#overview-of-q1-restful-api)
- [Overview of Q2 Database Design](#overview-of-q2-database-design)

## Overview of Q1 Restful API

Refer to `\documentation\q1\q1_restful_api_design.docx` for quick summary about about Q1

- [Version Information](#version-information)
- [Setup Database](#setup-database)
- [Results](#results)
- [Others](#others)

### Version Information 
`Spring MVC Web + Hibernate on Java`

Java

	jdk1.8.0_51
	
Spring framework

	4.3.2

Hibernate ORM Framework
	
	Hibernate 3

Database

	Mysql

Server
	
	Tomcat 9


### Setup Database
- Install MySQL
- Create a `cookpad` database schema and import the tables into schema using `\mysql-backup\cookpad.sql`
- In `\src\main\webapp\WEB-INF\jdbc.properties`, setup your username, password, port as following

		jdbc.driverClassName=com.mysql.jdbc.Driver
		jdbc.dialect=org.hibernate.dialect.MySQLDialect
		jdbc.databaseurl=jdbc:mysql://localhost:{mysql-port}/transporter
		jdbc.username={mysql-username}
		jdbc.password={mysql-password}

### Results

```
Request Endpoint
GET - /user/{userId}
```
```
GET - /user/1

Sample Response:
HTTP STATUS: OK
{
	id: 1,
	name: "Austin",
	friends: [
		2,
		5
	]
}
```

### Others

This restful web app was developed using eclipse ide - dynamic web project.
To try this app, simply import existing project from `https://github.com/sohjunjie/cookpad-general.git`


## Overview of Q2 Database Design
- Refer to `\documentation\q2\q2_database_design_menudb.sql` for solution to Q2
- Refer to `\documentation\q2\q2_database_design.docx` for details about Q2 solution
