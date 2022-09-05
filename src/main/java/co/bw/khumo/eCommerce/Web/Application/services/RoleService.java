package co.bw.khumo.eCommerce.Web.Application.services;

import co.bw.khumo.eCommerce.Web.Application.dao.RoleDAO;
import co.bw.khumo.eCommerce.Web.Application.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDAO roleDAO;

    public Role createRole(Role role){
        return roleDAO.save(role);
    }
}
