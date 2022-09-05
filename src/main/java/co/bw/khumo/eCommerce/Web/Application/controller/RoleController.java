package co.bw.khumo.eCommerce.Web.Application.controller;

import co.bw.khumo.eCommerce.Web.Application.entity.Role;
import co.bw.khumo.eCommerce.Web.Application.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping({"/createRole"})
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }
}
