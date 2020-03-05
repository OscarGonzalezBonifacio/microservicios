package com.formacionbdi.springboot.app.oauth.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id);

}
