package com.reaseguro.microservicios.app.users.models.repository;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.reaseguro.microservicios.app.commons.user.models.entity.Usuario;


@RepositoryRestResource(path = "usuarios")
public interface UserRepository extends PagingAndSortingRepository<Usuario, Long>  {	
	
	@RestResource(path = "buscar-username")
	public Usuario findByUsername(@Param("username") String username);
	
}
