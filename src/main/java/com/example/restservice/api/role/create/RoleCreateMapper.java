package com.example.restservice.api.role.create;

import com.example.restservice.domain.role.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleCreateMapper {

    Role fromRequestToRole(RoleCreateRequest request);

}
