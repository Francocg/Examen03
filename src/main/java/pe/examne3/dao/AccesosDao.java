package pe.examne3.dao;

import java.util.List;
import java.util.Map;

import pe.examne3.entity.Acceso;



public interface AccesosDao {
	int create(Acceso a);
	int update(Acceso a);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
}
