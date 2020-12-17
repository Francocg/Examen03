package pe.examne3.dao;

import java.util.Map;

import pe.examne3.entity.Persona;

public interface PersonaDao {
	int create(Persona r);
	int update(Persona r);
	int update(int id);
	int delete(int id);
	Persona read(int id);
	Map<String, Object> readAll();
}
