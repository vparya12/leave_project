package com.example.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component	//For declearing class as controller and will use as config. It is java configuration of Controller. 
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(JaxRestController.class);	//defined which class is controller class.
	}
}
