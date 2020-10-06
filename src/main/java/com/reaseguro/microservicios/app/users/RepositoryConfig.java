package com.reaseguro.microservicios.app.users;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.reaseguro.microservicios.app.commons.user.models.entity.Role;
import com.reaseguro.microservicios.app.commons.user.models.entity.Usuario;



@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class,Role.class);
	}
	

}
