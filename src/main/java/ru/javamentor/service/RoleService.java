package ru.javamentor.service;

import ru.javamentor.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> listOfRoles();

    List<Role> getRolesById(List<String> ids);
}
