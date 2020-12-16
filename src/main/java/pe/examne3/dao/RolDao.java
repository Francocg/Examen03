package pe.examne3.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.examne3.entity.Rol;



public interface RolDao {
int create(Rol r);
int update(Rol r);
int update(int id);
int delete(int id);
List<Rol> readHola(int id);
List<Map<String, Object>> read(int id);
List<Map<String, Object>> readAll();
List<GrantedAuthority> buscarRolUser(int iduser);
void convertitMap(Map<String, Object> map);
}
