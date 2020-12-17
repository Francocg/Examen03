package pe.examne3.service;

import java.util.Map;

import pe.examne3.entity.Venta;

public interface VentaService {
	int create(Venta r);
	int update(Venta r);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
    Map<String, Object> readAll();
    Map<String, Object> readv2(int id);
}
