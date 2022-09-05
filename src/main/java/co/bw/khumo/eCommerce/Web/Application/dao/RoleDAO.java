package co.bw.khumo.eCommerce.Web.Application.dao;

import co.bw.khumo.eCommerce.Web.Application.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends CrudRepository<Role, String> {

}
