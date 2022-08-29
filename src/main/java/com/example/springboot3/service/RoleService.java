package com.example.springboot3.service;

import com.example.springboot3.model.Role;
import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
