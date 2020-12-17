package pe.examne3.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.examne3.dao.PersonaDao;
import pe.examne3.entity.Persona;
@Repository
public class PersonaDaoImpl implements PersonaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Persona r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona r) {
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
	public Persona read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from persona where idpersona=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Persona>(Persona.class));
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_cliente") //nombre del paquete
				.withProcedureName("sp_listar_c") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("cursor_clientes", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
				Map<String, Object> map = simpleJdbcCall.execute();
		return map;
	}

}
