package org.student.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
		title="Ecommerce Rest API App",
		description = "A simple rest api project developed using Spring boot and Mysql ",
		contact = @Contact(email = "avinashdarandale6799@gmail.com", name = "Avinash_Darandale", url = "http://www.abc.com/"),
		license = @License(name="IBMRD Licence")),
		servers = @Server(url = "http://localhost:8080/")
		
		)
public class SwaggerConfiguration {

}
