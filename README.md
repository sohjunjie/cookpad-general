# Cookpad - Programming Assignment: General


## Overview
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

ORM Framework
	
	Hibernate 3

Database

	Mysql

Server
	
	Tomcat 9


## Setup database
- Install MySQL
- Create a 'cookpad' database by importing from `\mysql-backup\cookpad.sql`
- In `\src\main\webapp\WEB-INF\jdbc.properties`, setup your username, password, port as following

		jdbc.driverClassName=com.mysql.jdbc.Driver
		jdbc.dialect=org.hibernate.dialect.MySQLDialect
		jdbc.databaseurl=jdbc:mysql://localhost:{mysql-port}/transporter
		jdbc.username={mysql-username}
		jdbc.password={mysql-password}

## Results

```
GET - /user/1
```
```
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

## Others

This restful web app was developed using eclipse ide - dynamic web project.
To try this app, simply import existing project from [Git repository page](//github.com/sohjunjie/cookpad-general/)
