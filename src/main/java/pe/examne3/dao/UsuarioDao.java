package pe.examne3.dao;

import java.util.Map;

import pe.examne3.entity.Usuario;



public interface UsuarioDao {
Usuario validarUsuario(String nomuser);

Map<String, Object> datosUsuario(String name);
}
