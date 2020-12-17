package pe.examne3.service;

import java.util.Map;

import pe.examne3.entity.Usuario;

public interface UsuarioService {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Usuario read(int id);
	Usuario validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
}
