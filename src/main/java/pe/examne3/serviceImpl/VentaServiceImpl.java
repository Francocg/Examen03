package pe.examne3.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.examne3.dao.VentaDao;
import pe.examne3.entity.Venta;
import pe.examne3.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService {
	@Autowired
	private VentaDao vdao;
	@Override
	public int create(Venta r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Venta r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		return vdao.readAll();
	}
	@Override
	public Map<String, Object> readv2(int id){
		return vdao.readv2(id);
	}
}
