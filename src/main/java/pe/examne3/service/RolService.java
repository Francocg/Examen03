package pe.examne3.service;

import java.util.List;
import java.util.Map;

import pe.examne3.entity.Rol;



public interface RolService {
	int create(Rol r);
	int update(Rol r);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
}
