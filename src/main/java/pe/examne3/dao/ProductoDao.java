package pe.examne3.dao;

import java.util.List;
import java.util.Map;

import pe.examne3.entity.Producto;

public interface ProductoDao {
	int create(Producto r);
	int update(Producto r);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
    List<Map<String, Object>> readAll();
}
