# Microservice-Financial-Record-Service
    Microservices with Spring Boot - Financial Record Service

#REST API

    @GetMapping	"/payment/{id}"

    @PostMapping "/payment"

    @GetMapping	"/payment/list"

    @GetMapping	"/payment/search/amount/{amount}"

    @GetMapping	"/payment/search/currency/{currency}"


#APPLICATION PROPERTIES
    
    spring.application.name	financial-record-service

    server.port	8080

    logging.level.root	WARN

    spring.jpa.show-sql	true
   
    spring.h2.console.enabled	True


#DATABASE
    
    insert into payment_record(amount, currency) values(250,'USD');

    insert into payment_record(amount, currency) values(350,'INR');

    insert into payment_record(amount, currency) values(450,'USD');

    insert into payment_record(amount, currency) values(550,'EUR');

    insert into payment_record(amount, currency) values(700,'INR');
    
    insert into payment_record(amount, currency) values(650,'INR');
    
    insert into payment_record(amount, currency) values(800,'INR');
    
    insert into payment_record(amount, currency) values(120,'EUR');
    
    insert into payment_record(amount, currency) values(850,'KES');
    
    
    

#CONTRIBUTORS

	ANKIT JAIN
	
	AMANPREET SINGH
	
	ANKUR

